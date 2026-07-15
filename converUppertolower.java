import java.io.*;
import java.util.*;
class converUppertolower{
     public static void main(String[]args){
         String s1="Advanture";
          String s2=convertUpper(s1);

          for(int i=0;i<s2.length;i++){
             char ch=s1.charAt(i);
              if(ch>='a'||ch<='z'){
                  s2=(ch-32);
               }
                             }
            System.out.println(s2);
    
       }
   }