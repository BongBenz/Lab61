
public class Forward  extends SoccerPlayer{
	
	public Forward(){
		
	}
	
	public Forward(String name ,int age){
		super(name,age);
	}
	
	public String toString(){
		String s;
			s = "Name : "+this.name+", Age : "+this.age;
		return s;
	}
}
