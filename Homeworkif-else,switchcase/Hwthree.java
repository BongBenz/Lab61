import java.util.Scanner;

public class Hwthree {

	public static void main(String[] args) {
		int f_number , l_number;
		int sum = 0;
		char operator;
		//f_number Meaning first Number
		//l_number Meaning last Number
		Scanner sb = new Scanner(System.in);
		
		System.out.print("Enter your number1 : ");
		f_number = sb.nextInt();
		System.out.print("Enter your number2 : ");
		l_number = sb.nextInt();
		
		System.out.println("1 : Add (+)");
		System.out.println("2 : Subtract (-)");
		System.out.println("3 : Multiply (*)");
		
		System.out.print("Enter operation : ");
		operator = sb.next().charAt(0);
		
		switch (operator){
			case '1' :
				sum = f_number + l_number;
				System.out.println("Add = "+sum);
				break;
			case '2' :
				sum = f_number - l_number;
				System.out.println("Subtract = "+sum);
				break;
			default :
				sum = f_number * l_number;
				System.out.println("Multiply = "+sum);
				break;
		}
		
	}

}
