import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T -- > 0){
            int M = sc.nextInt();
            int N = sc.nextInt(); 
            int[] numbers = new int[N];
            for(int i = 0; i < N; i++)
                numbers[i] = sc.nextInt();
            for(int j = 0; j < N; j++)
                for(int m = j+1; m < N; m++)
                    if(numbers[j] + numbers[m] == M){
                        j++;
                        m++;
                        System.out.println(j + " " + m);
                        break;
                    }
        }
    }
}
