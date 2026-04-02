import java.util.*;
import java.io.*;
class sellstock{
    public static void main(String args[]){
        int[]prices={7,1,5,3,6,4};
        int minprice=prices[0];
        int maxprofit=0;
       
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minprice){
            minprice=prices[i];
                
            }
            else{
                
               maxprofit=Math.max(maxprofit,prices[i]-minprice);
            }
        }
        System.out.println("the best maxprofit is the "+maxprofit);
    }
}