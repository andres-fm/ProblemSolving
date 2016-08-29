import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Vertex{
    public int value;
    public Map<String, Vertex> map;
    char color;
    public Vertex(int value){
        this.value = value;
        map = new HashMap<>();
        color = 'a';
    }
}
public class Solution {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] array = new int[r][c];
        Map<String, Vertex> graph = new HashMap<>();
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++){
                array[i][j] = sc.nextInt();
                if(array[i][j] == 1)
                    graph.put(i+" "+j, new Vertex(1));
            }
        
        for(int a = 0; a < r; a++){
            for(int b = 0; b < c; b++){
                if(graph.containsKey(a+" "+b)){
                    if(graph.containsKey((a+1)+" "+b)) 
                        graph.get(a+" "+b).map.put((a+1)+" "+b, graph.get((a+1)+" "+b));
                    if(graph.containsKey(a+" "+(b+1)))
                        graph.get(a+" "+b).map.put(a+" "+(b+1), graph.get(a+" "+(b+1)));
                    if(graph.containsKey((a+1)+" "+(b+1)))
                        graph.get(a+" "+b).map.put((a+1)+" "+(b+1), graph.get((a+1)+" "+(b+1)));
                    if(graph.containsKey(a+" "+(b-1)))
                        graph.get(a+" "+b).map.put(a+" "+(b-1), graph.get(a+" "+(b-1)));
                    if(graph.containsKey((a+1)+" "+(b-1)))
                        graph.get(a+" "+b).map.put((a+ 1)+" "+(b-1), graph.get((a+1)+" "+(b-1)));
                    if(graph.containsKey((a-1)+" "+b))
                        graph.get(a+" "+b).map.put((a-1)+" "+b, graph.get((a-1)+" "+b));
                    if(graph.containsKey((a-1)+" "+(b+1)))
                        graph.get(a+" "+b).map.put((a-1)+" "+(b+1), graph.get((a-1)+" "+(b+1)));
                    if(graph.containsKey((a-1)+" "+(b-1)))
                        graph.get(a+" "+b).map.put((a-1)+" "+(b-1), graph.get((a-1)+" "+(b-1)));
                }
            }
        }
         
         int max = 0;
         
         for(String s : graph.keySet()){
             if(graph.get(s).color != 'a')
                 continue;
             int count = 1;
             Queue<Vertex> queue = new LinkedList<>();
             graph.get(s).color = 'b';
             queue.add(graph.get(s));
             while(!queue.isEmpty()){
                 Vertex actual = queue.remove();
                 for(String q : actual.map.keySet()){ 
                     if(actual.map.get(q).color == 'a'){
                         count++;
                         actual.map.get(q).color = 'b';
                         queue.add(actual.map.get(q));
                     }
                 }
             }
             max = (max < count) ? count : max;
         }
         System.out.println(max);
            
        
    }
}
