# Semana 6

**Bubble Sort** (Burbuja), su análisis de complejidad, implementación en Java y prueba de escritorio.

### Pseudocódigo

```pascal
procedure burbuja (var A: array [1..n] of integer);
    // burbuja clasifica el arreglo A de menor a mayor
var
    i, j, temp: integer;
begin
    for i := 1 to n-1 do
        for j := n downto i+1 do
            if A[j-1] > A[j] then begin
                temp := A[j-1];
                A[j-1] := A[j];
                A[j] := temp;
            end
end;
```

---

### Análisis de Complejidad

$$
\sum_{i=1}^{n-1} (n - i)
= \sum_{i=1}^{n-1} n - \sum_{i=1}^{n-1} i
= n(n - 1) - \frac{(n - 1)n}{2}
= \frac{2n(n - 1)}{2} - \frac{(n - 1)n}{2}
= \frac{(n - 1)n}{2}
$$

- **Mejor caso:** $O(n)$
- **Peor caso:** $O(n^2)$
- **Promedio:** $O(n^2)$

---

### Implementación en Java

```java
public class Burbuja {

    public static void burbuja(int[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (A[j - 1] > A[j]) {
                    int temp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {5, 3, 8, 4, 2};
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        burbuja(arreglo);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arreglo);
    }

    public static void imprimirArreglo(int[] A) {
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
```

---

### Prueba de Escritorio

#### Entrada: `A = [5, 3, 8, 4, 2]`

| i | j | A[j-1] | A[j] | Comparación | Intercambio | Resultado parcial        |
|---|---|--------|------|-------------|-------------|---------------------------|
| 0 | 4 | 4      | 2    | 4 > 2       | Sí          | [5, 3, 8, 2, 4]           |
| 0 | 3 | 8      | 2    | 8 > 2       | Sí          | [5, 3, 2, 8, 4]           |
| 0 | 2 | 3      | 2    | 3 > 2       | Sí          | [5, 2, 3, 8, 4]           |
| 0 | 1 | 5      | 2    | 5 > 2       | Sí          | [2, 5, 3, 8, 4]           |
| 1 | 4 | 8      | 4    | 8 > 4       | Sí          | [2, 5, 3, 4, 8]           |
| 1 | 3 | 3      | 4    | 3 > 4       | No          | -                         |
| 1 | 2 | 5      | 3    | 5 > 3       | Sí          | [2, 3, 5, 4, 8]           |
| 2 | 4 | 4      | 8    | 4 > 8       | No          | -                         |
| 2 | 3 | 5      | 4    | 5 > 4       | Sí          | [2, 3, 4, 5, 8]           |
| 3 | 4 | 5      | 8    | 5 > 8       | No          | -                         |

#### Resultado final:
`A = [2, 3, 4, 5, 8]`

---

### Conclusión

El algoritmo de burbuja es simple, pero no es eficiente para grandes cantidades de datos. Aún así, es excelente para propósitos educativos, especialmente para introducir conceptos de algoritmos y complejidad.

---
