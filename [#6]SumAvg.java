package practice.kunsan.ac;

public class SumAvg {
	public static void main(String[] args) {
		SumAvg sum = new SumAvg();
		sum.run();
	}
	public void run() {
		int[] score= {90,75,85,95,70,75,85,85,95,72};
		int sum=0;
		double avg=0.0;
		System.out.print("점수 : ");
		for(int i:score) {
			System.out.print(i+" ");
			sum+=i;
		}
		avg=sum/(double)10;
		System.out.println();
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
	}
}
