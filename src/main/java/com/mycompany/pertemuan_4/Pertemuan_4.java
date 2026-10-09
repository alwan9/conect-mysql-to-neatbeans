package com.mycompany.pertemuan_4;

import java.sql.Connection;
import java.sql.DriverManager;

public class Pertemuan_4 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/moduladpl";
        String user = "root"; // Sesuaikan dengan username database
        String password = "Sapi17$"; // Sesuaikan dengan password database
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Koneksi berhasil!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
