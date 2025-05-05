# Semana 4


## Notación Asintótica en Algoritmos

La **notación asintótica** es una herramienta fundamental en la **ciencia de la computación** para describir el comportamiento del tiempo de ejecución (o uso de memoria) de un algoritmo a medida que el tamaño de la entrada crece. Sirve para analizar el **rendimiento** de los algoritmos, especialmente cuando la entrada es muy grande.

Nos permite abstraernos de factores como la velocidad del procesador o el lenguaje de programación, centrándonos en **cómo crece la cantidad de operaciones necesarias**.

Por ejemplo, si un algoritmo realiza `3n + 5` operaciones, se considera que es `O(n)` porque los términos constantes y de menor orden son insignificantes cuando `n` es muy grande.

Depende de:

- La velocidad de la computadora
- El lenguaje de programacion
- Otros factores

---

## Tasa de Crecimiento en Algoritmos

La **tasa de crecimiento** (*growth rate*) describe cuán rápido aumenta el consumo de recursos (como tiempo o memoria) de un algoritmo en función del tamaño de la entrada `n`.

Es fundamental para:

- Estimar el rendimiento con entradas grandes.
- Comparar la eficiencia de diferentes algoritmos.
- Tomar decisiones sobre qué algoritmo implementar.

---

## ¿Por qué es importante?

Imagina que tienes tres algoritmos con diferentes tasas de crecimiento:

- Algoritmo A: O(n)
- Algoritmo B: O(n²)
- Algoritmo C: O(log n)

Veamos cómo escalan con distintos tamaños de entrada `n`:

| n      | O(log n) | O(n)  | O(n²)     |
|--------|----------|--------|-----------|
| 10     | 3        | 10     | 100       |
| 100    | 7        | 100    | 10,000    |
| 1000   | 10       | 1000   | 1,000,000 |

Esto muestra que algoritmos con una tasa de crecimiento más lenta escalan mucho mejor con entradas grandes.

---

## Tipos de Tasa de Crecimiento

A continuación se listan las tasas más comunes, de la más eficiente a la menos eficiente:

| Tasa de crecimiento   | Notación     | Ejemplo típico                  |
|-----------------------|--------------|----------------------------------|
| Constante             | O(1)         | Acceso directo a un array       |
| Logarítmica           | O(log n)     | Búsqueda binaria                |
| Lineal                | O(n)         | Búsqueda secuencial             |
| Lineal-logarítmica    | O(n log n)   | MergeSort, QuickSort            |
| Cuadrática            | O(n²)        | Ordenamiento burbuja, selección |
| Cúbica                | O(n³)        | Algoritmos de fuerza bruta      |
| Exponencial           | O(2ⁿ)        | Problemas NP-completos          |
| Factorial             | O(n!)        | Permutaciones, backtracking     |

---

## Ejemplos de Notación Asintótica en Java

### 1. Búsqueda Lineal – `O(n)`

```java
public boolean buscarElemento(int[] arreglo, int objetivo) {
    for (int elemento : arreglo) {
        if (elemento == objetivo) {
            return true;
        }
    }
    return false;
}
```

**Complejidad:** O(n)  
**Por qué:** En el peor caso, se recorre todo el arreglo.

---

### 2. Búsqueda Binaria – `O(log n)`

```java
public boolean busquedaBinaria(int[] arreglo, int objetivo) {
    int inicio = 0;
    int fin = arreglo.length - 1;

    while (inicio <= fin) {
        int medio = (inicio + fin) / 2;

        if (arreglo[medio] == objetivo) {
            return true;
        } else if (arreglo[medio] < objetivo) {
            inicio = medio + 1;
        } else {
            fin = medio - 1;
        }
    }
    return false;
}
```

**Complejidad:** O(log n)  
**Por qué:** En cada iteración, el espacio de búsqueda se reduce a la mitad.

---

### 3. Ordenamiento Burbuja – `O(n²)`

```java
public void burbuja(int[] arreglo) {
    int n = arreglo.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arreglo[j] > arreglo[j + 1]) {
                // Intercambio
                int temp = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = temp;
            }
        }
    }
}
```

**Complejidad:** O(n²)  
**Por qué:** Se realizan comparaciones anidadas.

---

### 4. Acceso Directo – `O(1)`

```java
public int obtenerElemento(int[] arreglo, int indice) {
    return arreglo[indice];
}
```

**Complejidad:** O(1)  
**Por qué:** Acceder a un índice específico es una operación constante.

---

## Conclusión

La notación asintótica permite **medir la eficiencia** de un algoritmo independientemente del hardware o del lenguaje. Es una herramienta esencial para escribir programas más rápidos y escalables.

Elegir el algoritmo adecuado puede marcar una gran diferencia cuando se trabaja con grandes cantidades de datos.
