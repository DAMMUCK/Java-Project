package practice.kunsan.ac;

public class Sum {
	public static void main(String[] args) {
		System.out.println("1ºÎÅÍ 100±îÁö ÇÕ»ê");
		Sum sum = new Sum();
		System.out.println(sum.sumNum());
	}
	public int sumNum() {
		int num=0;
		for(int i=1;i<101;i++) {
			num+=i;
		}
		return num;
	}
}
