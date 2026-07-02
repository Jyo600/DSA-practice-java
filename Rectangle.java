import java.io.*;
import java.util.*;
class Rectangle{
             public static void main(String[]args){
              int[]h={2,1,5,6,2,3};
              int largest=0;
                 int index=0;
                 int w=1;
                int area=0;              
                 for(int i=0;i<h.length;i++){
                   if(h[i]>largest){
                           largest=h[i];
                          index=i;  
                        }
                      
                }
                System.out.println(largest+" "+index);
                          int leftIn=index-1;
                          int rightIn=index+1;
                           int left=h[leftIn];
                           int right=h[rightIn];
                  if(left>right){
                          area=left*(w+(index-leftIn));
                        } 
                     else{
                          area=right*(w+(rightIn-index));
                  }
              System.out.println("Area:"+area);
              }

}