import java.io.*;
import java.util.*;
class leetcode49{
    public List<List<String>>groupAnagrams(String[]strs){
        HashMap<String,List<String>>map=new HashMap<>();
        for(String word : strs){
            char[]ch=word.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(word);
        }
         return new ArrayList<>(map.values());
    }
    public static void main(String[]args){
        String[]strs={"eat","tea","tan","ate","nat","bat"};
        leetcode49 obj=new leetcode49();
         List<List<String>>result= obj.groupAnagrams(strs);
         System.out.println(result);
    }
}