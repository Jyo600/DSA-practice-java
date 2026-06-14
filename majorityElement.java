import java.io.*;
import java.util.*;
class majorityElement{
    public static void main(String[]args){
        int[] nums = {2,2,1,1,1,2,2};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>nums.length/2){
                System.out.println(key);
                break;
            }
    }
        }
    }
