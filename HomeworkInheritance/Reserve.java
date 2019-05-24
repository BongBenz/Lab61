
public class Reserve extends SoccerPlayer{
	
	public Reserve(){
		
	}
	
	public Reserve(String name ,int age){
		super(name,age);
	}
	
	public String toString(){
		String s;
			s = "Name : "+this.name+", Age : "+this.age;
			s += "Not playing";
		return s;
	}
}
