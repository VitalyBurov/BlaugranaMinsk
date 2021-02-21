package by.bgminsk.dao;

import by.bgminsk.entity.Event;
import connection.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EventDaoImpl implements EventDao {

    private static final String SAVE_EVENT_QUERY = "INSERT INTO event (id,name,palace,description,author) VALUES (?,?,?,?,?);";

    @Override
    public void save(Event event) {
        try {
            Connection connection = ConnectionManager.newConnection();
            PreparedStatement statement = connection.prepareStatement(SAVE_EVENT_QUERY);

            statement.setInt(1, event.getId());
            statement.setString(2, event.getName());
            statement.setString(3, event.getPalace());
            statement.setString(4, event.getDescription());
            statement.setString(5, event.getAuthor());

            statement.execute();

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
