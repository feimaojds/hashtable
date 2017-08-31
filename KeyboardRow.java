package leecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class KeyboardRow {

public String[] findWords(String[] words) {
        
	    Map<Character,Integer> map = new HashMap<Character,Integer>();
	    String[] keyboard = new String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};
	    for(int i=0;i<keyboard.length;i++){
	    	for(char c:keyboard[i].toCharArray()){
	    		map.put(c, i);
	    	}
	    }
	    List<String> res = new ArrayList<String>();
	    for(String str:words){
	    	System.out.println(str);
	    	if("".equals(str)) continue;
	    	int index = map.get(str.toLowerCase().charAt(0));
	    	System.out.println(index);
	    	for(int i=0;i<str.length();i++){
	    		if(index!=map.get(str.toLowerCase().charAt(i))){
	    			break;
	    		}
	    		if(i==str.length()-1){
	    			res.add(str);
	    		}
	    	}
	    	
	    }
	    return res.toArray(new String[0]);
    }

public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	String[] test = new String[]{"qwer"};
	System.out.println(new KeyboardRow().findWords(test)[0]);
	
}

}
