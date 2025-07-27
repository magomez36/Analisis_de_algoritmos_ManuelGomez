# Semana 15

# Algoritmos Probabilistas

Los **algoritmos probabilistas** son algoritmos que toman decisiones basadas en la generación de números aleatorios. Se utilizan cuando una solución determinista es muy costosa o cuando es aceptable un resultado aproximado con cierta probabilidad de error.

Pueden clasificarse en dos grandes grupos:

- **Algoritmos de Monte Carlo:** Pueden dar una respuesta incorrecta con una pequeña probabilidad.
- **Algoritmos de Las Vegas:** Siempre dan la respuesta correcta, pero su tiempo de ejecución es probabilístico.

---

## Tiempo Esperado

El **tiempo esperado de ejecución** de un algoritmo probabilista se refiere al **promedio ponderado** de su tiempo de ejecución sobre todos los posibles caminos de ejecución (basados en los valores aleatorios que pueden ocurrir).

### Fórmula del tiempo esperado:

Si \( T_i \) es el tiempo de ejecución con probabilidad \( p_i \), entonces:

$$
\large
E[T] = \sum_{i} p_i \cdot T_i
$$

Este concepto es útil para comparar algoritmos cuya ejecución depende del azar, permitiendo evaluarlos con métricas estadísticas.

---

## Algoritmos Numéricos Probabilistas

Los algoritmos numéricos probabilistas se utilizan para resolver **problemas matemáticos continuos** o aproximar soluciones difíciles con precisión limitada.

### Ejemplos:

- Estimación de \( \pi \) usando puntos aleatorios en un círculo.
- Cálculo de integrales definidas por métodos de muestreo aleatorio.
- Resolución de sistemas de ecuaciones lineales grandes usando métodos iterativos probabilísticos.

---

## Algoritmos de Monte Carlo

Los **algoritmos de Monte Carlo** son algoritmos probabilistas que:

- **Pueden producir una respuesta incorrecta** con baja probabilidad.
- Ejecutan más rápido que sus equivalentes deterministas.
- Se evalúan por su **precisión y probabilidad de error aceptable**.

### Ejemplo clásico:
- Prueba de primalidad de un número (como Miller-Rabin).
- Estimación de áreas bajo curvas.

### Características:
- Fácil implementación.
- Requieren muchas ejecuciones para mayor precisión.
- Utilizan muestreo aleatorio repetido.

---

## Problemas Asociados

Aunque poderosos, los algoritmos probabilistas presentan ciertos desafíos:

- **Fiabilidad:** Algunos algoritmos pueden devolver respuestas incorrectas.
- **Reproducibilidad:** Dificultad para replicar resultados exactos debido al azar.
- **Análisis complejo:** Requieren técnicas estadísticas o probabilísticas para demostrar su eficacia.
- **Uso de recursos:** Algunos algoritmos pueden requerir gran cantidad de muestras aleatorias.

A pesar de estos problemas, son ampliamente utilizados en inteligencia artificial, simulación, gráficos computacionales, y optimización.

---
