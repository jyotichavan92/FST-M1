package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object of car class is toyota
		Car toyota = new Car();
		
		toyota.make=2014;
		toyota.color="Black";
		toyota.transmission="Manual";
		
		toyota.displayCharacterstics();
		toyota.accelarate();
		toyota.brake();
	}

}
