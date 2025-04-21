# Semana 2
### Principio de la induccion matematica

Es una técnica de demostración lógica muy utilizada en matemáticas, especialmente para probar afirmaciones que se aplican a todos los números naturales (o a una parte de ellos, a partir de cierto punto).

#### Tres pasos:

 - Definir el caso base
 - Hipotesis de inducción
 - Paso de inducción

$$
\large \sum_{i=1}^{n} i = \frac{n(n + 1)}{2}
$$

#### Demostrar que: 

$$
\large 1 + 2 + 3 + \dots + n = \frac{n(n + 1)}{2}
$$


#### Paso 1: Definir el caso base

$$
\large 1 = \frac{1 (1 + 1)}{2} = \frac{2}{2} = 1
$$

#### Paso 2: Hipotesis de inducción

$$
\large 1 + 2 + 3 + ... k = \frac{k (k + 1)}{2}
$$

#### Paso 3: Paso de inducción

$$
\large n = k + 1
$$

$$
\large 1 + 2 + 3 + \dots + k = \frac{k (k + 1)}{2}
$$

$$
\large 1 + 2 + 3 + \dots + k + (k + 1) = \frac{k (k + 1)}{2} + (k + 1)
$$

$$
\large = \frac{k (k + 1) + 2 (k + 1)}{2}
$$

$$
\large = \frac{(k + 1)(k + 2)}{2}
$$

##### Ejercicio Propuesto

```
for i = 1; i < n- 1; i = i + 1
    for j = i + 1; j < n; j = j + 1
        if (A[i] < A[j])
            aux = A[i]
            A[i] = A[j]
            A[j] = aux
```

##### Ejercicio Resuelto

```

```
