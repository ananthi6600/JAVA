import java.util.Scanner;

public class StringRotate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		String s1=sc.next();
		String s2="";
		int temp=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++){
				s2=s2+s.charAt(j);
			}
			for(int k=0;k<=i;k++) {
				s2=s2+s.charAt(k);
			}
			if(s2.equals(s1)) {
				System.out.println("YES");
				temp=1;
				break;
			}
			s2="";
		}
		if(temp==0)
			System.out.println("NO");
		sc.close();
	}
	

}
