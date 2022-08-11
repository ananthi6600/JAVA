

import java.io.File;

public class FileDetails {
	private int fileLength;
	private  File fileName;
	public FileDetails(int fileLength, File f) {
		this.fileLength = fileLength;
		this.fileName = f;
	}
	public int getFileLength() {
		return fileLength;
	}
	public void setFileLength(int fileLength) {
		this.fileLength = fileLength;
	}
	public File getFileName() {
		return fileName;
	}
	public void setFileName(File fileName) {
		this.fileName = fileName;
	}
	@Override
	public String toString() {
		return "FileDetails [fileLength=" + fileLength + ", fileName=" + fileName + "]";
	}
	
	

}