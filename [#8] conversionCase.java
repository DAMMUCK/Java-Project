package practice.kunsan.ac;

public class conversionCase {
	public static void main(String[] args) {
		conversionCase conversion = new conversionCase();
		conversion.run();
	}	
	public void run() {
		String name="Hello World! SOSUA";
		char[] temp = name.toCharArray();
		
		for(int i=0;i<temp.length;i++) {
			if(temp[i] >= 'a' && temp[i]<='z') {
				temp[i] = (char)(temp[i]-32);
			}
			else if(temp[i]>='A' && temp[i]<='Z') {
				temp[i] = (char)(temp[i]+32);
			}
		}
		System.out.print(temp);
	}
}
