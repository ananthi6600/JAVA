import java.lang.Thread;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Interview{
	
	public  void loop(Queue<Integer>totalMembers ,int capacity) {

		int m=0;
		for(Integer item:totalMembers) {
			if(m<capacity) {
				System.out.print(item+" | ");
			}
			else {
				break;
			}
			m++;
			
		}
		System.out.println();
	}
}
public class QueueInterviewHall {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int capacity=sc.nextInt();
		Queue<Integer> totalMembers =new LinkedList<Integer>(); 
		for(int i=1;i<=n;i++) {
			totalMembers.add(i);
		}
		
		
		Interview hall=new Interview();
		try {
			for(int i=0;i<n;i++) {
				hall.loop(totalMembers,capacity);
			totalMembers.poll();
			
				Thread.sleep(1000);
			}	
		} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		sc.close();
	}
	
	

	
}


