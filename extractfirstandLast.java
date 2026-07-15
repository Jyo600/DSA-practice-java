import java.io.*;
import java.util.*;
class extractfirstandLast{
    public static void main(String[]args){
          String name="Jyoti gavade";
          int result=name.indexOf(' ');
          String firstName=name.substring(0,result);
           String lastName=name.substring(result+1);
            System.out.println("firstname:"+firstName);
  System.out.println("lastname:"+lastName); 
         }
    }