import java.util.*;
import java.io.*;
class movenegative{
    public static void main(String args[]){
        int[]nums={1,-2,3,-4,5};
        int[]res=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                
                res[j]=nums[i];
                
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[j]=nums[i];
                j++;
            }
        }
        System.out.print(Arrays.toString(res));
        
    }
}