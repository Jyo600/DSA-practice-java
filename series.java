import java.io.*;
import java.util.*;
class series{
   public static void main(String[]args){
     //int[]arr={1,1,2,3,4,9,8,27,16,81,32,243,64,729,128,2187};
       //int n=10;
        Scanner sc=new Scanner(System.in);
         System.out.println("enter value of n:");
          int n=sc.nextInt();
    int l=0;
double m=0;
   while(n<30){
      if(n==0||n==1){
           System.out.println("1");
            }
        else if(n%2==0){
             l=n/2;
            m=Math.pow(2,l);
            System.out.println(m);
           }
          else if(n%2!=0){
              l=(n-1)/2;
             m=Math.pow(2,l);
             System.out.println(m);
           }
          
         }
}
 
  }
