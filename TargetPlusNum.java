import java.util.Scanner;

public class TargetPlusNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int [] a=new int[size];
		int ot=0;
		System.out.print("Enter array Elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the target number");
		int target=sc.nextInt();
		for(int i=0;i<size-2;i++) {
			for(int j=i+1;j<size-1;j++) {
			
					int ta=a[i]+a[j];
					if(ta==target) {
						System.out.println("["+a[i]+","+a[j]+"]");
						ot=1;
						break;
					}			
			}
			if(ot==1) {
				break;
			}

		}
	}
}
