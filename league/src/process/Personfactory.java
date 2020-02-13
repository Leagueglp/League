package process;

import data.microaspect.Contract;
import data.microaspect.Person;
import data.microaspect.Player;

public class Personfactory {

	public static Person getPlayer(String firstname, String lastname, int age, int number, Contract contract, int stat) {
		
		return new Player(firstname, lastname, age, number, contract, stat);
	}
	
}
