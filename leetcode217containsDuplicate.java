import java.io.*;
import java.util.*;
class leetcode217containsDuplicate{
    public static void main(String[]args){
    int[] nums = {1, 2, 3, 1};
      HashSet<Integer>set=new HashSet<>();
      boolean found=false;
      for(int num:nums){
        if(set.contains(num)){
            found=true;
            break;
        }
        set.add(num);
      }
      System.out.println(found);
    }
}