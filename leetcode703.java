import java.io.*;
import java.util.*;
class leetcode703{
    private PriorityQueue<Integer>pq;
    private int k;
    public leetcode703(int k,int[]nums){
        this.k=k;
        pq=new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
    }
     public int add(int val){
        pq.add(val);
        if(pq.size()>k){
            pq.poll();
        }
          return pq.peek();
     }
    public static void main(String[]args){
        int[]nums={4,5,8,2};
        int k=3;
        leetcode703 obj=new leetcode703(k,nums);
        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
        System.out.println(obj.add(9));
        System.out.println(obj.add(4));
    }
}