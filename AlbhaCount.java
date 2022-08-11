import java.util.Scanner;

public class AlbhaCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.next();
		int count=1;
		for(int i=0;i<s.length()-1;i++) {


			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
			}
			else if(s.charAt(i)!=s.charAt(i+1)||s.charAt(s.length()-2)==s.charAt(s.length()-1)){
				System.out.print(s.charAt(i));
				System.out.print(count);
				count=1;
			}
		}
		if(s.charAt(s.length()-2)!=s.charAt(s.length()-1)) {
			System.out.print(s.charAt(s.length()-1)+"1");
		}
		sc.close();

	}

}
