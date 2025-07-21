# Semana 13

## Ordenación rápida (Quicksort)

---

Matriz que hay que ordenar

| 3 | 1 | 4 | 1 | 5 | 9 | 2 | 6 | 5 | 3 | 5 | 8 | 9 |
|---|---|---|---|---|---|---|---|---|---|---|---|---|

---

La matriz se particiona tomando como pivote su primer elemento, p = 3

| 3 | 1 | 4 | 1 | 5 | 9 | 2 | 6 | 5 | 3 | 5 | 8 | 9 |
|---|---|---|---|---|---|---|---|---|---|---|---|---|

---

Se busca el primer elemento mayor que el pivote (subrayado) y el último elemento no mayor que el pivote (superrayado)

| 3 | 1 | $\underline{4}$ | 1 | 5 | 9 | 2 | 6 | 5 | $\overline{3}$ | 5 | 8 | 9 |
|---|---|---|---|---|---|---|---|---|---|---|---|---|

---

Se intercambiam esos elementos

| 3 | 1 | 3 | 1 | 5 | 9 | 2 | 6 | 5 | 4 | 5 | 8 | 9 |
|---|---|---|---|---|---|---|---|---|---|---|---|---|

---

Se vuelve a explorar en ambas direcciones

| 3 | 1 | 3 | 1 | $\underline{5}$ | 9 |  $\overline{2}$ | 6 | 5 | 4 | 5 | 8 | 9 |
|---|---|---|---|---|---|---|---|---|---|---|---|---|

---

Se intercambian

| 3 | 1 | 3 | 1 | 2 | 9 | 5 | 6 | 5 | 4 | 5 | 8 | 9 |
|---|---|---|---|---|---|---|---|---|---|---|---|---|

---

Se explora

| 3 | 1 | 3 | 1 | $\overline{2}$ | $\underline{9}$ | 5 | 6 | 5 | 4 | 5 | 8 | 9 |
|---|---|---|---|---|---|---|---|---|---|---|---|---|

---

Los punteros se han cruzado (el elemento superrayado está a la izquierda del subrayado):
 se intercambia el pivote con el elemento superrayado.

| 2 | 1 | 3 | 1 | 3 | 9 | 5 | 6 | 5 | 4 | 5 | 8 | 9 |
|---|---|---|---|---|---|---|---|---|---|---|---|---|

---

La partición ya está completada. Se ordenan recursivamente las submatrices a cada lado del pivote

| 1 | 1 | 2 | 3 | 3 | 4 | 5 | 5 | 5 | 6 | 8 | 9 | 9 |
|---|---|---|---|---|---|---|---|---|---|---|---|---|

---

### Pseudocódigo

```plaintext
procedimiento quicksort(T[i..j])
    {Ordena la submatriz T[i..j] por ordern no decreciente}
    si j - i es suficiente pequeño entonces insertar(T[i..j])
    sino
        pivote(T[i..j], l)
        quicksort(T[i..l-1])
        quicksort(T[l+1..j])
```

```plaintext
prodedimiento pivote(T[i..j]; var l)
    {Permuta los elementos de la matriz T[i..j] y proporciona un valor l
     tal que, al final, i <= l <= T[k] <= p para todo i <= k < l, T[l] = p,
     y T[k] > p para todo l < k <= j, en donde p es el valor inicial de T[i]}
    p ← T[i]
    k ← i; l ← j + 1
    repetir k ← k + 1 hasta que T[k] > p o k >= j
    repetir l ← l - 1 hasta que T[l] <= p
    mientras k < l hacer
        intercambiar T[k] y T[l]
        repetir k ← k + 1 hasta que T[k] > p
        repetir l ← l - 1 hasta que T[l] <= p
    intercambiar T[i] y T[l]
```

---

#### Pivote, a la izquierda sublistas menores, y a la derecha la de los mayores

![](https://github.com/magomez36/Analisis_de_algoritmos_ManuelGomez/blob/main/Contenidos/Recursos/Recursos%20Semana%2013/imagen%201%20-%20Semana%2013.png?raw=true)

---

#### Los nodos se concatenan con los pivotes de arriba

![](https://github.com/magomez36/Analisis_de_algoritmos_ManuelGomez/blob/main/Contenidos/Recursos/Recursos%20Semana%2013/imagen%202%20-%20Semana%2013.png?raw=true)

$$
t(n) \in O (n · log n)
$$

---
