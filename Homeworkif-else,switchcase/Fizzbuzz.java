import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		int number;
		Scanner sb = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		number = sb.nextInt();
		
		if(number % 3 == 0 && number % 5 ==0){
			System.out.print("FizzBuzz");
		}
		else if(number % 3 == 0){
			System.out.print("Fizz");
		}
		else if(number % 5 == 0){
			System.out.print("Buzz");
		}

	}

}
