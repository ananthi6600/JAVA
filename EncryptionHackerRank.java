

public class EncryptionHackerRank {
	public static void main(String[] args) {
		String s="chillout";
		int size=s.length(),k=0;
		int row= (int) Math.floor(Math.sqrt(size));
        final int column = (int) Math.ceil(Math.sqrt(size));//(int) Math.sqrt(size);
		int coloum=row+1;
		char [][] c=new char[row][coloum];
        for(int i=0;i<row;i++){
            for(int j=0;j<coloum;j++){
            	//System.out.println(s.charAt(k));
            		c[i][j]=s.charAt(k);
            		k++;
            
        }
        }
        System.out.println(row);
        System.out.println(coloum);
        System.out.println(k);
        for(int i=0;i<coloum;i++) {
        	for(int j=0;j<row;j++) {
        		System.out.print(c[j][i]);
        	}
        	System.out.print(" ");
        }
	}
}
