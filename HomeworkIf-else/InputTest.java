import java.util.Scanner;

public class InputTest {
	//Exercise 17
	public static void main(String[] args){
		int number1 ,number2 ,number3 ,number4;
		int sum = 0;
		Scanner sb = new Scanner(System.in);
		
		System.out.print("Enter number #1 :");
		number1 = sb.nextInt();
		sum += number1;
		if(number1 < 10){
			System.out.println("Number Less than it should be");
			System.out.print("Enter number again : ");
			number2 = sb.nextInt();
			sum += number2;
		}
		
		System.out.print("Enter number #2 :");
		number3 = sb.nextInt();
		sum += number3;
		if(number3 != 10){
			System.out.println("Number not equal to 10");
			System.out.print("Enter number again : ");
			number4 = sb.nextInt();
			sum += number4;
		}
		
		System.out.println("Sum :"+sum);
	}
}
