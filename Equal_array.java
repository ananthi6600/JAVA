import java.util.ArrayList;
import java.util.Arrays;


public class Equal_array {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(10 ,27 ,9 ,10 ,100 ,38 ,30 ,32 ,45 ,29 ,27 ,29 ,32 ,38 ,32 ,38 ,14 ,38 ,29 ,30 ,63 ,29 ,63 ,91 ,54 ,10 ,63));
		ArrayList<Integer> hm=new ArrayList<>();
		ArrayList<Integer> hm1=new ArrayList<>();
		
        int max=0;
        for(int i=0;i<arr.size();i++){
         int   temp=-1;
        for(Integer item:hm1){
            if(arr.get(i)==item){
                temp=0;
            }
        }
        if(temp!=0){
            int count=0;
     
            for(int j=0;j<arr.size();j++){
                if(arr.get(j)==arr.get(i)){
                    count++;
                }
            }
            if(max<count){
                max=count;
            }
            hm.add(count);
            hm1.add(arr.get(i));
        }
        }
        int deletions=0;
        for(Integer key:hm) {
                deletions=deletions+key;
        }
        deletions=deletions-max;
        

	   System.out.println(deletions);
   }

	}


