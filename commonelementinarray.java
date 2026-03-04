//two arrays have common element
import java.io.*;
import java.util.*;
class commonelementinarray{
    public static void main(String args[]){
        int[]arr={1,2,3,4,5,5,6,4};
        boolean common=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("the common alement is:"+i);
                    common=true;
                    break;
                }
            }
        }
        if(common==false){
            System.out.println("there no one any common eloement");
        }
    }
}