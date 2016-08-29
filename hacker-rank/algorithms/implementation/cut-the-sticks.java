import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        int actualMin = 1000;
        int nextMin = 1000;
        for(int i = 0; i < N; i++){
            array[i] = sc.nextInt();
            if(array[i] < nextMin)
                nextMin = array[i];
        }
        int count = 1;
        while(count != 0){
            actualMin = nextMin;
            nextMin = 1000;
            count = 0;
            for(int j = 0; j < N; j++){
               if(array[j] == 0)
                   continue;
                array[j] -= actualMin;
                count++;
                if(array[j] != 0 && array[j] < nextMin)
                    nextMin = array[j];
            }
            if(count != 0)
                System.out.println(count);           
        }
    }
}
