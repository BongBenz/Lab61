import java.util.Scanner;

public class Hwfour {

	public static void main(String[] args) {
		char number;
		Scanner sb = new Scanner(System.in);
		
		System.out.print("Code");
		System.out.println("\tDisk Drive Manufacturer");
		
		number = sb.next().charAt(0);
		
		switch (number){
			case '1' :
				System.out.print("\t3M Corporation");
				break;
			case '2' :
				System.out.print("\tMaxell Corporation");
				break;
			case '3' :
				System.out.print("\tSony Corporation");
				break;
			case '4' :
				System.out.print("\tVerbatim Corporation");
				break;
			default :
				System.out.print("\tAn incorrect code was entered");
				break;
		}
	}

}
