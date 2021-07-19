package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandler {
    //jdbc:mysql://127.0.0.1:3306/?user=java_18
    String connectionUrl = "jdbc:mysql://127.0.0.1:3306/supermarket?";
    String user = "java_18";
    String password = "java18";

    private Connection connection;

    public DatabaseHandler(){
        try{
            connection = DriverManager.getConnection(connectionUrl, user, password);
        }catch (SQLException e){
            System.out.println("Supermarket is unable to connect to data storage system");
            //e.printStackTrace();
        }
    }
    public Connection getConnection(){
        return connection;
    }
}
