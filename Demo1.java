package Unit12;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Demo1 {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("����",98);
		map.put("��ѧ", 89);
		map.put("Ӣ��", 99);
		map.put("����", 96);
		map.put("��ѧ", 90);
		System.out.println(map);
		for(int i=0;i<map.size();i++){
			System.out.println(map.get("����"));
		}
		Set<Entry<String, Integer>> set=map.entrySet();
		for(Entry<String,Integer> s:set){
			System.out.println(s.getKey()+" :"+s.getValue());
		}
		Collection<Integer> s=map.values();
		for(Integer ss:s){
			System.out.println(ss);
		}
		Iterator<Integer> it=s.iterator();
		
	}
}
