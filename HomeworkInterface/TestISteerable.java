
public class TestISteerable {
	//Exercise 1
	public static void main(String[] args) {
		Boat boat = new Boat("South");
		Truck truck = new Truck("North");
		
		System.out.println(boat.toString());
		boat.turnRight(10);
		System.out.println("After turn right 10 times, now Position is "+boat.getPosition());
		
		System.out.println(truck.toString());
		truck.turnLeft(5);
		System.out.println("After turn left 5 times, now Position is "+truck.getPosition());
	}

}
