# Taller Semana 6 - B1

### Análisis del Procedimiento `misterio`

Este algoritmo realiza múltiples bucles anidados y su análisis permite deducir su complejidad temporal.

--- 

#### Código del Algoritmo

```pascal
procedure misterio(n: integer)
var
    contador, i, j, k: integer
begin
    contador := 0
    for i := 1 to n - 1 do
        for j := i + 1 to n do
            for k := 1 to j do
                contador := contador + 1
end
```

---

#### Prueba de Escritorio (n = 5)

| i | j | k (1 to j) | Iteraciones del innermost loop (contador) |
|---|---|------------|--------------------------------------------|
| 1 | 2 | 1,2        | 2                                          |
| 1 | 3 | 1,2,3      | 3                                          |
| 1 | 4 | 1,2,3,4    | 4                                          |
| 1 | 5 | 1,2,3,4,5  | 5                                          |
| 2 | 3 | 1,2,3      | 3                                          |
| 2 | 4 | 1,2,3,4    | 4                                          |
| 2 | 5 | 1,2,3,4,5  | 5                                          |
| 3 | 4 | 1,2,3,4    | 4                                          |
| 3 | 5 | 1,2,3,4,5  | 5                                          |
| 4 | 5 | 1,2,3,4,5  | 5                                          |
|   |   |            | **Total: 40**                              |

---

### Análisis de Complejidad

#### Cálculo de $T(n)$

Queremos calcular el número total de veces que se ejecuta la instrucción:

```pascal
contador := contador + 1
```

Este número depende del valor de $j$, que va de $i + 1$ hasta $n$, y por cada valor de $j$, $k$ va de $1$ hasta $j$.

Entonces:

$$
T(n) = \sum_{i=1}^{n-1} \quad \sum_{j=i+1}^{n} \quad \sum_{k=1}^{j} 1
$$

La suma más interna (sobre $k$) da $j$, entonces:

$$
T(n) = \sum_{i=1}^{n-1} \quad \sum_{j=i+1}^{n} j
$$

---

### Ejemplo con n = 5

$$
T(5) = \sum_{i=1}^{4} \quad \sum_{j=i+1}^{5} j \\
= (2 + 3 + 4 + 5) + (3 + 4 + 5) + (4 + 5) + (5) \\
= 14 + 12 + 9 + 5 = 40
$$

---

#### Función General

Podemos simplificar la suma doble como:

$$
T(n) = \sum_{i=1}^{n-1} \quad \sum_{j=i+1}^{n} j \\
= \sum_{i=1}^{n-1} \quad \left[ \frac{n(n+1)}{2} - \frac{i(i+1)}{2} \right]
$$

Esta fórmula corresponde a restar la suma de los primeros $i$ números naturales desde la suma total hasta $n$.

---

#### Complejidad Asintótica

La complejidad de este algoritmo es:

$$
\mathcal{O}(n^3)
$$

Esto se debe a que la triple anidación provoca una tasa cúbica de crecimiento en las operaciones del contador.

---

#### Resultado

- Prueba de escritorio para $n = 5$: $T(5) = 40$
- Función general de operaciones:

$$
T(n) = \sum_{i=1}^{n-1} \quad \sum_{j=i+1}^{n} j
$$

- Complejidad temporal: $\mathcal{O}(n^3)$

---
