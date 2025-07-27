# Semana 14

## Multiplicación de matrices

```java
public static void multiplicar(int [][] a, int [][] b, int [][] c) {
    int n = a.lenght;
    for (int i=0; i<n; i++)
        for (int j=0; j<n; j++) {
            c[i][j] = 0;
            for (int k=0; k<n; k++)
                c[i][j] = c[i][j] + a[i][k]*b[k][j];
        }
}
```

$$
\large
c_{ij} = \sum_{k=1}^{n} A_{i,k} B_{k,j}  \longrightarrow \theta(n^3)
$$

## Multiplicación del algoritmo de Strassen

El **algoritmo de Strassen** es un método **más eficiente** que el método clásico de multiplicación de matrices. Fue desarrollado por **Volker Strassen en 1969** y es especialmente útil para matrices grandes.

Mientras el método tradicional tiene una complejidad de **O(n³)**, Strassen reduce esta a aproximadamente:

$$
O(n^{\log_2 7}) \approx O(n^{2.81})
$$

lo que implica menos operaciones a medida que el tamaño de la matriz crece.

---

$$
\large
A = \begin{bmatrix}
a_{1,1} & a_{1,2} \\ 
a_{2,1} & a_{2,2} \\
\\end{bmatrix}
$$

$$
\large
\text{y}
$$

$$
\large
B = \begin{bmatrix}
b_{1,1} & b_{1,2} \\ 
b_{2,1} & b_{2,2} \\
\\end{bmatrix}
$$

### Algoritmo de Strasesn

$$
\large
\begin{aligned}
M_1 &= (A_{1,1} + A_{2,2})(B_{1,1} + B_{2,2}) \\
M_2 &= (A_{2,1} + A_{2,2})B_{1,1} \\
M_3 &= A_{1,1}(B_{1,2} - B_{2,2}) \\
M_4 &= A_{2,2}(B_{2,1} - B_{1,1}) \\
M_5 &= (A_{1,1} + A_{1,2})B_{2,2} \\
M_6 &= (A_{2,1} - A_{1,1})(B_{1,1} + B_{1,2}) \\
M_7 &= (A_{1,2} - A_{2,2})(B_{2,1} + B_{2,2})
\end{aligned}
$$

$$
\large
\begin{aligned}
C_{1,1} &= M_1 + M_4 - M_5 + M_7 \\
C_{1,2} &= M_3 + M_5 \\
C_{2,1} &= M_2 + M_4 \\
C_{2,2} &= M_1 - M_2 + M_3 + M_6
\end{aligned}
$$

### Ejemplo 1

$$
\large
\begin{bmatrix}
1 & 3 \\ 
5 & 7
\end{bmatrix}
\times
\begin{bmatrix}
8 & 4 \\ 
6 & 2
\end{bmatrix}
$$

$$
\large
\longrightarrow
\begin{bmatrix}
26 & 10 \\ 
82 & 34 \\
\\end{bmatrix}
$$

---

### Ejemplo 2

$$
\large
A = \begin{bmatrix}
7 & 6 & 9 & 4 \\
8 & 5 & 3 & 2 \\
7 & 7 & 9 & 9 \\
4 & 3 & 8 & 5
\end{bmatrix}
\quad
B = \begin{bmatrix}
3 & 2 & 9 & 5 \\
7 & 5 & 6 & 4 \\
4 & 6 & 9 & 1 \\
9 & 3 & 8 & 7
\end{bmatrix}
$$

### Pasos para la multiplicación

La multiplicación de matrices consiste en calcular cada elemento de la matriz resultado multiplicando filas de la matriz A por columnas de la matriz B y sumando los productos. Para matrices cuadradas de tamaño 4x4, se procede así:

1. **Definir la matriz resultado \( C \):**

La matriz \( C \) tendrá tamaño 4x4, donde cada elemento \( c_{ij} \) se calcula como:

$$
\large
c_{ij} = \sum_{k=1}^4 a_{ik} \cdot b_{kj}
$$

Para cada fila \( i = 1,2,3,4 \) y cada columna \( j = 1,2,3,4 \).

2. **Calcular los elementos de la matriz \( C \):**

Ejemplo para el elemento \( c_{11} \) (primera fila, primera columna):

$$
\large
c_{11} = a_{11}b_{11} + a_{12}b_{21} + a_{13}b_{31} + a_{14}b_{41} = 7 \times 3 + 6 \times 7 + 9 \times 4 + 4 \times 9 = 21 + 42 + 36 + 36 = 135
$$

De manera similar, se calcula cada elemento de la matriz.

3. **Repetir para todos los elementos:**

Se calcula para todos los \( c_{ij} \), con \( i,j = 1, \ldots, 4 \).

---

### Resultado final

La matriz resultado \( C \) es:

$$
\large
C = A \times B = \begin{bmatrix}
135 & 110 & 212 & 96 \\
89 & 65 & 145 & 77 \\
187 & 130 & 258 & 135 \\
110 & 86 & 166 & 75
\end{bmatrix}
$$

---

### Resumen

- Se multiplica cada fila de A por cada columna de B.
- Se suman los productos para obtener el valor de cada elemento \( c_{ij} \).
- El resultado es una matriz del mismo tamaño, 4x4 en este caso.

---

**Nota:** El algoritmo de Strassen es otro método avanzado para multiplicar matrices más rápido que el método tradicional, especialmente para matrices grandes, pero aquí hemos aplicado la multiplicación estándar.

---
