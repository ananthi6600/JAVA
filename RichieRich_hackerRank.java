

public class RichieRich_hackerRank {

	public static void main(String[] args) {
		int k=32520;
	String s="";
	int len=s.length()-1;
		 StringBuffer sb=new StringBuffer();
	        sb.append(s);
	        if(sb.charAt(0)!=sb.charAt(s.length()-1)){
	        if(sb.charAt(0)=='9' ^ sb.charAt(s.length()-1)=='9'){
	            char c='9';
	            if(sb.charAt(0)=='9'){
	                sb.setCharAt(len, c);
	                k--;
	                System.out.println(k);
	            }
	            else {
	            	sb.setCharAt(0, c);
	            	k--;
	            	System.out.println(k);
	            }
	}
	        else if(sb.charAt(0)!='9'&&sb.charAt(s.length()-1)!='9'){
	        	char c='9';
	        	sb.setCharAt(len, c);
	        	k--;
	        	System.out.println(k);
	        	if(k>0) {
	        		sb.setCharAt(0, c);
	        		k--;
	        		System.out.println(k);
	        }
	        }
	        }
	      //  System.out.println(sb);
	       
	        for(int i=1;i<sb.length()/2;i++){
	            for(int j=sb.length()-2;j>i;j--){
	            	if(k>0) {
	                if(sb.charAt(i)<sb.charAt(j)) {
	                	char ch=sb.charAt(j);
	                	sb.setCharAt(i, ch);
	                	k--;
	                	System.out.println(k);
	                }
	                else {
	                	char ch=sb.charAt(i);
	                	sb.setCharAt(j, ch);
	                	k--;
	                	System.out.println(k);
	                }
	            	}
	            }
	        }
	        
	        String str=sb.toString();
	        String reverse="";
	        for(int i=str.length()-1;i>=0;i--) {
	        	reverse=reverse+str.charAt(i);
	        }
	        
	        if(str.equals(reverse)) {
	        	System.out.println(str);
	        }
	       else {
	    	   System.out.println(str);
	    	  System.out.println("-1");
	       }
	        
	        
	      
//            
	}
}