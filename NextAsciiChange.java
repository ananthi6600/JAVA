

public class NextAsciiChange {

	public static void main(String[] args) {
		String s = "aBuzZ9900";
		String s1 = "";
		char [] ch=new char[10];
		int [] in=new int[10];
		int size=0,temp=0;
		for(int i=0;i<s.length();i++) {
			
				for(int p=0;p<size;p++) {
					if(i==in[p]) 
						temp=1;
			}
			if(temp==0) {
				for(int j=0;j<s.length();j++) {
					if(i!=j) {
						if (s.charAt(i) == s.charAt(j) || s.charAt(i) - 32 == s.charAt(j)
								|| s.charAt(i) + 32 == s.charAt(j)) {
							char c=s.charAt(i);
							c++;
						
						}
					}
			}
			
		}
		}
		
//		for(int i=0;i<s.length();i++) {
//			int temp=1;
//			for(int j=0;j<s.length();j++) {
//				if(i!=j) {
//					if (s.charAt(i) == s.charAt(j) || s.charAt(i) - 32 == s.charAt(j)
//							|| s.charAt(i) + 32 == s.charAt(j)) {
//						temp=0;
//						switch(s.charAt(j)) {
//						
//						case '9':
//							s1=s1+'0';
//							break;
//						case 'z':
//							s1=s1+'a';
//							break;
//						case 'Z':
//							s1=s1+"A";
//							break;
//						default:
//							char ch=s.charAt(j);
//							ch++;
//							s1=s1+ch;
//						
//						}
//					}
//				}
//				if(temp==0) {
//					
//					break;
//				}
//			}
//			if(temp==1) {
//				s1=s1+s.charAt(i);
//			}
//		}
//System.out.println(s1);
//		for (int i = 0; i < s.length(); i++) {
//			int temp ;
//				char c=s.charAt(i);
//				
//					for (int k = 0; k < s.length(); k++) {
//						if (i != k) {
//							if (c == s.charAt(k) || c - 32 == s.charAt(k)
//									|| c + 32 == s.charAt(k)) {
//								if(s.charAt(k)=='9') {
//									s1=s1+'0';
//								}
//								
//								 else if(s.charAt(k)=='z') {
//									s1=s1+'a';
//								}
//								else if(s.charAt(k)=='Z') {
//									s1=s1+'A';
//								}
//								else {
//									char ch=s.charAt(k);
//									ch++;
//									s1=s1+ch;
//								}
//									temp=0;
//							}
//							
//					}
//					}
//				}
//			
//		

		
	}
}
