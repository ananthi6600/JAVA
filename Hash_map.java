import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hash_map {

	public static void main(String[] args) {
		Map<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(7, "Ananthi");
		hm.put(null, null);
		hm.put(12, "sneha");
		hm.put(2, "hema");
//		hm.put(9, "kalai","ananthi"); ---> not valid , only store object values
		hm.put(8, "Selva");
		hm.put(7, "kavi"); // duplicates not allowed so, it replaced, no insertion maintained
		System.out.println(hm); //{null=null, 2=hema, 7=kavi, 8=Selva, 12=sneha}
//
//       LinkedList<Object> ll=new LinkedList<>();
//       ll.add("Ananthi");
//       ll.add('k');
//       ll.add(99);
//       ll.add(null);
//       ll.add(9);
//       ll.add(null);
//       ll.add('?');
//       System.out.println(ll);//[Ananthi, k, 99, null, 9, null, ?]
//       System.out.println("REmove dublicates form linkedList");
//       HashMap<Integer,Object> hm1=new HashMap<>(ll);// cannot infer type arguments for hashMap , cannot convert list to map
//       
       LinkedHashMap<String,Object> lhm=new LinkedHashMap<>();
       lhm.put("key", null);
       lhm.put(null, null);//{key=null, null=ani, key0=null, Key1=Ananthi, key2=89, key3=Selva, key4=j, key5=56, key6=sneha}
       lhm.put("key0", null);//multiple null values allowed,only one null key allowed
       lhm.put(null, "ani");
       lhm.put("Key1", "Ananthi");
       lhm.put("key2", "kavi");
       lhm.put("key3", "Selva");
       lhm.put("key4", 'j');
       lhm.put("key5", 56);
       lhm.put("key6", "sneha");
       lhm.put("key2", 89);
       System.out.println(lhm);//{null=null, Key1=Ananthi, key2=89, key3=Selva, key4=j, key5=56, key6=sneha}
       
       
       TreeMap<Character,String> tm=new TreeMap<>();
       tm.put('k', null);
       tm.put('i', null);
       tm.put('t', "");
       tm.put('w', "selva");
       tm.put('a', "ananthi");
       tm.put('q', "swetha");// Sorting
       System.out.println(tm);//{a=ananthi, i=null, k=null, q=swetha, t=, w=selva}
       
       
       
       
       
	}

}
