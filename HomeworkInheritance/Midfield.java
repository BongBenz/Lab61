
public class Midfield extends SoccerPlayer {
	
	public Midfield(){
		
	}

	public Midfield(String name ,int age) {
		super(name,age);
	}
	
	public String toString(){
		String s;
			s = "Name : "+this.name+", Age : "+this.age;
		return s;
	}
	
}
