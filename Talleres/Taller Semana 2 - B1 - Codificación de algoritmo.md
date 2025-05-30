
## Algoritmo Merge (Paso de Fusión)

### Implementación en Java

```java
public class MergeStep {

    public static void merge(int[] A, int p, int q, int r) {
        int nL = q - p + 1;
        int nR = r - q;

        int[] L = new int[nL];
        int[] R = new int[nR];

        for (int i = 0; i < nL; i++) {
            L[i] = A[p + i];
        }

        for (int j = 0; j < nR; j++) {
            R[j] = A[q + j + 1];
        }

        int i = 0, j = 0, k = p;

        while (i < nL && j < nR) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < nL) {
            A[k] = L[i];
            i++;
            k++;
        }

        while (j < nR) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 8, 1, 3, 7};
        int p = 0, q = 2, r = 5;

        merge(A, p, q, r);

        System.out.print("Arreglo fusionado: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
```

### Prueba de escritorio

#### Datos de entrada:
- A = {2, 5, 8, 1, 3, 7}
- p = 0, q = 2, r = 5

#### Variables derivadas:
- L = {2, 5, 8}
- R = {1, 3, 7}

#### Tabla de seguimiento:

| i | j | k | L[i] | R[j] | A[k] antes | A[k] después | Comentario                        |
|---|---|---|------|------|-------------|---------------|-----------------------------------|
| 0 | 0 | 0 | 2    | 1    | 2           | 1             | R[j] < L[i], copiar R[j] en A[k]  |
| 0 | 1 | 1 | 2    | 3    | 5           | 2             | L[i] < R[j], copiar L[i] en A[k]  |
| 1 | 1 | 2 | 5    | 3    | 8           | 3             | R[j] < L[i], copiar R[j] en A[k]  |
| 1 | 2 | 3 | 5    | 7    | 1           | 5             | L[i] < R[j], copiar L[i] en A[k]  |
| 2 | 2 | 4 | 8    | 7    | 3           | 7             | R[j] < L[i], copiar R[j] en A[k]  |
| 2 | 3 | 5 | 8    | -    | 7           | 8             | Copiar el resto de L a A          |

#### Resultado final:
- A = {1, 2, 3, 5, 7, 8}

### Conclusión

Este paso de fusión implementa de manera eficiente la combinación de dos subarreglos ordenados en un solo arreglo ordenado, utilizando el paradigma de dividir y conquistar. Esta técnica es la esencia del algoritmo **Merge Sort**, que garantiza una complejidad de tiempo de **O(n log n)** en el peor de los casos. El uso de arreglos temporales permite comparar y fusionar los datos sin perder información, asegurando estabilidad en el ordenamiento.
