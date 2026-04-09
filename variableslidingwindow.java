import java.io.*;
import java.util.*;
class variableslidingwindow{
    public static void main(String args[]){
        int[]nums={1,2,1,0,1,1,0};
        int k=4;
        int sum=0;
        int left=0;
        int maxlen=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
        
        while(sum>k)
        {
            sum-=nums[left];
            left++;
        }
        maxlen=Math.max(maxlen,right-left+1);
    }
    System.out.println(maxlen);

    }
}