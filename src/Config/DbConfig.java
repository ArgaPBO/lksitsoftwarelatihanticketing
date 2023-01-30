/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Arga 'Ahmad Mujahidin' Herlambang
 */
public class DbConfig {
    public static Connection getConnection() {
        Connection conn=null;
        String url = "jdbc:mysql://localhost:3306/latihanlks";
        String username="root";
        String password="";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn=DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
}
