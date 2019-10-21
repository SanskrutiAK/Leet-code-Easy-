import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
    private int numVertices = 0;
    private LinkedList <Integer> adj[];
    int s;
    BFS(int numVertices){
        this.numVertices = numVertices;
        adj = new LinkedList[numVertices];
        for(int i = 0; i< this.numVertices; ++i) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int pt1, int pt2){
        adj[pt1].add(pt2);
    }

    public void treeTraversal(int start){
        boolean visited[] = new boolean[numVertices];
        visited[start] = true;

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(start);

        while(queue.size()!= 0) {
            s = queue.poll();
            System.out.println(s + "  ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }


    }
    public static void main(String[] args) {

        BFS bfs = new BFS(4);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 3);

        bfs.treeTraversal(2);
    }
}

