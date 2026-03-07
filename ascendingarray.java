import java.util.Arrays;
import java.io.*;
class ascendingarray{
    public static void main(String args[]){
        int[]arr={3,10,7,99,70,2,-1};
        print(arr);
        Arrays.sort(arr);
         print(arr);
    }
    public static void print(int[]arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
         System.out.println();
        } 
     }
     
