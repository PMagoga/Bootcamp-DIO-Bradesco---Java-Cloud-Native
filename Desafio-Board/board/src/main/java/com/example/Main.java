package com.example;

import com.example.persistence.migration.MigrationStrategy;
import com.example.ui.MainMenu;
import java.sql.SQLException;

import static com.example.persistence.config.ConnectionConfig.getConnection;

public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}
