
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class IntegerToRoman {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		Map<Character,Integer> Hm=new LinkedHashMap<Character,Integer>();
		Hm.put('M',1000);
		Hm.put('D',500);
		Hm.put('C',100);
		Hm.put('L',50);
		Hm.put('X',10);
		Hm.put('V',5);
		Hm.put('I',1);
		String str="";
		System.out.println("Enter Integer Number");
		int n=sc.nextInt();
		for(Entry<Character, Integer> item:Hm.entrySet())
		{
			//System.out.println(item.getValue());
				while(n>=item.getValue()) {
					n=n-item.getValue();
					System.out.println(n);
					str=str+item.getKey();
				}
		}
		System.out.println(str);
		sc.close();
	}
}
