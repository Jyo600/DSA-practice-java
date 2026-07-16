import java.io.*;
import java.util.*;
class house{
    public static void main(String[]args){
          int[][]arr={{1,5,3},
                      {2,9,4},
                      {3,1,7},
                         };
                       int previndex=-1;
                        int index=-1;
                        int sum=0;
                         int house=3;
                          int colour=3;
                            int budget=20;
                       for(int i=0;i<arr.length;i++){
                            int min=Integer.MAX_VALUE;
                          for(int j=0;j<arr[0].length;j++){
                             if(arr[i][j]<min&&j!=index){
                                 min=arr[i][j];
                                  index=j;
                                }
                            
                                
                           }
                          System.out.println(min+" "+index);
                          previndex=index;
                         sum+=min;
                           }
                          if(sum<budget){
                             System.out.println(sum);
                         }
                       else{
                           System.out.println("-1");
                       }
                       
                }
        
   }