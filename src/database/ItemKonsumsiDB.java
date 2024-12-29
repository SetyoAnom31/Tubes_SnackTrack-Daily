/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import interfaces.TambahHapus;
import java.sql.*;
import snacktrack.ItemKonsumsi;

/**
 *
 * @author Anom
 */
public class ItemKonsumsiDB implements TambahHapus {

    @Override
    public boolean tambahItem(ItemKonsumsi item) {
        String insertQuery = "INSERT INTO item_konsumsi (nama, kategori, kalori, waktu_konsumsi, username) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = databaseConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(insertQuery)) {

            statement.setString(1, item.getNama());
            statement.setString(2, item.getKategori());
            statement.setDouble(3, item.getKalori());
            statement.setString(4, item.getWaktuKonsumsi());
            statement.setString(5, item.getUsername());

            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean hapusItem(int id_ItemKonsumsi) {
        String deleteQuery = "DELETE FROM item_konsumsi WHERE id_item_konsumsi = ?";

        try (Connection connection = databaseConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(deleteQuery)) {

            statement.setInt(1, id_ItemKonsumsi);
            int rowsDeleted = statement.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public double hitungTotalKalori(String email) {
        String query = "SELECT SUM(kalori) AS total_kalori FROM item_konsumsi WHERE username = ?";
        double totalKalori = 0;

        try (Connection connection = databaseConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, email);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                totalKalori = resultSet.getDouble("total_kalori");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return totalKalori;
    }
}
