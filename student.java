//clg pgrm
import java.io.*;
import java.util.*;
class student{
     public static void main(String[]args){
       int count=0;
       int n=50;
              int[][]arr={{60,70,80},
                 {40,50,60},
                 {30,40,50},
                    };
           int m=3;
         for(int i=0;i<arr.length;i++){
                  int sum=0;

               for(int j=0;j<arr[i].length;j++){
                 sum+=arr[i][j];
                }
               
            
             int p=sum/m ;
System.out.println(p);
            if(p>=50){
                   count++;
               }
            }
         System.out.println(count);
      }
   }