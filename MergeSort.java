import java.util.*;
public class MergeSort {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		mergeSort(a,0,n-1);
		sc.close();
	}

	private static void mergeSort(int[] a, int lb, int ub) {
		if(lb<ub) {
			int midPoint=(lb+ub)/2;
			mergeSort(a,lb,midPoint);
			mergeSort(a,midPoint+1,ub);
			merge(a,lb,midPoint,ub);
		}
		
	}

	private static void merge(int[] a, int lb, int midPoint, int ub) {
		int i=lb;
		int j=midPoint+1;
		int k=lb;
		int []b=new int [ub+1];
		while(i<=midPoint&&j<=ub) {
			if(a[i]<=a[j]) {
				b[k]=a[i];
				i++;
			}
			else {
				b[k]=a[j];
				j++;
			}
		}
		if(i>midPoint) {
			while(j<=ub) {
				b[k]=a[j];
				j++;
				k++;
			}
		}
		else {
			while(i<=midPoint) {
				b[k]=a[i];
				i++;
				k++;
			}
		}
		
	}
	

	

}
