import java.util.Scanner;

public class GreaterRepeatedChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=' ';
		int max=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='*') {
				int count=0;
			
				for(int j=0;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						s.replace(s.charAt(j), '*');
						count++;
					}
				}
				if(max<count) {
					max=count;
					c=s.charAt(i);
				}
				else if(max==count) {
					if(s.charAt(i)>c) {
						c=s.charAt(i);
					}
				}
			}
		}
		System.out.println("Count : "+max+" character : "+c);
		sc.close();
	}

}
