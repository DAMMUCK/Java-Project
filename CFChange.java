package practice.kunsan.ac;

import java.util.Scanner;

public class CFChange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CFChange change = new CFChange();
		System.out.print("¼·¾¾ : ");
		double temp=scan.nextDouble();
		change.changeTemp(temp);
	}
	public void changeTemp(double temp) {
		double num=0;
		System.out.print("È­¾¾ : ");
		num=(temp*9/5)+32;
		System.out.println(num);
	}
}
