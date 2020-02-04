package test;



import data.sportaspect.*;


public class Testplayer {
	
	public static void main(String[] args) {
	
	Rookie r1= new Rookie("19 déc", 80099, 2, 0);
	Player p1=new Player ("Samy", "Chouaf",19,1, r1,10);
	System.out.println(p1);
	
	}
}
