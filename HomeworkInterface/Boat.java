
public class Boat implements ISteerable{
	public String position;
	
	public Boat (String position){
		this.position = position;
	}
	
	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public void turnLeft(int numofturn) {
		if (this.position == "South"){
			numofturn += 0;
		}
		else if (this.position == "West"){
			numofturn += 1;
		}
		else if (this.position == "North"){
			numofturn += 3;
		}
		else if (this.position == "East"){
			numofturn += 3;
		}
		
		while(numofturn != 0){
			if(numofturn >= 4){
				this.position = "West";
				numofturn -= 4;
			}
			else if(numofturn == 3){
				this.position = "North";
				numofturn -= 3;
			}
			else if(numofturn == 2){
				this.position = "East";
				numofturn -= 2;
			}
			else if(numofturn == 1){
				this.position = "South";
				numofturn -= 1;
			}
		}
		
	}

	public void turnRight(int numofturn) {
		
		if (this.position == "South"){
			numofturn += 0;
		}
		else if (this.position == "East"){
			numofturn += 1;
		}
		else if (this.position == "North"){
			numofturn += 2;
		}
		else if (this.position == "West"){
			numofturn += 3;
		}
		
		while(numofturn != 0){
			if(numofturn >= 4){
				this.position = "South";
				numofturn -= 4;
			}
			else if(numofturn == 3){
				this.position = "West";
				numofturn -= 3;
			}
			else if(numofturn == 2){
				this.position = "North";
				numofturn -= 2;
			}
			else if(numofturn == 1){
				this.position = "East";
				numofturn -= 1;
			}
		}
		
	}
	
	public String toString(){
		String s;
		s = "Boat Current Position "+this.position;
		return s;
	}

}
