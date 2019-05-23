import java.util.Scanner;

public class checkSumOfNumber {
	//Exercise 13
	public static void main(String[] args) {
		int number1 ,number2 ,number3;
		int sum = 0;
		Scanner sb = new Scanner(System.in);
		
		System.out.print("Enter number #1 : ");
		number1 = sb.nextInt();
		System.out.print("Enter number #2 : ");
		number2 = sb.nextInt();
		System.out.print("Enter number #3 : ");
		number3 = sb.nextInt();
		sum = number1 + number2 + number3;
		
		if(sum <= 100){
			System.out.print("Sum <= 100");
		}
		else if(sum > 100){
			System.out.print("Sum > 100");
		}
	}

}
