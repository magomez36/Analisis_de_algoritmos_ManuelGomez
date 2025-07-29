package Algoritmo;

public class Dijkstra {

    public static int[] encontrarCaminosMinimos(Grafo grafo, int origen) {
        int n = grafo.numeroVertices;
        int[] distancia = new int[n];
        boolean[] visitado = new boolean[n];

        for (int i = 0; i < n; i++) {
            distancia[i] = Integer.MAX_VALUE;
            visitado[i] = false;
        }

        distancia[origen] = 0;

        for (int i = 0; i < n - 1; i++) {
            int nodoMinimo = -1;
            int distanciaMinima = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                if (!visitado[j] && distancia[j] < distanciaMinima) {
                    distanciaMinima = distancia[j];
                    nodoMinimo = j;
                }
            }

            if (nodoMinimo == -1) {
                break;
            }

            visitado[nodoMinimo] = true;

            for (int vecino = 0; vecino < n; vecino++) {
                int pesoArista = grafo.matrizAdyacencia[nodoMinimo][vecino];

                if (!visitado[vecino] &&
                        pesoArista != Integer.MAX_VALUE &&
                        distancia[nodoMinimo] + pesoArista < distancia[vecino]) {

                    distancia[vecino] = distancia[nodoMinimo] + pesoArista;
                }
            }
        }

        return distancia;
    }
}
