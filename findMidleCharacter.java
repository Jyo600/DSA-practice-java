import java.io.*;
import java.util.*;
class findMidleCharacter{
     public static void main(String[]args){
       String s=new String();
         Scanner sc=new Scanner(System.in);
           System.out.println("entrr one string:");
           String name=sc.nextLine();
           System.out.println("entered string is:" +name);
            int l=name.length();
            System.out.println(l);
            if(l%2==0){
                  int startIndex=l/2-1;
                   int lastIndex=l/2+1;
                   String even=name.substring(startIndex,lastIndex);
                    System.out.println(even); 
 
                }
              else{
                   int i=l/2;
                  System.out.println(name.charAt(i));
                 }
                              
              
       }
    }