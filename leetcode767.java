import java.io.*;
import java.util.*;
class leetcode767{
    public static void main(String[]args){
        String s="aab";
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(char ch:map.keySet()){
            pq.add(ch);
        }
        StringBuilder result=new StringBuilder();
        Character prevchar=null;
        int prevfreq=0;
        while(!pq.isEmpty()){
           char current=pq.poll();
             result.append(current);
            map.put(current,map.get(current)-1);
            if(prevfreq>0){
                pq.add(prevchar);
            }
                prevchar=current;
                prevfreq=map.get(current);
            
        }
                
            
            if(result.length()==s.length()){
            System.out.println(result.toString());

            }
            System.out.println(" ");
        }
          
            
        }

    
