import java.io.*;
import java.util.*;
class countsubarray1{
    public static void main(String args[]){
        int[]nums={2,-2,2,-2};
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum)){
                count+=map.get(sum);
            }
                map.put(sum,map.getOrDefault(sum,0)+1);
            

        }
        System.out.println(count);
    }
}