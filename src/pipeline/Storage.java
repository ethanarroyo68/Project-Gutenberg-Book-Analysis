package pipeline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Storage {
    private static final String URL = "jdbc:sqlite:gutenberg.db";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    public static void init() {
        // TODO: create schema if not exists
        // book(id, title?), paragraph(id, book_id, text)
    }
}