package maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DetaisInMap {

	public static void main(String[] args) {

		HashMap<String, String> hm=new HashMap<>();
		hm.put("Name","Hemanth");
		hm.put("EmployeeId","2201");
		hm.put("location","bangalore");
		hm.put("Salary","20000");
		Set<Entry<String, String>> details=hm.entrySet();
		for(Entry o:details)
		{
			System.out.println(o);
			System.out.println(" ");
		}
//		for(Entry o:details)
//		{
//			System.out.println(o.getValue());
//			System.out.println(" ");
//		}
		
		String str=hm.get("Name");
		
		System.out.println(str);
		
		
//		Set<String> setview = hm.keySet();
//		System.out.println(setview);
//		//System.out.println(hm);
//		String eid = hm.get("EmployeeId");
//		System.out.println(eid);
//		HashMap<String,String>hs1=new HashMap<>();
//		hs1.putAll(hm);
//		hs1.put("Abc","100");
//		System.out.println();
	}

}
