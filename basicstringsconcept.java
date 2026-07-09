import java.io.*;
import java.util.*;
class basicstringsconcept{
   public static void main(String[]args){
     String  name= "hello this is alpha 5051 and 9075";
      int num=0;
      int max=0;
              for(int i=0;i<name.length();i++){
             int  ch= name.charAt(i)-'0';
              System.out.print(name.charAt(i)+" ");
               
            if(ch>=0 && ch<=8){
                           
                  num=(num*10)+ch;
                           if(num>max){
                             max=num;
                            
                             }
                        }
                       else{
                            num=0;
                           
                       }
                   }                    
                     System.out.println(max);
            }               
       
        
   } 

            
             
            
                