import java.util.Scanner;

public class PatternChennai {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new PatternChennai().print();
	}

	private void print() {
		System.out.println("Enter value of N");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int count=i,size=n-1;
			for(int j=1;j<=i;j++) {
				System.out.print(count);
				count=count+size--;
				
			}
			System.out.println();
		}
	}
}
