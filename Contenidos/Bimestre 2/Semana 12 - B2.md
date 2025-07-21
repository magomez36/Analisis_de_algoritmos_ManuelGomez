# Semana 12

## Ordenación por fusión

$$
\large
\{ t(n) = \Bigg\\{
\begin{array}{l}
     c_{1}                               & n = 1 \\
 2t \left( \frac{n}{2} \right) + c_{2}n  & n > 1
\end{array}
\\ 
\}
$$

[imagen 1]

#### Ejemplo gráfico 1:

[imagen 2]

#### Ejemplo gráfico 2:

[imagen 3]

## Pseudocódigo de ordenación

```plaintext
Merge-Sort(A, p, r)
if p>= r                       // zero or one element?
    return
q= [(p + r)/2]                 // midpoint of A[p:r]
Merge-Sort(A, p, q)            // recursively sort A[p:q]
Merge-Sort(A, q + 1, r)        // recursively sort A[q + 1:r]
// Merge A[p:q] and A[q + 1:r] into A[p:r].
Merge(A, p, q, r)
```

```plaintext
Merge(A, p, q, r)              
nL = q - p + 1                 // lenght of A[p:q]
nR = r - q                     // lenght of A[q + 1:r]
let L[0:nL - 1] and R[0:nR -1] be new arrays
for i = 0 to nL - 1            // copy A[p:q] into L[0:nL - 1]
    L[i] = A[p + i]
for j = 0 to nR - 1            // copy A[q + 1:r] into R[0:nR - 1]
i = 0                          // i indexes the smallest remaining element in L
j = 0                          // j indexes the smallest remaining element in R
k = p                          // k indexes the location in A to fill
// As long as each of the arrays L and R contains an unmerged element,
//     copy the smallest unmerged element back into A[p:r]
While i < nL and j < nR
    if L[i] <= R[j]
        A[k] = L [i]
        i = i + 1
    else A[k] = R[j]
        j = j + 1
    k = k +1
// Having gone through one of L and R entirely, copy the
//     remainder of the other to the end of A[p:r]
while i < nL
    A[k] = L[i]
    i = i + 1
    k = k + 1
while j < nR
    A[k] = R[j]
    j = j + 1
    k = k + 1
```

#### Ordenar por fusión 

- T(n) n elementos
- Separar T en U y V -> tiempo lineal
- fusionar(u, V) -> tiempo lineal

[imagen 4]

#### Por consiguiente:

$$
t(n) = 2t \left( \frac{n}{2} \right) + g(n)
$$

$$
t(n) \in \theta (n · log n)
$$
