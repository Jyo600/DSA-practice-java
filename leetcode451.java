import java.io.*;
import java.util.*;
class leetcode451{
    public static void main(String[]args){
        String s="tree";
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(char ch:map.keySet()){
            pq.add(ch);
        }
        StringBuilder result=new StringBuilder();
        while(!pq.isEmpty()){
         char ch=pq.poll();
        int  freq=map.get(ch);
         for(int i=0;i<freq;i++){
            result.append(ch);
         }


        }
        System.out.println(result.toString());
    }
}