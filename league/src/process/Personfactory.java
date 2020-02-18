package process;

import data.microaspect.Contract;
import data.microaspect.Manager;
import data.microaspect.Person;
import data.microaspect.Player;
import data.microaspect.Rookie;
import data.microaspect.Veterant;

public class Personfactory {

	public static Person createPerson(String type ,String firstname, String lastname, int age, int number, Contract contract, int stat) {
		if ("Player".equalsIgnoreCase(type)) {
			return new Player(firstname, lastname, age, number, contract, stat);
		}
		else if("Manager".equalsIgnoreCase(type)) {
			return new Manager(firstname, lastname, age, stat);
		}
		return null;
		 
	}
	
}
