
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;


public class QueueFiles {
	static PriorityQueue<FileDetails> queueFiles=new PriorityQueue<>(7,new FileSizeComparator());
	
	public void readFiles() {
		File folder=new File("C:\\Users\\SHWETA\\Desktop\\File1");
		File filesList[]=folder.listFiles();
		
		for(File f:filesList) {
			int count=0;
			try {
				FileReader fr=new FileReader(f);
				while(fr.read()!=-1) {
					count++;
				}
				System.out.println("Name"+f+" LetterCount"+count);
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			FileDetails fc=new FileDetails(count,f);
			queueFiles.add(fc);
		}
		
	}
	

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		QueueFiles qf=new QueueFiles();
		qf.readFiles();
		System.out.println("-------Files in the order of priority-------");
		while(!queueFiles.isEmpty()) {
			System.out.println(queueFiles.poll());
		}

	}

}