import java.util.Scanner;

public class ProductAllitself {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int [] a=new int[size];
		int [] b=new int[size];
		int sum;
		System.out.print("Enter array Elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			sum=1;
			for(int j=0;j<size;j++) {
				if(i!=j) {
					sum=sum*a[j];
				}
			}
			b[i]=sum;
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(b[i]+" ");
		}
		sc.close();
	}

}
