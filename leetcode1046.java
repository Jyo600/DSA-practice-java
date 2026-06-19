import java.io.*;
import java.util.*;
class leetcode1046{
    public static void main(String[]args){
        int[]stones={2,7,4,1,8,1};
        int k=1;
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->(b)-(a));
        for(int num:stones){
            pq.add(num);
        }
        while(pq.size()>k){
            int x=pq.poll();
            int y=pq.poll();
            if(x!=y){
                pq.add(x-y);
            }
        }
        if(pq.isEmpty()){
            System.out.println(0);
        }
        else{
            System.out.println(pq.peek());
        }
    }
}