import java.io.*;
import java.util.*;
class leetcode242ValidAnagram{
    public static void main(String[]args){
        String s="anagram";
        String t="nagaram";
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean valid =true;
        for(char ch:t.toCharArray()){
            if(!map.containsKey(ch)){
                valid=false;
                break;
            }
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                map.remove(ch);
            }


        }
        if(!map.isEmpty()){
            valid=false;
        }
        System.out.println(valid);
    }
}