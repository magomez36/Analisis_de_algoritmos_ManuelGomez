# Semana 7

## Recurrencias
Las recurrencias en análisis de algoritmos son expresiones matemáticas que describen el tiempo de ejecución de algoritmos recursivos. En lugar de dar directamente el tiempo total que tarda un algoritmo, una recurrencia lo expresa en términos del tiempo que tarda en resolver subproblemas más pequeños.

- El tiempo de ejecución para un algoritmo recursivo está más fácilmente expresado por una expresión recursiva.
- Una relación de recurrencia define una función mediante una expresión que incluye una o más instancias (más pequeñas) de si misma. Por ejemplo: n!
- Las ecuaciones de recurrencia son utilizadas para determinar cotas asintóticas en algoritmos que presentan recursividad.

#### Solución:

- Suposiciones inteligentes
- Ecuación característica
  
#### Suposiciones inteligentes

1. Calcular los primeros valores de la recurrencia
2. Buscar una regularidad
3. Inventar una forma general
4. Demostrar por inducción matemática (u otro método).


#### Factorial en java

```java
public static long Factorial(long n) {
    if (n == 0) 
        return 1;
    else
        return n * Factorial(n-1);
}
```

$$
\large
\{ t(n) = \Bigg\\{
\begin{array}{l}
     0     & n = 0 \\
t(n-1) + 1 & n > 0
\end{array}
\\ 
\}
$$

| n |    T(n)           |   T(n)       |
|---|-------------------|--------------|
| 1 | T(1) = T(1-1) + 1 | T(0) + 1 = 1 |
| 2 | T(2) = T(2-1) + 1 | T(1) + 1 = 2 |
| 3 | T(3) = T(3-1) + 1 | T(2) + 1 = 3 |
| 4 | T(4) = T(4-1) + 1 | T(3) + 1 = 4 |
| 5 | T(5) = T(5-1) + 1 | T(4) + 1 = 5 |

$$
\large
\begin{aligned}
& = T(n - 1) + 1 \\
& = (n - 1) + 1 \\
& = n
\end{aligned}
$$

$$
\large
\begin{aligned}
t(n) = \sum_{i=1}^{n} (1) \\
\end{aligned}
$$

$$
t(n) = n
$$

---

#### Ejemplo:

$$
\large
\{ t(n) = \Bigg\\{
\begin{array}{l}
     0      & \text{si } n = 0 \\
3T(n/2) + n & \text{caso contrario}
\end{array}
\\ 
\}
$$

| n          | T(n)                              |
|------------|-------------------------------------|
| $2^0$ → 1  | 1                                   |
| $2^1$ → 2  | $3T(2/2) + 2 = 3T(1) + 2 = 5$       |
| $2^2$ → 4  | $3T(4/2) + 4 = 3T(2) + 4 = 19$      |
| $2^3$ → 8  | $3T(8/2) + 8 = 3T(4) + 8 = 65$      |
| $2^4$ → 16 | $3T(16/2) + 16 = 3T(8) + 16 = 211$  |
| $2^5$ → 32 | $3T(32/2) + 32 = 3T(16) + 32 = 665$ |

##### Recurccion:

$$
\large
\begin{aligned}
2   & = & 3 * 1 + 2 \\
2^2 & = & 3(3 * 1 + 2) + 2^2 = 3^2 * 1 + 3 * 2 + 2^2 \\
2^3 & = & 3(3^2 * 1 + 3 * 2 + 2^2) + 2^3 = 3^3 * 1 + 3^2 * 2 + 3 * 2^2 + 2^3 \\
2^4 & = & 3(3^3 * 1 + 3^2 * 2 + 3 * 2^2 + 2^3) + 2^4 = 3^4 * 1 + 3^3 * 2 + 3^2 * 2^2 + 3 * 2^3 + 2^4 
\end{aligned}
$$

$$
\large
T(2^k) = 3^k * 2^0 + 3^{k-1} * 2^1 + 3^{k-2} * 2^2 + \dots + 3^1 * 2^{k-1} + 3^0 * 2^k
$$

$$
\large
\begin{aligned}
t(n) = \sum_{i=0}^{k} 3^{k-i} 2^i = 3^k = \sum_{i=1}^{k} (2/3)^i = 3^{k+1} - 2^{k+1}
\end{aligned}
$$

---
