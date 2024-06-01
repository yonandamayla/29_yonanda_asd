public class GraphMatriks29 {
    int vertex;
    int[][] matrix;

    public GraphMatriks29(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void makeEdge(int source, int destination, int jarak) {
        matrix[source][destination] = jarak;
    }

    public void removeEdge(int source, int destination) {
        matrix[source][destination] = -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Building " + (char) ('A' + i) + " : ");
            for (int j = 0; j < vertex; j++) {
                if (matrix[i][j] != -1) {
                    System.out.print("Building " + (char) ('A' + j) + " (" + matrix[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public int calculateDegree(int vertex) {
        int degree = 0;
        for (int i = 0; i < this.vertex; i++) {
            if (matrix[vertex][i] != -1) {
                degree++;
            }
            if (matrix[i][vertex] != -1) {
                degree++;
            }
        }
        return degree;
    }

    public int calculateInDegree(int vertex) {
        int inDegree = 0;
        for (int i = 0; i < this.vertex; i++) {
            if (matrix[i][vertex] != -1) {
                inDegree++;
            }
        }
        return inDegree;
    }

    public int calculateOutDegree(int vertex) {
        int outDegree = 0;
        for (int i = 0; i < this.vertex; i++) {
            if (matrix[vertex][i] != -1) {
                outDegree++;
            }
        }
        return outDegree;
    }

    public boolean hasEdge(int source, int destination) {
        // Periksa apakah bobot antara source dan destination tidak nol
        return matrix[source][destination] != -1;
    }

    public void updateJarak(int source, int destination, int newWeight) {
        if (source >= 0 && source < vertex && destination >= 0 && destination < vertex) {
            matrix[source][destination] = newWeight;
        } else {
            System.out.println("Invalid source or destination");
        }
    }
    public int hitungEdge() {
        int count = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                if (matrix[i][j] != -1) {
                    count++;
                }
            }
        }
        return count;
    }
}
