/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package NewChapterModule;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConnection {
    private static MyConnection instance;
    private Connection connection;
    
    
   public static MyConnection getInstance() {
        if(instance == null){
            instance = new MyConnection();
        }
        return instance;
    }
    
    private MyConnection() {
        
    }
    
    public void connectToDatabase() throws SQLException, ClassNotFoundException {
        final String URL = "jdbc:mysql://localhost:3306/idfc";
        final String USER = "root";
        final String PASSWORD = "ShyHuey0912~"; 
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    public Connection getConnection() {
        return connection;
    }
}
    

