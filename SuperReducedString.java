import java.util.HashSet;
import java.util.LinkedHashSet;

public class SuperReducedString {

	public static void main(String[] args) {
		String s="baab";
		
		StringBuffer str=new StringBuffer();
		 int i=0;
			    for( i=0;i<s.length()-1;i++) {
			    	if(s.charAt(i)==s.charAt(i+1)) {
			    		i++;
			    	}
			    	else {
			    			str=str.append(s.charAt(i));
			    		}
			    	if(i==s.length()-2  ) {
			    		  if(s.charAt(s.length()-2)!=s.charAt(s.length()-1)) {
						    	str=str.append(s.charAt(i));
						    }
			    	}
			    	System.out.println(str.length());
			    		if(str.length()>1) {
			    			if(str.charAt(str.length()-1)==str.charAt(str.length()-2)) {
		    				System.out.println(str.charAt(str.length()-1));
		    				System.out.println(str.charAt(str.length()-2));	
			    				str.deleteCharAt(str.length()-1);
			    				str.deleteCharAt(str.length()-2);
			    			}
			    		}
			    
			    }
	
			    System.out.println(s);
			    System.out.println(str);
	}

}



//tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwtqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh
//tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh