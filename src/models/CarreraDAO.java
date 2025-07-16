package models;

import java.sql.Connection;

public class CarreraDAO {
    private Connection conn;

    public CarreraDAO(Connection conn) {
        this.conn = conn;
    }
}
