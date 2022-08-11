import java.util.Scanner;
/*
 *    22 1 34 22 16
 *    1 34 16 1  1
 * 
 *     
 *    3 5 3 5 5 11 5 
 *    3 3 11 1 1 1 1
 * 
 * 
 * 
 */
public class ArrayLeft_Shift {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter remove value :");
		int Remove_element=sc.nextInt();
		
		
		
		if(array[size-1]==Remove_element) {
			array[size-1]=1;
		}
		for(int i=size-2;i>=0;i--) {
			if(array[i]==Remove_element) {
				for(int j=i;j<size-1;j++) {		
					array[j]=array[j+1]; 
				}
			}
				array[size-1]=1;  
		}
	
		
		
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+" ");
		}
			sc.close();
	}
}
