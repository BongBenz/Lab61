import java.util.Scanner;

public class Hwtwo {

	public static void main(String[] args) {
		String str;
		int price = 0;
		int piece;
		
		Scanner sb = new Scanner(System.in);
		
		System.out.print("Select size of pizza : ");
		str = sb.next();
		int n = str.length();
		
		for(int i = 0; i < n; i++){
			char result = str.charAt(i);
			
			switch (result){
				case 'x' :
				case 'X' :
					System.out.println("Price per piece : 150");
					price += 150;
					break ;
				case '-' : break;
				case 's' :
				case 'S' :
					System.out.println("Price per piece : 45");
					price += 45;
					break ;
				case 'm' :
				case 'M' :
					System.out.println("Price per piece : 80");
					price += 80;
					break;
				case 'l' :
				case 'L' :
					System.out.println("Price per piece : 130");
					price += 130;
					break;
				default :
					System.out.println("Invalid pizza size");
					break;
			}
		}
		
		System.out.print("Enter a piece : ");
		piece = sb.nextInt();
		
		System.out.println("Total price : "+(price*piece));

		
	}

}
