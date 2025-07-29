package Aplicacion;

public class Kruskal {

    public static Arista[] encontrarMST(int numeroVertices, Arista[] aristas) {
        for (int i = 0; i < aristas.length - 1; i++) {
            for (int j = 0; j < aristas.length - i - 1; j++) {
                if (aristas[j].peso > aristas[j + 1].peso) {
                    Arista temp = aristas[j];
                    aristas[j] = aristas[j + 1];
                    aristas[j + 1] = temp;
                }
            }
        }

        UnionFind uf = new UnionFind(numeroVertices);
        Arista[] resultado = new Arista[numeroVertices - 1];
        int contador = 0;

        for (int i = 0; i < aristas.length && contador < numeroVertices - 1; i++) {
            Arista arista = aristas[i];
            if (!uf.conectados(arista.origen, arista.destino)) {
                uf.unir(arista.origen, arista.destino);
                resultado[contador] = arista;
                contador++;
            }
        }

        return resultado;
    }
}