package dao;

import java.sql.Connection;
import java.sql.ResultSet;

import first.BasketTeam;

public class BasketTeamDao extends DAO<BasketTeam> {

	public BasketTeamDao(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(BasketTeam obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(BasketTeam obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(BasketTeam obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BasketTeam find(int id) {
		BasketTeam basketTeam = new BasketTeam();
		try {
			 ResultSet result = this.connect.createStatement(
				        ResultSet.TYPE_SCROLL_INSENSITIVE, 
				        ResultSet.CONCUR_READ_ONLY
				      ).executeQuery("SELECT * FROM data_team WHERE bsteam_id = " + id); 
			 if(result.first()) {
				 basketTeam = new BasketTeam(id, result.getString("Team"), result.getString("Location"));
				 PlayerDao plyDao = new PlayerDao((com.mysql.jdbc.Connection) this.connect);
				
				 result = this.connect.createStatement().executeQuery(
			                "SELECT * FROM data_player " +
			                "INNER JOIN data_team ON Team_id = bsteam_id AND bsteam_id = " + id
			        );
			        while(result.next())         
					          basketTeam.add(plyDao.find(result.getInt("ply_id")));

			
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return basketTeam;
	}

}
