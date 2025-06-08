# Semana 5

### Notaciones Asintóticas en Análisis de Algoritmos
El análisis de algoritmos es una parte fundamental de la informática teórica y práctica, ya que permite evaluar el rendimiento de un algoritmo independientemente de la máquina en la que se ejecute. Para describir este rendimiento, se utilizan notaciones asintóticas, las cuales permiten expresar cómo se comporta el tiempo de ejecución o el uso de recursos de un algoritmo a medida que el tamaño de la entrada crece indefinidamente. Las tres notaciones más comunes son:


### Notación Omega Ω
La notación Ω (Omega grande) se usa para describir un límite inferior del crecimiento de una función. En términos prácticos, representa el mejor caso de ejecución de un algoritmo, es decir, la menor cantidad de recursos que puede llegar a necesitar.


### Notación Theta Θ
La notación Θ (Theta) se utiliza para representar un límite ajustado o exacto del crecimiento de una función. Esto significa que la función crece a la misma velocidad que g(n), tanto desde arriba como desde abajo. Se usa para describir el comportamiento promedio o general del algoritmo cuando el mejor y el peor caso coinciden en el orden de crecimiento.


### Notación O  
La notación O (conocida como "O grande") se utiliza para describir un límite superior del crecimiento de una función. Es decir, establece una cota máxima del tiempo o espacio que un algoritmo puede consumir en función del tamaño de la entrada. Esta notación se usa comúnmente para representar el peor caso del comportamiento de un algoritmo, es decir, la mayor cantidad de recursos que puede requerir.

### Demostración:
---

### 1.

$$
\large
\lim_{n \to \infty} \frac{f(n)}{g(n)} = c \in \mathbb{R}
$$

Entonces:

$$
\large
\{ \Rightarrow \Bigg\\{
\begin{array}{l}
f(n) \in O(g(n)) \qquad f(n) \in \Omega(g(n)) \qquad f(n) \in \Theta(g(n)) \\
g(n) \in O(f(n)) \qquad g(n) \in \Omega(f(n)) \qquad g(n) \in \Theta(f(n))
\end{array}
\Bigg\\} 
\}
$$

Estas funciones se comportan igual. Se diferencian en una constante multiplicativa.

---

### 2.

$$
\large
\lim_{n \to \infty} \frac{f(n)}{g(n)} = \infty
$$

Entonces:

$$
\large
\{ \Rightarrow \Bigg\\{
\begin{array}{l}
f(n) \notin O(g(n)) \qquad f(n) \in \Omega(g(n)) \qquad f(n) \notin \Theta(g(n)) \\
g(n) \in O(f(n)) \qquad g(n) \notin \Omega(f(n)) \qquad g(n) \notin \Theta(f(n))
\end{array}
\Bigg\\} 
\}
$$

Por muy alta que sea la constante multiplicativa de $\( g(n) \)$, nunca superará a $\( f(n) \)$.

---

### 3.

$$
\large
\lim_{n \to \infty} \frac{f(n)}{g(n)} = 0
$$

Entonces:

$$
\large
\{ \Rightarrow \Bigg\\{
\begin{array}{l}
f(n) \in O(g(n)) \qquad f(n) \notin \Omega(g(n)) \qquad f(n) \notin \Theta(g(n)) \\
g(n) \notin O(f(n)) \qquad g(n) \in \Omega(f(n)) \qquad g(n) \notin \Theta(f(n))
\end{array}
\Bigg\\} 
\}
$$

$\( g(n) \)$ crece más exponencialmente que $\( f(n) \)$. Sería su cota superior.

---
