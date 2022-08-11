import java.io.InputStream;
import java.util.Scanner;

public class SecondLargestFrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Array Size");
		int size=sc.nextInt();
		String str[]=new String[size];
		String s1="",s2="";
		int firstMax=0,secondMax=0;
		System.out.println("Enter String Array Elements");
		for(int i=0;i<size;i++) {
			str[i]=sc.next();
		}
		for(int i=0;i<size;i++) {
			int count=0;
			if(i<2) {
				for(int j=0;j<size;j++) {
					if(str[i]==str[j]) {
						count++;
					}
				}
				if(i==0) {
					firstMax=count;
					s1=str[i];
				}
				else{
					secondMax=count;
					s2=str[i];
				}
			}
			else {
				for(int j=0;j<size;j++) {
					if(str[i]==str[j]) {
						count++;
					}
				}
				if(count>firstMax)
				{
					firstMax=count;
					s1=str[i];
				}
				else if(count<firstMax&&count>secondMax) {
					secondMax=count;
					s2=str[i];
				}
			}
		}
		System.out.println(secondMax+" "+s2);
	}

	

}
