
public class Goalkeeper extends SoccerPlayer{
	
	public Goalkeeper(){
		
	}
	
	public Goalkeeper(String name ,int age){
		super(name,age);
	}
	
	public String toString(){
		String s;
			s = "Name : "+this.name+", Age : "+this.age;
			s += "Can use hands";
		return s;
	}
}
