# Semana 11

## Algoritmos Divide y Vencerás

### 1. Introducción
Los algoritmos de tipo "divide y vencerás" resuelven problemas dividiéndolos en subproblemas más pequeños, resolviéndolos de manera recursiva y combinando sus soluciones para obtener la solución final. Esta estrategia es eficiente para problemas como búsqueda binaria, ordenación, cálculo de la mediana, multiplicación de matrices y exponenciación.

- Búsqueda binaria
- Ordenamiento (Merge Sort, Quick Sort)
- Cálculo de la mediana
- Multiplicación de matrices (por ejemplo, algoritmo de Strassen)
- Exponenciación rápida

El patrón general consiste en tres fases:

1. **Dividir:** El problema se divide en subproblemas más pequeños.
2. **Conquistar:** Cada subproblema se resuelve recursivamente.
3. **Combinar:** Las soluciones de los subproblemas se combinan para resolver el problema original.

---

### 2. Búsqueda Binaria

La búsqueda binaria permite encontrar la posición de un elemento en un arreglo **ordenado** de manera eficiente. Se basa en comparar el elemento buscado con el valor medio del arreglo, descartando la mitad que no contiene el valor buscado.

#### 2.1 Búsqueda Secuencial (referencia comparativa)

```java

public static int Secuencial(int[] T, int x) {
    int Encontrado = -1;
    int int=0;
    While (Encontrado==-1 && i<T.lebght) {
        if (T[i]==x)
            Encontrado=i;
        i++;
    }
    return Encontrado;
}

```

#### 2.2 Búsqueda Binaria Recursiva

```java

public static int BinRec(int [] T, int i, int j, int x) {
    if (i==j)
        return i;
    int k = (i+j)/2;
    if (x<=T[K])
        return BinRec(T, i, k, x);
    else
        return BinRec(T, k+1, j, x);
}

public static int BusquedaBin(int [] T, int x) {
    int n = T.lenght;
    if (n == 0 || x>T[n-1])
        return n+1;
    else
        return BinRec(T, 0, n, x);
}

```

#### 2.3 Búsqueda Binaria Iterativa

```java

public static int BinInter(int [] T, int x) {
    int n = T.lenght
    if (x>T[n-1])
        return n+1
    int i = 0;
    int j = n;
    While (i<j) {
        int k = (i+j)/2;
        if (x<=T[K])
            j=k;
        else
            i=k+1;
    }
    return i;
}

```
---

### 3. Complejidad y eficiencia

| Tipo de búsqueda  | Mejor caso | Peor caso     | Promedio     | Complejidad temporal |
|-------------------|------------|---------------|--------------|-----------------------|
| Secuencial        | 𝛩(1)       | 𝛩(n)          | 𝛩(n/2)       | O(n)                  |
| Binaria (ordenado)| 𝛩(1)       | 𝛩(log n)      | ~𝛩(log n)    | O(log n)              |

#### Contando comparaciones:

- **Mejor caso**:  
  Solo una comparación si el elemento está justo en la posición central del arreglo.

- **Peor caso**:  
  Aproximadamente `log₂(n)` comparaciones cuando el valor está en una de las esquinas o no existe.

- **Caso promedio**:  
  Se considera alrededor de `log₂(n/2)` comparaciones.

#### Conclusión:

La búsqueda binaria es mucho más eficiente que la secuencial para arreglos ordenados, especialmente con grandes volúmenes de datos, debido a su complejidad logarítmica.

---

### 4. Consideraciones importantes

- La búsqueda binaria **requiere** que el arreglo esté previamente **ordenado**.
- Si no se encuentra el elemento, puede retornar una posición estimada donde se podría insertar manteniendo el orden.
- Es recomendable usar búsqueda binaria para estructuras inmutables o muy grandes, donde el costo de ordenar inicialmente se amortiza con múltiples búsquedas.

---

### 5. Aplicaciones típicas del paradigma Divide y Vencerás

Además de la búsqueda binaria, el enfoque divide y vencerás se aplica en algoritmos como:

- **Merge Sort (ordenamiento por mezcla)**: divide el arreglo en dos, los ordena recursivamente y luego los fusiona.
- **Quick Sort**: selecciona un pivote, particiona el arreglo, y ordena recursivamente cada parte.
- **Algoritmo de Strassen para multiplicación de matrices**: reduce el número de multiplicaciones necesarias.
- **Exponenciación rápida**: calcula potencias de un número en tiempo logarítmico, dividiendo el exponente.

---
