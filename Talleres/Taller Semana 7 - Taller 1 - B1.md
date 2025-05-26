# Taller Semana 7 - Taller 1 - B1

- Resolver la siguiente recurrencia:

$$
\large
\{ t(n) = \Bigg\\{
\begin{array}{l}
     0        & \text{si } n = 0 \\
2T(n = 1) + 1 & \text{si } n > 0
\end{array}
\\ 
\}
$$

#### Evaluación de Términos

| n | $t(n)$              |
|---|---------------------|
| 0 | $t(0) + 1 = 0$      |
| 1 | $2t(1 - 1) + 1 = 1$ |
| 2 | $2t(1) + 1 = 3$     |
| 3 | $2t(2) + 1 = 7$     |
| 4 | $2t(3) + 1 = 15$    |
| 5 | $2t(4) + 1 = 31$    |
| 6 | $2t(5) + 1 = 63$    |

### Solucion:

```math
\Huge
2^n - 1
```
