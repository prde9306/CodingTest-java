package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static final Scanner scanner = new Scanner(System.in);
    

    public static void main(String[]args){
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        boolean[][]adj = new boolean[N+1][N+1];
        
        for(int i=0; i<M; i++){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            adj[u][v] = true;
            adj[v][u] = true;
        }
        
        ArrayList<Integer> dfsOrders = getDfsOrder(N, adj);
        ArrayList<Integer> bfsOrders = getBfsOrder(N, adj);
        
        printArrayList(dfsOrders);
        printArrayList(bfsOrders);
        
        
    }

    private static void printArrayList(ArrayList<Integer> dfsOrders) {
    }

    public class State {
        public final int nodeIndex;
        public final int depth;

        public State(int nodeIndex, int depth) {
            this.nodeIndex = nodeIndex;
            this.depth = depth;
        }
    }

}
