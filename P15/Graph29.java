/*public class Graph29 {
    int vertex;
    DoubleLinkedLists29 list[];

    public Graph29(int v) {
        list = new DoubleLinkedLists29[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedLists29();
        }
    }

    public void addEdge(int source, int destination, int jarak) {// for directed graph
        list[source].addFirst(destination, jarak);
        list[destination].addFirst(source, jarak);// for undirected graph
    }

    public void degree(int source) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // in degree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source) {
                    ++totalIn;
                }
            }
            // out degree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree from Building " + (char) ('A' + source) + " : " + totalIn);
        System.out.println("OutDegree from Building " + (char) ('A' + source) + " : " + totalOut);
        System.out.println("Degree from building " + (char) ('A' + source) + " : " + (totalIn + totalOut));
        System.out.println("Degree from building" + (char) ('A' + source) + " : " + list[source].size());
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph successfully emptied");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Building " + (char) ('A' + i) + " connected with ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}*/

import java.util.*;

public class Graph29 {
    private class Edge {
        int destination, distance;

        public Edge(int destination, int distance) {
            this.destination = destination;
            this.distance = distance;
        }
    }

    private int vertex;
    private LinkedList<Edge>[] list;

    public Graph29(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination, int distance) {
        list[source].addFirst(new Edge(destination, distance));
    }

    public void removeEdge(int source, int destination) {
        list[source].removeIf(edge -> edge.destination == destination);
    }

    public void degree(int source) {
        int inDegree = 0, outDegree = list[source].size();
        for (LinkedList<Edge> edges : list) {
            for (Edge edge : edges) {
                if (edge.destination == source) {
                    inDegree++;
                }
            }
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + source) + ": " + inDegree);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + source) + ": " + outDegree);
        System.out.println("Degree dari Gedung " + (char) ('A' + source) + ": " + (inDegree + outDegree));
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (!list[i].isEmpty()) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan");
                for (Edge edge : list[i]) {
                    System.out.println((char) ('A' + edge.destination) + " (" + edge.distance + " m),");
                }
            }
        }
    }

    // modif no 5 praktikum 1 
    public boolean isConnected(int source, int destination) {
        return list[source].stream().anyMatch(edge -> edge.destination == destination);
    }
}
