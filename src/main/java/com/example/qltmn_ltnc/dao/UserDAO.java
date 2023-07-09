package com.example.qltmn_ltnc.dao;

import com.example.qltmn_ltnc.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO extends  DAO{
    public UserDAO() {
        super();
    }
    public User createUser(User user) {
        String query = "INSERT INTO User (username, password, phone, gender, address, name, dob) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getPhone());
            statement.setString(4, user.getGender());
            statement.setString(5, user.getAddress());
            statement.setString(6, user.getName());
            statement.setDate(7, new Date(user.getDob().getTime()));

            int affectedRows = statement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                user.setUserId(generatedKeys.getInt(1));
            } else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public User getUserById(int userId) {
        String query = "SELECT * FROM User WHERE userId = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, userId);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return createUserFromResultSet(resultSet);
            }

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        String query = "SELECT * FROM User";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                User user = createUserFromResultSet(resultSet);
                userList.add(user);
            }

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }

    public User updateUser(User user) {
        String query = "UPDATE User SET username = ?, password = ?, phone = ?, gender = ?, address = ?, name = ?, dob = ? " +
                "WHERE userId = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getPhone());
            statement.setString(4, user.getGender());
            statement.setString(5, user.getAddress());
            statement.setString(6, user.getName());
            statement.setDate(7, new Date(user.getDob().getTime()));
            statement.setInt(8, user.getUserId());

            int affectedRows = statement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Updating user failed, no rows affected.");
            }

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public void deleteUser(int userId) {
        String query = "DELETE FROM User WHERE userId = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, userId);
            statement.executeUpdate();

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private User createUserFromResultSet(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setUserId(resultSet.getInt("userId"));
        user.setUsername(resultSet.getString("username"));
        user.setPassword(resultSet.getString("password"));
        user.setPhone(resultSet.getString("phone"));
        user.setGender(resultSet.getString("gender"));
        user.setAddress(resultSet.getString("address"));
        user.setName(resultSet.getString("name"));
        user.setDob(resultSet.getDate("dob"));

        return user;
    }
}
