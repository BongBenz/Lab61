
public class Show1To25 {
	//Exercise 14
	public static void main(String[] args) {
		int i = 1;
		do{
			for(int j = 0; j < 5 ; j++){
				System.out.print(" "+i);
				i++;
			}
			System.out.print("\n");
		}while(i < 25);
	}

}
