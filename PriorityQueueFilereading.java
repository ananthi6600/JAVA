
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PriorityQueueFilereading {
	
public int count(FileReader file) {
	System.out.print("File Data  :");
	int count=0;
	try {
		int output=file.read();
		while(output!=-1) {
			count++;
			System.out.print((char)output);
			output=file.read();
		}
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	System.out.println();
	System.out.println("count :"+count);
	return count;
}


	public static void main(String[] args) throws FileNotFoundException {
			PriorityQueue<FileReader> pq=new PriorityQueue<>();
			FileReader reading = new FileReader("C://Users/User/Desktop/File1/fileno1.txt");
			FileReader reading1 = new FileReader("C://Users/User/Desktop/File1/fileno2.txt");
			FileReader reading2 = new FileReader("C://Users/User/Desktop/File1/fileno3.txt");
			FileReader reading3 = new FileReader("C://Users/User/Desktop/File1/fileno4.txt");
			FileReader reading4 = new FileReader("C://Users/User/Desktop/File1/fileno5.txt");
			FileReader reading5 = new FileReader("C://Users/User/Desktop/File1/fileno6.txt");
			int []array=new int[6];
			HashMap<FileReader,Integer> readingFile=new HashMap<FileReader,Integer>();
	 	 	readingFile.put(reading,new PriorityQueueFilereading().count(reading));
			readingFile.put(reading1,new PriorityQueueFilereading().count(reading1));
			readingFile.put(reading2,new PriorityQueueFilereading().count(reading2));
			readingFile.put(reading3,new PriorityQueueFilereading().count(reading3));
			readingFile.put(reading4,new PriorityQueueFilereading().count(reading4));
			readingFile.put(reading5,new PriorityQueueFilereading().count(reading5));
			int i=0;
			for(Map.Entry<FileReader,Integer> item:readingFile.entrySet()) {
				array[i]=item.getValue();
				i++;
			}
			
			Arrays.sort(array);
			for(int j=0;j<array.length;j++) {
				for(Map.Entry<FileReader,Integer> item:readingFile.entrySet()) {
					if(array[j]==item.getValue()) {
						try {
							pq.add(item.getKey());
							break;
						} catch (Exception e) {
							e.printStackTrace();
						}
						
					}
				}
			}
			
			for(FileReader item:pq) {
				
				System.out.println(new PriorityQueueFilereading().count(item));
			}
}

}
