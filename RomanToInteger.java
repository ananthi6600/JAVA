import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class RomanToInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Character,Integer> Hm=new HashMap<Character,Integer>();
		Hm.put('M',1000);
		Hm.put('D',500);
		Hm.put('C',100);
		Hm.put('L',50);
		Hm.put('X',10);
		Hm.put('V',5);
		Hm.put('I',1);
		String str="IX";
		System.out.println("Enter Integer Number");
		int n=0;
		for(int i=0;i<str.length();i++){
			char key=str.charAt(i);
			n=n+Hm.get(key);
		}
		
		System.out.println(n);
		sc.close();
	}
	}


