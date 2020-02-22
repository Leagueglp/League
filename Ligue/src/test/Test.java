package test;

import com.mysql.jdbc.Connection;

import dao.BasketTeamDao;
import dao.DAO;
import dao.PlayerDao;
import dao.SdzConnection;
import first.BasketTeam;
import first.Player;

public class Test{
	
	public static void main (String[] args) {	
     System.out.println("#####################\n");
     DAO<BasketTeam> bskDao = new BasketTeamDao(SdzConnection.getInstance());
     for(int i = 1; i < 31; i++) {
     BasketTeam team = bskDao.find(i);
       
     System.out.println("Team : " + team.getTeamName());
     System.out.println("Team location: "+ team.getLocation());
     team.calculateStat();
     System.out.println("Team rating "+team.getStat());
     System.out.println("\nPlayer list :");
   
     System.out.println("////////////\n");
     for(Player pl : team.getPlayers())
       System.out.println("  - " + pl.getName() + "  -Age : " + pl.getAge()+"  -Rating: "
	  			+ pl.getRating());
    
     System.out.println("#####################\n");
	
	}
	}
}