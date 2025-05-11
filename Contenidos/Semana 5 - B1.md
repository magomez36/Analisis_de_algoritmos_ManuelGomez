# Semana 5

### Notación Omega Ω



### Notación Theta Θ



### Notación O  


---

### 1.

$$
\normalsize
\lim_{n \to \infty} \frac{f(n)}{g(n)} = c \in \mathbb{R}
$$

Entonces:

$$
\normalsize
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
