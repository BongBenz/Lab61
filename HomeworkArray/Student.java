
public class Student {
	//Exercise 11
	public static void main(String[] args) {
		int[][] test = {
				{83,71,56,41,68},
				{56,43,91,75,66},
				{33,54,87,63,84},
				{58,61,48,38,48}
		};
		
		for(int i = 0;i < test.length;i++){
			for(int j = 0;j < 5;j++){
				System.out.print(" "+test[i][j]);
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		for(int i = 0;i < test.length;i++){
			double avg = 0.0;
			for(int j = 0;j < 5;j++){
				avg += test[i][j];
			}
			avg = avg / 5;
			System.out.println("Avarage Exam#"+(i+1)+" : "+avg);
		}
		
		System.out.print("\n");
		double[] avg2 = new double[5];
		avg2 = averageStudent(test);
		
		for(int i = 0; i < avg2.length;i++){
			System.out.println("Score Average Student #"+(i+1)+" : "+avg2[i]);
		}
		
		System.out.print("\n");
		double[] finalscore = new double[5];
		finalscore = createfinalscore(test);
		for(int i = 0; i < avg2.length;i++){
			System.out.println("Final Average Student#"+(i+1)+" : "+(finalscore[i]/3));
			if((finalscore[i]/3) < 60){
				System.out.println("Student#"+(i+1)+" : Fail");
			}
		}
		
	}
	
	public static double[] averageStudent(int[][] test){
		double[] avg2 = new double[5];
		
		avg2[0] = avg2[0] + test[0][0];
		avg2[0] = avg2[0] + test[1][0];
		avg2[0] = avg2[0] + test[2][0];
		avg2[0] = avg2[0] + test[3][0];
		avg2[0] = avg2[0] / 4;
		
		avg2[1] = avg2[1] + test[0][1];
		avg2[1] = avg2[1] + test[1][1];
		avg2[1] = avg2[1] + test[2][1];
		avg2[1] = avg2[1] + test[3][1];
		avg2[1] = avg2[1] / 4;
		
		avg2[2] = avg2[2] + test[0][2];
		avg2[2] = avg2[2] + test[1][2];
		avg2[2] = avg2[2] + test[2][2];
		avg2[2] = avg2[2] + test[3][2];
		avg2[2] = avg2[2] / 4;
		
		avg2[3] = avg2[3] + test[0][3];
		avg2[3] = avg2[3] + test[1][3];
		avg2[3] = avg2[3] + test[2][3];
		avg2[3] = avg2[3] + test[3][3];
		avg2[3] = avg2[3] / 4;
		
		avg2[4] = avg2[4] + test[0][4];
		avg2[4] = avg2[4] + test[1][4];
		avg2[4] = avg2[4] + test[2][4];
		avg2[4] = avg2[4] + test[3][4];
		avg2[4] = avg2[4] / 4;
		return avg2;
	}
	
	public static double[] createfinalscore(int[][] test){
		double[] finalscore = new double[5];
		
		finalscore[0] = finalscore[0] + test[0][0];
		finalscore[0] = finalscore[0] + test[1][0];
		finalscore[0] = finalscore[0] + test[3][0];
		
		finalscore[1] = finalscore[1] + test[0][1];
		finalscore[1] = finalscore[1] + test[2][1];
		finalscore[1] = finalscore[1] + test[3][1];
		
		finalscore[2] = finalscore[2] + test[0][2];
		finalscore[2] = finalscore[2] + test[1][2];
		finalscore[2] = finalscore[2] + test[2][2];
				
		finalscore[3] = finalscore[3] + test[0][3];
		finalscore[3] = finalscore[3] + test[1][3];
		finalscore[3] = finalscore[3] + test[2][3];
		
		finalscore[4] = finalscore[4] + test[0][4];
		finalscore[4] = finalscore[4] + test[1][4];
		finalscore[4] = finalscore[4] + test[2][4];
		return finalscore;
	}

}
