import java.io.*;
import java.util.*;

public class Solution {
    
    static class Page{
        public int number;
        public int[] exercises;
        
        public Page(int number, int tam){
            this.number = number;
            exercises = new int[tam];
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] problems = new int[n+1];
        for(int m = 1; m <= n;m++)
            problems[m] = sc.nextInt();
        int pages = 0;
        /* Counting how many page the book will have */
        for(int i = 1 ; i <=n; i++)
            pages += (int)Math.ceil((double)problems[i]/k);
        Page[] book = new Page[pages+1];
        /* Filling the book */
        for(int j = 1; j <= pages; j++)
            book[j] = new Page(j, k);
        
        int q = 1;
        int e = 0;
        for(int a : problems){
            if(a == 0)
                continue;
            for(int b = 1; b <= a; b++){                
                if(e < k)
                    book[q].exercises[e++] = b;
                else{
                    q++;
                    e = 0;
                    b--;
                }
            }
            if(e != 0)
                q++;
            e = 0;
        }
        int count = 0;
        for(Page p : book){
            if(p != null)
                for(int a : p.exercises)    
                    if(a == p.number)
                        count++;
            
        }
        System.out.print(count);
       
        
    }
}
