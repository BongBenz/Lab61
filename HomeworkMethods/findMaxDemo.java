import java.util.Scanner;

public class findMaxDemo {
	//Exercise_Method + Array 3
	public static void main(String[] args) {
		int number;
		int max = 0;
		Scanner sb = new Scanner(System.in);
		
		System.out.print("Enter Data set width : ");
		number = sb.nextInt();
		int[] fmArray = new int[number];
		
		for(int i = 0;i < fmArray.length;i++){
			System.out.print("Enter age #"+(i+1)+" : ");
			fmArray[i] = sb.nextInt();
		}
		
		max = findMax(fmArray,number);
		System.out.print("Max : "+max);
	}
	
	public static int findMax(int[] fmArray ,int number){
		int max = 0;
		for(int i = 0;i < number;i++){
			if(fmArray[i] > max){
				max = fmArray[i];
			}
		}
		
		return max;
	}

}
