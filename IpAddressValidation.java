import java.util.Scanner;

public class IpAddressValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String array[]=new String[4];
		for(int i=0;i<array.length;i++) {
			array[i]="";
		}
		System.out.println("Enter a IP address");
		String ip=sc.next();
		String s="";
		int dotCount=0,arrayIndex=0,finalValue=0;
		for(int i=0;i<ip.length()-1;i++) {
			if(ip.charAt(i)=='.') {
				if(ip.charAt(i+1)=='.') {
					dotCount=-1;
					
					break;
				}
				dotCount++;
				
			}
		}
		if(dotCount>3||dotCount==-1) {
			System.out.println("Invalid IP address");
		}
		else {
			for(int i=0;i<ip.length();i++) {
				if(ip.charAt(i)!='.') {
					array[arrayIndex]+=ip.charAt(i);
					
				}
				else {
					arrayIndex=arrayIndex+1;
					continue;
				}
				
			}
			int ans[]=new int[4];
			
			for (int i = 0; i < array.length; i++) {
				int mul=1,find=0;
				for(int k=array[i].length()-1;k>=0;k--) {
					find=find+(array[i].charAt(k)-'0')*mul;
					mul*=10;
				}
				ans[i]=find;
				
			}
			
			for(int i=0;i<ans.length;i++) {
				if(ans[i]>255) {
					finalValue=1;
				}
			}
		}
		
		System.out.println((finalValue==0)?"Valid IP Address":"Invalid IP Address");
		
	}

}
