package InflearnLecture.chap07DFSBFS;

class Main{
    static int M, N, answer=0;
    static int [][]graph;
    static int [] ch;

    public void DFS(int v){
        if(v==M) return answer++;
        else{
            for(int i=1; i<=n; i++){
                if(graph[v][i]==1 && ch[i]==0){
                    ch[i]=1;
                    DFS(i);
                    ch[i]=0;
                }
            }
        }

        public static void main(String[]args){
            Main T = new Main();
            Scanner sc = new Scanner(System.in);
            int M = sc.nextInt();
            int N = sc.nextInt();

            graph = new int[n+1][n+1];
            ch = new int[n+1];

            for(int i=0; i<N; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph[a][b]=1;
            }
            ch[1]=1;
            T.DFS(1);
            System.out.println(answer);

        }
    }