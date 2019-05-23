import java.util.Scanner;

public class multipliesDemo {
	//Exercise_Method + Array 1
	public static void main(String[] args) {
		int number;
		int[] muArray = new int[12];
		Scanner sb = new Scanner(System.in);
		
		System.out.print("Enter number required to multiplies : ");
		number = sb.nextInt();
		
		Multiplies(muArray ,number);
	}
	
	public static void Multiplies(int[] muArray ,int number){
		for(int i = 0; i < muArray.length;i++){
			if(i == 0){
				muArray[i] = number;
			}
			else
				muArray[i] = muArray[i-1] + number;
		}
		
		for(int i = 0; i < muArray.length;i++){
			System.out.print(muArray[i]+" ");
		}
	}

}
