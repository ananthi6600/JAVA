import java.util.Scanner;
public class AcsciiChange{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			String p="";
			char[] c=new char[s.length()];
			for(int i=0;i<s.length();i++) {
				c[i]=s.charAt(i);
			}
			for(int i=0;i<c.length-1;i++) {
				for(int j=i+1;j<c.length;j++) {
					if((c[i]==c[j] || c[i]+32==c[j] || c[i]-32==c[j]) && c[i]=='z') {
						c[j]='a';
						i=-1;
						break;
					}
					else if((c[i]==c[j] || c[i]+32==c[j] || c[i]-32==c[j]) && c[i]=='Z') {
						c[j]='A';
						i=-1;
						break;
					}
					else if((c[i]==c[j] || c[i]+32==c[j] || c[i]-32==c[j]) && c[i]=='9') {
						c[j]='0';
						i=-1;
						break;
					}
					else if((c[i]==c[j] || c[i]+32==c[j] || c[i]-32==c[j])) {
						c[j]=(char) (c[i]+1);
				}
			}

		}
			for(int i=0;i<c.length;i++) {
				p+=c[i];
			}
			System.out.println(p);
	}
	}

