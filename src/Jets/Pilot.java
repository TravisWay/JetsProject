package Jets;

//Pilot class for creating pilot objects

public class Pilot {
	
	private String Name;	
	
	public Pilot(String Name) {
		super();
		setName(Name);
	
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}	
	
}
