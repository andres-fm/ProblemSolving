import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int maxFives = 0;
            boolean possible = false;
            for(int fives = 0; fives < N+1; fives += 3)
                if((N - fives) % 5 == 0){
                    maxFives = fives;
                    possible = true;
                }
            if(possible){
                for(int i = 0; i < maxFives; i++)
                    System.out.print("5");
                for(int j = maxFives; j < N; j++)
                    System.out.print("3");                
            }else{
                System.out.print("-1");
            }
            System.out.println("");        
        }
    }
}
