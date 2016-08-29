import java.io.*;
import java.util.*;

public class Solution {
    
    /* Represents a vertex from the graph */
    static class Vertex{
        public int value;
        public Vertex[] adjacencies;
        public char color;
        
        public Vertex(int value, int tam){
            this.value = value;
            adjacencies = new Vertex[tam];
            color = 'a';
        }
    }
    
    /* Connects two element from the graph */
    public static void connect(int a, int b){
        graph[a].adjacencies[b] = graph[b];
        graph[b].adjacencies[a] = graph[a];
    }
    
    /* Disconnects two element from the graph */
    public static void disconnect(int a, int b){
        graph[a].adjacencies[b] = null;
        graph[b].adjacencies[a] = null;
    }
    
    /* Makes a BFS travel starting by the vertex received as parameter 
       indicating if that connected component has an even number of vertices */
    public static boolean bfs(int a){
        int number = 1;
        int t = 0;
        Queue<Vertex> queue = new LinkedList<>();
        graph[a].color = 'b';
        queue.add(graph[a]);
        while(!queue.isEmpty()){
            Vertex current = queue.remove();
            for(Vertex b : current.adjacencies){                
                if(b != null && b.color == 'a'){
                    b.color = 'b';
                    number++;
                    queue.add(b);
                }
            }
        }
        for(Vertex i : graph)
            if(i != null && i.color != 'a')
                i.color = 'a';
        
        return (number % 2 == 0);        
    }
    
    public static Vertex[] graph;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new Vertex[n+1];
        /* Adds the elements to the graph */
        for(int i = 1; i <= n;i++)
            graph[i] = new Vertex(i, n+1);
        /* Adds the adjacencies of the graph */
        while(m-- > 0)
            connect(sc.nextInt(), sc.nextInt());
        
        int count = 0;
        int p = 0;
        
        for(Vertex a : graph){
            if(a == null)
                continue;
            for(Vertex b : a.adjacencies){
                if(b == null)
                    continue;
                p++;
                disconnect(a.value, b.value);
                if(bfs(b.value))
                    count++;
            }
        }
        System.out.print(count);
        
    }
}
