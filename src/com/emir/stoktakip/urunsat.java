package com.emir.stoktakip;

import java.awt.Component;
import java.awt.Image;
import java.math.BigDecimal;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class urunsat extends javax.swing.JFrame {

    public urunsat() {
        initComponents();
    }
    int kullaniciID = giris.kullaniciID; //kullanıcıID'ye göre işlemler olduğu için giriş formundan çağrılıyor
    Connection baglanti = veritabani.baglantiAl();//bağlantı cümlesi
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Geri = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblsepet = new javax.swing.JLabel();
        btnsat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        uruntable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        sepettable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbkategori = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbaltkategori = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbmodel = new javax.swing.JComboBox<>();
        adetspinner = new javax.swing.JSpinner();
        btnsepeteekle = new javax.swing.JButton();
        tfbarkod = new javax.swing.JTextField();
        btnsepettencikar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Geri.setBackground(new java.awt.Color(255, 0, 51));
        Geri.setText("Geri");
        Geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeriActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Barkod numarası:");

        lblsepet.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblsepet.setText("Sepet(0 ürün)");

        btnsat.setBackground(new java.awt.Color(51, 255, 51));
        btnsat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsat.setText("Satışı Tamamla");
        btnsat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsatActionPerformed(evt);
            }
        });

        uruntable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Görsel", "Model", "Stok", "Fiyat"
            }
        ));
        jScrollPane2.setViewportView(uruntable);

        sepettable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Görsel", "Model", "Adet", "Tutar"
            }
        ));
        sepettable.setRowHeight(42);
        jScrollPane3.setViewportView(sepettable);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ürün");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Kategori");

        cbkategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbkategoriİtemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Alt Kategori");

        cbaltkategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbaltkategoriİtemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Model");

        cbmodel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmodelİtemStateChanged(evt);
            }
        });

        adetspinner.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        btnsepeteekle.setBackground(new java.awt.Color(102, 255, 255));
        btnsepeteekle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsepeteekle.setText("Sepete Ekle");
        btnsepeteekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsepeteekleActionPerformed(evt);
            }
        });

        tfbarkod.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tfbarkod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfbarkodKeyReleased(evt);
            }
        });

        btnsepettencikar.setBackground(new java.awt.Color(255, 0, 102));
        btnsepettencikar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsepettencikar.setText("SEPETTEN ÇIKAR");
        btnsepettencikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsepettencikarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsepet, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsepeteekle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsepettencikar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adetspinner, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnsat, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Geri)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfbarkod, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(cbaltkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Geri)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbaltkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(tfbarkod, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblsepet, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adetspinner, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsepeteekle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsepettencikar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnsat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void tabloGorselAyarla(JTable table, int satirYuksekligi, int gorselSutunIndex) {//table içine gelecek itemler için görsel ayarlama methodu
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

    private void GeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeriActionPerformed
        if (sepettable.getRowCount() == 0) {//eğer sepet içinde herhangi bir item yoksa ana forma döner
            ana Ana = new ana();
            Ana.setVisible(true);
            Ana.setLocationRelativeTo(null);
            this.dispose();
        } else {//eğer sepet içinde item varsa messagebox döner ve ilgili soruyu sorar kullanıcının seçimine göre hareket eder
            Object[] tuslar = {"Tamam", "İptal"};//messagebox butonları türkçe olmadığı için butonların içini object tanımladık
            int secim = JOptionPane.showOptionDialog(
                    null,
                    "Sayfadan ayrılmanız durumunda sepetiniz boşaltılacaktır.",
                    "Sepet dolu!",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    tuslar,
                    tuslar[0]
            );
            if (secim == 0) {//tamam butonuna basılırsa sepette herhangi bir işlem yapılmaz ve ana forma dönülür
                ana Ana = new ana();
                Ana.setVisible(true);
                Ana.setLocationRelativeTo(null);
                this.dispose();
            } else {}//iptal butonuna basılırsa urunsat formunda kalınır sepet boşaltılmaz
        }
    }//GEN-LAST:event_GeriActionPerformed

    private void tfbarkodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfbarkodKeyReleased
        //tfbarkod tool'una herhangi bir tuş(harf-sayı-noktalama) girdi çıktı olursatetiklenecek kod (KeyReleased)
        String barkodArama = tfbarkod.getText();//tfbarkod içine girilen itemi barkodarama'ya atıyoruz
        if (barkodArama == null || barkodArama.isEmpty()) {//barkodarama boş ise tabloyu temizle
            ((DefaultTableModel) uruntable.getModel()).setRowCount(0);
            return;
        }
        //kullanıcıID ve barkodarama değişkenine göre ürünler çağıran SQL sorgusu
        String sql = """
    SELECT ub.urunGORSELYOLU, m.modelAD, ub.urunBARKOD, ub.urunSTOK, ub.urunFIYAT, ub.urunVERGI
    FROM urun_bilgi ub
    JOIN model m ON ub.modelID = m.modelID
    JOIN altkategori a ON m.altkategoriID = a.altkategoriID
    JOIN kategori k ON a.kategoriID = k.kategoriID
    WHERE ub.kullaniciID = ? AND ub.urunBARKOD LIKE ?
""";
        //sorguya göre try-catch bloğu
        try (PreparedStatement pstmt = baglanti.prepareStatement(sql)) {
            pstmt.setInt(1, kullaniciID);//1. ? olan kısma kullanıcıID koyuyoruz
            pstmt.setString(2, "%" + barkodArama + "%"); //urunBARKOD sütununda barkodarama değişkeni olan ürünleri çağırır
            ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır
            DefaultTableModel modelTablo = (DefaultTableModel) uruntable.getModel(); //tablonun kopyasını al
            modelTablo.setRowCount(0);//kopyayı aynı zamanda tabloyu temizler satır toplamını 0 yapar
            while (rs.next()) {//birden fazla ürün gelebileceği için while döngüsüne aldık
                ImageIcon icon = new ImageIcon(rs.getString("urunGORSELYOLU"));//görsel yolundaki görseli icon olarak alıyoruz ki görsel gelsin
                Image scaledImage = icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);//görseli yenıden boyutlandırıyoruz
                ImageIcon scaledIcon = new ImageIcon(scaledImage);//boyutlandırılan görseli tekrar icon yapıypruz
                modelTablo.addRow(new Object[]{
                    scaledIcon,//yeniden yapılandırılan iconu satıtın ilk kolonuna ekliyoruz
                    rs.getString("modelAD"),//sorguda çağırdığımız modelAD'ı aynı satır 2. sütuna ekliyoruz 
                    rs.getInt("urunSTOK"),//sorguda çağırdığımız stok bilgisini 3. kolona ekliyoruz
                    rs.getBigDecimal("urunFIYAT"),//sorgudan gelen fiyat bilgisini 4 kolona ekliyoruz
                });
            }
        } catch (Exception ex) {//herhangi bir hatada kullanıcıya gösterilecek messagebox ile hata
            JOptionPane.showMessageDialog(null, "Hata: " + ex.getMessage());
        }
        tabloGorselAyarla(uruntable, 42, 0);// satırın yüksekliğini görsele göre ayarlamak için çağırılan method
    }//GEN-LAST:event_tfbarkodKeyReleased

    private void cbkategoriİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbkategoriİtemStateChanged
        String secilenKategori = (String) cbkategori.getSelectedItem();//seçilen kategoriAD'ı string değişkene atıyoruz
        if (secilenKategori == null) {//seçilen kategori boş ise hem altkategoriyi hemde ürün tablosunu temizler
            cbaltkategori.removeAllItems();
            ((DefaultTableModel) uruntable.getModel()).setRowCount(0);
            return;
        }

        try {
            // kategoriAD vekullnıcıID'ye göre altkategorileri çek
            String sqlAltKategori = """
        SELECT DISTINCT a.altkategoriAD 
        FROM urun_bilgi ub
        JOIN model m ON ub.modelID = m.modelID
        JOIN altkategori a ON m.altkategoriID = a.altkategoriID
        JOIN kategori k ON a.kategoriID = k.kategoriID
        WHERE ub.kullaniciID = ? AND k.kategoriAD = ?
    """;
            //sorguyu veritabanına bağla
            try (PreparedStatement pstmt = baglanti.prepareStatement(sqlAltKategori)) {
                pstmt.setInt(1, kullaniciID);//1. boşluğu ilgili değişkenle doldur
                pstmt.setString(2, secilenKategori);//2. boşluğu ilgili değişkenle doldur
                ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır

                cbaltkategori.removeAllItems();//tabloyu temizle
                while (rs.next()) {//birden fazla ürün gelebileceği için while döngüsü kullanıyoruz
                    cbaltkategori.addItem(rs.getString("altkategoriAD"));//döngüye göre combobox'a item ekliyoruz
                }
            }

            //kategoriden seçim yapılınca urun tablosuna ürünleri ekliyoruz
            //ürünler sorgusu kullanıcıID ve cbkategori'den seçilen kategoriye göre 
            String sqlUrunler = """
        SELECT ub.urunGORSELYOLU, m.modelAD, ub.urunBARKOD, ub.urunSTOK, ub.urunFIYAT, ub.urunVERGI
        FROM urun_bilgi ub
        JOIN model m ON ub.modelID = m.modelID
        JOIN altkategori a ON m.altkategoriID = a.altkategoriID
        JOIN kategori k ON a.kategoriID = k.kategoriID
        WHERE ub.kullaniciID = ? AND k.kategoriAD = ?
    """;
            //sorguyu çalıştırmak için veritabanı cümleciğini ekliyoruz
            try (PreparedStatement pstmt = baglanti.prepareStatement(sqlUrunler)) {
                pstmt.setInt(1, kullaniciID);//1. boşluğa kullanıcıID koyuyoruz
                pstmt.setString(2, secilenKategori);//2. boşluğa seçilen kategoriyi koyuyoruz
                ResultSet rs = pstmt.executeQuery();//eksiklerini tamamladığımız sorguyu çalıştırıyoruz

                DefaultTableModel modelTablo = (DefaultTableModel) uruntable.getModel();//urun tablusunun kopyasını alıyoruz
                modelTablo.setRowCount(0);//kopyanın aynı zamanda urun tablosunun satır sayısını 0'a indiriyoruz

                while (rs.next()) {//birden fazla ürün gelebileceği için while döngüsünü kullanıyoruz
                    ImageIcon icon = new ImageIcon(rs.getString("urunGORSELYOLU"));//görsel yolundan görseli gerekli değişken şeklinde alıyoruz
                    Image img = icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);//gelen görseli image'ye çevirip yeniden boyutlandırıyouz
                    ImageIcon scaledIcon = new ImageIcon(img);//yeniden boyutlandırdığımı görseli kullanabilmek için gerekli değişken haline tekrardan çeviriyoruz

                    modelTablo.addRow(new Object[]{//kopyaya aynı zamanda ürün tablosunun satırının kolonlarını ayarlıyoruz
                        scaledIcon,//ürünümüzün görseli
                        rs.getString("modelAD"),//ürünümüzüm adı
                        rs.getInt("urunSTOK"),//ürünün elimizdeki stok bilgisi
                        rs.getBigDecimal("urunFIYAT"),//ürünün fiyatı
                    });
                }
            }
        } catch (Exception ex) {//olası hatada kullanıcıya gösterilen messagebox
            JOptionPane.showMessageDialog(null, "Hata: " + ex.getMessage());
        }
        //görselin satıra sığabilmesi için satırı boyutlandıran method
        tabloGorselAyarla(uruntable, 42, 0);

    }//GEN-LAST:event_cbkategoriİtemStateChanged

    private void cbaltkategoriİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbaltkategoriİtemStateChanged
        String secilenAltKategori = (String) cbaltkategori.getSelectedItem();//comboboxtan seçilen alt kategoriyi string olarak alıyoruz
        if (secilenAltKategori == null) {
            return;
        }
        //alt kategoriye bağlı olan modelleri almak için try-catch bloğu
        try {
            // alt kategoriye bağlı modelleri almak için gerekli sorgu kullanıcıID ve altkategoriAD kullanarak
            String sqlModeller = """
        SELECT DISTINCT m.modelAD 
        FROM urun_bilgi ub
        JOIN model m ON ub.modelID = m.modelID
        JOIN altkategori a ON m.altkategoriID = a.altkategoriID
        WHERE ub.kullaniciID = ? AND a.altkategoriAD = ?
    """;
            //sorguyu çalıştırmak için veritabanı bağlantı cümleciği 
            try (PreparedStatement pstmt = baglanti.prepareStatement(sqlModeller)) {
                pstmt.setInt(1, kullaniciID);//1. boşluğa kullanıcıID koyuyoruz
                pstmt.setString(2, secilenAltKategori);//2. boşluğa secilenalt kategori değişkenini koyuyoruz
                ResultSet rs = pstmt.executeQuery();//sorguyu çalıştırıyoruz

                cbmodel.removeAllItems();  //bulunan modelleri temizle
                while (rs.next()) {//birden fazla model olabileceği için while döngüsüne alıyoruz
                    cbmodel.addItem(rs.getString("modelAD"));//combobox' model adlarını ekliyoruz
                }
            }
            //alt kategori'den seçilen iteme göre urun tablosunu doldurma
            //sorguyu kullanıcıID kategoriAD ve altkatehoriAD' göre yapıyoruz
            String kategori = (String) cbkategori.getSelectedItem();//kategoriden seçilen itemi string olarak alıyoruz
            //sql sorgumuz
            String sqlUrunler = """
        SELECT ub.urunGORSELYOLU, m.modelAD, ub.urunBARKOD, ub.urunSTOK, ub.urunFIYAT, ub.urunVERGI
        FROM urun_bilgi ub
        JOIN model m ON ub.modelID = m.modelID
        JOIN altkategori a ON m.altkategoriID = a.altkategoriID
        JOIN kategori k ON a.kategoriID = k.kategoriID
        WHERE ub.kullaniciID = ? AND k.kategoriAD = ? AND a.altkategoriAD = ?
    """;
            //sorguyu çalıştırmak için veritabanı bağlantı cümleciği
            try (PreparedStatement pstmt = baglanti.prepareStatement(sqlUrunler)) {
                pstmt.setInt(1, kullaniciID);//1. boşluk için kullanıcıID
                pstmt.setString(2, kategori);//2. boşluk için kategoriAD
                pstmt.setString(3, secilenAltKategori);//3. boşluk için altkategoriAD
                ResultSet rs = pstmt.executeQuery();//sorguyu çalıştırıyoruz
                DefaultTableModel modelTablo = (DefaultTableModel) uruntable.getModel();//tablonun kopyasını alıyoruz
                modelTablo.setRowCount(0);//tablodaki satır sayısını 0'a indiriyoruz
                while (rs.next()) {//çok sayıda satır gelmesi durumu için while döngüsü kullanıyoruz
                    ImageIcon icon = new ImageIcon(rs.getString("urunGORSELYOLU"));//görsel yolundan görseli ilgili değişkene göre alıyoruz
                    Image img = icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);//görseli yeniden boyutlandırıyoruz
                    ImageIcon scaledIcon = new ImageIcon(img);//boyutlandırdığımız görseli tekrar ikon olarak değiştiriyoruz
                    modelTablo.addRow(new Object[]{//tabloya object satır ekliyoruz
                        scaledIcon,//1. kolonda görselimizin son hali var
                        rs.getString("modelAD"),//2. kolon model adı
                        rs.getInt("urunSTOK"),//3. kolon stok bilgisi
                        rs.getBigDecimal("urunFIYAT"),//4. kolon ürünün fiyatı
                    });
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Hata: " + ex.getMessage());
        }
        //satıra görselin sığması için satırın yüksekliğinei tekrar ayarlıyoruz
        tabloGorselAyarla(uruntable, 42, 0);
    }//GEN-LAST:event_cbaltkategoriİtemStateChanged

    private void cbmodelİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmodelİtemStateChanged
        String kategori = (String) cbkategori.getSelectedItem();//cbkategori'de olan itemi string olarak alıyoruz
        String altkategori = (String) cbaltkategori.getSelectedItem();//cbaltkategori'de olan itemi string olarak alıyoruz
        String model = (String) cbmodel.getSelectedItem();//cbmodel'de olan itemi string olarak alıyoruz
        //cbmodelden seçilen iteme göre ürün tablosunu listelemek için kullanacağımız sorgu(kullanıcıID kategoriAD altkategoriAD ve modelAD)
        String sql = """
    SELECT ub.urunGORSELYOLU, m.modelAD, ub.urunBARKOD, ub.urunSTOK, ub.urunFIYAT, ub.urunVERGI
    FROM urun_bilgi ub
    JOIN model m ON ub.modelID = m.modelID
    JOIN altkategori a ON m.altkategoriID = a.altkategoriID
    JOIN kategori k ON a.kategoriID = k.kategoriID
    WHERE ub.kullaniciID = ? AND k.kategoriAD = ? AND a.altkategoriAD = ? AND m.modelAD = ?
""";
        //sorguyu çalıştırabilmek için bağlantı cümleciği
        try (PreparedStatement pstmt = baglanti.prepareStatement(sql)) {
            pstmt.setInt(1, kullaniciID);//1. boşluk için kullanıcıID
            pstmt.setString(2, kategori);//2. boşluk için kategoriAD
            pstmt.setString(3, altkategori);// 3. boşluk için altkategoriAD
            pstmt.setString(4, model);//4. boşluk için modelAD

            ResultSet rs = pstmt.executeQuery();//boşluklarda dolduğuna göre sorguyu çalıştıralım
            DefaultTableModel modelTablo = (DefaultTableModel) uruntable.getModel();//tabloyu temizlemek için kopysını alıyoruz
            modelTablo.setRowCount(0);//kopyadaki aynı zamanda asıl tablodaki satır sayısını 0 yapıyoruz

            while (rs.next()) {//aslında 1 sonuç geleceği için if(affectedrow>0){....} yapabilirdik ama sorun yok 
                ImageIcon icon = new ImageIcon(rs.getString("urunGORSELYOLU"));//görsel yolundaki görseli ilgili değişken şeklinde alıyoruz 
                Image scaledImage = icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);//görseli yeniden boyutlandırıyouz
                ImageIcon scaledIcon = new ImageIcon(scaledImage);//boyutlandırılan görseli kullanabileceğimiz ikon şekline alıyoruz

                modelTablo.addRow(new Object[]{//kopya tabloya satır ekliyoruz
                    scaledIcon,//1. kolona görsel
                    rs.getString("modelAD"),//2. kolona model adı
                    rs.getInt("urunSTOK"),//3. kolona stok bilgisi
                    rs.getBigDecimal("urunFIYAT"),//4 kolona fiyat bilgisi
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Hata: " + ex.getMessage());
        }
        //görselin sığabilmesi için satırları yeniden yapılandırıyoruz(sadece yüksekliğini)
        tabloGorselAyarla(uruntable, 42, 0);

    }//GEN-LAST:event_cbmodelİtemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //form açılınca ilgili diğer comboboxlar dolsun diye cbkategori'yi dolduruyouz
        try {//kullanıcıIDye denk gelen kategoriAD'ları(kategori tablosunda kullanıcıID olmadığı için biraz dolanarak geldik) çekmek için kullanılan sorgu
            String sql = """
            SELECT DISTINCT k.kategoriAD 
            FROM urun_bilgi ub
            JOIN model m ON ub.modelID = m.modelID
            JOIN altkategori a ON m.altkategoriID = a.altkategoriID
            JOIN kategori k ON a.kategoriID = k.kategoriID
            WHERE ub.kullaniciID = ?
        """;
            //sorguyu çalıştırmak için bağlantı cümleciği
            PreparedStatement pstmt = baglanti.prepareStatement(sql);
            pstmt.setInt(1, kullaniciID);//sorgudaki tek boşluğu kullanıcıID ile dolduruyouz
            ResultSet rs = pstmt.executeQuery();//sorguyu çalıştırıyoruz

            cbkategori.removeAllItems(); // Önce combobox temizle(default itemlere karşı)
            while (rs.next()) {//birden fazla kategoriAD olmasına karşi while döngüsünü kullanıyoruz
                String kategoriAd = rs.getString("kategoriAD");//sorgudan gelen kategoiAD'ı değişkene atıyoruz
                cbkategori.addItem(kategoriAd);//değişkenimizi comboboxa ekliyoruz
            }
        } catch (Exception e) {//herhangi bir hata almamıza karşı hatayı kullanıcıya messagebox ile veriyoruz
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnsepeteekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsepeteekleActionPerformed
        int selectedRow = uruntable.getSelectedRow();//ürün tablosundan seçilen satırı alıyoruz
        if (selectedRow == -1) {//eğer herhangibir ürün seçilmediyse
            JOptionPane.showMessageDialog(null, "Lütfen bir ürün seçin.");//kullanıcıya ürün seçmesi için göderilen messagebox
            return;
        }

        //ürün tablosundan gerekli verileri al
        ImageIcon goruntu = (ImageIcon) uruntable.getValueAt(selectedRow, 0); // Görsel
        Object modelAdi = uruntable.getValueAt(selectedRow, 1); // Model adı
        Object stokobj = uruntable.getValueAt(selectedRow, 2);//stok bilgisi
        Object fiyatObj = uruntable.getValueAt(selectedRow, 3); // Fiyat (4. sütun, index 3)

        int stok = Integer.parseInt((stokobj).toString());//stok bilgisini object değişkenden integer değişkene çeviriyoruz 
        int adet = (int) adetspinner.getValue();//spinnerden gelen veriyi integer değişkenine çeviriyoruz
        if (adet == 0) {//spinner değeri 0 ise kullanıcının miktar seçmesini istiyoruz
            JOptionPane.showMessageDialog(null, "Ürün adedini giriniz!!");//messagebox
            return;
        }
        //fiyatı bulmak için double değişken tanımlıyoruz
        double fiyat = 0;
        try {//tablodan gelen object fiyatı double fiyat değişkenine atıyoruz
            fiyat = Double.parseDouble(fiyatObj.toString());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Geçersiz fiyat formatı.");
            return;
        }
        if (adet > stok) {//satılcak adet miktarı stok miktarından fazla olamaz
            JOptionPane.showMessageDialog(this, "Yeterli stok yok, mevcut stok:" + stok);
            return;
        }
        int yenistok = stok - adet;//yeterli stok varsa eldeki stoktan düşüyoruz
        double tutar = fiyat * adet;//toplam fiyat hesaplama
        //sepet tablosunun kopyasını alıyoruz
        DefaultTableModel sepetModel = (DefaultTableModel) sepettable.getModel();
        // Yeni satır oluştur ve tabloya ekle
        tabloGorselAyarla(sepettable, 42, 0);//satır yüksekliğini ayarlıyoruz
        Object[] yeniSatir = {goruntu, modelAdi, adet, tutar};//object yeni satır oluşturuyoruz
        uruntable.setValueAt(yenistok, uruntable.getSelectedRow(), 2);//önce ürün tablosundan stok düşürüyoruz
        sepetModel.addRow(yeniSatir);//kopyamıza yenisatırı ekliyoruz
        int urunadedi = 0;//sepet tablosuna adet eklemek için değiken tanımlıyoruz
        double toplam = 0.0;//sepet tablosuna fiyat eklemek için yeni değişken tanımlıyoruz

        for (int i = 0; i < sepettable.getRowCount(); i++) {//toplam fiyat ve ürün adedi için for döngüsü açıyoruz
            // Adet hesaplama (3. sütun)
            Object adetObj = sepettable.getValueAt(i, 2);//sepetteki 3. sütunda bulunan adet bilgilerini çekiyoruz
            if (adetObj != null) {//adetObj içinde bir değer olmalı ki gelen adetle toplayabilelim
                try {
                    urunadedi += Integer.parseInt(adetObj.toString()); // burada int kullanmak daha mantıklı
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Adet okuma hatası (satır " + (i + 1) + "): " + e);//adet bilgisi okunamayan satırı kullanıcıya göster
                }
            }

            // Tutar hesaplama (4. sütun)
            Object tutarObj = sepettable.getValueAt(i, 3);
            if (tutarObj != null) {//tutarObj içinde bir değer olmalı ki gelen tutarla toplayabilelim 
                try {
                    toplam += Double.parseDouble(tutarObj.toString());//daha sonra kullanmak için gelen tüm toplamları topluyoruz
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Tutar okuma hatası (satır " + (i + 1) + "): " + e);
                }
            }
        }

        lblsepet.setText("Sepet (" + urunadedi + " ürün)");//sepetteki toplam adet bilgisini labele gönder 
        btnsat.setText("Satışı Tamamla (" + String.format("%.2f", toplam) + "₺)");//toplam fiyatı butona atıyoruz
        adetspinner.setValue(0);//spinneri sıfırlıyoruz
    }//GEN-LAST:event_btnsepeteekleActionPerformed

    private void btnsepettencikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsepettencikarActionPerformed
        int selectedrow = sepettable.getSelectedRow();//sepetten çıkarılacak satırı seçiyoruz
        if (selectedrow == -1) {//eğer seçim yapılmadıysa kullanıcıyı uyar
            JOptionPane.showMessageDialog(this, "Lütfen çıkarılacak ürünü seçiniz");
            return;
        }
        Object eklenecekadetobj = sepettable.getValueAt(selectedrow, 2);//çıkarılan ürünün stok bilgisini geri eklemek için object alıyoruz
        int eklenecekadet = Integer.parseInt((eklenecekadetobj).toString());//stok bilgisini int yapıyoruz
        Object model = sepettable.getValueAt(selectedrow, 1);//stok eklenecek modelin adını alıyoruz

        int eklenecekrow = -1;//stoğun ekleneceği satırı alıyoruz 
        for (int i = 0; i < uruntable.getRowCount(); i++) {//ürün tablosundaki satır sayısına göre for döngüsü yapıyoruz
            Object urunmodel = uruntable.getValueAt(i, 1);//ürünün modeladını alıyoruz
            if (model != null && urunmodel != null && model.equals(urunmodel)) {//eşleşen model bulunduysa
                eklenecekrow = i;//eklenecek satırı atıyoruz
                break;
            }
        }
        if (eklenecekrow == -1) {//eğer bulunamadıysa kullanıcıyı uyar
            JOptionPane.showMessageDialog(null, "ürün tablosunda çıkarılacak ürünün görünmesi gerekiyor");
            return;
        }
        int kalanadet = Integer.parseInt(((Object) uruntable.getValueAt(eklenecekrow, 2)).toString());//kalan stok adedi alınıyor
        int sonuc = eklenecekadet + kalanadet;//kalan stok ve eklenecek stok toplanıyor
        uruntable.setValueAt(sonuc, eklenecekrow, 2);//güncel stok bilgisi ürün tablosuna ekleniyor
        DefaultTableModel dtm = (DefaultTableModel) sepettable.getModel();//sepet tablosu model şeklinde alınıyor
        dtm.removeRow(selectedrow);//seçilen satırı modelden kaldırıyoruz
        int urunadedi = 0;//kalan ürün adedini bulmak için değişken atıyoruz
        for (int i = 0; i < sepettable.getRowCount(); i++) {//sepet tablosunun tüm satırlarını gezen for döngüsü
            Object adet = sepettable.getValueAt(i, 2);//3. kolondaki adet bilgisi alınıyor
            if (adet != null) {//adet bilgisi boş değil ise
                try {//gelen adet ile sonuç olacak adedi topluyoruz
                    urunadedi += Integer.parseInt(adet.toString());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Adetler toplırken hata oluştu: " + e);
                }
            }
        }
        lblsepet.setText("Sepet(" + urunadedi + " ürün)");//toplanmış yani sepette olan toplam ürün adedini labele yazdırıyoruz
        double toplam = 0;//toplam fiyat için değişken atıyoruz
        for (int i = 0; i < sepettable.getRowCount(); i++) {//sepet tablosundaki tüm satırları gezen for döngüsü
            Object deger = sepettable.getValueAt(i, 3);//4kolon ürünlerin tutarları
            if (deger != null) {//değer değişkeni yani tutar değişkeni boş değil ise 
                try {
                    toplam += Double.parseDouble(deger.toString()); //gelen object tutarı int yapıp toplam sepet için toplam değişkenine atıyoruz
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Geçersiz sayı formatı:" + e);
                }
            }
        }
        btnsat.setText("Satışı Tamamla(" + toplam + "₺)");//toplam tutarı butona yazırıyoruz

    }//GEN-LAST:event_btnsepettencikarActionPerformed

    private void btnsatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsatActionPerformed
        DefaultTableModel model = (DefaultTableModel) sepettable.getModel();//bazı işlemleri yapabilemk için sepet tablosunun modelini alıyoruz
        for (int i = sepettable.getRowCount() - 1; i >= 0; i--) {//sepet tablosundaki tüm satırları gezmek için gerekli döngü
            String modelad = (String) sepettable.getValueAt(i, 1);//i. satırdaki model adını alıyoruz
            int adet = Integer.parseInt((sepettable.getValueAt(i, 2)).toString());//i. satırdaki adet miktarını alıyoruz
            Double fiyat = Double.valueOf((sepettable.getValueAt(i, 3)).toString());//i. satırdaki tutar miktarını alıyoruz
            int modelıd = -1;//modelAD dan modelID almak için gerekli değişken 
            int vergiyuzdesi = 0;//veritabanından vergi yüzdesini almak için gerekli
            double vergisizfiyat;//vergisi düşürülmüş fiyat için gerekli olan değişken
            double uygulamakesintisi;//%1 uygulama kesintisini atmak için gerekli olan değişken
            double verilecekvergi;//yüzdeye göre verdiğimiz vergi miktarı için değişken 
            double toplamkar;//toplam kârımız için gereken değişken
            int urunıd = 0;//modelID ye göre ürünID almamız için gerekli olan değişken
            int satisid = 0;//veritabanında ilgili yere satır eklemek için gerkli olan değişken 
            double urungelisfiyat = 0;//kâr miktarını tam hesaplamak için ürünün geliş fiyatını da almamız gerek

            //modelAD'a göre modelID aldığımız sql sorgusu
            try {
                String sql = "SELECT modelID FROM model WHERE modelAD=?";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setString(1, modelad);//boşluğu modelad ile doldur
                ResultSet rs = ps.executeQuery();//sorguyu çalıştır
                if (rs.next()) {
                    modelıd = rs.getInt("modelID");//modelıd içini modelID ile doldur
                } else {//olmazsa kullanıcıya hata mesajı ver
                    JOptionPane.showMessageDialog(null, "Model alınamadı");
                    return;
                }
            } catch (SQLException e) {//SQL kısmında hata çıkarsa kullanıcıya bildir
                JOptionPane.showMessageDialog(null, "Veritabanı hatası:" + e);
            }
            //vergi miktarını aldığımız sql sorgusu ve kod bloğu
            try {
                String sql = "SELECT urunVERGI FROM urun_bilgi WHERE modelID=?";
                PreparedStatement pst = baglanti.prepareStatement(sql);
                pst.setInt(1, modelıd);//boşluğu doldur
                ResultSet rs = pst.executeQuery();//sorguyu çalıştır
                if (rs.next()) {
                    vergiyuzdesi = rs.getInt("urunVERGI");//gelen urunVERGI yi vergiyuzdesi değişkenine at
                } else {//vergi yüzdesi alınamazsa kullanıcıya bildir
                    JOptionPane.showMessageDialog(null, "Vergi miktarı alınamadı");
                    return;
                }
            } catch (SQLException e) {//SQL kısmında hata çıkarsa hatayı kullanıcıya bildir
                JOptionPane.showMessageDialog(this, "Veritabanı hatası:" + e);
            }
            //urunID yi aldığımız sql sorgusu ve kod bloğu
            try {
                String sql = "SELECT urunID FROM urun_bilgi WHERE modelID=? and kullaniciID=?";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setInt(1, modelıd);//boşluğu doldur
                ps.setInt(2, kullaniciID);//kullanıcıID boşluğunu doldur
                ResultSet rs = ps.executeQuery();//sorguyu çalıştır
                if (rs.next()) {
                    urunıd = rs.getInt("urunID");//gelen değişkeni urunıd değişkenine at
                } else {
                    JOptionPane.showMessageDialog(null, "urunID alınırken hata oluştu");//hata olursa kullanıcıya bildir
                    return;
                }
            } catch (SQLException e) {//sql kısmında hata çıkarsa kullanıcıya bildir
                JOptionPane.showMessageDialog(null, "Veritabanı hatası:" + e);
            }
            //urunGELISFIYAT'nı aldığımız sorgu ve kod bloğu
            try {
                String sql = "SELECT urunGELISFIYAT FROM urun_bilgi WHERE urunID=?";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setInt(1, urunıd);//boşluğu doldur
                ResultSet rs = ps.executeQuery();//sorguyu çalıştır
                if (rs.next()) {
                    urungelisfiyat = rs.getDouble("urunGELISFIYAT");//sorgudan gelen değişkeni koddaki değişkene atıyoruz
                } else {//hata durumunda kullanıcıya bildiriyoruz
                    JOptionPane.showMessageDialog(null, "Ürün geliş fiyatı alınırken bir hata oluştu");
                }
            } catch (SQLException e) {//sql kısmında hata olursa kullanıcıya hata ile birlikte bildiriyoruz
                JOptionPane.showMessageDialog(null, "Veritabanı hatası:" + e);
            }
            //verilecek vergi uygulama kesintisi kar gider işlemleri
            verilecekvergi = (fiyat / 100) * (vergiyuzdesi);
            vergisizfiyat = fiyat - verilecekvergi;
            uygulamakesintisi = vergisizfiyat / 100;
            toplamkar = fiyat - (adet * urungelisfiyat) - (verilecekvergi + uygulamakesintisi);
            //satis tablosuna kayıt ekleme
            try {
                BigDecimal bdfiyat = BigDecimal.valueOf(fiyat);//veritabanındaki değişken bigdecimal olduğu için tür değişimi yapıyoruz
                String sql = "INSERT INTO satis (kullaniciID, urunID, adet, toplamTUTAR, islem) VALUES (?, ?, ?, ?, 'Satış')";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setInt(1, kullaniciID);//values kısmındaki boşlukları dolduruyoruz
                ps.setInt(2, urunıd);
                ps.setInt(3, adet);
                ps.setBigDecimal(4, bdfiyat);
                ps.executeUpdate();//sorguyu çalıştır
            } catch (SQLException e) {//sql kısmında bir hata çıkarsa hata ile birlikte kullanıcıya bildiriyoruz
                JOptionPane.showMessageDialog(null, "Hata: " + e);
            }
            //gunluk_gider tablosuna kayıt eklemek için satısID alıyoruz
            try {//kullanıcıID ve urunID ye göre tarih sıralaması yapıyoruz ve en sonuncuyu alıyoruz
                String sql = "SELECT TOP 1 satisID FROM satis WHERE kullaniciID=? AND urunID =? ORDER BY satisTARIH DESC";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setInt(1, kullaniciID);//boşluk doldurma
                ps.setInt(2, urunıd);//boşluk doldurma
                ResultSet rs = ps.executeQuery();//sorguyu çalıştır
                if (rs.next()) {
                    satisid = rs.getInt("satisID");//alınan satısID yi kodumuzdaki değişkene atıyoruz
                } else {//hata olması durumunda hiçbirşey yapmıyoruz
                    return;
                }
            } catch (SQLException e) {//sql kısmında hata olması durumunda hata ile birlikte kullanıcıya bildir
                JOptionPane.showMessageDialog(null, "Veritabanı hatası5:" + e);
            }
            //gunluk_gider tablosuna kayıt ekleme
            try {

                String sql = "INSERT INTO gunluk_gider(kullaniciID,urunID,satisID,toplamCIRO,toplamVERGI,toplamUYGKES,toplamMALIYET,toplamKAR) VALUES (?,?,?,?,?,?,?,?)";
                BigDecimal bdfiyat = BigDecimal.valueOf(fiyat);//veritabanındaki değişkenler sebebiyle double olan değişkenleriBigDecimal yapıyoruz
                BigDecimal bdverilecekvergi = BigDecimal.valueOf(verilecekvergi);
                BigDecimal bduygulamakesintisi = BigDecimal.valueOf(uygulamakesintisi);
                BigDecimal bdmaliyet = BigDecimal.valueOf(adet * urungelisfiyat);
                BigDecimal bdtoplamkar = BigDecimal.valueOf(toplamkar);
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setInt(1, kullaniciID);//sorgudaki boşlukları doldurma
                ps.setInt(2, urunıd);
                ps.setInt(3, satisid);
                ps.setBigDecimal(4, bdfiyat);
                ps.setBigDecimal(5, bdverilecekvergi);
                ps.setBigDecimal(6, bduygulamakesintisi);
                ps.setBigDecimal(7, bdmaliyet);
                ps.setBigDecimal(8, bdtoplamkar);
                ps.executeUpdate();//sorguyu çalıştır
            } catch (SQLException e) {////veritabanında hata olmasına karşı kullanıcıya hata ile birlikte messagebox gönder
                JOptionPane.showMessageDialog(null, "Veritabanı hatası:" + e);
            }
            //stoktan satılan adedi düşmek için gereken kodve sorgu
            try {
                String sql = "UPDATE urun_bilgi SET urunSTOK = urunSTOK- ? WHERE urunID=?";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setInt(1, adet);//boşlukları doldur
                ps.setInt(2, urunıd);
                ps.executeUpdate();//sorguyu çalıştır
            } catch (SQLException e) {//olası sql hatasında kullanıcıya bildir
                JOptionPane.showMessageDialog(null, "Veritabanı hatası:" + e);
            }
            model.removeRow(i);//satışı yapılan ve tüm işlemleri biten satırı sil
        }
        if (sepettable.getRowCount() == 0) {//eğer satır boşaltılmış ise toolların değişkenlerini düzelt
            btnsat.setText("Satış Tamamlandı");
            lblsepet.setText("Sepet(0 ürün)");
        }
    }//GEN-LAST:event_btnsatActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new urunsat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Geri;
    private javax.swing.JSpinner adetspinner;
    private javax.swing.JButton btnsat;
    private javax.swing.JButton btnsepeteekle;
    private javax.swing.JButton btnsepettencikar;
    private javax.swing.JComboBox<String> cbaltkategori;
    private javax.swing.JComboBox<String> cbkategori;
    private javax.swing.JComboBox<String> cbmodel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblsepet;
    private javax.swing.JTable sepettable;
    private javax.swing.JTextField tfbarkod;
    private javax.swing.JTable uruntable;
    // End of variables declaration//GEN-END:variables
}
