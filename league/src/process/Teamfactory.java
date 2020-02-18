package process;

import java.util.ArrayList;

import data.microaspect.Conference;
import data.microaspect.Contract;
import data.microaspect.Franchise;
import data.microaspect.Person;
import data.microaspect.Player;
import data.microaspect.Stadium;
import data.microaspect.Team;

public class Teamfactory {
	
	public static Team createFranchise(ArrayList<Player> player, double generalstat, String teamname, int ranking, Conference conference,
			Stadium stadium, double payroll) {
		return new Franchise(player, generalstat, teamname, ranking, conference, stadium, payroll);
	}

}
