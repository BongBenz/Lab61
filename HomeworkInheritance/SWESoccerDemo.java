
public class SWESoccerDemo {
	//Exercise 1
	public static void main(String[] args) {
		SoccerPlayer obj[] = new SoccerPlayer[12];
		
		obj[0] = new Forward("Kittipong",20);
		obj[1] = new Forward("Kunad",21);
		obj[2] = new Forward("Saowarat",20);
		obj[3] = new Forward("Sirirat",20);
		
		obj[4] = new Forward("Suttipong",20);
		obj[5] = new Forward("Pongsakorn",21);
		obj[6] = new Forward("Chonlatan",21);
		obj[7] = new Forward("Burin",21);

		obj[8] = new Forward("Chatchawal",20);
		obj[9] = new Forward("Aakawit",22);
		
		obj[10] = new Forward("Gaidmanee",20);
		
		obj[11] = new Forward("Juthaporn",23);
		
		showAllPlayer(obj);
	}
	
	public static void showAllPlayer(SoccerPlayer obj[]){
		for(int i = 0; i < obj.length;i++){
			if(i == 0){
				System.out.println("Forward: ");
			}
			else if(i == 4){
				System.out.println("Midfield: ");
			}
			else if(i == 8){
				System.out.println("Defense: ");
			}
			else if(i == 10){
				System.out.println("Goalkeeper: ");
			}
			else if(i == 11){
				System.out.println("\n");
				System.out.println("-------------------------------------");
				System.out.println("Reserve: ");
			}
			System.out.println(i+". "+obj[i].toString());
		}
	}
}
