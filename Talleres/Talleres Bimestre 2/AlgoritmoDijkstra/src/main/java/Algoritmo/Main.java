package Algoritmo;

public class Main {
    public static void main(String[] args) {
        int numeroVertices = 6;
        Grafo grafo = new Grafo(numeroVertices);

        // Agregamos aristas dirigidas con sus pesos
        grafo.agregarArista(0, 1, 5);   // A → B
        grafo.agregarArista(0, 2, 3);   // A → C
        grafo.agregarArista(1, 3, 6);   // B → D
        grafo.agregarArista(1, 2, 2);   // B → C
        grafo.agregarArista(2, 4, 4);   // C → E
        grafo.agregarArista(2, 5, 2);   // C → F
        grafo.agregarArista(2, 3, 7);   // C → D
        grafo.agregarArista(3, 4, 1);   // D → E
        grafo.agregarArista(4, 5, 6);   // E → F

        int origen = 0;
        int[] distancias = Dijkstra.encontrarCaminosMinimos(grafo, origen);

        System.out.println("Distancias mínimas desde el nodo A:");
        for (int i = 0; i < distancias.length; i++) {
            char nodo = (char) ('A' + i);
            if (distancias[i] == Integer.MAX_VALUE) {
                System.out.println("A → " + nodo + " = ∞");
            } else {
                System.out.println("A → " + nodo + " = " + distancias[i]);
            }
        }
    }
}
