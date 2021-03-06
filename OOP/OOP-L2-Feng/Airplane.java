public class Airplane{
	private int gasLevel;
	private String landingGear;
	private String doorStatus;
	private int passengers;

	public Airplane(){
		gasLevel = 100;
		landingGear = "Down";
		doorStatus = "Open";
		passengers = 100;
	}

	public void openDoor(){
		doorStatus = "Open";
	}

	public void closeDoor(){
		doorStatus = "Closed";
	}

	public void fillUp(){
		gasLevel = 100;
	}

	public void takeOff(){
		gasLevel-=30;
	}

	public void doneTakeOff(){
		landingGear = "Up";
	}

	public void normalFlight(int percent){
		gasLevel-=(int)(percent/100*gasLevel);

	}

	public void prepLanding(){
		landingGear = "Down";
	}

	public void land(){
		gasLevel-=15;
	}

	public void loadPass(int pass){
		passengers+=pass;
	}

	public void unloadPass(int pass){
		passengers-=pass;
	}

	public int getGasLevel(){
		return gasLevel;
	}

	public String getDoorStatus(){
		return doorStatus;
	}

	public int getPassengers(){
		return passengers;
	}

	public String getLandingGear(){
		return landingGear;
	}

	public static void main(String[] args) {
		Airplane airbus = new Airplane();
		
	}
}