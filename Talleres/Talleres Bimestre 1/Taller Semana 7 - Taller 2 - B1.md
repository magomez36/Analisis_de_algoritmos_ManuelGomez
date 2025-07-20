# Taller Semana 7 - Taller 2 - B1

- Codificar el algoritmo de Fibonacci
- Identificar las recurrencias
- Obtener la ecuación general
- Demostrar

## Desarrollo:

```java
public static int fibonacci(int n) {
    if (n <= 1) {
        return n; 
    }
    return fibonacci(n - 1) + fibonacci(n - 2); 
}
```

### Identificación de la Recurrencia

La definición recursiva de la serie de Fibonacci es:

```math
\large
F(n) = 
\begin{cases}
0 & \text{si } n = 0 \\
1 & \text{si } n = 1 \\
F(n-1) + F(n-2) & \text{si } n > 1
\end{cases}
```

Esta es la **relación de recurrencia** que define la serie.

### Evaluación de Términos

| n  | F(n)                                |
|----|-------------------------------------|
| 0  | 0                                   |
| 1  | 1                                   |
| 2  | $F(1) + F(0) = 1 + 0 = 1$           |
| 3  | $F(2) + F(1) = 1 + 1 = 2$           |
| 4  | $F(3) + F(2) = 2 + 1 = 3$           |
| 5  | $F(4) + F(3) = 3 + 2 = 5$           |
| 6  | $F(5) + F(4) = 5 + 3 = 8$           |
| 7  | $F(6) + F(5) = 8 + 5 = 13$          |

---

### Relación de recurrencia

La forma de expansión es:

```math
\large
\begin{aligned}
F(n) &= F(n-1) + F(n-2) \\
     &= [F(n-2) + F(n-3)] + F(n-2) \\
     &= F(n-2) + F(n-3) + F(n-2) \\
     &= 2F(n-2) + F(n-3) \\
     &= \dots
\end{aligned}
```

La expansión continúa y la cantidad de llamadas se duplica en cada paso: esto genera una complejidad exponencial.

---

### Fórmula Cerrada (Binet)

```math
\large
F(n) = \frac{(1 + \sqrt{5})^n - (1 - \sqrt{5})^n}{2^n \cdot \sqrt{5}}
```

### Demostración por Inducción

#### Paso base:

```math
\large
\begin{aligned}
F(0) = \frac{(1 + \sqrt{5})^0 - (1 - \sqrt{5})^0}{2^0 \cdot \sqrt{5}} = 0  \qquad
F(1) = \frac{(1 + \sqrt{5})^1 - (1 - \sqrt{5})^1}{2^1 \cdot \sqrt{5}} = 1
\end{aligned}
```

#### Paso inductivo:

Asumimos que:

```math
\large
F(n) = \text{fórmula cerrada}, \quad F(n - 1) = \text{fórmula cerrada}
```

Entonces:

```math
\large
F(n + 1) = F(n) + F(n - 1)
```

Al aplicar la fórmula cerrada en ambos lados, se verifica que se cumple la igualdad.

---

#### Conclusión

- La serie de Fibonacci se puede definir recursivamente con una fórmula muy simple.
- La evaluación recursiva sin optimización lleva a una complejidad exponencial.
- Existe una fórmula cerrada basada en raíces cuadradas.
- Esta fórmula se puede demostrar válida usando inducción matemática.

---
