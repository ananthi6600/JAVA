import java.util.Scanner;
/*
 *     22 1 34 22 16
 *     1  1  1 34 16
 *  
 *  
 *     3 5 3 5 5 11 5  
 *     1 1 1 1 3 3 11
 * 
 */
public class ArrayShift {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter size of array:");
//		int size=sc.nextInt();
//		int[] array=new int[size];
//		System.out.println("Enter array elements");
//		for(int i=0;i<size;i++) {
//			array[i]=sc.nextInt();
//		}
//		System.out.println("Enter remove value :");
//		int Remove_element=sc.nextInt();
//		
//		
//		
//		if(array[0]==Remove_element) {
//			array[0]=1;
//		}
//		for(int i=1;i<size;i++) {
//			
//			if(array[i]==Remove_element) {
//				for(int j=i;j>0;j--) {
//					array[j]=array[j-1];				
//				}
//			}
//				array[0]=1;                  
//		}
		
		
		
//		for(int i=0;i<size;i++) {
//			System.out.print(array[i]+" ");
//		}
//sc.close();
		
		
		class Candidate {
			private static int count = 1;
			private long id;
			private String name;
			private int result;
			private int marks;
			private String remarks;
			private String interviewerName;
			private boolean isInterviewed;

			public Candidate(String name, String interviewerName) {
				this.id = incrementCount();
				this.name = name;
				this.interviewerName = interviewerName;
			}

			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getResult() {
				return result;
			}

			public void setResult(int result) {
				this.result = result;
			}

			public int getMarks() {
				return marks;
			}

			public void setMarks(int marks) {
				this.marks = marks;
			}

			public String getRemarks() {
				return remarks;
			}

			public void setRemarks(String remarks) {
				this.remarks = remarks;
			}

			public static int getCount() {
				return count;
			}

			public static void setCount(int count) {
				Candidate.count = count;
			}

			public String getInterviewerName() {
				return interviewerName;
			}

			public void setInterviewerName(String interviewerName) {
				this.interviewerName = interviewerName;
			}

			private int incrementCount() {
				return count++;
			}

			public boolean isInterviewed() {
				return isInterviewed;
			}

			public void setInterviewed(boolean isInterviewed) {
				this.isInterviewed = isInterviewed;
			}

			@Override
			public String toString() {
				return "Candidate [id=" + id + ", name=" + name + ", result=" + result + ", marks=" + marks + ", remarks="
						+ remarks + ", interviewerName=" + interviewerName + ", isInterviewed=" + isInterviewed + "]";
			}

		}

//		public class InterviewQueue {
//
//			private Queue<Candidate> candidateList = new LinkedList<Candidate>();
//			private String interviewerName;
//			private int countPerBatch;
//			private int timePerCandidate;
//			private int batchInterval;
//
//			public InterviewQueue(String interviewerName, int countPerBatch, int timePerCandidate, int batchInterval) {
//				this.interviewerName = interviewerName;
//				this.countPerBatch = countPerBatch;
//				this.timePerCandidate = timePerCandidate;
//				this.batchInterval = batchInterval;
//			}
//
//			public void registeration() {
//				for (int i = 0; i < 20; i++) {
//					this.candidateList.add(new Candidate("Candidate" + i, interviewerName));
//				}
//			}
//
//			public static void main(String[] args) {
//				InterviewQueue interviewQueue = new InterviewQueue("Bala", 5, 1, 2);
//
//				interviewQueue.registeration();
//				interviewQueue.startInterview();
//			}
//
//			public void startInterview() {
//				int batchCount = 1;
//				while (candidateList.peek() != null) {
//					interviewByBatch(batchCount++);
//				}
//
//			}
//
//			private void interviewByBatch(int batchCount) {
//				try {
//					Candidate candidate;
//					for (int i = 0; i < countPerBatch && (candidate = candidateList.poll()) != null; i++) {
//						Thread.sleep(1000 * timePerCandidate);
//						candidate.setInterviewed(true);
//						System.out.println(candidate.toString());
//					}
//					System.out.println("Batch " + batchCount + " completed");
//					Thread.sleep(1000 * batchInterval);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//
//		}```
	}

}
