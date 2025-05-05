/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author uande
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/dbcliente";
    private static final String USER = "root";
    private static final String PASS = "";
    
   public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriveManager.getConnection(URL, USER, PASS)
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ",ex);
        }
}
   
   public static void closeConnection(Connection con){
       try{
           if(con!=null) {
              con.close();
              
           }
           
}

   }
   
}
