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

public class tumpiyasa extends javax.swing.JFrame {

    public tumpiyasa() throws ClassNotFoundException {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btngeri = new javax.swing.JButton();
        cbkategori = new javax.swing.JComboBox<>();
        cbaltkategori = new javax.swing.JComboBox<>();
        cbmodel = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        rbkategori = new javax.swing.JRadioButton();
        rbaltkategori = new javax.swing.JRadioButton();
        rbmodel = new javax.swing.JRadioButton();
        rbtumu = new javax.swing.JRadioButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btngeri.setBackground(new java.awt.Color(255, 51, 51));
        btngeri.setText("Geri");
        btngeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngeriActionPerformed(evt);
            }
        });

        cbkategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbkategoriİtemStateChanged(evt);
            }
        });

        cbaltkategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbaltkategoriİtemStateChanged(evt);
            }
        });

        cbmodel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmodelİtemStateChanged(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Görsel", "Model", "İşletme", "Fiyat"
            }
        ));
        jScrollPane1.setViewportView(table);

        buttonGroup1.add(rbkategori);
        rbkategori.setText("Kategori");
        rbkategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbkategoriActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbaltkategori);
        rbaltkategori.setText("Alt Kategori");
        rbaltkategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbaltkategoriActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbmodel);
        rbmodel.setText("Model");
        rbmodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmodelActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtumu);
        rbtumu.setText("Tümü");
        rbtumu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtumuİtemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btngeri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbtumu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbaltkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbaltkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 78, Short.MAX_VALUE))
                            .addComponent(cbmodel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btngeri)
                        .addGap(4, 4, 4)
                        .addComponent(rbtumu))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbkategori)
                                .addComponent(rbaltkategori)
                                .addComponent(rbmodel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbkategori, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                    .addComponent(cbaltkategori))))
                        .addComponent(cbmodel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection baglanti = veritabani.baglantiAl();//veritabanına bağlanmak için gereken metod çağrısı

    private void tabloGorselAyarla(JTable table, int satirYuksekligi, int gorselSutunIndex) {//görseli ve satırı yeniden yapılandıram metod
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

    public void kategoriyeGoreUrunListele() {//kategoriAD a göre ilgili yerlerden satır içeriklerini çeken metod
        String secilenKategori = (String) cbkategori.getSelectedItem();//kategoriadını string olarak alıyoruz
        if (secilenKategori == null) {//kategori yok ise yada boş ise 
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);//tabloyu temizle
            return;
        }
        //kategori adına göre satır içeriklerini çeken sorgu
        String sql = """
        SELECT ub.urunGORSELYOLU, m.modelAD, kb.isletmeAD, ub.urunFIYAT
        FROM urun_bilgi ub
        INNER JOIN model m ON ub.modelID = m.modelID
        INNER JOIN altkategori a ON m.altkategoriID = a.altkategoriID
        INNER JOIN kategori k ON a.kategoriID = k.kategoriID
        INNER JOIN kullanici_bilgi kb ON ub.kullaniciID = kb.kullaniciID
        WHERE k.kategoriAD = ?
    """;

        try (PreparedStatement pstmt = baglanti.prepareStatement(sql)) {
            pstmt.setString(1, secilenKategori);//boşluğu doldur
            ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);//tabloyu temizle

            while (rs.next()) {//sorgudan gelenleri yerlerine yerleştir
                String gorselYolu = rs.getString("urunGORSELYOLU");//görsel yolunu al
                ImageIcon ikon = new ImageIcon(gorselYolu);//görsel yolundakini uygun formatta al 
                Image img = ikon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH); //görseli 80e 80 yapılandır
                ImageIcon kucukIkon = new ImageIcon(img);//yapılandırılan görseli kullanabileceğimiz formata geri çevir

                model.addRow(new Object[]{//yeni satır ekle
                    kucukIkon,//satırın 1. kolonu yapıladırılan görsel
                    rs.getString("modelAD"),//2. kolon model
                    rs.getString("isletmeAD"),//3. kolon bu ürünü satan işletmenin adı
                    rs.getBigDecimal("urunFIYAT")//4. kolon bu ürünü kaç tlden satıyor
                });
            }
        } catch (Exception e) {//olası hata durumunu kullanıcıya bildir
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }

    public void altKategoriyeGoreUrunListele() {//altkategoriAD a göre ilgili yerlerden değişkenleri çeken sorgu ve kod bloğu metodu
        String secilenAltKategori = (String) cbaltkategori.getSelectedItem();//seçilmiş olan altkategori
        if (secilenAltKategori == null) {//altkategori seçilmemiş veya boş ise 
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);//tabloyu temizle
            return;
        }
        //altkategoriAD'a göre içeriklerin çekildiği sorgu
        String sql = """
        SELECT ub.urunGORSELYOLU, m.modelAD, kb.isletmeAD, ub.urunFIYAT
        FROM urun_bilgi ub
        INNER JOIN model m ON ub.modelID = m.modelID
        INNER JOIN altkategori a ON m.altkategoriID = a.altkategoriID
        INNER JOIN kullanici_bilgi kb ON ub.kullaniciID = kb.kullaniciID
        WHERE a.altkategoriAD = ?
    """;

        try (PreparedStatement pstmt = baglanti.prepareStatement(sql)) {
            pstmt.setString(1, secilenAltKategori);//boşluğu doldur
            ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);//tabloyu temizle

            while (rs.next()) {//birden çok satır gelmesi ihtimali için while döngüsü
                String gorselYolu = rs.getString("urunGORSELYOLU");//ürün görsel yolunu al
                ImageIcon ikon = new ImageIcon(gorselYolu);//yoldaki görseli kullanabileceğimiz hale getir
                Image img = ikon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);//görseli yeniden yapılandır
                ImageIcon kucukIkon = new ImageIcon(img);//yeniden yapılandırılan görseli tekrar kullanabileceğimiz hale getir

                model.addRow(new Object[]{
                    kucukIkon,//1. sütuna görseli yerleştir
                    rs.getString("modelAD"),//2. sütun model adı
                    rs.getString("isletmeAD"),//3. sütun ürünün bulundurğu işletme adı
                    rs.getBigDecimal("urunFIYAT")//işletmenin ürüne belirlediği fiyat
                });
            }
        } catch (Exception e) {//herhangi bir hataya karşı kullanıcıya bildir
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }

    public void modelGoreUrunListele() {//modelAD'a göre ilgili yerlerden değişkenleri çeken sorgu ve kod methodu
        String secilenModel = (String) cbmodel.getSelectedItem();//seçlimiş model adı
        if (secilenModel == null) {//model adı seçilmemiş veya boş ise
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);//tabloyu temizle
            return;
        }
        //modelAD'a göre ilgili içerikleri getiren sorgu
        String sql = """
        SELECT ub.urunGORSELYOLU, m.modelAD, kb.isletmeAD, ub.urunFIYAT
        FROM urun_bilgi ub
        INNER JOIN model m ON ub.modelID = m.modelID
        INNER JOIN kullanici_bilgi kb ON ub.kullaniciID = kb.kullaniciID
        WHERE m.modelAD = ?
    """;

        try (PreparedStatement pstmt = baglanti.prepareStatement(sql)) {
            pstmt.setString(1, secilenModel);//boşluğu doldur
            ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);//tabloyu temizle

            while (rs.next()) {//birden çok model gelmesine karşı while döngüsü kullanıyoruz
                String gorselYolu = rs.getString("urunGORSELYOLU");//ürünün görsel yolunu al
                ImageIcon ikon = new ImageIcon(gorselYolu);//yoldaki görseli üygun formata çevir
                Image img = ikon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);//görseli yeniden yapılandır
                ImageIcon kucukIkon = new ImageIcon(img);//yapılandırılan görseli kullanabileceğimiz formata çevir

                model.addRow(new Object[]{//tabloya satır ekle
                    kucukIkon,//1. kolonda ürünün görseli
                    rs.getString("modelAD"),//2. kolonda ürünün model ADI
                    rs.getString("isletmeAD"),//3. kolon ürünü satan işletme
                    rs.getBigDecimal("urunFIYAT")//ürünün fiyatı
                });
            }
        } catch (Exception e) {//herhangi hata durumuna karşı kullanıcıya bildir
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        rbtumu.setSelected(true);//form açılınca rbtumu radiobuttonu seç
        try {
            String sql = "SELECT kategoriAD FROM kategori";//kategori tablosundaki tüm kategorileri getir
            PreparedStatement pst = baglanti.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();//sorguyu çalıştır
            cbkategori.removeAllItems();//cbkategoriyi temizle
            while (rs.next()) {//birden fazla kategoriAD gelmesi ihtimaline karşı döngü kurduk
                cbkategori.addItem(rs.getString("kategoriAD"));//cbkategoriye gelen itemi (kategoriAD) ekliyoruz
            }
        } catch (Exception e) {//hata alma ihtimalinden değil zorunluluk olduğu için koydum
        }
    }//GEN-LAST:event_formWindowOpened

    private void rbtumuİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtumuİtemStateChanged
        //radiobuttonlardan rbtumu seçilince çalışacak kod ve sorgu
        //ürün_bilgi tablosundaki tüm ürünler geliyor ve gerekli değişkenler çağırılıyor
        String sql = """
        SELECT ub.urunGORSELYOLU, m.modelAD, kb.isletmeAD, ub.urunFIYAT
        FROM urun_bilgi ub
        INNER JOIN model m ON ub.modelID = m.modelID
        INNER JOIN kullanici_bilgi kb ON ub.kullaniciID = kb.kullaniciID
    """;

        try {
            PreparedStatement pstmt = baglanti.prepareStatement(sql);//veritabanı bağlantı cümleciği
            ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);//tabloyu temizle

            while (rs.next()) {//birden fazla item gelmesi ihtimali için döngü
                String gorselYolu = rs.getString("urunGORSELYOLU");//ürünün görsel yolunu al
                ImageIcon ikon = new ImageIcon(gorselYolu);//yoldaki görseli uygun formata çevir
                Image img = ikon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);//görseli yeniden boyutlandırmak farklı değişkene at
                ImageIcon kucukIkon = new ImageIcon(img);//boyutlandırılan görseli kullanabileceğimiz şekle getir

                model.addRow(new Object[]{//tabloya satır ekle
                    kucukIkon,//1. kolon ürün görseli
                    rs.getString("modelAD"),//2. kolon ürünün adı(modelAD)
                    rs.getString("isletmeAD"),//ürünü satan işletme
                    rs.getBigDecimal("urunFIYAT")//işletmenin belirlediği fiyat
                });
            }
        } catch (Exception e) {//herhangi bir hata durumunda kullanıcıya messagebox ile hatayı göster
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
        tabloGorselAyarla(table, 100, 0);// satır yüksekliğini tekrar ayarla
    }//GEN-LAST:event_rbtumuİtemStateChanged
    private void btngeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngeriActionPerformed
        //geri butonuna basılınca ana formunu açan ve bu formu kapatan kod kısmı
        ana Ana = new ana();
        Ana.setVisible(true);
        Ana.setLocationRelativeTo(null);
        this.dispose();//bu formu kapat
    }//GEN-LAST:event_btngeriActionPerformed
    private void cbaltkategoriİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbaltkategoriİtemStateChanged
        //cbaltkategoride herhangi bir seçim değişikliği olunca çalışacak kodlar
        String secilenAltKategori = (String) cbaltkategori.getSelectedItem();//altkategoriadını al
        if (secilenAltKategori == null) {//alt kategori seçilmemiş veya boş ise
            cbmodel.removeAllItems();//tabloyu temizle
            return;
        }
        try {//altkategoriadına göre modelleri listeleyen sorgu
            String sql = "SELECT DISTINCT a.modelAD "
                    + "FROM model a "
                    + "JOIN altkategori k ON a.altkategoriID = k.altkategoriID "
                    + "WHERE k.altkategoriAD = ?;";

            try (PreparedStatement pst = baglanti.prepareStatement(sql)) {
                pst.setString(1, secilenAltKategori);//boşluğu doldur
                ResultSet rs = pst.executeQuery();//sorguyu çalıştır

                cbmodel.removeAllItems();//önce comboboxu temizle

                while (rs.next()) {//birden fazla iteme karşi while döngüsü
                    cbmodel.addItem(rs.getString("modelAD"));//combobox a modelleri ekle
                }
            }
        } catch (Exception e) {//boş kod bloğu
        }
        if (rbaltkategori.isSelected() == true) {//eğer altkategori radiobuttonu seçili iken altkategori comboboxunda değişiklik yapıldı ise 
            altKategoriyeGoreUrunListele();//methodu çağır
            tabloGorselAyarla(table, 100, 0);//satır yüksekliğini ayarla
        }
    }//GEN-LAST:event_cbaltkategoriİtemStateChanged
    private void cbkategoriİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbkategoriİtemStateChanged
        //cbkategoride herhangi seçim değişikliği olmuca çalışacak kodlar
        String secilenkategori = (String) cbkategori.getSelectedItem();//kategoriadınıal
        if (secilenkategori == null) {//kategoriseçilmemiş veya boş ise
            cbaltkategori.removeAllItems();//tabloyu temizle
            return;
        }
        try {//kategoriadına göre altkategorileri çağıran sorgu
            String sql = "SELECT DISTINCT a.altkategoriAD "
                    + "FROM altkategori a "
                    + "JOIN kategori k ON a.kategoriID = k.kategoriID "
                    + "WHERE k.kategoriAD = ?;";
            try (PreparedStatement ps = baglanti.prepareStatement(sql)) {
                ps.setString(1, secilenkategori);//boşluğu doldur
                ResultSet rs = ps.executeQuery();//sorguyu çalıştır
                cbaltkategori.removeAllItems();//önce comboboxu temizleyelim
                while (rs.next()) {//birden fazla altkategori adına karşı while
                    cbaltkategori.addItem(rs.getString("altkategoriAD"));//gelen alt kategori adlarını combobox a ekle
                }
            }

        } catch (Exception e) {//boş kod bloğu
        }
        if (rbkategori.isSelected() == true) {//eğer kategori radiobuttonuseçili iken kategori comboboxunda değişiklik olursa 
            kategoriyeGoreUrunListele();//methodu çağır
            tabloGorselAyarla(table, 100, 0);//satır yüksekliğini ayarla
        }
    }//GEN-LAST:event_cbkategoriİtemStateChanged
    private void rbkategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbkategoriActionPerformed
        kategoriyeGoreUrunListele();//kategori radiobuttonu seçilince methodu kullan
        tabloGorselAyarla(table, 100, 0);//satır yüksekliğini ayarla
    }//GEN-LAST:event_rbkategoriActionPerformed
    private void rbaltkategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbaltkategoriActionPerformed
        altKategoriyeGoreUrunListele();//alt kategori radiobuttonu seçilince methodu kullan
        tabloGorselAyarla(table, 100, 0);//satır yüksekliğini ayarla
    }//GEN-LAST:event_rbaltkategoriActionPerformed
    private void rbmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmodelActionPerformed
        modelGoreUrunListele();//model radiobuttonu seçilince methodu kullan
        tabloGorselAyarla(table, 100, 0);//satır yüksekliğini ayarla
    }//GEN-LAST:event_rbmodelActionPerformed
    private void cbmodelİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmodelİtemStateChanged
        if (rbmodel.isSelected() == true) {//eğer model radiobuttonu seçili iken comboboxta değişiklik yapıldı ise 
            modelGoreUrunListele();//methodu çağır
            tabloGorselAyarla(table, 100, 0);//satır yüksekliğini ayarla
        }
    }//GEN-LAST:event_cbmodelİtemStateChanged
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngeri;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbaltkategori;
    private javax.swing.JComboBox<String> cbkategori;
    private javax.swing.JComboBox<String> cbmodel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbaltkategori;
    private javax.swing.JRadioButton rbkategori;
    private javax.swing.JRadioButton rbmodel;
    private javax.swing.JRadioButton rbtumu;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
