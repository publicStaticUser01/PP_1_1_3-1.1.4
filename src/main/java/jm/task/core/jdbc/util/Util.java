package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
//    private  static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
//    private  static final String DB_URL = "jdbc:mysql://localhost:3306/base";
//    private  static final String DB_USERNAME = "root";
//    private  static final String DB_PASSWORD = "1111";
    //  public Connection getConnection() {
//        Connection connection = null;
//        try {
//            Class.forName(DB_DRIVER);
//            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
//            System.out.println("Connection OK");
//
//        } catch (ClassNotFoundException  | SQLException e) {
//            e.printStackTrace();
//            System.out.println("Connection ERROR");
//        }
//        return connection;
//    }
        private final String HOST = "jdbc:mysql://localhost:3306/base";
        private final String USERNAME = "root";
        private final String PASSWORD = "1111";
        private Connection connection;


        public Connection getConnection() {
            try {
                connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }

}

