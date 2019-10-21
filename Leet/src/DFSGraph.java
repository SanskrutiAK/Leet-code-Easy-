import java.util.Iterator;
import java.util.LinkedList;

public class DFSGraph {
    private static int numVertices = 0;
    private LinkedList<Integer> adj[];
    int s;
    DFSGraph(int numVertices){
        this.numVertices = numVertices;
        adj = new LinkedList[numVertices];
        for(int i = 0; i< this.numVertices; ++i) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int pt1, int pt2){
        adj[pt1].add(pt2);
    }

    public void treeTraversal(int vertex, boolean visited[]){

        visited[vertex] = true;
        System.out.println(vertex+"  ");

        Iterator<Integer> i = adj[vertex].listIterator();
        while (i.hasNext()){
            int n = i.next();
            if(!visited[n]){
                treeTraversal(n,visited);
            }
        }    }
    public static void main(String[] args) {

        DFSGraph bfs = new DFSGraph(4);
        boolean visited[] = new boolean[numVertices];
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 3);

        bfs.treeTraversal(2, visited);
    }
}
