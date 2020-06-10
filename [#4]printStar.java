package practice.kunsan.ac;

import java.util.Scanner;

public class printStar {
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		printStar star = new printStar();
		star.print();
	}
	public void print() {
		System.out.print("숫자입력 : ");
		int num = scan.nextInt();
		for(int i=1;i<num;i++) {
          for(int j=1;j<=i;j++) {
        	  System.out.print("*");
        	  
          }
          System.out.println();
		}
	}
}
