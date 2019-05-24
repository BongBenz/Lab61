
public class Defense extends SoccerPlayer{
	
	public Defense(){
		
	}
	
	public Defense(String name ,int age){
		super(name,age);
	}
	
	public String toString(){
		String s;
			s = "Name : "+this.name+", Age : "+this.age;
		return s;
	}
}
