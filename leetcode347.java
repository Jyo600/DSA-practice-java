
import java.util.*;
class leetcode347{
    public static void main(String[]args){
        int[]nums={1,1,1,2,2,3};
        int k=2;
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>(
            (a,b) -> map.get(a)-map.get(b)
         );
        for(int key:map.keySet()){
            pq.add(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[]result=new int[k];
        for(int i=k-1;i>=0;i--){
        result[i]=pq.poll();
        }
        System.out.println(Arrays.toString(result));
    }

}