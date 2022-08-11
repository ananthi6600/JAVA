

import java.util.Comparator;

public class FileSizeComparator implements Comparator<FileDetails>{

	@Override
	public int compare(FileDetails o1, FileDetails o2) {
		// TODO Auto-generated method stub
		if(o1.getFileLength()<o2.getFileLength()) {
			return 1;
		}
		else if(o1.getFileLength()>o2.getFileLength()) {
			return -1;
		}
		return 0;
	}

}