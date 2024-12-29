/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snacktrack;

/**
 *
 * @author Anom
 */

import database.databaseConnection;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TugasBesar_SnackTrackDaily extends databaseConnection{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InputKonsumsi loginFrame = new InputKonsumsi();
            loginFrame.setVisible(true);
            try {
            Connection con = databaseConnection.getConnection();
            if (con != null) {
                System.out.println("Koneksi berhasil!");
            }
        } catch (Exception e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        });
    }
    
}
