package com.emir.stoktakip;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class giris extends javax.swing.JFrame {

    Connection baglanti = veritabani.baglantiAl();

    public giris() {
        initComponents();
        tfsifre.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pfsifre = new javax.swing.JPasswordField();
        btngirisyap = new javax.swing.JButton();
        btnkaydol = new javax.swing.JButton();
        tfsifre = new javax.swing.JTextField();
        tgglbsifregoster = new javax.swing.JToggleButton();
        formattedtelno = new javax.swing.JFormattedTextField();
        btnyonetici = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Telefon numarası:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Şifre");

        btngirisyap.setBackground(new java.awt.Color(0, 255, 0));
        btngirisyap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btngirisyap.setText("Giriş Yap");
        btngirisyap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngirisyapActionPerformed(evt);
            }
        });

        btnkaydol.setBackground(new java.awt.Color(0, 204, 255));
        btnkaydol.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnkaydol.setText("Kaydol");
        btnkaydol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaydolActionPerformed(evt);
            }
        });

        tgglbsifregoster.setText("🙈");
        tgglbsifregoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgglbsifregosterActionPerformed(evt);
            }
        });

        try {
            formattedtelno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+90 (###) ### ## ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnyonetici.setBackground(new java.awt.Color(255, 102, 102));
        btnyonetici.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnyonetici.setText("Yönetici");
        btnyonetici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyoneticiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(formattedtelno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pfsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tgglbsifregoster)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnkaydol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btngirisyap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnyonetici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formattedtelno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfsifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pfsifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tgglbsifregoster)))
                .addGap(6, 6, 6)
                .addComponent(btngirisyap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnkaydol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnyonetici)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnkaydolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaydolActionPerformed
        //kaydol butonuna basılınca iletişim bilgileri kullanıcıya gösteriliyor
        JOptionPane.showMessageDialog(rootPane, "0************* telefon numarasını arayınız ya da **********@gmail.com adresine mail atınız");
    }//GEN-LAST:event_btnkaydolActionPerformed

    private void tgglbsifregosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgglbsifregosterActionPerformed
        //pfsifre(passwordfield) tfsifre(textfield)
        if (tgglbsifregoster.isSelected() == false) {//toggle buton kapalı ise
            tgglbsifregoster.setText("🙈");//butonun text'ini ayarla
            pfsifre.setText(tfsifre.getText());//tfsifreden gelen veriyi pfsifreye at
            pfsifre.setVisible(true);//pfsifreyi göster
            tfsifre.setVisible(false);//tf sifreyi sakla
        } else {
            tgglbsifregoster.setText("🙉");//toggle buton aktif ise
            tfsifre.setText(new String(pfsifre.getPassword()));//pf sifreden gelen veriyi string yap ve tfsifreye ata
            tfsifre.setVisible(true);//tfsifreyi göster
            pfsifre.setVisible(false);//pfsifreyi sakla
        }
    }//GEN-LAST:event_tgglbsifregosterActionPerformed

    private void btngirisyapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngirisyapActionPerformed
        String telnotext = formattedtelno.getText();//formattedtextfieldden gelen veriyi string değişkene ata
        if (telnotext.isEmpty()) {//işlem yapma boş ise diyemeyeceğiz çünkü +90(  ) kısmı dolduruyor stringi yani string hiçbir zaman boş değil
            return;}
        String sifre;
        if (tgglbsifregoster.isSelected() == false) {//toggle buton aktif değil ise
            sifre = new String(pfsifre.getPassword());//passwordfieldden şifreyi al stringe çevir
        } else {//toggle buton aktif ise
            sifre = tfsifre.getText();//textfieldden veriyi al
        }
        kontrol(telnotext, sifre);//kontrol methodunda kontrol et
    }//GEN-LAST:event_btngirisyapActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Form açılırken beni hatırla tablosundan verileri çekiyoruz
        String selectQuery = "SELECT * from beni_hatirla";
        try (PreparedStatement selectStmt = baglanti.prepareStatement(selectQuery)) {
            ResultSet rs = selectStmt.executeQuery();//sorguyu çalıştırıyoruz
            if (rs.next()) {//zaten 1 kayıt oluyor o kayıttaki bilgileri istiyoruz
                String tel = rs.getString("kullaniciTELNO");//telefon numarasını stringe atıyoruz
                String sifre = rs.getString("kullaniciSIFRE");//şifreyi stringe atıyoruz
                formattedtelno.setText(tel);//gelen telefon numarasını formattedtextfielde atıyoruz
                pfsifre.setText(sifre);//gelen şifreyi passwordfielde atıyoruz
            }
        } catch (SQLException ex) {//olası sql hatasını kullanıcıya bildiriyoruz 
            JOptionPane.showMessageDialog(null, "Veritabanı hatası: " + ex.getMessage());}
    }//GEN-LAST:event_formWindowOpened

    private void btnyoneticiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyoneticiActionPerformed
        kullanicieklegiris kg = new kullanicieklegiris();
        kg.setVisible(true);
        kg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnyoneticiActionPerformed
    public static int kullaniciID;//kullanıcıID yi başka formlara verebilmek için burda public olarak tanımlıyoruz
    private static String tel;
    private static String ksifre;

    private void kontrol(String telno, String ksifre) {
        if (baglanti == null) {//bağlatı methodumuzdan boş değer dönüyor ise 
            System.out.println("veritabanına bağlanılamadı!");//kullanıcıyı bilgilendir
            return;}
        try {//kullanıcı_bilgi tablosundan telefon numarası ve şifreye göre sorgu yap
            String sql = "select * from kullanici_bilgi where kullaniciTELNO =? and kullaniciSIFRE =?";
            PreparedStatement stmt = baglanti.prepareStatement(sql);
            stmt.setString(1, telno);//telefon numarası ile boşluğu doldur
            stmt.setString(2, ksifre);//şifre ile 2. boşluğu doldur
            ResultSet rs = stmt.executeQuery();//sorguyu çalıştır
            if (rs.next()) {//sorgudan dönmesi beklenen satır 1 olduğu için if bloğu ve 1 dönerse 
                kullaniciID = rs.getInt("kullaniciID");//kullanıcıID yi genel koda atıyoruz
                tel = rs.getString("kullaniciTELNO");//sorgudan telefon numarasını alıyoruz
                ksifre = rs.getString("kullaniciSIFRE");//sorgudan şifreyi alıyoruz
                String checkQuery = "SELECT COUNT(*) FROM beni_hatirla";//beni hatırla tablosundaki tüm satırları geziyoruz zaten 1 satır olması gerekiyor
                try (PreparedStatement checkStmt = baglanti.prepareStatement(checkQuery)) {//sorguyu veritabanı ile bağlıyoruz
                    ResultSet checkRs = checkStmt.executeQuery();//sorguyu çalıştırıyoruz
                    checkRs.next();
                    if (checkRs.getInt(1) > 0) {
                        // eğer tablo boş değilse UPDATE sorgusu yapıyoruz
                        String updateQuery = "UPDATE beni_hatirla SET kullaniciTELNO = ?, kullaniciSIFRE = ?";
                        try (PreparedStatement updateStmt = baglanti.prepareStatement(updateQuery)) {
                            updateStmt.setString(1, tel); //aldığımız telefon numarasını yine aynı yere yazıyoruz
                            updateStmt.setString(2, ksifre);//değişmiş olabilecek şifreyi de yazıyoruz
                            updateStmt.executeUpdate();/*sorguyu çalıştır*/}
                    } else {// tablo boşsa INSERT sorgusu yapıyoruz
                        String insertQuery = "INSERT INTO beni_hatirla (kullaniciTELNO, kullaniciSIFRE) VALUES (?, ?)";
                        try (PreparedStatement insertStmt = baglanti.prepareStatement(insertQuery)) {
                            insertStmt.setString(1, tel);//boş tabloya satır ekliyoruz 1. kolon olarak telefon numarası
                            insertStmt.setString(2, ksifre);//2. değişken olarak kullanıcı şifresi
                            insertStmt.executeUpdate();/*sorguyu çalıştırıyoruz*/ }
                    }
                } catch (SQLException ex) {//olası sql hatası için gerekli messagebox
                    JOptionPane.showMessageDialog(null, "Veritabanı hatası: " + ex.getMessage());}
                //işlemler tamamlandı ise ana forma giriş yapılır
                ana anaPencere = new ana();
                anaPencere.setLocationRelativeTo(null);
                anaPencere.setVisible(true);
                this.dispose();
            } else {//hatalı giriş denemesinden sonra kullanıcıya gönderilen messagebox
                JOptionPane.showMessageDialog(rootPane, "Hatalı bilgi", "Hata", JOptionPane.ERROR_MESSAGE);}
        } catch (Exception e) {}
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngirisyap;
    private javax.swing.JButton btnkaydol;
    private javax.swing.JButton btnyonetici;
    private javax.swing.JFormattedTextField formattedtelno;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pfsifre;
    private javax.swing.JTextField tfsifre;
    private javax.swing.JToggleButton tgglbsifregoster;
    // End of variables declaration//GEN-END:variables
}
