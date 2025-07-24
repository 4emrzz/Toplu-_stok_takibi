package com.emir.stoktakip;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class aidat extends javax.swing.JFrame {
    public aidat() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btngeri = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        rbgunluk = new javax.swing.JRadioButton();
        rbaylik = new javax.swing.JRadioButton();
        rbyillik = new javax.swing.JRadioButton();
        rbtumu = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btngeri.setBackground(new java.awt.Color(255, 0, 51));
        btngeri.setText("Geri");
        btngeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngeriActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ciro", "Vergi", "Uygulama kesintisi", "Maliyet", "Kâr", "Tarih"
            }
        ));
        jScrollPane2.setViewportView(table);

        buttonGroup1.add(rbgunluk);
        rbgunluk.setText("Günlük");
        rbgunluk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbgunlukActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbaylik);
        rbaylik.setText("Aylık");
        rbaylik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbaylikActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbyillik);
        rbyillik.setText("Yıllık");
        rbyillik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbyillikActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtumu);
        rbtumu.setText("Tümü");
        rbtumu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtumuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btngeri)
                        .addGap(18, 18, 18)
                        .addComponent(rbgunluk, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(rbaylik, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(rbyillik, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(rbtumu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 123, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btngeri)
                    .addComponent(rbgunluk)
                    .addComponent(rbaylik)
                    .addComponent(rbyillik)
                    .addComponent(rbtumu))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int kullaniciID = giris.kullaniciID;//giris formundan kullanıcıID çek
    Connection baglanti = veritabani.baglantiAl();//veritabanı bağlantı methodu
    private void btngeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngeriActionPerformed
        //geri butonuna basılınca ana formu aç ve bu formu kapat
        ana Ana = new ana();
        Ana.setVisible(true);
        Ana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btngeriActionPerformed

    private void rbaylikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbaylikActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();//tablonun kopyasını al
        model.setRowCount(0); // Tabloyu temizle

        try {//günlük gider tablosundan kullanıcıID ve aylığa göre toplam giderleri ve kârı getiren sorgu
            String sql = """
            SELECT 
                YEAR(giderTARIH) AS yil,
                MONTH(giderTARIH) AS ay,
                SUM(toplamCIRO) AS toplamCiro,
                SUM(toplamVERGI) AS toplamVergi,
                SUM(toplamUYGKES) AS toplamUygKes,
                SUM(toplamMALIYET) AS toplamMaliyet,
                SUM(toplamKAR) AS toplamKar
            FROM gunluk_gider
            WHERE kullaniciID = ?
            GROUP BY YEAR(giderTARIH), MONTH(giderTARIH)
            ORDER BY yil DESC, ay DESC
        """;

            PreparedStatement pstmt = baglanti.prepareStatement(sql);
            pstmt.setInt(1, kullaniciID);//boşluğu doldur
            ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır

            while (rs.next()) {//birden fazla satır gelebilir
                String tarih = rs.getInt("yil") + "-" + String.format("%02d", rs.getInt("ay")); // 6 kolon için uygun formata çevirilmiş tarih
                Object[] row = {//object satır oluştur
                    rs.getDouble("toplamCiro"),//1. kolon toplam yapılan ciro aylık
                    rs.getDouble("toplamVergi"),//2. kolon toplam verilen vergi aylık
                    rs.getDouble("toplamUygKes"),//3. kolon toplam uygulama kesintisi aylık
                    rs.getDouble("toplamMaliyet"),//4. kolon toplam ürünlerin geliş maliyeti aylık
                    rs.getDouble("toplamKar"),//5. kolon elimize geçen net kar aylık
                    tarih//6. kolon formatını ayarladığımız tarih(2025-04, 2022-11 vb.)
                };
                model.addRow(row);//oluşturduğumuz satırı tablomuza ekliyoruz
            }

        } catch (SQLException e) {//herhangi sql hatasına karşı kullanıcıya bildir
            JOptionPane.showMessageDialog(null, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_rbaylikActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //form açılınca çalışacak kodlar
        rbgunluk.setSelected(true);//rbgunluk radiobuttonunu seç
        rbgunlukActionPerformed(null);//rbgunluk seçimini manuel olarak yapıyoruz
    }//GEN-LAST:event_formWindowOpened

    private void rbgunlukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbgunlukActionPerformed
        if(rbgunluk.isSelected()){
        rbgunluk.setSelected(true);//rbgunluk radiobuttonunu seç
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Tabloyu temizle
        try {
            //günlük şekilde toplanmış verileri getiren sorgu
            String sql = """
    SELECT CONVERT(date, giderTARIH) AS gun,
           SUM(toplamCIRO) AS toplamCiro,
           SUM(toplamVERGI) AS toplamVergi,
           SUM(toplamUYGKES) AS toplamUygKes,
           SUM(toplamMALIYET) AS toplamMaliyet,
           SUM(toplamKAR) AS toplamKar
    FROM gunluk_gider
    WHERE kullaniciID = ?
    GROUP BY CONVERT(date, giderTARIH)
    ORDER BY gun DESC
""";
            PreparedStatement pstmt = baglanti.prepareStatement(sql);
            pstmt.setInt(1, kullaniciID);  //boşluğu doldur
            ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır

            while (rs.next()) {//birden fazla sonuç gelmesi ihtimali için while
                Object[] row = {//object satır oluştur
                    rs.getDouble("toplamCiro"),//1. kolon toplam yapılan ciro günlük
                    rs.getDouble("toplamVergi"),//2. kolon toplam verilen vergi günlük
                    rs.getDouble("toplamUygKes"),//3. kolon toplam uygulama kesintisi günlük
                    rs.getDouble("toplamMaliyet"),//4. kolon toplam ürünlerin geliş maliyeti günlük
                    rs.getDouble("toplamKar"),//5. kolon elimize geçen net kar günlük
                    rs.getDate("gun").toString()//6. kolon bu paraların döndüğü tarih günlük
                };
                model.addRow(row);//object satırı tabloya ekle
            }

        } catch (SQLException e) {//herhangi sql hatası ihtimali için kullanıcıya bildir
            JOptionPane.showMessageDialog(null, "Hata: " + e.getMessage());
        }
        }
    }//GEN-LAST:event_rbgunlukActionPerformed

    private void rbyillikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbyillikActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Tabloyu temizle
        try {//kullanıcıID nin yaptığı parasal işlemlerin yıllık olarak toplamış hali
            String sql = """
            SELECT 
                YEAR(giderTARIH) AS yil,
                SUM(toplamCIRO) AS toplamCiro,
                SUM(toplamVERGI) AS toplamVergi,
                SUM(toplamUYGKES) AS toplamUygKes,
                SUM(toplamMALIYET) AS toplamMaliyet,
                SUM(toplamKAR) AS toplamKar
            FROM gunluk_gider
            WHERE kullaniciID = ?
            GROUP BY YEAR(giderTARIH)
            ORDER BY yil DESC
        """;
            PreparedStatement pstmt = baglanti.prepareStatement(sql);
            pstmt.setInt(1, kullaniciID);//boşluğu doldur
            ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır
            while (rs.next()) {//fazla satır olmasına karşı while
                String tarih = String.valueOf(rs.getInt("yil")); // Sadece yıl
                Object[] row = {//object satır oluştur
                    rs.getDouble("toplamCiro"),//1.kolon yıllık ciro
                    rs.getDouble("toplamVergi"),//2. kolon yıllık vergi
                    rs.getDouble("toplamUygKes"),//3. kolon yıllık uygulama kesintisi
                    rs.getDouble("toplamMaliyet"),//4. kolon yıllık ürün maliyeti
                    rs.getDouble("toplamKar"),//5. kolon yıllık cebe kalan net kâr
                    tarih//yıl
                };
                model.addRow(row);//oluşturup içini doldurduğumuz satırı tabloya ekle
            }
        } catch (SQLException e) {// olası sql hatasına karşı kullanıcıya messagebox gönderir
            JOptionPane.showMessageDialog(null, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_rbyillikActionPerformed

    private void rbtumuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtumuActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Tabloyu temizle

        try {//kullanıcıID nin tüm zamanlarda yaptığı parasal işlemlerin toplamı
            String sql = """
            SELECT 
                SUM(toplamCIRO) AS toplamCiro,
                SUM(toplamVERGI) AS toplamVergi,
                SUM(toplamUYGKES) AS toplamUygKes,
                SUM(toplamMALIYET) AS toplamMaliyet,
                SUM(toplamKAR) AS toplamKar
            FROM gunluk_gider
            WHERE kullaniciID = ?
        """;

            PreparedStatement pstmt = baglanti.prepareStatement(sql);
            pstmt.setInt(1, kullaniciID);//boşluğu doldur
            ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır

            if (rs.next()) {//bir değeri yani true döneceği için if 
                Object[] row = {//object satır oluştur
                    rs.getDouble("toplamCiro"),//1. kolon toplam ciro
                    rs.getDouble("toplamVergi"),//2. kolon toplam verilen vergi
                    rs.getDouble("toplamUygKes"),//3. kolon toplam uygulama kesintisi
                    rs.getDouble("toplamMaliyet"),//4. kolon toplam ürün maliyetleri
                    rs.getDouble("toplamKar"),//5. kolon toplam cebimize kalan kâr
                    "Tüm Zamanlar"//6. kolona direk metin yazdırıyoruz
                };
                model.addRow(row);//oluşturulan satırı tabloya ekle
            }

        } catch (SQLException e) {//olası sql hatası için messagebox
            JOptionPane.showMessageDialog(null, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_rbtumuActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aidat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngeri;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbaylik;
    private javax.swing.JRadioButton rbgunluk;
    private javax.swing.JRadioButton rbtumu;
    private javax.swing.JRadioButton rbyillik;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
