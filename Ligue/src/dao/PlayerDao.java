package dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import first.Player;

public class PlayerDao extends DAO<Player> {

	public PlayerDao(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Player obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Player obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Player obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Player find(int id) {
		  Player player = new Player();      
	      
		    try {
		      ResultSet result = this.connect.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM data_player WHERE ply_id = " + id);
		      if(result.first())
		        player = new Player(id,
		        		result.getString("Player_Name"), 
		        		result.getInt("Player_Age"),
		        		result.getInt("Player_Rating"));       
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
		    return player;
		  }
}


