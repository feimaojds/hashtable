package leecode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	
public int singleNumber(int[] nums) {
     
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	for(int i=0;i<nums.length;i++){
		if(!map.containsKey(nums[i])){
		   map.put(nums[i], 1);
		}else{
			map.put(nums[i],map.get(nums[i])+1);
		}
	}
	
	for(int num:map.keySet()){
		if(map.get(num)==1){
			return num;
		}
	}
	return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] test = new int[]{1,1,2,2,3};
        System.out.println(new SingleNumber().singleNumber(test));
	}

}
