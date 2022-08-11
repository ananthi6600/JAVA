import java.util.Scanner;

public class EvenInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int [] a=new int[size];
		System.out.print("Enter array Elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(a[i]%2==0) {
				for(int j=i;i<a.length;) {
					a[i]=a[i+1];
					
				}
				size--;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
