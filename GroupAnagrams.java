package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	
public List<List<String>> groupAnagrams(String[] strs) {
       if(strs == null || strs.length == 0 ) return new ArrayList<>();
       Map<String,List<String>> map = new HashMap<String, List<String>>();
       for(String str : strs){
    	   char[] c = str.toCharArray();
    	   Arrays.sort(c);
    	   String key = String.valueOf(c);
    	   if(!map.containsKey(key)){
    		   List<String> list = new ArrayList<String>();
    		   map.put(key, list);
    		   map.get(key).add(str);
    	   }else{
    		   map.get(key).add(str);
    	   }
       }
       List<List<String>> res = new ArrayList<>();
       res.addAll(map.values());
       return res;
    }
}
