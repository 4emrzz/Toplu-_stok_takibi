//bu formda form açıp kapatmaktan başka hiçbir işlem yoktur sadece tumpiyasa formu sonradan bu ismi aldığı için try-catch bloğu gerekli
package com.emir.stoktakip;

import javax.swing.JOptionPane;

public class ana extends javax.swing.JFrame {
    public ana() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        urunsat = new javax.swing.JButton();
        stokekle = new javax.swing.JButton();
        yeniurunekle = new javax.swing.JButton();
        fatura = new javax.swing.JButton();
        aidat = new javax.swing.JButton();
        ayarlar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tumpiyasa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        urunsat.setBackground(new java.awt.Color(255, 255, 0));
        urunsat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        urunsat.setText("ÜRÜN SAT");
        urunsat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunsatActionPerformed(evt);
            }
        });

        stokekle.setBackground(new java.awt.Color(102, 255, 102));
        stokekle.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        stokekle.setText("STOK EKLE/ÇIKAR");
        stokekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokekleActionPerformed(evt);
            }
        });

        yeniurunekle.setBackground(new java.awt.Color(204, 255, 204));
        yeniurunekle.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        yeniurunekle.setText("<html>YENİ ÜRÜN<br>EKLE<html>");
        yeniurunekle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        yeniurunekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniurunekleActionPerformed(evt);
            }
        });

        fatura.setBackground(new java.awt.Color(153, 255, 255));
        fatura.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        fatura.setText("<html>İŞLEMLER/<br>İADE AL<html>");
        fatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faturaActionPerformed(evt);
            }
        });

        aidat.setBackground(new java.awt.Color(204, 153, 255));
        aidat.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        aidat.setForeground(new java.awt.Color(51, 51, 51));
        aidat.setText("<html>AYLIK<br>GİDERLER</html>");
        aidat.setToolTipText("\n\n");
        aidat.setPreferredSize(new java.awt.Dimension(114, 173));
        aidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aidatActionPerformed(evt);
            }
        });

        ayarlar.setBackground(new java.awt.Color(255, 51, 0));
        ayarlar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ayarlar.setText("ŞİFRE DEĞİŞTİR");
        ayarlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayarlarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("KATEGORİ EKLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tumpiyasa.setBackground(new java.awt.Color(0, 255, 204));
        tumpiyasa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tumpiyasa.setText("TÜM PİYASA");
        tumpiyasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tumpiyasaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(urunsat, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(tumpiyasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(stokekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yeniurunekle)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(ayarlar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aidat, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fatura, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fatura, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aidat, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(stokekle, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yeniurunekle, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(urunsat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(tumpiyasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ayarlar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void urunsatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunsatActionPerformed
        urunsat urunSat = new urunsat();
        urunSat.setVisible(true);
        urunSat.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_urunsatActionPerformed

    private void stokekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokekleActionPerformed
        stokekle stokEkle = new stokekle();
        stokEkle.setVisible(true);
        stokEkle.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_stokekleActionPerformed

    private void yeniurunekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniurunekleActionPerformed
        yeniurunekle yeniUrunEkle = new yeniurunekle();
        yeniUrunEkle.setVisible(true);
        yeniUrunEkle.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_yeniurunekleActionPerformed

    private void aidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aidatActionPerformed
        aidat Aidat = new aidat();
        Aidat.setVisible(true);
        Aidat.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_aidatActionPerformed

    private void ayarlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayarlarActionPerformed
        ayarlar Ayarlar = new ayarlar();
        Ayarlar.setVisible(true);
        Ayarlar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ayarlarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        kategoriekle Kategori = new kategoriekle();
        Kategori.setVisible(true);
        Kategori.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tumpiyasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tumpiyasaActionPerformed
        try {
        tumpiyasa piyasaFormu = new tumpiyasa();
        piyasaFormu.setVisible(true);
        piyasaFormu.setLocationRelativeTo(null); // ekranın ortasında açılır
        this.dispose(); // ana form kapanır, eğer kapanmasını istemiyorsan bunu sil
    } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Form açılırken bir sorun oluştu veya form bulunamadı:"+ex);
    }
    }//GEN-LAST:event_tumpiyasaActionPerformed

    private void faturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faturaActionPerformed
        fatura Fatura = new fatura();
        Fatura.setVisible(true);
        Fatura.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_faturaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aidat;
    private javax.swing.JButton ayarlar;
    private javax.swing.JButton fatura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton stokekle;
    private javax.swing.JButton tumpiyasa;
    private javax.swing.JButton urunsat;
    private javax.swing.JButton yeniurunekle;
    // End of variables declaration//GEN-END:variables
}
