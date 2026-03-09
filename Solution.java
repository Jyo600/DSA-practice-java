//given a sorted array hos sum=target
import java.io.*;
import java.util.*;
public class Solution{
   
    public static int[]twoSum(int[]nums,int target){
         int left=0;
        int right=nums.length-1;
        while(left<right){
                int sum =nums[left]+nums[right];
               if( sum ==target){
                return new int[]{left,right};
            }
        
            if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    
    public static void main(String args[]){
        int[]nums={2,4,5,6,7,8,9,10};
        int target=13;
        int[]result= twoSum(nums,target);
        System.out.println(result[0]+"and the"+result[1]);
    }
}
