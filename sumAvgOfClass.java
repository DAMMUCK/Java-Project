package practice.kunsan.ac;

public class sumAvgOfClass {
	public static void main(String[] args) {
		sumAvgOfClass operation = new sumAvgOfClass();
		operation.run();
	}
	public void run() {
		int[][] student ={
				{90,80,80},{85,85,95},{95,70,75},{80,80,90},{90,75,80},
		};
		int sum=0;
		double avg=0.0;
		
		for(int i=0;i<5;i++) {
			System.out.print("ID="+i);
			for(int j=0;j<3;j++) {
				sum+=student[i][j];
			}
			avg=sum/(double)3;
			System.out.println(" ÇÕ°è : "+sum+", Æò±Õ : "+Math.round(avg*100)*0.01);
			sum=0;
			avg=0.0;
		}
	}
}
