import java.util.Scanner;

public class Hwfive {

	public static void main(String[] args) {
		char number;
		Scanner sb = new Scanner(System.in);
		
		System.out.print("Code");
		System.out.println("\tStudent Status");
		
		number = sb.next().charAt(0);
		
		switch (number){
			case '1' :
				System.out.print("\tFreshman");
				break;
			case '2' :
				System.out.print("\tSophomore");
				break;
			case '3' :
				System.out.print("\tJunior");
				break;
			case '4' :
				System.out.print("\tSenior");
				break;
			case '5' :
				System.out.print("\tMasters Program");
				break;
			case '6' :
				System.out.print("\tDoctoral Program");
				break;
			default :
				System.out.print("\tAn incorrect code was entered");
				break;
		}
	}

}
