import java.util.*;
import java.io.*;
class invertedPalindrome{
  public static void main(String[]args){
  for(int i=5;i>=0;i--){
    for(int j=5-i;j>0;j--){
     System.out.print(" ");
}
 for(int j=2*i-1;j>0;j--){
System.out.print("*");

}
System.out.println();
}
}
}