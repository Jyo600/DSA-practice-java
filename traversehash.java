import java.io.*;
import java.util.*;
class traversehash{
    public static void main(String args[]){
        int[]nums={4,5,6,5,4};
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                System.out.println(num+"");
                return;
            }else{
                set.add(num);
            }
            
        }  
        
    }
}