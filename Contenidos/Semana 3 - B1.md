# Semana 3

### Algoritmo MERGE(A, p, q, r)

- **Objetivo:**  
  Combinar dos **subarreglos ordenados** en un solo **arreglo ordenado**.

- **¿Cómo funciona?**
  1. **Divide** el arreglo `A[p..r]` en dos partes:
     - `A[p..q]` (primer subarreglo)
     - `A[q+1..r]` (segundo subarreglo)
  2. **Copia** esos dos subarreglos en arreglos temporales `L` y `R`.
  3. **Compara** los elementos de `L` y `R` uno por uno:
     - Inserta el más pequeño en el arreglo original `A`.
  4. **Completa**:
     - Si uno de los arreglos se queda sin elementos, se copian los elementos restantes del otro arreglo.

- **¿Qué se logra?**  
  El subarreglo `A[p..r]` queda completamente **ordenado**.

---

#### Ejemplo sencillo

Supongamos que tenemos:

- `L = [2, 5, 8]`
- `R = [1, 3, 7]`

**Proceso de fusión:**
1. Compara 2 y 1 → elige 1.
2. Compara 2 y 3 → elige 2.
3. Compara 5 y 3 → elige 3.
4. Compara 5 y 7 → elige 5.
5. Compara 8 y 7 → elige 7.
6. Copia el 8 que sobra.

**Resultado final:**  
`[1, 2, 3, 5, 7, 8]`

---

#### Resumen corto

> **MERGE** toma dos listas ordenadas y las une en una sola lista ordenada comparando elemento por elemento.



```plaintext
nL = q - p + 1          // longitud de A[p : q]
nR = r - q              // longitud de A[q + 1 : r]
declarar L[0 : nL - 1] y R[0 : nR - 1] como nuevos arreglos
para i = 0 hasta nL - 1    // copiar A[p : q] en L[0 : nL - 1]
    L[i] = A[p + i]
para j = 0 hasta nR - 1    // copiar A[q + 1 : r] en R[0 : nR - 1]
    R[j] = A[q + j + 1]

i = 0                  // i indica el menor elemento restante en L
j = 0                  // j indica el menor elemento restante en R
k = p                  // k indica la posición en A que se va a llenar

// Mientras ambos arreglos L y R contengan elementos no fusionados,
// copiar el elemento no fusionado más pequeño de vuelta a A[p : r].
mientras i < nL y j < nR
    si L[i] ≤ R[j]
        A[k] = L[i]
        i = i + 1
    sino
        A[k] = R[j]
        j = j + 1
    k = k + 1

// Habiendo terminado con uno de L o R completamente, copiar
// el resto del otro al final de A[p : r].
mientras i < nL
    A[k] = L[i]
    i = i + 1
    k = k + 1

mientras j < nR
    A[k] = R[j]
    j = j + 1
    k = k + 1
