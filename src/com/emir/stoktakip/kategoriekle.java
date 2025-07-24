package com.emir.stoktakip;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class kategoriekle extends javax.swing.JFrame {

    Connection baglanti = veritabani.baglantiAl();

    public kategoriekle() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbkategoriekle = new javax.swing.JRadioButton();
        rbaltkategoriekle = new javax.swing.JRadioButton();
        rbmodelekle = new javax.swing.JRadioButton();
        tfkategoriad = new javax.swing.JTextField();
        cbkategorisec = new javax.swing.JComboBox<>();
        tfaltkategoriad = new javax.swing.JTextField();
        cbaltkategorisec = new javax.swing.JComboBox<>();
        tfmodelad = new javax.swing.JTextField();
        btnkaydet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btngeri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        buttonGroup1.add(rbkategoriekle);
        rbkategoriekle.setText("Kategori ekle");
        rbkategoriekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbkategoriekleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbaltkategoriekle);
        rbaltkategoriekle.setText("Alt kategori ekle");
        rbaltkategoriekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbaltkategoriekleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbmodelekle);
        rbmodelekle.setText("Model ekle");
        rbmodelekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmodelekleActionPerformed(evt);
            }
        });

        cbkategorisec.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbkategorisecİtemStateChanged(evt);
            }
        });

        btnkaydet.setText("Kaydet");
        btnkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaydetActionPerformed(evt);
            }
        });

        jLabel1.setText("Kategori Adı");

        jLabel2.setText("Kategori seç");

        jLabel3.setText("Alt kategori adı");

        jLabel4.setText("Alt kategori seç");

        jLabel5.setText("Model adı");

        btngeri.setBackground(new java.awt.Color(255, 51, 0));
        btngeri.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btngeri.setText("Geri");
        btngeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngeriActionPerformed(evt);
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
                        .addComponent(rbkategoriekle, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rbaltkategoriekle)
                        .addGap(6, 6, 6)
                        .addComponent(rbmodelekle, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfkategoriad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(cbkategorisec, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfaltkategoriad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(cbaltkategorisec, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfmodelad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(btnkaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btngeri))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btngeri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbkategoriekle)
                    .addComponent(rbaltkategoriekle)
                    .addComponent(rbmodelekle))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfkategoriad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbkategorisec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfaltkategoriad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbaltkategorisec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfmodelad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkaydet))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbaltkategoriekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbaltkategoriekleActionPerformed
        if (rbaltkategoriekle.isSelected() == true) {//altkategori radiobuttonu seçili ise
            tfkategoriad.setEnabled(false);//kategoriad textfieldini erişilemez yap 
            cbkategorisec.setEnabled(true);//kategori comboboxunu erişilebilir yap
            tfaltkategoriad.setEnabled(true);//altkategoriad textfieldini erişilebilir yap
            cbaltkategorisec.setEnabled(false);//altkategori comboboxunu erişilemez yap
            tfmodelad.setEnabled(false);//modelad textfieldini erişilemez tap
        }
    }//GEN-LAST:event_rbaltkategoriekleActionPerformed

    private void btngeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngeriActionPerformed
        //geri butonuna basılınca ana formu aç ve bu formu kapat
        ana Ana = new ana();
        Ana.setVisible(true);
        Ana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btngeriActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //form açılınca 
        rbkategoriekle.setSelected(true);//kategori radiobutonunu seç
        tfkategoriad.setEnabled(true);//kategoriad textfieldini erişilebilir yap
        cbkategorisec.setEnabled(false);//kategori comboboxunu erişilemez yap
        tfaltkategoriad.setEnabled(false);//altkategoriad textfieldini erşilemez yap
        cbaltkategorisec.setEnabled(false);//alt kategori comboboxunu erişilemez yap
        tfmodelad.setEnabled(false);//modelad textfieldini erşilemez yap
        //*********************************************
        String sql = "SELECT kategoriAD FROM kategori";//kategori tablosundan kategoriAD larını çağıran sorgu
        try (PreparedStatement pst = baglanti.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {//veritabaına bağla ve sorguyu çalıştır

            // Comboboxu temizle
            cbkategorisec.removeAllItems();

            // kategoriAD larını comboboxa ekle 
            while (rs.next()) {
                String kategoriAd = rs.getString("kategoriAD");
                cbkategorisec.addItem(kategoriAd);
            }
        } catch (SQLException ex) {//olası sql hatasına karşı kullanıcıya messagebox gönder
            JOptionPane.showMessageDialog(null, "Kategori verileri yüklenirken bir hata oluştu.");
        }
    }//GEN-LAST:event_formWindowOpened

    private void rbkategoriekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbkategoriekleActionPerformed
        if (rbkategoriekle.isSelected() == true) {//kategoriekle radiobutonu seçili ise
            tfkategoriad.setEnabled(true);//kategoriad textfieldini erişilebilir yap
            cbkategorisec.setEnabled(false);//kategori comboboxunu erişilemez yap
            tfaltkategoriad.setEnabled(false);//altkategori textfieldini erişilemez yap
            cbaltkategorisec.setEnabled(false);//altkategori comboboxunu erişilemez yap
            tfmodelad.setEnabled(false);//model textfieldini erişilemez yap
        }
    }//GEN-LAST:event_rbkategoriekleActionPerformed

    private void rbmodelekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmodelekleActionPerformed
        if (rbmodelekle.isSelected() == true) {//model ekle rdiobuttonu seçili ise
            tfkategoriad.setEnabled(false);//kategoriad textfieldini erisilemez yap
            cbkategorisec.setEnabled(true);//kategori comboboxunu erişilebilir yap
            tfaltkategoriad.setEnabled(false);//altkategoriad textfieldini erişilemaz yap
            cbaltkategorisec.setEnabled(true);//altkategori comboboxunu erişilebilir yap
            tfmodelad.setEnabled(true);//modelad textfieldini erişilebilir yap
        }
    }//GEN-LAST:event_rbmodelekleActionPerformed

    private void btnkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaydetActionPerformed
        if (rbkategoriekle.isSelected() == true) {//kategoriekle radiobutonu seçili ise
            String kategoriAd = tfkategoriad.getText();  // textfieldden metni al
            if (!kategoriAd.isEmpty()) {  // eğer metin boş değilse
                String sql = "INSERT INTO kategori (kategoriAD) VALUES (?)";//kategori tablosuna yeni satırk ekleyen kod
                try (PreparedStatement pst = baglanti.prepareStatement(sql)) {
                    pst.setString(1, kategoriAd);  // kategori adını sql sorgusuna yerleştir
                    int rowsAffected = pst.executeUpdate();  // sorguyu çalıştır
                    if (rowsAffected > 0) {//sorgumuz sorunsuz çalışmış ise 
                        JOptionPane.showMessageDialog(null, "Kategori başarıyla eklendi.");
                        tfkategoriad.setText("");  // textfieldi temizle
                    } else {//sorgu çalışmadıysa kullanıcıyı bilgilendir
                        JOptionPane.showMessageDialog(null, "Kategori eklenirken bir hata oluştu.");
                    }
                } catch (SQLException ex) {//olası sql hatalarında kullanıcıya messagebox gönder
                    JOptionPane.showMessageDialog(null, "Veritabanı hatası: " + ex.getMessage());
                }
            } else {//kategori textfieldi boş ise bu kısım çalışor kullanıcı uyarılır
                JOptionPane.showMessageDialog(null, "Kategori adı boş olamaz!");
            }
        }
        if (rbaltkategoriekle.isSelected() == true) {//altkategoriekle radiobutonu seçili ise  
            String altKategoriAd = tfaltkategoriad.getText();  //altkategori adı al
            String kategoriAd = (String) cbkategorisec.getSelectedItem();  // seçilen kategori adı al

            if (!altKategoriAd.isEmpty() && kategoriAd != null) {
                //kategori adına denk gelen kategoriID yi al
                String kategoriIDQuery = "SELECT kategoriID FROM kategori WHERE kategoriAD = ?";
                try (PreparedStatement pst = baglanti.prepareStatement(kategoriIDQuery)) {
                    pst.setString(1, kategoriAd);//sorgudaki boşluğu doldur
                    ResultSet rs = pst.executeQuery();//sorguyu çalıştır

                    if (rs.next()) {//sorgu başarılı sonuçlanmış ise
                        int kategoriID = rs.getInt("kategoriID");  // kategoriIDyi al

                        // altkategoriAD'ı ve kategoriID'yi altkategori tablosuna ekle
                        String insertQuery = "INSERT INTO altkategori (altkategoriAD, kategoriID) VALUES (?, ?)";
                        try (PreparedStatement pstInsert = baglanti.prepareStatement(insertQuery)) {
                            pstInsert.setString(1, altKategoriAd);  //1. boşluk altkategori adı
                            pstInsert.setInt(2, kategoriID);  //2. boşluk kategoriID
                            int rowsAffected = pstInsert.executeUpdate();//sorguyu çalıştır

                            if (rowsAffected > 0) {//sonuç 1 dönerse
                                JOptionPane.showMessageDialog(null, "Alt kategori başarıyla eklendi.");//kullanıcıyı bilgilendir
                                tfaltkategoriad.setText("");  // textfieldi temizle
                            } else {//sonuç 0 döner ve sorgu çalışmaz ise kullanıcıya bildir
                                JOptionPane.showMessageDialog(null, "Alt kategori eklenirken bir hata oluştu.");
                            }
                        }
                    } else {//comboboxta seçilen kategori veritabanında bulunamadı ise kullanıcıya bildir
                        JOptionPane.showMessageDialog(null, "Seçilen kategori bulunamadı.");
                    }
                } catch (SQLException ex) {//olası sql hatasını kullanıcıya bildir
                    JOptionPane.showMessageDialog(null, "Veritabanı hatası: " + ex.getMessage());
                }
            } else {//alt kategori adı boş ise kullanıcıyı uyar
                JOptionPane.showMessageDialog(null, "Alt kategori adı boş olamaz veya kategori seçilmelidir!");
            }
        }
        if (rbmodelekle.isSelected() == true) {//eğer model ekle radiobutonu seçili ise 
            String modelAd = tfmodelad.getText();  // eklenecek model adı al
            String altKategoriAd = (String) cbaltkategorisec.getSelectedItem();  // seçilen alt kategori string olarak al

            //model adı boş değil ve alt kategori seçimi de yapıldıysa
            if (!modelAd.isEmpty() && altKategoriAd != null) {
                //altkategoriadına göre altkategoriID yi alan sorgu
                String altKategoriIDQuery = "SELECT altkategoriID FROM altkategori WHERE altkategoriAD = ?";
                try (PreparedStatement pst = baglanti.prepareStatement(altKategoriIDQuery)) {
                    pst.setString(1, altKategoriAd);//altkategoriadı ile sorgudaki boşluğu doldur
                    ResultSet rs = pst.executeQuery();//sorguyu çalıştır

                    if (rs.next()) {//sorgunun çalışmasından true dönerse
                        int altKategoriID = rs.getInt("altkategoriID");  // altkategoriID'yi al
                        //model tablosuna modelAD ve altkategorID ekleyen sorgu
                        String insertModelQuery = "INSERT INTO model (altkategoriID, modelAD) VALUES (?, ?)";
                        try (PreparedStatement pstInsert = baglanti.prepareStatement(insertModelQuery)) {
                            pstInsert.setInt(1, altKategoriID);  // altkategoriID
                            pstInsert.setString(2, modelAd);  // modeladı
                            int rowsAffected = pstInsert.executeUpdate();//sorguyu çalıştır

                            if (rowsAffected > 0) {//sorgu başarılı ise
                                JOptionPane.showMessageDialog(null, "Model başarıyla eklendi.");//kullanıcıya bildir
                                tfmodelad.setText("");  // textfieldi temizle
                            } else {//sorguda bir hata çiktı ve başarısız ise kullanıcıya bildir
                                JOptionPane.showMessageDialog(null, "Model eklenirken bir hata oluştu.");
                            }
                        }//comboboxtan seçilen alt kategori veritabanında bulunamaz ise kullanıcıyı uyar
                    } else {
                        JOptionPane.showMessageDialog(null, "Seçilen alt kategori bulunamadı.");
                    }
                } catch (SQLException ex) {//olası sql hatalarına karşı kullanıcıyı uyar
                    JOptionPane.showMessageDialog(null, "Veritabanı hatası: " + ex.getMessage());
                }
            } else {//model adı kısmı boş ise kullanıcıyı uyar
                JOptionPane.showMessageDialog(null, "Model adı boş olamaz veya alt kategori seçilmelidir!");
            }
        }
    }//GEN-LAST:event_btnkaydetActionPerformed

    private void cbkategorisecİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbkategorisecİtemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {//comboboxtan seçim yapılınca kod bloğu çalışır
            String kategoriAd = (String) cbkategorisec.getSelectedItem();  // seçilen kategori adını al

            // kategori adından kategoriID'yi al
            String kategoriIDQuery = "SELECT kategoriID FROM kategori WHERE kategoriAD = ?";
            try (PreparedStatement pst = baglanti.prepareStatement(kategoriIDQuery)) {
                pst.setString(1, kategoriAd);//boşluğu kategoriadı ile doldur
                ResultSet rs = pst.executeQuery();//sorguyu çalıştır

                if (rs.next()) {//sorgu sorunsuz çalışmış ise
                    int kategoriID = rs.getInt("kategoriID");  // kategoriID'yi al
                    //kategoriID ye göre alt kategori comboboxunu dolduran methodu çağır
                    altKategoriComboBoxYukle(kategoriID);
                } else {
                    //kategoriID veritabanında yoksa alt kategori comboboxunu temizle
                    cbaltkategorisec.removeAllItems();
                }
            } catch (SQLException ex) {//olaı sql hatasını kullanıcıya bildir
                JOptionPane.showMessageDialog(null, "Veritabanı hatası: " + ex);
            }
        }

    }//GEN-LAST:event_cbkategorisecİtemStateChanged
    private void altKategoriComboBoxYukle(int kategoriID) {//gelen kategoriID ye göre çalışacak kod bloğu ve sorgu
        String sql = "SELECT altkategoriAD FROM altkategori WHERE kategoriID = ?";
        try (PreparedStatement pst = baglanti.prepareStatement(sql)) {
            pst.setInt(1, kategoriID);//boşluğa kategoriID yi yerleştir
            ResultSet rs = pst.executeQuery();//sorguyu çalıştır

            // comboboxu temizle
            cbaltkategorisec.removeAllItems();

            // altkategori adlarını comboboxa ekle
            while (rs.next()) {
                String altKategoriAd = rs.getString("altkategoriAD");
                cbaltkategorisec.addItem(altKategoriAd);
            }
        } catch (SQLException ex) {//olası sql hatasını kullanıcıya bildir
            JOptionPane.showMessageDialog(null, "Alt kategori verileri yüklenirken bir hata oluştu."+ex);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kategoriekle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngeri;
    private javax.swing.JButton btnkaydet;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbaltkategorisec;
    private javax.swing.JComboBox<String> cbkategorisec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rbaltkategoriekle;
    private javax.swing.JRadioButton rbkategoriekle;
    private javax.swing.JRadioButton rbmodelekle;
    private javax.swing.JTextField tfaltkategoriad;
    private javax.swing.JTextField tfkategoriad;
    private javax.swing.JTextField tfmodelad;
    // End of variables declaration//GEN-END:variables
}
