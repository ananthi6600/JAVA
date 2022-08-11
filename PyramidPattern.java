import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=i+1;k<n;k++) {
				System.out.print(" ");
			}
			int inc=i+1;
			for(int j=i;j>=0;j--) {
				System.out.print(inc++);
			}
			int dec=i*2;
			for(int p=i;p>=1;p--) {
				System.out.print(dec--);
			}
			System.out.println();
		}

	}

}
