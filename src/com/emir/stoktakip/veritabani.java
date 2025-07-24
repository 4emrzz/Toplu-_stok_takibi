package com.emir.stoktakip;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class veritabani {
    private final String dbUserName = "sa";
    private final String dbPassword = "DESKTOP-V36019R"; 
    private final String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=javatoptanci;encrypt=false";

    private Connection connection = null;

    public veritabani() throws ClassNotFoundException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        }
         catch (SQLException e) {
            System.out.println(e);
        }    
    }
    public Connection getConnection() {
        return connection;
    }
    public static Connection baglantiAl() {
        // Bu metod Veritabani sınıfındaki bağlantıyı alır
        try {
            veritabani veritabani = new veritabani();  // Yeni Veritabani nesnesi oluşturuluyor
            return veritabani.getConnection();  // Bağlantıyı döndürüyoruz
        } catch (ClassNotFoundException e) {
            System.err.println("Veritabanı sürücüsü bulunamadı!");
            e.printStackTrace();
            return null;
        }
    }
}
