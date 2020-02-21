package dao;

import java.sql.*;

//CTRL + SHIFT + O pour générer les imports
public class SdzConnection{

private static String url = "jdbc:mysql://localhost:3306/mydatabase";
private static String user = "root";
private static String passwd = "";
private static Connection connect;
 
public static Connection getInstance(){
  if(connect == null){
    try {
      connect = DriverManager.getConnection(url, user, passwd);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }      
  return connect;
}   
}