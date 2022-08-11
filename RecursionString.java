import java.util.Scanner;

public class RecursionString {
	static int p = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		RecursionString rs = new RecursionString();
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		String ans = rs.recurString(s1);
		System.out.println(ans);

		sc.close();
	}

	// one two three
	private String recurString(String s) {
		String s2="";
		String s3="";
		for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)==' ') {
				for(int k=i-1;k>=0;k--){
					s3=s3+s.charAt(k);
				}
			}
		}
		return null;
		
}
}