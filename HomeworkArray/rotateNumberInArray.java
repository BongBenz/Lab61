import java.util.Scanner;

public class rotateNumberInArray {
	//Exercise 14
	public static void main(String[] args) {
		int[] number = {1,2,3,4,5};
		int temp ,temp2 ,temp3 ,temp4 ,temp5;
		int nor;
		//number of rotate
		Scanner sb = new Scanner(System.in);
		
		System.out.print("A[5] =");
		for(int i = 0;i < number.length;i++){
			System.out.print(" "+number[i]);
		}
		
		System.out.print("\n");
		System.out.print("Please enter number of rotation: ");
		nor = sb.nextInt();
		while(nor != 0){
			temp = number[0];
			temp2 = number[1];
			temp3 = number[2];
			temp4 = number[3];
			temp5 = number[4];
			
			number[4] = temp;
			number[3] = temp5;
			number[2] = temp4;
			number[1] = temp3;
			number[0] = temp2;
			nor --;
		}
		
		System.out.print("B[5] =");
		for(int i = 0;i < number.length;i++){
			System.out.print(" "+number[i]);
		}
	}

}
