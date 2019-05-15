import java.util.Scanner;

public class Hwseven {

	public static void main(String[] args) {
		char grade;
		char grades;
		//grade mean grade with input
		Scanner sb = new Scanner(System.in);
		
		System.out.print("Please Enter Grade: ");
		grade = sb.next().charAt(0);
		
		switch (grade){
			case 'a' :
			case 'A' :
				System.out.println("Grade value: 4");
				break;
			case 'b' :
			case 'B' :
				System.out.println("Grade value: 3");
				break;
			case 'c' :
			case 'C' :
				System.out.println("Grade value: 2");
				break;
			case 'd' :
			case 'D' :
				System.out.println("Grade value: 1");
				break;
			case 'f' :
			case 'F' :
				System.out.println("Grade value: 0");
				break;
			default  :
				System.out.println("Invalid value");
				break;
		}
		
	}

}
