package data.macroaspect;

import java.util.HashMap;

import data.microaspect.Franchise;

public class Playoff {
	private HashMap<String, Franchise> qualifiedteam = new HashMap<String, Franchise>();

	public Playoff(HashMap<String, Franchise> qualifiedteam) {
		super();
		this.qualifiedteam = qualifiedteam;
	}
	public Playoff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HashMap<String, Franchise> getQualifiedteam() {
		return qualifiedteam;
	}

	public void setQualifiedteam(HashMap<String, Franchise> qualifiedteam) {
		this.qualifiedteam = qualifiedteam;
	}

	@Override
	public String toString() {
		return "Playoff [qualifiedteam=" + qualifiedteam + "]";
	}
	
}
