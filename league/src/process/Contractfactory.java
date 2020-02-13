package process;

import data.microaspect.Contract;
import data.microaspect.Rookie;
import data.microaspect.Veterant;

public class Contractfactory {
	
	public static Contract getContract(String type, String date,double salary , int duration, int draftrank, int teamduration) {
		if ("Rookie".equalsIgnoreCase(type)) {
			return new Rookie(date, salary, duration, draftrank);
		
		}
		else if("Veterant".equalsIgnoreCase(type)) {
			return new Veterant(date, salary, duration, teamduration);
		}
		return null;
				
	}

}
