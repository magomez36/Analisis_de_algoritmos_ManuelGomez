package Aplicacion;

public class Main {
    public static void main(String[] args) {
        int numeroVertices = 6;

        Arista[] aristas = new Arista[10];
        aristas[0] = new Arista(0, 1, 6);  // 1-2
        aristas[1] = new Arista(0, 2, 1);  // 1-3
        aristas[2] = new Arista(0, 3, 5);  // 1-4
        aristas[3] = new Arista(1, 2, 5);  // 2-3
        aristas[4] = new Arista(1, 4, 3);  // 2-5
        aristas[5] = new Arista(2, 3, 5);  // 3-4
        aristas[6] = new Arista(2, 4, 6);  // 3-5
        aristas[7] = new Arista(2, 5, 4);  // 3-6
        aristas[8] = new Arista(3, 5, 2);  // 4-6
        aristas[9] = new Arista(4, 5, 6);  // 5-6

        Arista[] mst = Kruskal.encontrarMST(numeroVertices, aristas);

        System.out.println("Aristas del Árbol de Recubrimiento Mínimo:");
        int pesoTotal = 0;
        for (Arista a : mst) {
            System.out.println("[" + (a.origen + 1) + " - " + (a.destino + 1) + "] peso: " + a.peso);
            pesoTotal += a.peso;
        }
        System.out.println("Peso total " + pesoTotal);
    }
}
