package practice.kunsan.ac;

import java.util.Scanner;

public class sumArray {
	final int num=3;
	Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
		sumArray calc = new sumArray();
		calc.run();
	}
	public void run() {
		int[] arr1 = new int [num];
		int[] arr2 = new int [num];
		int sum=0;
		System.out.print("A: ");
		for(int i=0;i<num;i++) {
			arr1[i]=scan.nextInt();
			sum+=arr1[i];
		}
		System.out.println("Sum<A> = "+sum);
		System.out.print("B: ");
		sum=0;
		for(int i=0;i<num;i++) {
			arr2[i]=scan.nextInt();
			sum+=arr2[i];
		}
		System.out.println("Sum<B> = "+sum);
	
		
	}
}
