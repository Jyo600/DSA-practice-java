
import java.io.*;
import java.util.*;
class leetcode1usinghashmap{
    public static void main(String[]args){
       int[] nums = {2,7,11,15};
       int target = 9;
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int complement=target-nums[i];
       
       if(map.containsKey(complement)){
         System.out.println(map.get(complement)+" "+i);
    
       }
    
    map.put(nums[i],i);
    }
}}