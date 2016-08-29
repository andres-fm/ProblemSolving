import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        while(T -- > 0){
            String print = "";
            int size = Integer.valueOf(sc.nextLine());
            String[][] array = new String[size][size];
            for(int i = 0; i < size; i++){      
                array[i] = sc.nextLine().split("");
                Arrays.sort(array[i]);
            }
            boolean yes = true;
            for(int j = 0; j < size; j++){
                for(int k = 0; k < size - 1; k++){
                    if(array[k][j].compareTo(array[k + 1][j]) > 0){
                        print = "NO";
                        yes = false;
                        break;
                    }
                }
                if(!yes)
                    break;
            }
            if(yes)
                print = "YES";
            System.out.println(print);
        }
    
    }
}
