public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 10;
        int noEdges = 11;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "Mycko";
        myGraph.edge[0].dest = "Du";

        // Edge 2
        myGraph.edge[1].src = "Mycko";
        myGraph.edge[1].dest = "Neil";

        // Edge 3
        myGraph.edge[2].src = "Mycko";
        myGraph.edge[2].dest = "Ron";

        // Edge 4
        myGraph.edge[3].src = "Neil";
        myGraph.edge[3].dest = "Du";

        // Edge 5
        myGraph.edge[4].src = "Neil";
        myGraph.edge[4].dest = "Borris";

        // Edge 6
        myGraph.edge[5].src = "Borris";
        myGraph.edge[5].dest = "Joven";

        // Edge 7
        myGraph.edge[6].src = "Joven";
        myGraph.edge[6].dest = "Du";

        // Edge 8
        myGraph.edge[7].src = "Joven";
        myGraph.edge[7].dest = "Borris";

        // Edge 9
        myGraph.edge[8].src = "Joven";
        myGraph.edge[8].dest = "Joshua";

        // Edge 10
        myGraph.edge[9].src = "Joven";
        myGraph.edge[9].dest = "Mike";

        // Edge 11
        myGraph.edge[10].src = "Joven";
        myGraph.edge[10].dest = "Gab";

        



        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
