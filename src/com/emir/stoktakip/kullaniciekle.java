package com.emir.stoktakip;
import java.awt.event.ItemEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class kullaniciekle extends javax.swing.JFrame {

    public kullaniciekle() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ftftelno = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        tfad = new javax.swing.JTextField();
        tfsoyad = new javax.swing.JTextField();
        tfisletmead = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnmusterikaydet = new javax.swing.JButton();
        tftumu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfyil = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbmusteri = new javax.swing.JComboBox<>();
        btnmusterisil = new javax.swing.JButton();
        rbkategori = new javax.swing.JRadioButton();
        rbmodel = new javax.swing.JRadioButton();
        rbaltkategori = new javax.swing.JRadioButton();
        btnsecimisil = new javax.swing.JButton();
        cbkategori = new javax.swing.JComboBox<>();
        cbmodel = new javax.swing.JComboBox<>();
        cbaltkategori = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        try {
            ftftelno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+90 (###) ### ## ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Telefon Numarası:");

        jLabel2.setText("Ad:");

        jLabel3.setText("Soyad(Şifre):");

        jLabel4.setText("İşletme Adı:");

        btnmusterikaydet.setBackground(new java.awt.Color(153, 255, 153));
        btnmusterikaydet.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnmusterikaydet.setText("Müşteriyi Kaydet");
        btnmusterikaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmusterikaydetActionPerformed(evt);
            }
        });

        jLabel5.setText("Kazanç (Tüm zamanlar)");

        jLabel6.setText("Kazanç (Geçen ay)");

        jLabel7.setText("Kazanç(Geçen yıl)");

        btnmusterisil.setBackground(new java.awt.Color(255, 153, 153));
        btnmusterisil.setText("Müşteriyi Sil");
        btnmusterisil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmusterisilActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbkategori);
        rbkategori.setText("Kategori");
        rbkategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbkategoriActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbmodel);
        rbmodel.setText("Model");
        rbmodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmodelActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbaltkategori);
        rbaltkategori.setText("Alt Kategori");
        rbaltkategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbaltkategoriActionPerformed(evt);
            }
        });

        btnsecimisil.setBackground(new java.awt.Color(255, 102, 51));
        btnsecimisil.setText("Seçimi sil");
        btnsecimisil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsecimisilActionPerformed(evt);
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

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 5));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(5, 160));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 5));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tftumu, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tfyil, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsecimisil, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbaltkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbaltkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ftftelno, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(tfad, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(tfsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(tfisletmead, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnmusterikaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfay, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(cbmusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnmusterisil, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftftelno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfisletmead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(btnmusterikaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmusterisil)
                            .addComponent(cbmusteri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(rbmodel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbkategori)
                                .addComponent(rbaltkategori))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbaltkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsecimisil)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jLabel6))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jLabel7))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(tfyil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(tfay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(jLabel5))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(135, 135, 135)
                            .addComponent(tftumu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection baglanti = veritabani.baglantiAl();
    private void btnmusterikaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmusterikaydetActionPerformed
        String telno = ftftelno.getText();//formattedtextfielde girilen değişkeni string olarak alıyoruz
        String ad = tfad.getText();//textfielde girilen ad değişkenini string olarak alıyoruz 
        String soyad = tfsoyad.getText();//textfielde girilen soyad değişkenini string olarak alıyoruz
        String isletmead = tfisletmead.getText();//text fielde girilen işletme adını string olarak alıyoruz
        //eğer tüm alanlar dolu ise kodumuz ve sorgumuz çalışacaktır
        if (!telno.trim().isEmpty() && !ad.trim().isEmpty() && !soyad.trim().isEmpty() && !isletmead.trim().isEmpty()) {
            try {
                //kullanici_bilgi tablosuna kayıt ekleyen sorgu
                String sql = "INSERT INTO kullanici_bilgi (kullaniciTELNO,kullaniciAD,kullaniciSOYAD,kullaniciSIFRE,isletmeAD) VALUES (?,?,?,?,?)";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setString(1, telno);//1. boşluğa telefon numarasını yazıyoruz
                ps.setString(2, ad);//2. boşluğa kişinin ismini yazıyoruz
                ps.setString(3, soyad);//3. boşluğa kişinin soyadını yazıyoruz
                ps.setString(4, soyad);//4. boşluğa yani şifre kısmına kullanıcının soyadını yazıyoruz sonradan değiştirebilir
                ps.setString(5, isletmead);//5. boşluğa işletmenin adını ekliyoruz
                int rs = ps.executeUpdate();//sorguyu çalıştırıyoruz
                if (rs > 0) {//sorgudan dönen true(1) ise kaydı yapanı bildiriyoruz
                    JOptionPane.showMessageDialog(null, "Kayıt başarılı.");
                } else {//sorgu çalışmaz false(0) dönerse kullanıcıyı uyarıyoruz
                    JOptionPane.showMessageDialog(null, "İşlem yapılamadı");
                }
            } catch (SQLException e) {//olası sql hatasında kaydı yapan kişiye bilidiriyoruz
                JOptionPane.showMessageDialog(null, "Veritabanı hatası:" + e);
            }
        } else {//eğer boşluklar tam dolu değil ise kullanıcıya bildir
            JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurunuz.");
        }
        formWindowOpened(null);//formopened olayını yeniden canlandır
    }//GEN-LAST:event_btnmusterikaydetActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //form açılınca uygulamanın yaptığı kârı gösteren kod ve sorgu kısmı (tüm zamanlar, aylık ve yıllık)
        cbkategori.setEnabled(false);//comboboxun erişilebilirliğini kapatıyoruz
        cbaltkategori.setEnabled(false);//comboboxun erişilebilirliğini kapatıyoruz
        cbmodel.setEnabled(false);//comboboxun erişilebilirliğini kapatıyoruz
        try {
            String sql = """
            SELECT
                SUM(toplamUYGKES) AS tumu,
                SUM(CASE 
                        WHEN YEAR(giderTARIH) = YEAR(DATEADD(YEAR, -1, GETDATE())) 
                        THEN toplamUYGKES 
                        ELSE 0 
                    END) AS gecenYil,
                SUM(CASE 
                        WHEN YEAR(giderTARIH) = YEAR(DATEADD(MONTH, -1, GETDATE())) AND 
                             MONTH(giderTARIH) = MONTH(DATEADD(MONTH, -1, GETDATE())) 
                        THEN toplamUYGKES 
                        ELSE 0 
                    END) AS gecenAy
            FROM gunluk_gider;
        """;
            PreparedStatement ps = baglanti.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();////sorguyu çalıştır
            if (rs.next()) {//sorgu çalışırsa
                tftumu.setText(rs.getString("tumu"));//tüm zamanların uygulama kesintisini textfielde ekle 
                tfyil.setText(rs.getString("gecenYil"));//geçen yıldaki uygulama kesintisini textfielde ekle
                tfay.setText(rs.getString("gecenAy"));//geçen aydaki uygulama kesintisini textfielde ekle
            }
        } catch (SQLException e) {//olası sql hatasını kullanıcıya bildir 
            JOptionPane.showMessageDialog(null, "Veritabanı hatası" + e);
        }
        //form açılınca işletme adlarını comboboxa eklesin
        try {
            cbmusteri.removeAllItems();
            String sql = "SELECT isletmeAD FROM kullanici_bilgi";
            PreparedStatement ps = baglanti.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cbmusteri.addItem(rs.getString("isletmeAD"));
            }
        } catch (Exception e) {
        }
        //form açılınca kategori adlarını comboboxa eklesin
        try {
            String sql = "SELECT kategoriAD FROM kategori";
            PreparedStatement ps = baglanti.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            cbkategori.removeAllItems();
            while (rs.next()) {
                cbkategori.addItem(rs.getString("kategoriAD"));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnmusterisilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmusterisilActionPerformed
        //işletme adına göre kullaniciID aldığımız kod ve sorgu
        String isletmead = (String) cbmusteri.getSelectedItem();
        int kullaniciid = -1;
        try {
            String sql = "SELECT kullaniciID FROM kullanici_bilgi WHERE isletmeAD=?";
            PreparedStatement ps = baglanti.prepareStatement(sql);
            ps.setString(1, isletmead);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                kullaniciid = rs.getInt("kullaniciID");
            } else {
                JOptionPane.showMessageDialog(null, "kullanıcıID alınamadı.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Veritabanı hatası :" + e);
        }
        //kategoriID'ye göre kullanıcının tüm bilgilerini sildiğimiz kod ve sorgu
        try {
            String sql = """
    BEGIN TRANSACTION;
    BEGIN TRY
        DECLARE @kullaniciID INT = ?;
        DELETE FROM beni_hatirla
        WHERE kullaniciTELNO IN (
            SELECT kullaniciTELNO FROM kullanici_bilgi WHERE kullaniciID = @kullaniciID
        );
        DELETE FROM gunluk_gider WHERE kullaniciID = @kullaniciID;
        DELETE FROM satis WHERE kullaniciID = @kullaniciID;
        DELETE FROM urun_bilgi WHERE kullaniciID = @kullaniciID;
        DELETE FROM kullanici_bilgi WHERE kullaniciID = @kullaniciID;
        COMMIT;
    END TRY
    BEGIN CATCH
        ROLLBACK;
        THROW;
    END CATCH;
    """;
            PreparedStatement ps = baglanti.prepareStatement(sql);
            ps.setInt(1, kullaniciid);
            ps.executeUpdate();
            cbmusteri.removeItemAt(cbmusteri.getSelectedIndex());//seçilen müşteriyi anında siliyoruz
            JOptionPane.showMessageDialog(null, "Kullanıcı ve verileri başarıyla silindi.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Silme sırasında hata oluştu:\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnmusterisilActionPerformed

    private void rbkategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbkategoriActionPerformed
        // TODO add your handling code here:
        cbkategori.setEnabled(true);//comboboxun erişilebilirliğini açıyoruz
        cbaltkategori.setEnabled(false);//comboboxun erişilebilirliğini kapatıyoruz
        cbmodel.setEnabled(false);//comboboxun erişilebilirliğini kapatıyoruz
        btnsecimisil.setText("Kategoriyi Sil");//butonun yazısını değiştiriyoruz
    }//GEN-LAST:event_rbkategoriActionPerformed

    private void rbaltkategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbaltkategoriActionPerformed
        // TODO add your handling code here:
        cbkategori.setEnabled(true);//comboboxun erişilebilirliğini açıyoruz
        cbaltkategori.setEnabled(true);//comboboxun erişilebilirliğini açıyoruz
        cbmodel.setEnabled(false);//comboboxun erişilebilirliğini kapatıyoruz
        btnsecimisil.setText("Alt Kategoriyi Sil");//butonun yazısını değiştiriyoruz

    }//GEN-LAST:event_rbaltkategoriActionPerformed

    private void rbmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmodelActionPerformed
        // TODO add your handling code here:
        cbkategori.setEnabled(true);//comboboxun erişilebilirliğini açıyoruz
        cbaltkategori.setEnabled(true);//comboboxun erişilebilirliğini açıyoruz
        cbmodel.setEnabled(true);//comboboxun erişilebilirliğini açıyoruz
        btnsecimisil.setText("Modeli Sil");//butonun yazısını değiştiriyoruz

    }//GEN-LAST:event_rbmodelActionPerformed

    private void cbkategoriİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbkategoriİtemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {//seçim her değiştiğinde çalışacak kod bloğu
            //kategoriID aldığımız kod ve sorgu
            int kategoriid = -1;
            String kategoriad = (String) cbkategori.getSelectedItem();
            try {
                String sql = "SELECT kategoriID FROM kategori WHERE kategoriAD=?";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setString(1, kategoriad);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    kategoriid = rs.getInt("kategoriID");
                } else {
                    JOptionPane.showMessageDialog(null, "kategoriID alınamadı");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Veritabanı hatası:" + e);
            }
            cbaltkategori.removeAllItems();
            //kategoriID'ye göre alt kategorileri comboboxa eklediğimiz sorgu
            try {
                String sql = "SELECT altkategoriAD FROM altkategori WHERE kategoriID=?";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setInt(1, kategoriid);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    cbaltkategori.addItem(rs.getString("altkategoriAD"));
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Veritabanı hatası" + e);
            }
        }
    }//GEN-LAST:event_cbkategoriİtemStateChanged

    private void cbaltkategoriİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbaltkategoriİtemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {//seçim her değiştiğinde çalışacak kod
            //altkategori adına göre altkategoriID aldığımız sorgu ve kod bloğu
            int altkategoriid = -1;
            String altkategoriad = (String) cbaltkategori.getSelectedItem();
            try {
                String sql = "SELECT altkategoriID FROM altkategori WHERE altkategoriAD=?";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setString(1, altkategoriad);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    altkategoriid = rs.getInt("altkategoriID");
                } else {
                    JOptionPane.showMessageDialog(null, "altkategoriID alınamadı");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Veritabanı hatası:" + e);
            }
            cbmodel.removeAllItems();
            //alt kategoriID'ye göre modelleri listeledğimiz kod ve sorgu
            try {
                String sql = "SELECT modelAD FROM model WHERE altkategoriID=?";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setInt(1, altkategoriid);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    cbmodel.addItem(rs.getString("modelAD"));
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Veritabanı hatası" + e);
            }
        }
    }//GEN-LAST:event_cbaltkategoriİtemStateChanged

    private void btnsecimisilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsecimisilActionPerformed
        try {
            if (rbkategori.isSelected()) {//kategori radiobuttonu seçili ise
                String kategoriad = (String) cbkategori.getSelectedItem();
                // Kategori adını güncelle
                String sql = "UPDATE kategori SET kategoriAD = 'Yönetici tarafından silindi' WHERE kategoriAD = ?";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setString(1, kategoriad);
                ps.executeUpdate();
                // Bağlı alt kategorileri güncelle
                sql = "UPDATE altkategori SET altkategoriAD = 'Yönetici tarafından silindi' WHERE kategoriID = (SELECT kategoriID FROM kategori WHERE kategoriAD = 'Yönetici tarafından silindi')";
                ps = baglanti.prepareStatement(sql);
                ps.executeUpdate();
                // Alt kategorilere bağlı modelleri güncelle
                sql = "UPDATE model SET modelAD = 'Yönetici tarafından silindi' WHERE altkategoriID IN (SELECT altkategoriID FROM altkategori WHERE altkategoriAD = 'Yönetici tarafından silindi')";
                ps = baglanti.prepareStatement(sql);
                ps.executeUpdate();
            } else if (rbaltkategori.isSelected()) {//alt kategori radiobuttonu seçili ise
                String altkategoriad = (String) cbaltkategori.getSelectedItem();
                // Alt kategori adını güncelle
                String sql = "UPDATE altkategori SET altkategoriAD = 'Yönetici tarafından silindi' WHERE altkategoriAD = ?";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setString(1, altkategoriad);
                ps.executeUpdate();
                // Bağlı modelleri güncelle
                sql = "UPDATE model SET modelAD = 'Yönetici tarafından silindi' WHERE altkategoriID = (SELECT altkategoriID FROM altkategori WHERE altkategoriAD = 'Yönetici tarafından silindi')";
                ps = baglanti.prepareStatement(sql);
                ps.executeUpdate();
            } else if (rbmodel.isSelected()) {//model radiobuttonu seçili ise
                String modelad = (String) cbmodel.getSelectedItem();
                // Model adını güncelle
                String sql = "UPDATE model SET modelAD = 'Yönetici tarafından silindi' WHERE modelAD = ?";
                PreparedStatement ps = baglanti.prepareStatement(sql);
                ps.setString(1, modelad);
                ps.executeUpdate();
            } else {
                JOptionPane.showMessageDialog(null, "Lütfen bir seçim yapın.");
            }
            JOptionPane.showMessageDialog(null, "İşlem başarıyla tamamlandı.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Veritabanı hatası: " + e.getMessage());
        }
    }//GEN-LAST:event_btnsecimisilActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmusterikaydet;
    private javax.swing.JButton btnmusterisil;
    private javax.swing.JButton btnsecimisil;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbaltkategori;
    private javax.swing.JComboBox<String> cbkategori;
    private javax.swing.JComboBox<String> cbmodel;
    private javax.swing.JComboBox<String> cbmusteri;
    private javax.swing.JFormattedTextField ftftelno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rbaltkategori;
    private javax.swing.JRadioButton rbkategori;
    private javax.swing.JRadioButton rbmodel;
    private javax.swing.JTextField tfad;
    private javax.swing.JTextField tfay;
    private javax.swing.JTextField tfisletmead;
    private javax.swing.JTextField tfsoyad;
    private javax.swing.JTextField tftumu;
    private javax.swing.JTextField tfyil;
    // End of variables declaration//GEN-END:variables
}
