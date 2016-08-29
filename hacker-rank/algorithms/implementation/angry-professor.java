import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int onTime = 0;
            for(int i = 0; i < N; i++)
                if(sc.nextInt() <= 0)
                    onTime++;
            System.out.println((onTime < K) ? "YES" : "NO");
        }
    }
}
