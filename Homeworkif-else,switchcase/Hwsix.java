import java.util.Scanner;

public class Hwsix {

	public static void main(String[] args) {
		int bank1 = 0;
		int bank2 = 0;
		int bank3 = 0;
		int som;
		//bank1 mean Banknote value 1000 bath
		//bank2 mean Banknote value 500 bath
		//bank3 mean Banknote value 100 bath
		//som mean sum of money
		Scanner sb = new Scanner(System.in);
		
		System.out.print("Enter amount of money : ");
		som = sb.nextInt();
		if(som >= 0 && som < 100){
			System.out.println("Please enter amount of money behind 100");
			System.out.println("e.g. 100 bath ,500 bath ,1000 bath");
		}
		else if(som > 20000){
			System.out.println("You can’t withdraw money more than 20000 Bahts");
		}
		else {
			while(som >= 1000){
				bank1 += 1;
				som = som - 1000;
			}
			while(som >= 500){
				bank2 += 1;
				som = som - 500;
			}
			while(som >=100){
				bank3 += 1;
				som = som - 100;
			}
		}
		
		System.out.println("\n1000 Baths = "+bank1);
		System.out.println("\n500 Baths = "+bank2);
		System.out.println("\n100 Baths = "+bank3);
		

	}

}
