import java.util.Scanner;

public class DublicateZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Size");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter array Elements");
		for (int i = 0; i < size; i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<size-1;i++) {
			if(array[i]!=0) {
				for(int j=i+1;j<size;j++) {
					if(array[i]==array[j])
						array[j]=0;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
