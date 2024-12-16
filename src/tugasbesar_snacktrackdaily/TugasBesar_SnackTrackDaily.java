/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasbesar_snacktrackdaily;

/**
 *
 * @author Anom
 */

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TugasBesar_SnackTrackDaily {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InputKonsumsi loginFrame = new InputKonsumsi();
            loginFrame.setVisible(true);
        });
    }
    
}
