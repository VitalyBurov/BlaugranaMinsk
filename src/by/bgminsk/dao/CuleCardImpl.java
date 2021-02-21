package by.bgminsk.dao;

import by.bgminsk.entity.CuleCard;
import connection.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CuleCardImpl implements CuleCardDao {

    private static final String SAVE_CULE_CARD_QUERY = "INSERT INTO users (id,name) VALUES (?,?);";

    @Override
    public void save(CuleCard culeCard) {
        try {
            Connection connection = ConnectionManager.newConnection();
            PreparedStatement statement = connection.prepareStatement(SAVE_CULE_CARD_QUERY);

            statement.setInt(1, culeCard.getId());
            statement.setString(2, culeCard.getName());


            statement.execute();

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
