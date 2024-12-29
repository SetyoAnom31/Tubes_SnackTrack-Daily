/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;
import interfaces.LoginRegister;
import java.util.ArrayList;
import java.util.List;
import snacktrack.User;
// UserDB class

public class UserDB implements LoginRegister {

    private List<User> users = new ArrayList<>();

    @Override
    public boolean login(String email, String password) {
        String query = "SELECT * FROM user WHERE email = ? AND password = ?";

        try (Connection connection = databaseConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean register(User user) {
        String checkQuery = "SELECT * FROM user WHERE email = ?";
        String insertQuery = "INSERT INTO user (nama_user, email, password) VALUES (?, ?, ?)";

        try (Connection connection = databaseConnection.getConnection(); PreparedStatement checkStatement = connection.prepareStatement(checkQuery); PreparedStatement insertStatement = connection.prepareStatement(insertQuery)) {

            // Check if the email already exists
            checkStatement.setString(1, user.getEmail());
            ResultSet resultSet = checkStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("Email sudah terdaftar");
                return false;
            }

            // Insert new user
            insertStatement.setString(1, user.getNama_User());
            insertStatement.setString(2, user.getEmail());
            insertStatement.setString(3, user.getPassword());

            insertStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
