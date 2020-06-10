package practice.kunsan.ac;

import java.util.Scanner;

public class calcScore {
	Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		calcScore score = new calcScore();
		score.calculation();
	}
	public void calculation() {
		int num=0;
		System.out.print("점수입력 : ");
		num=scan.nextInt();
		if(num>=90 && num<=100) {
			System.out.println("학점 : A");
		}else if(num>=80 && num<90)
		{
			System.out.println("학점 : B");
		}else if(num>=70 && num<80) {
			System.out.println("학점 : C");
		}
		else if(num>=60 && num<70) {
			System.out.println("학점 : D");
		}else if(num>=50 && num<60) {
			System.out.println("학점 : F");
		}else{
			System.out.println("잘못입력!!");
		}
		scan.close();
			
	}
}
