package com.company.DAO;

import com.company.entities.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao{

    private static final String SAVE_USER_QUERY = "INSERT INTO users (id,name,age,position) VALUES (?,?,?,?);";

    @Override
    public void save(User user) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "burik2310");
            PreparedStatement statement = connection.prepareStatement(SAVE_USER_QUERY);

            statement.setInt(1, user.getId());
            statement.setString(2, user.getName());
            statement.setByte(3, user.getAge());
            statement.setString(4, user.getPosition());

            statement.execute();

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}