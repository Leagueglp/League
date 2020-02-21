package second;

import com.mysql.jdbc.Connection;

import dao.DAO;
import dao.PlayerDao;
import dao.SdzConnection;
import first.Player;

public class TestSAm {
	
	public static void main (String[] args) {	
	DAO<Player> playerDao = new PlayerDao((Connection) SdzConnection.getInstance());
	 System.out.println("Atlanta Hawks");
     System.out.println("********************");
	 for(int i = 1; i <= 5; i++){
	      Player player = playerDao.find(i);
	     
	      System.out.println("Player N°" + player.getId() + "  - " + player.getName() + "  - " + player.getAge()+"  - "+ player.getRating());;
	    }
	 System.out.println("^^^^^^^^^^^^^^^^^^^^");
	 System.out.println("Boston Celtics");
     System.out.println("********************"); 
     for(int i = 6; i <= 10; i++){
	      Player player = playerDao.find(i);
	     
	      System.out.println("Player N°" + player.getId() + "  - " + player.getName() + "  - " + player.getAge()+"  - "+ player.getRating());;
	    }
	}
}
