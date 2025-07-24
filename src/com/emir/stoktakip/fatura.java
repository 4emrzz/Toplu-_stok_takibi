package com.emir.stoktakip;
import java.awt.Component;
import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
public class fatura extends javax.swing.JFrame {
    public fatura() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngeri = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btniadeal = new javax.swing.JButton();

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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Görsel", "Model", "Adet", "Tutar", "Tarih", "İşlem", "satisID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(6).setMinWidth(0);
            table.getColumnModel().getColumn(6).setPreferredWidth(0);
            table.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        btniadeal.setBackground(new java.awt.Color(255, 153, 102));
        btniadeal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btniadeal.setText("İade al");
        btniadeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniadealActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btngeri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btniadeal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btngeri)
                    .addComponent(btniadeal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int kullaniciID = giris.kullaniciID;
    Connection baglanti = veritabani.baglantiAl();

    private void tabloGorselAyarla(JTable table, int satirYuksekligi, int gorselSutunIndex) {
        // Satır yüksekliği ayarla
        table.setRowHeight(satirYuksekligi);

        // Görsel sütununa özel renderer ayarla
        table.getColumnModel().getColumn(gorselSutunIndex).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                if (value instanceof ImageIcon) {
                    JLabel lbl = new JLabel((ImageIcon) value);
                    lbl.setHorizontalAlignment(JLabel.CENTER);
                    return lbl;
                }
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        });
    }
    private void btngeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngeriActionPerformed
        //geri butonuna basılınca ana formu aç ve bu formu kapat
        ana Ana = new ana();
        Ana.setVisible(true);
        Ana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btngeriActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // tabloyu temizle

        try {//son 15 günlük satış verilerini ve gerekli itemleri çağıran sorgu
            String sql = """
    SELECT 
        s.satisID,
        ub.urunGORSELYOLU,
        m.modelAD,
        s.adet,
        s.toplamTUTAR,
        s.satisTARIH,
        s.islem
    FROM satis s
    INNER JOIN urun_bilgi ub ON s.urunID = ub.urunID
    INNER JOIN model m ON ub.modelID = m.modelID
    WHERE s.kullaniciID = ?
      AND s.satisTARIH >= DATEADD(DAY, -15, GETDATE())
    ORDER BY s.satisTARIH DESC
""";

            PreparedStatement pstmt = baglanti.prepareStatement(sql);
            pstmt.setInt(1, kullaniciID);//boşluğu kullanıcıID ile doldur
            ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır

            while (rs.next()) {//birden fazla sorgu gelmesine karşı while döngüsü
                String gorselYolu = rs.getString("urunGORSELYOLU");//görsel yolunu al
                ImageIcon icon = new ImageIcon(gorselYolu); // görsel yolundan görseli al
                Image image = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH); //görseli yeniden boyutlandır
                icon = new ImageIcon(image);//yeniden boyutlandırılan görseli kullanabileceğimiz formata al
                Timestamp ts = rs.getTimestamp("satisTARIH");//işlemin yapıldığı tarihi düzenlemek için bu formatta aldık
                SimpleDateFormat sdf = new SimpleDateFormat("d MMMM yyyy, HH:mm"); // örnek: 5 Mayıs 2025, 12:00
                String formattedDate = sdf.format(ts);//düzenlediğimiz tarih formatını string hale getirdik

                Object[] row = {//object satır tanımlıyoruz
                    icon, // 1. görsel
                    rs.getString("modelAD"), // 2. model adı
                    rs.getInt("adet"), // 3. satışı yapılan adet
                    rs.getDouble("toplamTUTAR"), // 4. yapılan satışın tutarı
                    formattedDate,// satışın yapıldığı zaman
                    rs.getString("islem"), // 6. yapılan işlem 
                    rs.getInt("satisID")// tabloda görünmeyen satışID
                };
                model.addRow(row);//oluşturduğumuz satırı tabloya ekliyoruz
            }
        } catch (SQLException e) {//olası sql hatasını kullanıcıya bildir
            JOptionPane.showMessageDialog(null, "Veri yüklenirken hata oluştu: " + e);
        }
        tabloGorselAyarla(table, 82, 0);//görselin satıra sığması için satırın yüksekliğini ayarlıyoruz

    }//GEN-LAST:event_formWindowOpened

    private void btniadealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniadealActionPerformed
        int selectedRow = table.getSelectedRow();//seçilen satırı al
        if (selectedRow != -1) {//satır seçilmiş ise
            int satisID = (int) table.getValueAt(selectedRow, 6); // gizli kolondaki satisID al
            Object iadekontrol = table.getValueAt(selectedRow, 5); // yapılan işlemi al
            if ("Iade alindi".equals(iadekontrol.toString())) {//yapılan işlem değeri eğer "Iade alindi" ise kullanıcıyı uyar
                JOptionPane.showMessageDialog(null, "Bu ürünün iadesi zaten yapılmış");
                return;
            }

            try {
                baglanti.setAutoCommit(false); // Toplu işlem için

                // satis tablosunda islem'i "Iade alindi" olarak güncelle
                String updateSatis = "UPDATE satis SET islem = 'İade alındı' WHERE satisID = ?";
                try (PreparedStatement pstmt1 = baglanti.prepareStatement(updateSatis)) {
                    pstmt1.setInt(1, satisID);//boşluğa satisID yerleştir
                    pstmt1.executeUpdate();//sorguyu çalıştır
                }

                // gunluk_gider tablosundaki toplam değerleri sıfırla toplam gelir gider formunda fazladan değer çıkmasın
                String updateGider = """
            UPDATE gunluk_gider 
            SET toplamCIRO = 0, toplamVERGI = 0,toplamMALIYET=0, toplamUYGKES = 0, toplamKAR = 0 
            WHERE satisID = ?
        """;
                try (PreparedStatement pstmt2 = baglanti.prepareStatement(updateGider)) {
                    pstmt2.setInt(1, satisID);//boşluğu satisID ile doldur
                    pstmt2.executeUpdate();//sorguyu çalıştır
                }

                // satis tablosundan urunID ve adet'i al(stok tablosuna geri eklemek için)
                int urunID = 0;
                int adet = 0;
                String selectSatis = "SELECT urunID, adet FROM satis WHERE satisID = ?";
                try (PreparedStatement pstmt3 = baglanti.prepareStatement(selectSatis)) {
                    pstmt3.setInt(1, satisID);//boşluğu doldur
                    ResultSet rs = pstmt3.executeQuery();//sorguyu çalıştır
                    if (rs.next()) {//sorgu çalışırsa gelen verileri ilgili değişkenlere ata
                        urunID = rs.getInt("urunID");
                        adet = rs.getInt("adet");
                    }
                }

                // urun_bilgi tablosuna stokları geri ekle
                String updateStok = "UPDATE urun_bilgi SET urunSTOK = urunSTOK + ? WHERE urunID = ?";
                try (PreparedStatement pstmt4 = baglanti.prepareStatement(updateStok)) {
                    pstmt4.setInt(1, adet);//1. boşluğa eklenecek adet mikatı gelecek
                    pstmt4.setInt(2, urunID);//stok eklenecek ürünün urunID'si
                    pstmt4.executeUpdate();//sorguyu çalıştır
                }

                baglanti.commit();
                JOptionPane.showMessageDialog(null, "İade işlemi başarıyla yapıldı.");
            } catch (SQLException e) {//olası hata durumunda çalışacak kod bloğu
                try {
                    baglanti.rollback();//işlemler başarısız olursa yapılan tüm işlemleri geri al
                } catch (SQLException ex) {
                }
                JOptionPane.showMessageDialog(null, "Hata: " + e);//hata gelirse kullanıcıya bildir
            }
        } else {//satır seçimi yapımamış ise kullanıcıya hatırlat
            JOptionPane.showMessageDialog(null, "Lütfen bir satır seçin.");
        }
        table.setValueAt("Iade alindi", selectedRow, 5);//iadesi alınan ürünün tekrar iadesi alınmaması için 6. kolonu güncelle

    }//GEN-LAST:event_btniadealActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngeri;
    private javax.swing.JButton btniadeal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
