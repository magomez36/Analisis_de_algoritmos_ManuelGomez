# Taller Semana 5 - B1

Dado: $f(n) = n^3 + 9n^2\log(n))$ y $g(n) = n^2\log(n)$
* Comprobar $f(n) \in O(g(n))$
* Comprobar $f(n) \notin O(n^2)$

Demostrar formalmente si existe relacion de pertenencia entre $f(n)$ y $O(g(n))$ y tambiem entre $g(n)$ y $O(f(n))$ considerando $f(n) = 2^n$ y $g(n) = 2^{2n}$ 

---

##  Parte 1: Comprobar $f(n) \in O(g(n))$

$$
\large
\begin{align*}
\lim_{n \to \infty} \frac{f(n)}{g(n)} = \frac{n^3 + 9n^2\log(n)}{n^2\log(n)} = \frac{n^3}{n^2\log(n)} + \frac{9n^2\log(n)}{n^2\log(n)} = \frac{n}{\log(n)} + 9
\end{align*}
$$

$$
\large
\begin{align*}
\lim_{n \to \infty} \left( \frac{n}{\log(n)} + 9 \right) = \infty
\end{align*}
$$

**Análisis y conclusion:**

El cociente tiende a infinito, lo que significa que \( f(n) \) crece más rápido que \( g(n) \).  
No existe una constante \( C \) que cumpla la definición de Big O.

$$
\large
\begin{align*}
\boxed{f(n) \notin O(g(n))}
\end{align*}
$$

---

##  Parte 2: Comprobar $f(n) \notin O(n^2)$

$$
\large
\begin{align*}
\lim_{n \to \infty} \frac{f(n)}{n^2} = \frac{n^3 + 9n^2\log(n)}{n^2} = n + 9\log(n)
\end{align*}
$$

$$
\large
\begin{align*}
\lim_{n \to \infty} \left(n + 9\log(n)\right) = \infty
\end{align*}
$$

**Análisis y conclusion:**

El cociente también crece sin límite.

$$
\large
\begin{align*}
\boxed{f(n) \notin O(n^2)}
\end{align*}
$$

---

##  Parte 3: ¿Existe relacion de pertenencia? 
* ### ¿Pertenece $f(n) \in O(g(n))$?
* ### ¿Pertenece $g(n) \in O(f(n))$?

Sabemos que:

$$
\large
\begin{align*}
\frac{f(n)}{g(n)} = \frac{2^n}{2^{2n}} = 2^{-n}
\end{align*}
$$

Entonces:

$$
\large
\begin{align*}
\lim_{n \to \infty} \frac{f(n)}{g(n)} = \lim_{n \to \infty} 2^{-n} = 0
\end{align*}
$$

Esto implica que $f(n)$ crece mucho más lentamente que $g(n)$.

### Conclusión 1: ✔

Existe una constante $C > 0$ tal que:

$$
\large
\begin{align*}
f(n) \leq C \cdot g(n) \quad \text{para todo } n \geq n_0
\end{align*}
$$

Por ejemplo, para $C = 1$ y $n \geq 1$:

$$
\large
\begin{align*}
2^n \leq 4^n
\end{align*}
$$

Por tanto:

$$
\large
\begin{align*}
\boxed{f(n) \in O(g(n))}
\end{align*}
$$

### Conclusión 2: ❌

Ahora analizamos:

$$
\large
\begin{align*}
\frac{g(n)}{f(n)} = \frac{4^n}{2^n} = 2^n
\end{align*}
$$

Y:

$$
\large
\begin{align*}
\lim_{n \to \infty} 2^n = \infty
\end{align*}
$$

Esto significa que no hay constante $C$ tal que $g(n) \leq C \cdot f(n)$.  
Por lo tanto:

$$
\large
\begin{align*}
\boxed{g(n) \notin O(f(n))}
\end{align*}
$$

---
