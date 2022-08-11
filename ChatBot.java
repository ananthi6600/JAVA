import java.util.HashMap;
import java.util.Scanner;

public class ChatBot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,HashMap<Integer,String>> language=new HashMap<Integer,HashMap<Integer,String>>();
		HashMap<Integer,String> english=new HashMap<Integer,String>();
		english.put(1,"Recharge");
		english.put(2,"CallerTune");
		english.put(3,"DTH");
		english.put(4,"New Offers");
		HashMap<Integer,String> tamil=new HashMap<Integer,String>();
		tamil.put(1,"ரிச்சார்ஜ்");
		tamil.put(2,"காலர் டியுன்");
		tamil.put(3,"டிடிஎச்");
		tamil.put(4,"புதிய ஆஃபர்");
		
		language.put(1,tamil);
		language.put(2,english);
		
		System.out.println("1.Tamil"+"\n"+"2.English"+"\n"+"3.Exit");
		int chioce=sc.nextInt();
		switch(chioce){
		case 1:
				
		
		}

	}

}
