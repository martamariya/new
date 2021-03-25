package example;

import java.util.Scanner;
public class clas {
    
    
    public static int find(int n){
        
        int sum=0;
        int max_sum=0;
        int num_with_max=0;
        for (int i = 1; i <= n; i++){
            for (int j=1; j<=i; j++){
                 if(i%j==0)
                 {
                    sum+=j;
                 }
            }
        if (sum>max_sum)
        {
         max_sum=sum;
         num_with_max=i;
        }
          sum=0;     
            }
            return (num_with_max);
        
        
    }
    
    public static void main(String[] args){
        
        
       //find(5);
        
        
        System.out.println(find(10000));
         
    }
            
    }
