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
		map.put("语文",98);
		map.put("数学", 89);
		map.put("英语", 99);
		map.put("物理", 96);
		map.put("化学", 90);
		System.out.println(map);
		for(int i=0;i<map.size();i++){
			System.out.println(map.get("语文"));
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
