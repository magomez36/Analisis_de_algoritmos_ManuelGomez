package Algoritmo;

public class Grafo {
    int numeroVertices;
    int[][] matrizAdyacencia;

    public Grafo(int numeroVertices) {
        this.numeroVertices = numeroVertices;
        matrizAdyacencia = new int[numeroVertices][numeroVertices];

        for (int i = 0; i < numeroVertices; i++) {
            for (int j = 0; j < numeroVertices; j++) {
                if (i == j) {
                    matrizAdyacencia[i][j] = 0;
                } else {
                    matrizAdyacencia[i][j] = Integer.MAX_VALUE;
                }
            }
        }
    }

    public void agregarArista(int origen, int destino, int peso) {
        matrizAdyacencia[origen][destino] = peso;
    }
}
