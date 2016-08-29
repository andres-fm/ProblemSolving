import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] array = new int[N];
            int sum = 0;
            for(int i = 0; i < N; i++){
                array[i] = sc.nextInt();
                sum += array[i];
            }
            int left = 0, right = sum - array[0];
            boolean exists = false;
            for(int j = 0; j < N; j++){
                if(left == right){
                    exists = true;
                    break;
                }
                left += array[j];
                if(j + 1 < N)
                    right -= array[j+1];
            }
            System.out.println((exists) ? "YES" : "NO");
        }
    }
}
