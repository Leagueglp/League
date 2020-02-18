package test;

import java.util.ArrayList;

import data.microaspect.Contract;
import data.microaspect.Person;
import data.microaspect.Player;
import data.microaspect.Rookie;
import data.microaspect.Veterant;
import process.Contractfactory;
import process.Personfactory;

public class testplayer {

	public static void main(String[] args) {
		
		Contract rookie = Contractfactory.createContract("Rookie", "20/01", 10000, 2, 21, 0);
		Contract veterant = Contractfactory.createContract("Veterant", "10/02", 1000000, 4, 0, 7);
		Person P2 = Personfactory.createPerson("Player", "Stame", "lasme", 26, 15, veterant, 12);
		Person P1= Personfactory.createPerson("Player","JOJO", "lae", 19, 10, rookie, 10);
		ArrayList<Person> Players = new ArrayList<Person>(10);
		Players.add(P1);
		Players.add(P2);
		System.out.println(Players);
	
	}

}
