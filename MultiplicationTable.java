package practice.kunsan.ac;

public class MultiplicationTable {
	public static void main(String[] args) {
		MultiplicationTable multi = new MultiplicationTable();
		System.out.println("备备窜 3窜");
		multi.multi3();
		System.out.println("备备窜");
		multi.multiTotal();
	}
	public void multi3() {
		for(int i=1;i<10;i++) {
			System.out.println("3 * "+i+" = "+3*i);
		}
	}
	
	public void multiTotal() {
		for(int i=1;i<11;i++) {
			for(int j=1;j<=11;j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
	}
}
