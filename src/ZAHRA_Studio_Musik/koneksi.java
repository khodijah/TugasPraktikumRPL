/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZAHRA_Studio_Musik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Khodijah Azzahra
 */
public class koneksi {
    Connection conn;
    Statement st;
    ResultSet rs;
    public void setkoneksi() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn=DriverManager.getConnection("jdbc:mysql://localhost/studio","root","");
            } catch (SQLException ex) {
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                st=conn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    }

