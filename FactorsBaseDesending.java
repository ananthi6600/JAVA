import java.util.Scanner;

public class FactorsBaseDesending {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new FactorsBaseDesending().print();
	}

	private void print() {
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter array elements");
		for(int index=0;index<size;index++) {
			array[index]=sc.nextInt();
		}
		int factor[]=Factor(array,size);
		decending(factor,size,array);
	}

	private void decending(int[] factor,int size, int[] array) {
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(factor[i]<factor[j]) {
					int swap=factor[i],swap1=array[i];
					factor[i]=factor[j];
					factor[j]=swap;
					array[i]=array[j];
					array[j]=swap1;
				}
			}
		}
		result(array,size);
		
	}

	private void result(int[] array, int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

	private int[] Factor(int[] array, int size) {
		int factor[]=new int[size];
		for(int index=0;index<size;index++) {
			int count=2;
			for(int i=2;i<=array[index]/2;i++) {
				if(array[index]%i==0)
				count++;
			}
			factor[index]=count;
		}
//		for (int i = 0; i <size; i++) {
//			System.out.println(factor[i]);
//		}
		return factor;
		
	}
}
