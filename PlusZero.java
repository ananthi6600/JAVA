import java.util.Scanner;

public class PlusZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int [] a=new int[size];
		System.out.print("Enter array Elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size-2;i++) {
			for(int j=i;j<size-2;j++) {
				if(i!=j) {
					int p=a[i]+a[j]+a[j+1];
						if(p==0) {
							System.out.println("["+a[i]+" "+a[j]+" "+a[j+1]+"]");
						}
				}

			}

		}
		sc.close();
	}
}