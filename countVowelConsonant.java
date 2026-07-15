import java.io.*;
import java.util.*;
class countVowelConsonant{
    public static void main(String[]args){
       String name="Automation";
         int vovel=0;
         int consonant=0;
         
         for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
              if(c=='a'|| c=='e'|| c=='i'||                             c=='o'|| c=='u'|| c=='A'|| 
c=='E'|| c=='I'|| c=='O'||
 c=='U'){
             vovel++;
            }
        else{
              consonant++;
          }
        }
       System.out.println("total no of vowels :"+vovel+"total nimber of consonant: "+consonant);
      }
   }