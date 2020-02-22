package test;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;


public class Testconnect {
	  public static void main(String[] args) {      
	    try {
	      Class.forName("com.mysql.jdbc.Driver");
	      System.out.println("Driver O.K.");

	      String url = "jdbc:mysql://localhost:3306/mydatabase";
	      String user = "root";
	      String passwd = "";

	      Connection conn = (Connection) DriverManager.getConnection(url, user, passwd);
	         
	      //Création d'un objet Statement
	      Statement state = (Statement) conn.createStatement();
	      //L'objet ResultSet contient le résultat de la requête SQL
	      ResultSet result = state.executeQuery("SELECT * FROM mydatabase.data_team;");
	      //On récupère les MetaData
	      ResultSetMetaData resultMeta = (ResultSetMetaData) result.getMetaData();
	         
	      System.out.println("\n**********************************");
	      //On affiche le nom des colonnes
	      for(int i = 1; i <= resultMeta.getColumnCount(); i++)
	        System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
	         
	      System.out.println("\n**********************************");
	         
	      while(result.next()){         
	        for(int i = 1; i <= resultMeta.getColumnCount(); i++)
	          System.out.print("\t" + result.getObject(i).toString() + "\t |");
	            
	        System.out.println("\n---------------------------------");

	      }

	      result.close();
	      state.close();
	         
	    } catch (Exception e) {
	      e.printStackTrace();
	    }      
	  }
	}
