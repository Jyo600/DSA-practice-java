import java.io.*;
import java.util.*;
class leetcode215{
    public static void main(String[]args){
        int[]nums={3,2,1,5,6};
        int k=2;
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->(a)-(b));
        for(int num:nums){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
          System.out.println(pq.peek());
    }
}