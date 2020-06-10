package practice.kunsan.ac;

public class Caesar {
	public static void main(String[] args) {
		Caesar cs = new Caesar();
		cs.run();
	}
	public void run() {
		System.out.println("원문 : Hello World");
		String hello="Hello World";
		String answer = "";
		int len = hello.length();
		char alpha; char start;
		for(int i=0;i<len;i++) {
			alpha = hello.charAt(i);
			if(alpha !=' ') {
				start = Character.isLowerCase(alpha)? 'a':'A';
				alpha = (char)((alpha+3%26-start)%26+start);
			}
			answer +=alpha;
		}
		System.out.println("암호 :"+answer);
	}
}
