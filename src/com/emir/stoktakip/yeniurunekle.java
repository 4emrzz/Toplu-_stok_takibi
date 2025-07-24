package com.emir.stoktakip;

import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.*;
import java.awt.event.ItemEvent;
import java.io.File;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.UUID;
import javax.swing.ImageIcon;

public class yeniurunekle extends javax.swing.JFrame {

    public yeniurunekle() {
        initComponents();
        //görsel sürükle-bırak kodu(buraya yazılma sebebi ise form açılınca hemen aktif olsun)
        DropTarget dropTarget = new DropTarget() {
            public synchronized void drop(DropTargetDropEvent evt) {
                try {
                    evt.acceptDrop(DnDConstants.ACTION_COPY);
                    java.util.List<File> droppedFiles = (java.util.List<File>) evt.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);

                    for (File file : droppedFiles) {
                        if (file.getName().toLowerCase().matches(".*\\.(jpg|jpeg|png|gif)$")) {
                            ImageIcon icon = new ImageIcon(file.getAbsolutePath());
                            lblDropArea.setIcon(new ImageIcon(icon.getImage().getScaledInstance(
                                    lblDropArea.getWidth(), lblDropArea.getHeight(), java.awt.Image.SCALE_SMOOTH)));
                            selectedImagePath = file.getAbsolutePath();}
                    }
                } catch (Exception e) {}}
        };
        lblDropArea.setDropTarget(dropTarget);
    }

    int kullaniciId = giris.kullaniciID;
    Connection baglanti = veritabani.baglantiAl();
    private String selectedImagePath;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox4 = new javax.swing.JComboBox<>();
        btngeri = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbkategori = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbaltkategori = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbmodel = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfbarkod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfurunfiyati = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfurunvergimiktari = new javax.swing.JTextField();
        btnurunkaydet = new javax.swing.JButton();
        lblDropArea = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sinirspinner = new javax.swing.JSpinner();
        ilkstokspinner = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfgelisfiyati = new javax.swing.JTextField();
        btnfiyathesapla = new javax.swing.JButton();
        tfkar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Kategori");

        cbkategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbkategoriİtemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Alt kategori");

        cbaltkategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbaltkategoriİtemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Model");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Barkod");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Ürün fiyatı (₺/Adet) manuel olarak düzenlenebilir");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Ürün vergi miktarı(%)");

        btnurunkaydet.setBackground(new java.awt.Color(0, 255, 0));
        btnurunkaydet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnurunkaydet.setText("ÜRÜNÜ KAYDET");
        btnurunkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnurunkaydetActionPerformed(evt);
            }
        });

        lblDropArea.setText("                     Ürün görselini buraya sürükleyiniz");
        lblDropArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Adet");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Sınır stok");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Geliş Fiyatı (₺/Adet)");

        btnfiyathesapla.setBackground(new java.awt.Color(51, 255, 255));
        btnfiyathesapla.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnfiyathesapla.setText("Satış Fiyatı Hesapla");
        btnfiyathesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfiyathesaplaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Beklenen Kâr (₺)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btngeri)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(tfbarkod, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbaltkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ilkstokspinner, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(sinirspinner, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tfgelisfiyati, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(tfkar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tfurunvergimiktari, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(btnfiyathesapla, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                                .addComponent(tfurunfiyati)))
                                        .addGap(12, 12, 12)
                                        .addComponent(lblDropArea, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnurunkaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btngeri)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1))
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfbarkod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2))
                            .addComponent(jLabel7))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbaltkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ilkstokspinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sinirspinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfgelisfiyati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfkar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfurunvergimiktari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnfiyathesapla, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(tfurunfiyati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDropArea, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnurunkaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String getFileExtension(String fileName) {
        int lastDot = fileName.lastIndexOf(".");
        return (lastDot == -1) ? "" : fileName.substring(lastDot);
    }
    private void btngeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngeriActionPerformed
        ana Ana = new ana();
        Ana.setVisible(true);
        Ana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btngeriActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Form açılınca cbkategori form bileşeninin içini dolduran kod
        //kategori tablosundan kategoriAD'ları çağıran sorgu
        String sql = "SELECT kategoriAD FROM kategori";
        try (PreparedStatement pst = baglanti.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
            cbkategori.removeAllItems();
            while (rs.next()) {
                String kategoriAd = rs.getString("kategoriAD");
                cbkategori.addItem(kategoriAd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Kategori verileri yüklenirken bir hata oluştu.");
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnurunkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnurunkaydetActionPerformed
        //Ürün görseli boş mu kontrolü
        if (selectedImagePath == null || selectedImagePath.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen ürün görselini sürükleyin.");
            return;
        }

        //TextField alanları boş mu kontrolü
        if (tfbarkod.getText().isEmpty() || tfurunfiyati.getText().isEmpty() || tfurunvergimiktari.getText().isEmpty() || tfgelisfiyati.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurun.");
            return;
        }

        File sourceFile = new File(selectedImagePath);
        //çok değişkenli dosya adı üretmek için kullanılan değişken tanımlamadır 2¹²⁸ kadar farklı kombinasyon yapılabilir
        String uniqueName = UUID.randomUUID().toString() + getFileExtension(sourceFile.getName());
        File targetFile = new File("C:/javatoptancı/" + uniqueName);

        // Hedef klasörün var olduğundan emin olalım
        File directory = new File("C:/javatoptancı/");
        if (!directory.exists()) {
            directory.mkdirs();
        }

        try {
            // Dosya kopyalama işlemi
            java.nio.file.Files.copy(
                    sourceFile.toPath(),
                    targetFile.toPath(),
                    java.nio.file.StandardCopyOption.REPLACE_EXISTING
            );
            //Veritabanı hatası aldığım için bağlantı metodunu tekrar çağırıyorum
            Connection bag = veritabani.baglantiAl();
            //ürün bilgi tablosuna eklenecek satırın içeriklerini belirten sorgu
            String sql = "INSERT INTO urun_bilgi(modelID,kullaniciID,urunBARKOD,urunGELISFIYAT,urunFIYAT,urunVERGI,urunSTOK,sinirSTOK,urunGORSELYOLU) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = bag.prepareStatement(sql);
            ps.setInt(1, getmodelID(cbmodel.getItemAt(cbmodel.getSelectedIndex())));//seçilen modelAD'a göre modelID çeken method 
            ps.setInt(2, kullaniciId);
            ps.setString(3, tfbarkod.getText());
            ps.setBigDecimal(4, new java.math.BigDecimal(tfgelisfiyati.getText()));
            ps.setBigDecimal(5, new java.math.BigDecimal(tfurunfiyati.getText()));
            ps.setInt(6, Integer.parseInt(tfurunvergimiktari.getText()));
            ps.setInt(7, (int) ilkstokspinner.getValue());
            ps.setInt(8, (int) sinirspinner.getValue());
            ps.setString(9, targetFile.getAbsolutePath());

            //Sorguyu çalıştırıyoruz
            int affectedRows = ps.executeUpdate();
            //İşlem başarılı ise yani en az 1 satır bile eklendiyde
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Ürün başarıyla kaydedildi.");
                // Formu temizle
                tfbarkod.setText("");
                tfurunfiyati.setText("");
                tfurunvergimiktari.setText("");
                ilkstokspinner.setValue(0);
                sinirspinner.setValue(0);
                lblDropArea.setIcon(null);
                lblDropArea.setText("                     Ürün görselini buraya sürükleyiniz");
                tfgelisfiyati.setText("");
                tfkar.setText("");

                selectedImagePath = null;
            } else // işlem başarısız ise çalışacak kod bloğu
            {
                JOptionPane.showMessageDialog(null, "Ürün kaydedilemedi.");
            }

        } catch (java.io.IOException e) //Kopyalama işlemi başarısız ise dönecek hata mesajı
        {
            JOptionPane.showMessageDialog(null, "Dosya kopyalanırken hata oluştu: " + e.getMessage());
        } catch (SQLException e) //Veritabanı kısmında hata olursa kullanıcıya dönecek mesaj
        {
            JOptionPane.showMessageDialog(null, "Veritabanı hatası: " + e.getMessage());
        } catch (NumberFormatException e) //Sayısal kısımlarda hata olursa kullanıcıya dönecek mesaj
        {
            JOptionPane.showMessageDialog(null, "Lütfen fiyat ve vergi alanlarına geçerli sayısal değerler girin.");
        } catch (Exception e) //Try-Catch bloğunda oluşabilecek genel hata için kullanıcıya dönecek mesaj
        {
            JOptionPane.showMessageDialog(null, "Beklenmeyen bir hata oluştu: " + e.getMessage());
            //printStackTrace hata hakkındaki tüm bilgileri veren kelimedir son kullanıcı için buna gerek yoktur
            e.printStackTrace();//tüm catch bloklarında vardı sildim
        }
    }//GEN-LAST:event_btnurunkaydetActionPerformed

    private void cbaltkategoriİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbaltkategoriİtemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) //seçim yapıldığında kodun tetiklenmesi için gerekli
        {   //altkategoriID almak için altkategoriAD aldığımız string ifade
            String altkategoriAd = (String) cbaltkategori.getSelectedItem();
            //altkategoriID almak için yazılan sorgu
            String altkategoriIDQuery = "SELECT altkategoriID FROM altkategori WHERE altkategoriAD =?";
            try (PreparedStatement pst = baglanti.prepareStatement(altkategoriIDQuery)) {
                //sorgudaki ? yerine gerekli değişkeni koyuruz 
                pst.setString(1, altkategoriAd);
                ResultSet rs = pst.executeQuery();
                //sorguyu çalıştırıyoruz 
                if (rs.next()) {
                    //sorgudan gelen değişkeni kodumuzdaki değişkene atıyoruz
                    int altkategoriID = rs.getInt("altkategoriID");
                    //altkategoriID değişkenine göre methoddan modelAD çağırıyoruz
                    modelComboBoxYukle(altkategoriID);
                } else {
                    //sorgu çalışmazsa cbmodeli temizliyoruz
                    cbmodel.removeAllItems();
                }
            } catch (SQLException ex) //veritabanı hatasını adlandırıp joptionpane ile kullanıcıya gösteriyoruz
            {
                JOptionPane.showMessageDialog(null, "veritabanı hatası:" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_cbaltkategoriİtemStateChanged

    private void cbkategoriİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbkategoriİtemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) //seçim yapılınca kodun tetiklenmesi için gerekli 
        {
            //kategoriAD değişkenini string şekilde alıyoruz
            String kategoriAd = (String) cbkategori.getSelectedItem();
            //kategoriAD'a öre kategoriID çektiğimiz SQL sorgusu
            String kategoriIDQuery = "SELECT kategoriID FROM kategori WHERE kategoriAD = ?";
            try (PreparedStatement pst = baglanti.prepareStatement(kategoriIDQuery)) {
                pst.setString(1, kategoriAd);//sorgudaki boşlukları dolduruyoruz
                ResultSet rs = pst.executeQuery();//sorguyu çalıştırıyoruz
                if (rs.next()) {
                    int kategoriID = rs.getInt("kategoriID");//sorgudan gelen değişkeni koddaki değişkene atıyouz
                    altkategoriComboBoxYukle(kategoriID);//kategoriID'ye göre altkategori metodunu çalıştırıyoruz
                } else {//işlem başarısız olursa cbaltkategoriyi temizliyoruz
                    cbaltkategori.removeAllItems();
                }
            } catch (SQLException ex) {//veritabanı işlemi başarısız olursa hatayı kullanıcıya gösteriyoruz
                JOptionPane.showMessageDialog(null, "veritabanı hatası:" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_cbkategoriİtemStateChanged

    private void btnfiyathesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfiyathesaplaActionPerformed
        /*geliş fiyatı, istenen kâr, uygulama kesintisi(%1) ve verilecek vergi(%xx)'ye göre olması gereken en düşük 
        fiyat için formül fiyat hespla butonuna basılınca çalışıyor*/
        double gelisfiyat = Double.parseDouble(tfgelisfiyati.getText());
        double kar = Double.parseDouble(tfkar.getText());
        double vergi = Double.parseDouble(tfurunvergimiktari.getText()) / 100.0;
        double uygulamaKesintisi = 0.01;
        double netKazanc = gelisfiyat + kar;
        double fiyat;
        if (vergi < 1.0) {//eğer vergi %100'ün altında ise bu kısım çalışır
            fiyat = netKazanc / ((1 - uygulamaKesintisi) * (1 - vergi));
        } else {//eğer vergi %100 ve üzerinde ise "identity(%100 için)" ve "-(%100 üzeri)" sonuç almak için bu kısım çalışır
            fiyat = netKazanc * (1+vergi)/(1-uygulamaKesintisi);
        }
        tfurunfiyati.setText(String.valueOf(fiyat));//fiyat değişkenini ilgili textfield'e atıyoruz

    }//GEN-LAST:event_btnfiyathesaplaActionPerformed
    private void altkategoriComboBoxYukle(int kategoriID) {
        // gelen kategoriID'ye göre altkategoriAD listelemek için kullanılan method(sorgu ve bağlantı araçları)
        String sql = "SELECT altkategoriAD FROM altkategori WHERE kategoriID = ?";
        try (PreparedStatement pst = baglanti.prepareStatement(sql)) {
            pst.setInt(1, kategoriID);
            ResultSet rs = pst.executeQuery();
            cbaltkategori.removeAllItems();
            while (rs.next()) {
                String altKategoriAd = rs.getString("altkategoriAD");
                cbaltkategori.addItem(altKategoriAd);
            }
        } catch (SQLException ex) {//varsa veritabanı hatası için kullanıcıya gösterilecek messagebox
            JOptionPane.showMessageDialog(null, "alt kategori verileri yüklenirken bir hata oluştu");
        }
    }

    private void modelComboBoxYukle(int altkategoriID) {
        //gelen altkategoriID'ye göre modelAD listelemek için kullanılan method(sorgu ve bağlantı araçları)
        String sql = "SELECT modelAD FROM model WHERE altkategoriID =?";
        try (PreparedStatement pst = baglanti.prepareStatement(sql)) {
            pst.setInt(1, altkategoriID);
            ResultSet rs = pst.executeQuery();
            cbmodel.removeAllItems();
            while (rs.next()) {
                String modelAd = rs.getString("modelAD");
                cbmodel.addItem(modelAd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Model verileri yüklenirken bir hata oluştu.");
        }
    }

    private int getmodelID(String modelAd) {//gelen modelAD'a göre modelID çağıran method(sorgu ve bağlantı araçları)
        int modelID = -1;
        String sql = "SELECT modelID FROM model WHERE modelAD = ?";
        try (Connection baglanti = veritabani.baglantiAl(); PreparedStatement ps = baglanti.prepareStatement(sql)) {
            ps.setString(1, modelAd);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {modelID = rs.getInt("modelID");}
        } catch (Exception e) {JOptionPane.showMessageDialog(null, "Hata:"+e);}
        return modelID;//modelID geri döndürüyor
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yeniurunekle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfiyathesapla;
    private javax.swing.JButton btngeri;
    private javax.swing.JButton btnurunkaydet;
    private javax.swing.JComboBox<String> cbaltkategori;
    private javax.swing.JComboBox<String> cbkategori;
    private javax.swing.JComboBox<String> cbmodel;
    private javax.swing.JSpinner ilkstokspinner;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDropArea;
    private javax.swing.JSpinner sinirspinner;
    private javax.swing.JTextField tfbarkod;
    private javax.swing.JTextField tfgelisfiyati;
    private javax.swing.JTextField tfkar;
    private javax.swing.JTextField tfurunfiyati;
    private javax.swing.JTextField tfurunvergimiktari;
    // End of variables declaration//GEN-END:variables

    private Connection veritabani() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
