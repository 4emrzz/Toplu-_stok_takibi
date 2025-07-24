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

public class stokekle extends javax.swing.JFrame {

    public stokekle() {
        initComponents();
    }
    Connection baglanti = veritabani.baglantiAl();//bağlantı metodunu çağır
    int kullaniciID = giris.kullaniciID;//giriş formundan kullaniciID çağır

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngeri = new javax.swing.JButton();
        cbkategori = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbaltkategori = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbmodel = new javax.swing.JComboBox<>();
        miktarspinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        btnstokguncelle = new javax.swing.JButton();
        cbfiyatguncelle = new javax.swing.JCheckBox();
        tfyenifiyat = new javax.swing.JTextField();
        cbvergiguncelle = new javax.swing.JCheckBox();
        tfyenivergi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnguncelle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtbarkod = new javax.swing.JTextField();
        tfmaliyet = new javax.swing.JTextField();
        cbmaliyetguncelle = new javax.swing.JCheckBox();

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

        cbkategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbkategoriİtemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Kategori");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Alt kategori");

        cbaltkategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbaltkategoriİtemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Model");

        cbmodel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmodelİtemStateChanged(evt);
            }
        });

        miktarspinner.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("İşlem yapılacak adet");

        btnstokguncelle.setBackground(new java.awt.Color(51, 255, 0));
        btnstokguncelle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnstokguncelle.setText("Stok bilgilerini güncelle");
        btnstokguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstokguncelleActionPerformed(evt);
            }
        });

        cbfiyatguncelle.setText("Fiyat güncelle");
        cbfiyatguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbfiyatguncelleActionPerformed(evt);
            }
        });

        tfyenifiyat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        cbvergiguncelle.setText("Vergi güncelle");
        cbvergiguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbvergiguncelleActionPerformed(evt);
            }
        });

        tfyenivergi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Barkod");

        btnguncelle.setBackground(new java.awt.Color(102, 255, 255));
        btnguncelle.setText("Güncelle");
        btnguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguncelleActionPerformed(evt);
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
                "Görsel", "Model", "Barkod", "Stok", "Maliyet(₺)", "Fiyat(₺)", "Vergi(%)"
            }
        ));
        table.setRowHeight(80);
        jScrollPane1.setViewportView(table);

        txtbarkod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbarkodKeyReleased(evt);
            }
        });

        cbmaliyetguncelle.setText("Maliyet güncelle");
        cbmaliyetguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmaliyetguncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(miktarspinner))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfyenifiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfyenivergi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfmaliyet, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(cbfiyatguncelle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbvergiguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbmaliyetguncelle))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btngeri)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbarkod, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(cbkategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbaltkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnstokguncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btngeri)
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(txtbarkod, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbaltkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbfiyatguncelle)
                    .addComponent(cbvergiguncelle)
                    .addComponent(cbmaliyetguncelle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(miktarspinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfyenifiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfyenivergi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnstokguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfmaliyet, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        //geri butonuna basılınca ana formu aç bu formu kapat(.dispose())
        ana Ana = new ana();
        Ana.setVisible(true);
        Ana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btngeriActionPerformed

    private void cbfiyatguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbfiyatguncelleActionPerformed
        //checkbox işaretlenir ise
        if (cbfiyatguncelle.isSelected() == true) {//checkbox işaretli ise 
            tfyenifiyat.setEnabled(true);//textfield'in erişilebilirliğini aç
            btnguncelle.setEnabled(true);//butonun erişilebilirliğini aç
        } else {// combobox işaterli DEĞİL ise 
            if (tfyenifiyat.getText().trim().isEmpty()) {//ve textfield boş ise
                tfyenifiyat.setEnabled(false);//textfield'in erişilebilirliğini kapat
                if (cbvergiguncelle.isSelected() == false || cbmaliyetguncelle.isSelected() == false) {//aynı zamanda diğer 2 checkbox'ta işaretli değilse butonun erişilebilirliğini kapat
                    btnguncelle.setEnabled(false);
                }
            } else {//textfield boş değil ise hata mesajı döndür ve checkbox'u aynı haline çevir
                JOptionPane.showMessageDialog(null, "Fiyat güncellemek istemiyorsanız alanı temizleyin!!");
                cbfiyatguncelle.setSelected(true);
            }
        }
    }//GEN-LAST:event_cbfiyatguncelleActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tfyenifiyat.setEnabled(false);//form açılınca textfield'in erişilebilirliğini kapat
        tfyenivergi.setEnabled(false);//form açılınca textfield'in erişilebilirliğini kapat
        tfmaliyet.setEnabled(false);//form açılınca textfield'in erişilebilirliğini kapat
        btnguncelle.setEnabled(false);//form açılınca buton'un erişilebilirliğini kapat
        //*******************************************
        try {//kullanıcıID ye göre ilgili ürünleri ve değişkeni çek urun_bilgi->model->altkategori->kategori
            String sql = """
            SELECT DISTINCT k.kategoriAD 
            FROM urun_bilgi ub
            JOIN model m ON ub.modelID = m.modelID
            JOIN altkategori a ON m.altkategoriID = a.altkategoriID
            JOIN kategori k ON a.kategoriID = k.kategoriID
            WHERE ub.kullaniciID = ?
        """;
            PreparedStatement pstmt = baglanti.prepareStatement(sql);
            pstmt.setInt(1, kullaniciID);//boşluğu doldur
            ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır
            cbkategori.removeAllItems(); // Önce temizle
            while (rs.next()) {//birden fazla item gelmesine karşın while
                String kategoriAd = rs.getString("kategoriAD");//gelen kategoriAD'ları string ifadeye çeviriyoruz
                cbkategori.addItem(kategoriAd);//gelen string değişkeni comboboxa atıyoruz
            }
        } catch (Exception e) {//olası sql hatasına karşı bildirim
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void cbvergiguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbvergiguncelleActionPerformed
        //checkbox işaretlenir ise 
        if (cbvergiguncelle.isSelected() == true) {//checkbox işaretli ise
            tfyenivergi.setEnabled(true);//textfield'in erisilebilirligini aç
            btnguncelle.setEnabled(true);//butonun erisilebilirligini aç
        } else {// combobox isaterli DEGIL ise 
            if (tfyenivergi.getText().trim().isEmpty()) {//ve textfield bos ise
                tfyenivergi.setEnabled(false);//textfield'in erisilebilirligini kapat
                if (cbfiyatguncelle.isSelected() == false && cbmaliyetguncelle.isSelected() == false) {//ayni zamanda diger 2 checkbox'ta isaretli degilse butonun erisilebilirligini kapat
                    btnguncelle.setEnabled(false);//butonun erişilebilirliğini kapat
                }
            } else {//textfield bos degil ise hata mesaji döndür ve checkbox'u ayni haline çevir
                JOptionPane.showMessageDialog(null, "Vergi güncellemek istemiyorsanız alanı temizleyin!!");
                cbvergiguncelle.setSelected(true);
            }
        }
    }//GEN-LAST:event_cbvergiguncelleActionPerformed

    private void cbkategoriİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbkategoriİtemStateChanged
        String secilenKategori = (String) cbkategori.getSelectedItem();//comboboxtan gelen itemi string olarak alıyoruz
        if (secilenKategori == null) {//değişken boş ise
            cbaltkategori.removeAllItems();//alt kategori comboboxu temizle
            ((DefaultTableModel) table.getModel()).setRowCount(0);//tabloyu temizle
            return;
        }
        //kullaniciID ve kategoriAD'ına göre altkategoriAD larını çeken sorgu
        try {
            String sqlAltKategori = """
        SELECT DISTINCT a.altkategoriAD 
        FROM urun_bilgi ub
        JOIN model m ON ub.modelID = m.modelID
        JOIN altkategori a ON m.altkategoriID = a.altkategoriID
        JOIN kategori k ON a.kategoriID = k.kategoriID
        WHERE ub.kullaniciID = ? AND k.kategoriAD = ?
    """;

            try (PreparedStatement pstmt = baglanti.prepareStatement(sqlAltKategori)) {
                pstmt.setInt(1, kullaniciID);//1. boşluğu dolduruyoruz
                pstmt.setString(2, secilenKategori);//2. boşluğu dolduruyoruz
                ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır

                cbaltkategori.removeAllItems();//comboboxu temizle
                while (rs.next()) {//birden fazla altkategoriAD gelebilir while
                    cbaltkategori.addItem(rs.getString("altkategoriAD"));//gelen altkategoriADlarını comboboxa ekliyoruz
                }
            }

            // seçilen kategoriAD göre ve kullanıcıID ye göre ürünleri çeken sorgu ve kod bloğu
            String sqlUrunler = """
        SELECT ub.urunGORSELYOLU, m.modelAD, ub.urunBARKOD, ub.urunSTOK,ub.urunGELISFIYAT, ub.urunFIYAT, ub.urunVERGI
        FROM urun_bilgi ub
        JOIN model m ON ub.modelID = m.modelID
        JOIN altkategori a ON m.altkategoriID = a.altkategoriID
        JOIN kategori k ON a.kategoriID = k.kategoriID
        WHERE ub.kullaniciID = ? AND k.kategoriAD = ?
    """;

            try (PreparedStatement pstmt = baglanti.prepareStatement(sqlUrunler)) {
                pstmt.setInt(1, kullaniciID);//1. boşluğu kullanıcıID ile dolduruyoruz
                pstmt.setString(2, secilenKategori);//2. boşluğa secilen kategori adı ile dolduruyoruz
                ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır

                DefaultTableModel modelTablo = (DefaultTableModel) table.getModel();
                modelTablo.setRowCount(0);//tabloyu temizle

                while (rs.next()) {
                    ImageIcon icon = new ImageIcon(rs.getString("urunGORSELYOLU"));//ürün görsel yolundan görseli al
                    Image img = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);//yeniden boyutlandırmak için değişkenini değiştiriyoruz
                    ImageIcon scaledIcon = new ImageIcon(img);//yeniden boyutlandırılan görseli kullanabileceğimiz değişkene atıyoruz

                    modelTablo.addRow(new Object[]{//tabloya satır ekle
                        scaledIcon,//1. kolon görsel
                        rs.getString("modelAD"),//2. kolon modelAD
                        rs.getString("urunBARKOD"),//3. kolon barkod
                        rs.getInt("urunSTOK"),//4. kolon stok bilgisi
                        rs.getBigDecimal("urunGELISFIYAT"),//5. kolon maliyet 
                        rs.getBigDecimal("urunFIYAT"),//6. kolon satış fiyatı
                        rs.getInt("urunVERGI")//7. kolon vergi yüzdesi
                    });
                }
            }
        } catch (Exception ex) {//herhangi bir hataya karşı messagebox gönderiyoruz
            JOptionPane.showMessageDialog(null, "Hata: " + ex.getMessage());
        }

        tabloGorselAyarla(table, 100, 0);// satır yüksekliğini ayarlıyoruz

    }//GEN-LAST:event_cbkategoriİtemStateChanged

    private void cbaltkategoriİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbaltkategoriİtemStateChanged
        String secilenAltKategori = (String) cbaltkategori.getSelectedItem();//comboboxtan seçilen alt kategoriyi string olarak alıyoruz
        if (secilenAltKategori == null) {//birşey seçilmemiş ise bişey yapmıyoruz
            return;
        }

        try {
            // Alt kategori ve kullanıcıID ye bağlı modelleri çek
            String sqlModeller = """
        SELECT DISTINCT m.modelAD 
        FROM urun_bilgi ub
        JOIN model m ON ub.modelID = m.modelID
        JOIN altkategori a ON m.altkategoriID = a.altkategoriID
        WHERE ub.kullaniciID = ? AND a.altkategoriAD = ?
    """;

            try (PreparedStatement pstmt = baglanti.prepareStatement(sqlModeller)) {
                pstmt.setInt(1, kullaniciID);//1. boşluğa kullanıcıID ekliyoruz
                pstmt.setString(2, secilenAltKategori);//2. boşluğa seçilen alt kategoriyi ekliyoruz
                ResultSet rs = pstmt.executeQuery();//sorguyu çalıştırıyoruz

                cbmodel.removeAllItems();  //combobox'u temizle
                while (rs.next()) {//birden fazla item gelmesine karşı while
                    cbmodel.addItem(rs.getString("modelAD"));//comboboxa gelen model adını ekliyoruz
                }
            }

            // alt kategori comboboxundan seçime göre tabloyu dolduruyoruz sorgu ve kodlar
            String kategori = (String) cbkategori.getSelectedItem();//kategori adını string olarak alıyoruz
            String sqlUrunler = """
        SELECT ub.urunGORSELYOLU, m.modelAD, ub.urunBARKOD, ub.urunSTOK,ub.urunGELISFIYAT, ub.urunFIYAT, ub.urunVERGI
        FROM urun_bilgi ub
        JOIN model m ON ub.modelID = m.modelID
        JOIN altkategori a ON m.altkategoriID = a.altkategoriID
        JOIN kategori k ON a.kategoriID = k.kategoriID
        WHERE ub.kullaniciID = ? AND k.kategoriAD = ? AND a.altkategoriAD = ?
    """;

            try (PreparedStatement pstmt = baglanti.prepareStatement(sqlUrunler)) {
                pstmt.setInt(1, kullaniciID);//1. boşluk kullanıcıID
                pstmt.setString(2, kategori);//2. boşluk kategoriAD
                pstmt.setString(3, secilenAltKategori);//3. boşluk altkategori ad
                ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır

                DefaultTableModel modelTablo = (DefaultTableModel) table.getModel();
                modelTablo.setRowCount(0);//tabloyu temzile

                while (rs.next()) {//fazla item gelmesine karşı döngü kullanıyoruz
                    ImageIcon icon = new ImageIcon(rs.getString("urunGORSELYOLU"));//ürünü görsel yolu ile alıyoruz
                    Image img = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);//yeniden boyutlandırma
                    ImageIcon scaledIcon = new ImageIcon(img);//kullanılabilecek haşe getirme

                    modelTablo.addRow(new Object[]{//object satır 
                        scaledIcon,//ürün görseli
                        rs.getString("modelAD"),//model adı 
                        rs.getString("urunBARKOD"),//barkod
                        rs.getInt("urunSTOK"),//stok bilgisi
                        rs.getBigDecimal("urunGELISFIYAT"),//geliş fiyatı
                        rs.getBigDecimal("urunFIYAT"),//ürünün fiyatı
                        rs.getInt("urunVERGI")//vergi miktarı
                    });
                }
            }
        } catch (Exception ex) {//olası hata durumuna karşı chath bloğu
            JOptionPane.showMessageDialog(null, "Hata: " + ex.getMessage());
        }

        tabloGorselAyarla(table, 100, 0);//tablonun yüksekliğini ayarlama methodu
    }//GEN-LAST:event_cbaltkategoriİtemStateChanged

    private void cbmodelİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmodelİtemStateChanged
        String kategori = (String) cbkategori.getSelectedItem();//comboboxtan seçilen kategoriyi string olarak alıyoruz
        String altkategori = (String) cbaltkategori.getSelectedItem();//comboboxtan seçilen alt kategoriyi string olarak alıyoruz
        String model = (String) cbmodel.getSelectedItem();//comboboxtan seçilen modeli string olarak alıyoruz
        //aslında sadece modelID yeterdi ama bu değikenler ve kullanıcıID ile ürünlerin bilgilerini çeken sorgu ve ko bloğu
        String sql = """
    SELECT ub.urunGORSELYOLU, m.modelAD, ub.urunBARKOD, ub.urunSTOK,ub.urunGELISFIYAT, ub.urunFIYAT, ub.urunVERGI
    FROM urun_bilgi ub
    JOIN model m ON ub.modelID = m.modelID
    JOIN altkategori a ON m.altkategoriID = a.altkategoriID
    JOIN kategori k ON a.kategoriID = k.kategoriID
    WHERE ub.kullaniciID = ? AND k.kategoriAD = ? AND a.altkategoriAD = ? AND m.modelAD = ?
""";

        try (PreparedStatement pstmt = baglanti.prepareStatement(sql)) {
            pstmt.setInt(1, kullaniciID);//boşluğu doldur
            pstmt.setString(2, kategori);//boşluğu doldur
            pstmt.setString(3, altkategori);//boşluğu doldur
            pstmt.setString(4, model);//boşlu doldur

            ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır
            DefaultTableModel modelTablo = (DefaultTableModel) table.getModel();//tablonun modelini bir nevi kopyasını al
            modelTablo.setRowCount(0);//tabloyu temizle

            while (rs.next()) {//birden fazla item için döngü
                ImageIcon icon = new ImageIcon(rs.getString("urunGORSELYOLU"));//ürün görsel yolu ile görseli alıyoruz
                Image scaledImage = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);//yeniden boyutlandır
                ImageIcon scaledIcon = new ImageIcon(scaledImage);//yeniden boyutlanırılmış görseli kullanabileceğimiz hale getiriyoruz

                modelTablo.addRow(new Object[]{//yeniobject satır ekliyoruz modele
                    scaledIcon,//görselin son hali
                    rs.getString("modelAD"),//model adı
                    rs.getString("urunBARKOD"),//barkod numarası
                    rs.getInt("urunSTOK"),//strok bilgisi
                    rs.getBigDecimal("urunGELISFIYAT"),//maliyet fiyatı
                    rs.getBigDecimal("urunFIYAT"),//satış fiyatı
                    rs.getInt("urunVERGI")//vergi yüzdesi
                });
            }
        } catch (Exception ex) {//herhangi bir hata durmuna karşı kullanıcıya bildir
            JOptionPane.showMessageDialog(null, "Hata: " + ex.getMessage());
        }

        tabloGorselAyarla(table, 100, 0);//tablonun yüksekliğini ayarla

    }//GEN-LAST:event_cbmodelİtemStateChanged
    private void barkodaGoreListele(String barkodArama) {//tf barkoda girilen değişkene göre sonuç getirmesi için method
        if (barkodArama == null || barkodArama.isEmpty()) {//gelen string değişken boş ise 
            ((DefaultTableModel) table.getModel()).setRowCount(0); // Tabloyu temizle
            return;
        }
        //kullanıcıID ve içinde yazılan barkodu içeren tüm sonuçları getir
        String sql = """
    SELECT ub.urunGORSELYOLU, m.modelAD, ub.urunBARKOD, ub.urunSTOK, ub.urunGELISFIYAT,ub.urunFIYAT, ub.urunVERGI
    FROM urun_bilgi ub
    JOIN model m ON ub.modelID = m.modelID
    JOIN altkategori a ON m.altkategoriID = a.altkategoriID
    JOIN kategori k ON a.kategoriID = k.kategoriID
    WHERE ub.kullaniciID = ? AND ub.urunBARKOD LIKE ?
""";

        try (PreparedStatement pstmt = baglanti.prepareStatement(sql)) {
            pstmt.setInt(1, kullaniciID);//kullanıcıID'yi 1. boşluğa koy
            pstmt.setString(2, "%" + barkodArama + "%");//gelen değişkeni içeren tüm sonuçlar

            ResultSet rs = pstmt.executeQuery();//sorguyu çalıştır
            DefaultTableModel modelTablo = (DefaultTableModel) table.getModel();
            modelTablo.setRowCount(0);//tabloyu temizle

            while (rs.next()) {//birden fazla sorgu gelmesi ihtimali için döngü
                ImageIcon icon = new ImageIcon(rs.getString("urunGORSELYOLU"));//görsel yolundan ürünü al
                Image scaledImage = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);//yeniden yapılandır
                ImageIcon scaledIcon = new ImageIcon(scaledImage);//yeniden yapılandırılan görseli kullanabileceğimiz formata al

                modelTablo.addRow(new Object[]{//object satır ekleyeceğiz içini altta dolduracağız
                    scaledIcon,//görsel
                    rs.getString("modelAD"),//model adı
                    rs.getString("urunBARKOD"),//barkod numarası
                    rs.getInt("urunSTOK"),//stok bilgisi
                    rs.getBigDecimal("urunGELISFIYAT"),//maliyet fiyatı
                    rs.getBigDecimal("urunFIYAT"),//satış fiyatı
                    rs.getInt("urunVERGI")//vergi yüzdesi
                });
            }
        } catch (Exception ex) {//olası hata durumuna messagebox
            JOptionPane.showMessageDialog(null, "Hata: " + ex.getMessage());
        }

        tabloGorselAyarla(table, 100, 0);//satır yüksekliğini tekrar ayarla 
    }
    private void txtbarkodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbarkodKeyReleased
        //text fielde giren çıkan herhangi değişken durmunda tetiklenen kod
        String barkodArama = txtbarkod.getText();//girilen değişkeni string alıyoruz
        barkodaGoreListele(barkodArama);//değişkeni methoda atıyoruz
    }//GEN-LAST:event_txtbarkodKeyReleased

    private void btnguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguncelleActionPerformed
        int seciliSatir = table.getSelectedRow();//secilen satırı int olarak alıyoruz
        if (seciliSatir == -1) {//eğer satır seçilmemiş ise
            JOptionPane.showMessageDialog(this, "Lütfen bir ürün seçiniz");
            return;
        }
        if (cbfiyatguncelle.isSelected() == true) {//fiyat güncelle seçilmiş ise
            if (tfyenifiyat.getText().trim().isEmpty()) {//fiyat textfieldi boş ise 
                JOptionPane.showMessageDialog(this, "Fiyat alanını doldurunuz");//messagebox gönder kullanıcıya 
                return;
            }

            try {//fiyatgüncelle checkbox seçili ise ve text field de değer var ise
                String barkod = table.getValueAt(seciliSatir, 2).toString();//secilen satırın barkod numarasını al
                double yenifiyat = Double.parseDouble(tfyenifiyat.getText());//yeni fiyatı textfield den al
                BigDecimal guncelfiyat = new BigDecimal(yenifiyat);//veritabanına atabilmek için big decimal yapıyoruz

                if (yenifiyat < 0) {//fiyata - değer girlmiş ise mesajbox gönderiyoruz
                    JOptionPane.showMessageDialog(this, "Fiyat negatif olamaz");
                    return;
                }
                //herşey yolunda ise update sorgusu ile güncellemeyi yapabiliriz
                String sql = "UPDATE urun_bilgi SET urunFIYAT=? WHERE urunBARKOD =? AND kullaniciID =?";
                PreparedStatement pst = baglanti.prepareStatement(sql);
                pst.setBigDecimal(1, guncelfiyat);//yeni fiyatı atıyoruz
                pst.setString(2, barkod);//barkod numarasına ve
                pst.setInt(3, kullaniciID);//kullanıcıID'ye göre sorgumuzu dolduruyoruz 
                int sonuc = pst.executeUpdate();//1 satırda işlem yapacağımız için işlem yapılan sorgu olarak int almamız mantıklı
                if (sonuc > 0) {//sonuç olarak 1 satırda işlem başarı ile yapıldı ise bu sorgu çalışır
                    JOptionPane.showMessageDialog(this, "Fiyat güncellemesi başarılı");//messagebox
                    table.setValueAt(guncelfiyat, seciliSatir, 5);//yeni fiyatı tabloya atıyoruz
                    tfyenifiyat.setText("");//fiyat textfieldini temizliyoruz
                    cbfiyatguncelle.setSelected(false);//işimiz bittiğine göre gerekli yerleri kapatıyoruz
                    tfyenifiyat.setEnabled(false);
                } else {//başarısız ise kullanıcıya bildiriyoruz
                    JOptionPane.showMessageDialog(this, "Fiyat güncelleme başarısız.");
                }
            } catch (Exception ex) {//olası hata durumunda kullanıcıya bildiriyoruz
                JOptionPane.showMessageDialog(this, "Hata:" + ex);
            }
        }
        if (cbvergiguncelle.isSelected() == true) {//vergi güncelle seçilmiş ise
            if (tfyenivergi.getText().trim().isEmpty()) {//vergi tf boş ise
                JOptionPane.showMessageDialog(this, "Vergi alanını doldurunuz");//kullanıcıyı uyar
                return;
            }
            try {//vergi güncelle checkbox seçili ve vergi textfield de değer var ise 
                String barkod = table.getValueAt(seciliSatir, 2).toString();//seçilmiş satırın barkod numarasını ilgili kolondan al
                int yenivergi = Integer.parseInt(tfyenivergi.getText());// textfield e girilen vergiyi integere çevir
                if (yenivergi < 0) {//vergi yüzdesine - girilmeye çalışılırsa
                    JOptionPane.showMessageDialog(this, "Vergi yüzdesi negatif olamaz");//hata mesajı gönder
                    return;
                }
                //ürün vergisini update etmek için barkod ve kullanıcıID ye göre sorgu yapıyoruz
                String sql = "UPDATE urun_bilgi SET urunVERGI=? WHERE urunBARKOD =? AND kullaniciID=?";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setInt(1, yenivergi);//yeni vergiyi sorguya ekliyoruz
                ps.setString(2, barkod);//barkod kısmını dolduruyoruz
                ps.setInt(3, kullaniciID);//kullanıcıID yi dolduruyoruz
                int sonuc = ps.executeUpdate();//sorguyu çalıştır zaten sonuç başarılı ise 1 değil ise 0 dönecek
                if (sonuc > 0) {//1 donerse
                    JOptionPane.showMessageDialog(this, "Vergi güncellemesi başarılı");//kullanıcıyı bilgilendir
                    table.setValueAt(yenivergi, seciliSatir, 6);//vergi değerini tabloya ata
                    tfyenivergi.setText("");//vergi textfieldi temizle
                    cbvergiguncelle.setSelected(false);//seçimi kaldır
                    tfyenivergi.setEnabled(false);//erişilebilriliği kapat
                } else {//0 dönerse kullanıcıya hata olarak mesaj ver
                    JOptionPane.showMessageDialog(this, "Vergi yüzdesi güncellenemedi");
                }
            } catch (Exception ex) {//herhangi hata durmuna karşı kullanıcıya messagebox gönder
                JOptionPane.showMessageDialog(this, "Hata" + ex);
            }
        }
        if (cbmaliyetguncelle.isSelected() == true) {//maliyet checkboxu seçili ise 
            if (tfmaliyet.getText().trim().isEmpty()) {//maliyet textfieldi boş ise
                JOptionPane.showMessageDialog(null, "Maliyet alanını doldurunuz");//kullanıcıyı doldurması için uyar
                return;
            }
            try {//checkbox seçili textfield dolu ise 
                String barkod = table.getValueAt(seciliSatir, 2).toString();//barkod numarasını al
                double yenimaliyet = Double.parseDouble(tfmaliyet.getText());//maliyet fiyatını al
                BigDecimal bdmaliyet = new BigDecimal(yenimaliyet);//veritabanına koyulabilecek formata getir

                if (yenimaliyet < 0) {//maliyet 0 dan az gelmiş ise kullanıcıyı uyar 
                    JOptionPane.showMessageDialog(null, "Maliyet negatif düşük olamaz");
                    return;
                }
                //herşeyimiz yolunda ise güncelleme işlemine geçebiliriz kullanıcıID ve barkoda göre dönen tek sonucun maliyetini güncelleyen sorgu 
                String sql = "UPDATE urun_bilgi SET urunGELISFIYAT=? WHERE urunBARKOD=? AND kullaniciID=?";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setBigDecimal(1, bdmaliyet);//1. boşluğa yeni maliyet fiyatı
                ps.setString(2, barkod);//2. boşluğa ürünün barkodu
                ps.setInt(3, kullaniciID);//3. boşluğa kullanıcıID
                int sonuc = ps.executeUpdate();//sorguyu çalıştır sonuc 1 ya da 0 dönecektir
                if (sonuc > 0) {//1 dönerse  
                    JOptionPane.showMessageDialog(null, "Maliyet güncellemesi başarılı");//kullanıcıyı bilgilendir
                    table.setValueAt(yenimaliyet, seciliSatir, 4);//yeni maliyeti tabloya ata
                    tfmaliyet.setText("");//textfieldi temizle
                    cbmaliyetguncelle.setSelected(false);//checkboxtan seçimi kaldır
                    tfmaliyet.setEnabled(false);//textfieldin erişilebilirliğini kaldır 
                } else {//sonuç 0 gelirse
                    JOptionPane.showMessageDialog(null, "Yeni maliyet güncellenemedi");
                }
            } catch (Exception e) {//herhangi hata ihtimaline karşı kullanıcıyı bilgilendir
                JOptionPane.showMessageDialog(null, "Hata:" + e);
            }
        }
    }//GEN-LAST:event_btnguncelleActionPerformed

    private void btnstokguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstokguncelleActionPerformed
        int seciliSatir = table.getSelectedRow();//seçilen satırı int olarak al
        if (seciliSatir == -1) {//satır seçilmemiş ise kullanıcıyı uyar
            JOptionPane.showMessageDialog(this, "Lütfen bir ürün seçiniz.");
            return;
        }

        try {
            String barkod = table.getValueAt(seciliSatir, 2).toString(); // ürünün Barkodunu alıyoruz
            int mevcutStok = Integer.parseInt(table.getValueAt(seciliSatir, 3).toString()); // ürünün stoğunu alıyoruz
            int miktar = (int) miktarspinner.getValue();//spinnerden alınan değeri integere çevir - değerde girilebilir

            int yeniStok = mevcutStok + miktar;// eldeki stok ve gelen stok bilgisi toplanıyor

            if (yeniStok < 0) {//eğer stok miktarı 0 dan az ise işlem iptal edilir ve kullanıcıya bildirilir
                JOptionPane.showMessageDialog(this, "Stok negatif olamaz.");
                return;
            }
            //herşey yolunda ise barkod ve kullanıcıID ye göre stok bilgisini güncelleyen sorgu
            String sql = "UPDATE urun_bilgi SET urunSTOK = ? WHERE urunBARKOD = ? AND kullaniciID = ?";
            PreparedStatement pstmt = baglanti.prepareStatement(sql);
            pstmt.setInt(1, yeniStok);//yeni stok miktarı
            pstmt.setString(2, barkod);//güncelleme yapılacak ürünün barkodu
            pstmt.setInt(3, kullaniciID);// kullanıcıID 

            int sonuc = pstmt.executeUpdate();//1 satırda işlem yapacağımız için int değere atıyoruz başarılı 1 başarısız 0 değerini verecektir
            if (sonuc > 0) {//başarılı ise
                JOptionPane.showMessageDialog(this, "Stok başarıyla güncellendi.");//kullanıcıya bildir
                table.setValueAt(yeniStok, seciliSatir, 3); // Tabloyu güncelle
            } else {//0 yani başarısız ise kullanıcıyı uyar
                JOptionPane.showMessageDialog(this, "Stok güncelleme başarısız.");
            }

        } catch (Exception e) {//olası hata durumuna karşı kullanıcıyı bilgilendir
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_btnstokguncelleActionPerformed

    private void cbmaliyetguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmaliyetguncelleActionPerformed
        //checkbox isaretlenir ise
        if (cbmaliyetguncelle.isSelected() == true) {//checkbox isaretli ise 
            tfmaliyet.setEnabled(true);//textfield'in erisilebilirligini aç
            btnguncelle.setEnabled(true);//butonun erisilebilirligini aç
        } else {// combobox isaterli DEGIL ise 
            if (tfmaliyet.getText().trim().isEmpty()) {//ve textfield bos ise
                tfmaliyet.setEnabled(false);//textfield'in erisilebilirligini kapat
                if (cbfiyatguncelle.isSelected() == false && cbvergiguncelle.isSelected() == false) {//ayni zamanda diger 2 checkbox'ta isaretli degilse butonun erisilebilirligini kapat
                    btnguncelle.setEnabled(false);
                }
            } else {//textfield bos degil ise hata mesaji döndür ve checkbox'u ayni haline çevir
                JOptionPane.showMessageDialog(null, "Maliyet güncellemek istemiyorsanız alanı temizleyin!!");
                cbmaliyetguncelle.setSelected(true);
            }
        }
    }//GEN-LAST:event_cbmaliyetguncelleActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stokekle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngeri;
    private javax.swing.JButton btnguncelle;
    private javax.swing.JButton btnstokguncelle;
    private javax.swing.JComboBox<String> cbaltkategori;
    private javax.swing.JCheckBox cbfiyatguncelle;
    private javax.swing.JComboBox<String> cbkategori;
    private javax.swing.JCheckBox cbmaliyetguncelle;
    private javax.swing.JComboBox<String> cbmodel;
    private javax.swing.JCheckBox cbvergiguncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner miktarspinner;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfmaliyet;
    private javax.swing.JTextField tfyenifiyat;
    private javax.swing.JTextField tfyenivergi;
    private javax.swing.JTextField txtbarkod;
    // End of variables declaration//GEN-END:variables
}
