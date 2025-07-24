package com.emir.stoktakip;
import java.sql.*;
import javax.swing.JOptionPane;
public class ayarlar extends javax.swing.JFrame {
    public ayarlar() {
        initComponents();
    }
    int kullaniciID = giris.kullaniciID;
    Connection baglanti = veritabani.baglantiAl();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngeri = new javax.swing.JButton();
        tfyenisifre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btngeri.setBackground(new java.awt.Color(255, 0, 51));
        btngeri.setText("Geri");
        btngeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngeriActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Yeni Şifre");

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setText("Kaydet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btngeri)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfyenisifre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btngeri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(tfyenisifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngeriActionPerformed
        ana Ana = new ana();
        Ana.setVisible(true);
        Ana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btngeriActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String yenisifre = tfyenisifre.getText().trim();//başta veya sonda boşluk olmadan sade halde string değişkene atıyoruz
        if (!yenisifre.isEmpty()) {//eğer değişkenimiz boş DEĞİL ise
            try {//kullanici_bilgi tablosundan kullanıcıID ye göre kullaniciSIFRE'sini değiştirmek için olan sorgu
                String sql = "UPDATE kullanici_bilgi SET kullaniciSIFRE = ? WHERE kullaniciID = ?";
                PreparedStatement pstmt = baglanti.prepareStatement(sql);
                pstmt.setString(1, yenisifre);//1. boşluğa yeni şifre
                pstmt.setInt(2, kullaniciID);//2. boşluğa kullanıcıID
                int guncellenenSatir = pstmt.executeUpdate();//sorguyu çalıştır

                if (guncellenenSatir > 0) {//güncellenen satır 1 dönerse yani if bloğu true olursa bu kısım çalışır
                    JOptionPane.showMessageDialog(null, "Şifre başarıyla güncellendi.");
                } else {//sorgu çalışmaz ise bu kısım çalışır
                    JOptionPane.showMessageDialog(null, "Şifre güncellenemedi. Kullanıcı bulunamadı.");
                }

            } catch (SQLException ex) {//herhangi bir sql hatasına karşı kullanıcıya bildir
                JOptionPane.showMessageDialog(null,"veritabanı hatası:"+ ex);
            }
        }
        else{//değişken boş ise doldurum diye messagebox gönderir
            JOptionPane.showMessageDialog(null, "şifre alanını doldurunuz");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ayarlar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngeri;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfyenisifre;
    // End of variables declaration//GEN-END:variables
}
