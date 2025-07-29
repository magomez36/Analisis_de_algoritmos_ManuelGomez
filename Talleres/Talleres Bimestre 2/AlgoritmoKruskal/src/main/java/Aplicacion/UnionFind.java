package Aplicacion;

public class UnionFind {
    int[] padre;

    public UnionFind(int n) {
        padre = new int[n];
        for (int i = 0; i < n; i++) {
            padre[i] = i;
        }
    }

    public int encontrar(int x) {
        if (padre[x] != x) {
            padre[x] = encontrar(padre[x]);
        }
        return padre[x];
    }

    public void unir(int x, int y) {
        int raizX = encontrar(x);
        int raizY = encontrar(y);
        if (raizX != raizY) {
            padre[raizY] = raizX;
        }
    }

    public boolean conectados(int x, int y) {
        return encontrar(x) == encontrar(y);
    }
}
