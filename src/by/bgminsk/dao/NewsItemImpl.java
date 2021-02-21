package by.bgminsk.dao;

import by.bgminsk.entity.NewsItem;
import connection.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewsItemImpl implements NewsItemDao{

    private static final String SAVE_NEWS_ITEM_QUERY = "INSERT INTO news_item (id,title,content,author) VALUES (?,?,?,?);";

    @Override
    public void save(NewsItem newsItem) {
        try { Connection connection = ConnectionManager.newConnection();
            PreparedStatement statement = connection.prepareStatement(SAVE_NEWS_ITEM_QUERY);

            statement.setInt(1, newsItem.getId());
            statement.setString(2, newsItem.getTitle());
            statement.setString(3, newsItem.getContent());
            statement.setString(4, newsItem.getAuthor());

            statement.execute();

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }

}
