package second;

import java.util.HashMap;

import first.BasketTeam;
import first.Calendar;
import first.Player;
import first.Rank;
import first.Stadium;

public class TestClass {

	public static void main (String[] args) {
		
		// Create Team
		
		// Atlanta Hawks
		
		Player Trae_Young = new Player ("Trae Young",21,90);
		Player Clint_Capela = new Player ("Clint Capela",25,86);
		Player John_Collins = new Player ("John Collins",22,84);
		Player Jeff_Teague = new Player ("Jeff Teague",31,79);
		Player DeAndre_Hunter = new Player ("DeAndre Hunter",22,76);
		Stadium State_Farm_Arena = new Stadium ("Stade Farm Arena",18047,0,0,0);
		Rank AtlantaRank = new Rank (0,0,0);
		
		// Boston Celtics 
		
		Player Kemba_Walker = new Player ("Kemba Walker",29,87);
		Player Jayson_Tatum = new Player ("Jayson Tatum",21,86);
		Player Jaylen_Brown = new Player ("Jaylen Brown",23,85);
		Player Gordon_Hayward = new Player ("Gordon Hayward",29,82);
		Player Marcus_Smart = new Player ("Marcus Smart",25,80);
		Stadium TD_Garden = new Stadium ("TD Garden",18624,0,0,0);
		Rank BostonRank = new Rank (0,0,0);
		
		// Brooklyn Nets
		
		Player Kevin_Durant = new Player ("Kevin Durant",31,96);
		Player Kyrie_Irving = new Player ("Anthony Davis",26,91);
		Player Spencer_Dinwiddie = new Player ("Spencer Dinwiddie",26,82);
		Player Jarrett_Allen = new Player ("Jarrett Allen",21,81);
		Player DeAndre_Jordan = new Player ("DeAndre Jordan",31,81);
		Stadium Barclays_Center = new Stadium ("Barclays Center",18103,0,0,0);
		Rank BrooklynRank = new Rank (0,0,0);
		
		// Charlotte Hornets

		Player Devonte_Graham = new Player ("Devonte Graham",24,80);
		Player Terry_Rozier = new Player ("Terry Rozier",25,80);
		Player Cody_Zeller = new Player ("Cody Zeller",27,79);
		Player Bismack_Biyombo = new Player ("Bismack Biyombo",27,78);
		Player Miles_Bridges = new Player ("Miles Bridges",21,78);
		Stadium Spectrum_Center = new Stadium ("Spectrum Center",19026,0,0,0);
		Rank CharlotteRank = new Rank (0,0,0);
		
		// Chicago Bulls
		
		Player Zach_LaVine = new Player ("Zach LaVine",24,86);
		Player Wendell_CarterJR = new Player ("Wendell Carter JR",20,81);
		Player Lauri_Markkanen = new Player ("Lauri Markkanen",22,80);
		Player Otto_PorterJR = new Player ("Otto Porter JR",26,78);
		Player Tomas_Satoransky = new Player ("Tomas Satoransky",28,78);
		Stadium United_Center = new Stadium ("United Center",21711,0,0,0);
		Rank ChicagoRank = new Rank (0,0,0);

		// Los Angeles Lakers
		
		Player LeBron_James = new Player ("LeBron James",35,97);
		Player Anthony_Davis = new Player ("Anthony Davis",26,96);
		Player DeMarcus_Cousins = new Player ("DeMarcus Cousins",29,81);
		Player Dwight_Howard = new Player ("Dwight Howard",34,81);
		Player JaVale_McGee = new Player ("JaVale McGee",32,80);
		Stadium Staples_Center = new Stadium ("Staples Center",19060,0,0,0);
		Rank LakersRank = new Rank (0,0,0);
		
		
		// Construct NBA teams
		
		BasketTeam Atlanta_Hawks = new BasketTeam ("Atlanta Hawks","Atlanta",State_Farm_Arena,AtlantaRank,0);
		BasketTeam Boston_Celtics = new BasketTeam ("Boston Celtics","Boston",TD_Garden,BostonRank,0);
		BasketTeam Brooklyn_Nets = new BasketTeam ("Brooklyn Nets","Brooklyn",Barclays_Center,BrooklynRank,0);
		BasketTeam Charlotte_Hornets = new BasketTeam ("Charlotte Hornets","Charlotte",Spectrum_Center,CharlotteRank,0);
		BasketTeam Chicago_Bulls = new BasketTeam ("Chicago Bulls","Chicago",United_Center,ChicagoRank,0);
		BasketTeam Los_Angeles_Lakers = new BasketTeam ("Los Angeles Lakers","Los Angeles",Staples_Center,LakersRank,0);

		// Add players 
		
		Atlanta_Hawks.add(Trae_Young);
		Atlanta_Hawks.add(Clint_Capela);
		Atlanta_Hawks.add(John_Collins);
		Atlanta_Hawks.add(Jeff_Teague);
		Atlanta_Hawks.add(DeAndre_Hunter);
		
		Boston_Celtics.add(Kemba_Walker);
		Boston_Celtics.add(Jaylen_Brown);
		Boston_Celtics.add(Jayson_Tatum);
		Boston_Celtics.add(Gordon_Hayward);
		Boston_Celtics.add(Marcus_Smart);
		
		Brooklyn_Nets.add(Kevin_Durant);
		Brooklyn_Nets.add(Kyrie_Irving);
		Brooklyn_Nets.add(Spencer_Dinwiddie);
		Brooklyn_Nets.add(Jarrett_Allen);
		Brooklyn_Nets.add(DeAndre_Jordan);
		
		Charlotte_Hornets.add(Devonte_Graham);
		Charlotte_Hornets.add(Terry_Rozier);
		Charlotte_Hornets.add(Cody_Zeller);
		Charlotte_Hornets.add(Bismack_Biyombo);
		Charlotte_Hornets.add(Miles_Bridges);
		
		Chicago_Bulls.add(Zach_LaVine);
		Chicago_Bulls.add(Wendell_CarterJR);
		Chicago_Bulls.add(Lauri_Markkanen);
		Chicago_Bulls.add(Otto_PorterJR);
		Chicago_Bulls.add(Tomas_Satoransky);
		
		Los_Angeles_Lakers.add(LeBron_James);
		Los_Angeles_Lakers.add(Anthony_Davis);
		Los_Angeles_Lakers.add(DeMarcus_Cousins);
		Los_Angeles_Lakers.add(Dwight_Howard);
		Los_Angeles_Lakers.add(JaVale_McGee);
		
		Atlanta_Hawks.calculateStat();
		Boston_Celtics.calculateStat();
		Brooklyn_Nets.calculateStat();
		Charlotte_Hornets.calculateStat();
		Chicago_Bulls.calculateStat();
		Los_Angeles_Lakers.calculateStat();
		
		HashMap<String,BasketTeam> teams = new HashMap<String,BasketTeam>();
		
		teams.put(Atlanta_Hawks.getTeamName(), Atlanta_Hawks);
		teams.put(Boston_Celtics.getTeamName(), Boston_Celtics);
		teams.put(Brooklyn_Nets.getTeamName(), Brooklyn_Nets);
		teams.put(Charlotte_Hornets.getTeamName(), Charlotte_Hornets);
		teams.put(Chicago_Bulls.getTeamName(), Chicago_Bulls);
		teams.put(Los_Angeles_Lakers.getTeamName(), Los_Angeles_Lakers);
		
		// Ranking
		
		BasketTeam[] ranking = new BasketTeam[6]; 
		
		ranking[0] = Atlanta_Hawks ;
		ranking[1] = Boston_Celtics;
		ranking[2] = Brooklyn_Nets;
		ranking[3] = Charlotte_Hornets;
		ranking[4] = Chicago_Bulls;
		ranking[5] = Los_Angeles_Lakers;
		
		for (int i = 0; i<6; i++) {
			System.out.println(ranking[i].toString());
		}
		
		//Create Calendar
		
		Calendar[] year_2020 = new Calendar[365];
		int counter = 0;
		
		for (int i=1; i<=12; i++) {
			if (i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
				for (int j=1; j<=31; j++) {
					year_2020[counter]= new Calendar(j,i,2020);
					counter++;
				}
			}
			else if (i==2) {
				for (int j=1; j<=28; j++) {
					year_2020[counter]= new Calendar(j,i,2020);
					counter++;
				}
			}
			else {
				for (int j=1; j<=30; j++) {
					year_2020[counter]= new Calendar(j,i,2020);
					counter++;
					}
				}
			}

		for (int i = 0; i<365; i++) {
			System.out.println(year_2020[i].toString());
		}
	}
}
