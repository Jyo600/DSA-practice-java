import java.util.*;
import java.io.*;
class waterwall{
    public static void main(String args[]){
        int[]nums={1,8,6,2,5,4,8,3,7};
        int left=0;
        int right=nums.length-1;
        int max=0;
        while(left<right){
            int  h =Math.min(nums[left],nums[right]);
            int  w=right-left;
            int area= h*w;
             max=Math.max(max,area);
            if(nums[left]<nums[right]){
                left++;
            }
            else{
                right--;
            }
            
        }
         System.out.println(max);
}
}