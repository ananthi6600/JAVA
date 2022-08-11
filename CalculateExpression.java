import java.util.Scanner;
//"3+2*2"
public class CalculateExpression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		int q=0,p,chindex=0,w=0;
		int []a=new int[10];
		char []ch=new char[10];
		char []arr= {'*','/','%','+','-'};
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)>47&&str.charAt(i)<58) {
				
				if(str.charAt(i+1)>47&&str.charAt(i+1)<58) {
					p=((str.charAt(i)-48)*10)+(str.charAt(i+1)-48);
				i++;	
				}
				else {
				
						p=str.charAt(i)-48;
						
				}
				a[q]=p;
				q++;
				
			}
			else {
				ch[chindex]=str.charAt(i);
				chindex++;
			}
			
		}
		if(str.charAt(str.length()-1)>47&&str.charAt(str.length()-1)<58){
			p=str.charAt(str.length()-1)-48;
			a[q]=p;
			q++;
			
			
		}

		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}

		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		int j=0;
		for(int i=0;i<5;i++) {
			for( j=0;j<4;j++) {
			
				if(arr[i]==ch[j]) {
					switch(arr[i]) {
						case '*':
							w=a[j]*a[j+1];
							break;
						case '+':
							 w=a[j]+a[j+1];
							break;
						case '-':
							w=a[j]-a[j+1];
							break;
						case '%':
							w=a[j]%a[j+1];
							break;
						case '/':
							w=a[j]/a[j+1];
							break;
					}
					a[j+1]=w;
					a[j]=w;
					System.out.println(w);
				}
			}
		}
		for(int k=0;k<q;k++)
			a[k]=w;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println(a[0]);
		sc.close();
		
	}

}
