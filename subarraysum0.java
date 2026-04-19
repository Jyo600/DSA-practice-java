import java.io.*;
import java.util.*;
class subarraysum0{
    public static void main(String args[]){
        int[]nums={1,-1,3,2,-2,-3,3};
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==0){
                maxlen=i+1;
            }
            if(map.containsKey(sum)){
                maxlen=Math.max(maxlen,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        System.out.println(maxlen);
    }
}