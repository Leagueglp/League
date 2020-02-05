package data.sportaspect;

public class Staff {
	
	private Manager manager;
	private Comissioner comissioner;
	
	public Staff(Manager manager, Comissioner comissioner) {
		super();
		this.manager = manager;
		this.comissioner = comissioner;
	}
	
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public Comissioner getComissioner() {
		return comissioner;
	}
	public void setComissioner(Comissioner comissioner) {
		this.comissioner = comissioner;
	}
	@Override
	public String toString() {
		return "Staff [manager=" + manager + ", comissioner=" + comissioner + "]";
	}	

}
