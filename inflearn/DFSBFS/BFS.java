package inflearn.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class Node2 {
    int data;
    Node2 lt, rt;

    public Node2(int val) {
        data = val;//1,2,3,4,5,6
        lt = rt = null; // 노드라는 클래스의 객체주소를 저장
    }

    public class Main {
        Node2 root;
        public void BFS(Node root){
            Queue<Node2> Q = new LinkedList<>();
            Q.offer(root);
            int L =0;
            while (!Q.isEmpty()){
                int len =Q.size();
                System.out.print(L+" ");
                for(int i=0; i<len; i++){
                    Node cur = Q.poll();
                    System.out.print(cur.data+ " ");
                    if(cur.lt != null) Q.offer(cur.lt);
                    if(cur.rt!=null) Q.offer(cur.rt);
                }
                L++;
                System.out.println();
            }

    }

        public static void main(String[] args) {
            Main tree = new Main();
            tree.root = new Node2(1);
            tree.root.lt = new Node2(2);
            tree.root.rt = new Node2(3);
            tree.root.lt.lt = new Node2(4);
            tree.root.lt.rt = new Node2(5);
            tree.root.rt.lt = new Node2(6);
            tree.root.rt.rt = new Node2(7);
            tree.BFS(tree.root);

        }
    }
}