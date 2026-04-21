import java.util.*;
import java.io.*;
class substringwithriplacement{
    public static void main(String args[]){
        String s="AABAB";
        int k=1;
        int left=0;
        int maxlen=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int maxfreq=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch));
            while((right-left+1)-maxfreq>k){
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        System.out.println(maxlen);
    }
}