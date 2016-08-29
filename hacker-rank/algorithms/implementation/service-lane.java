import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] width = new int[N];
        for(int a = 0; a < N; a++)
            width[a] = sc.nextInt();
        while(T-- > 0){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int min = 3;
            for(int q = i; q <= j; q++)
                if(width[q] < min)
                    min = width[q];
            System.out.println(min);
        }
    }
}
