import java.io.*;
import java.util.*;
class letters{
      public static void main(String[]args){
         String name="HeyYou";
         String result=" ";
         for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
              if( ch>='A'&&ch<='Z'){
                   result=result+" ";
              }
               result=result+ch;
          }  
            System.out.println(result.trim());
           System.out.println(result.toLowerCase());            
      }
     }