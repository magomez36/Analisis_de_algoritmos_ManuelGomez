# Semana 9


---

## Algoritmos Voraces

Los **algoritmos voraces (greedy)** toman decisiones paso a paso seleccionando la opción que ofrece el beneficio inmediato más alto, sin considerar las consecuencias globales.

### ¿Cómo funcionan?
1. Se construye una solución desde cero.
2. En cada paso, se elige la mejor opción local disponible.
3. No se reconsideran decisiones anteriores.

### Ventajas
- **Simplicidad**: son fáciles de entender e implementar.
- **Eficiencia**: suelen ser más rápidos que otros enfoques como la programación dinámica o el backtracking.
- **Aplicación en problemas reales**: buenos para problemas de optimización como cambio de monedas, algoritmos de rutas, árboles de recubrimiento mínimo, etc.

### Desventajas
- **No garantizan soluciones óptimas** para todos los problemas.
- **Miopía algorítmica**: ignoran el efecto futuro de las decisiones actuales.
- Requieren que el problema cumpla la propiedad de subestructura óptima y elección voraz.

**Ejemplos comunes**:
- Algoritmo de Kruskal y Prim (para árboles de recubrimiento mínimo).
- Algoritmo de Dijkstra (para caminos más cortos).
- Problema del cambio de monedas (en versiones simples).

---

## Árbol de Recubrimiento Mínimo (MST - Minimum Spanning Tree)

Un **árbol de recubrimiento mínimo** de un grafo ponderado y no dirigido es un subconjunto de sus aristas que:
- Conecta todos los vértices (forma un árbol).
- Tiene el peso total mínimo posible.

**Propiedades**:
- Un grafo conectado con _n_ vértices tendrá un MST con exactamente _n - 1_ aristas.
- Puede no ser único si existen múltiples aristas con el mismo peso.

---

## Definición de Grafos

Un **grafo G(V, E)** consiste en:
- Un conjunto de **vértices (nodos)** V.
- Un conjunto de **aristas (enlaces)** E que conectan pares de vértices.

### Grafos Conexos y No Conexos
- **Conexo**: Existe al menos un camino entre cada par de vértices.
- **No conexo**: Al menos un par de vértices no está conectado.

### Grafos Dirigidos y No Dirigidos
- **Dirigido**: Las aristas tienen una dirección (representadas como pares ordenados).
- **No dirigido**: Las aristas no tienen dirección (representadas como pares no ordenados).

**Ejemplos**:
- Redes sociales (dirigidas: "seguir a alguien")
- Mapas de carreteras (no dirigidas, o dirigidas si hay sentido único).

---

## El Camino entre Dos Vértices

Un **camino** es una secuencia de vértices conectados mediante aristas.
- Puede ser simple (sin repetir vértices) o con ciclos.
- La longitud del camino se puede contar como número de aristas o suma de pesos (en grafos ponderados).

**Aplicaciones**:
- Redes de transporte, navegación, redes de computadoras, etc.

---

## Árboles

Un **árbol** es un grafo conexo, no dirigido, sin ciclos. Tiene varias propiedades útiles:
- Entre cualquier par de nodos existe exactamente un camino.
- Si tiene _n_ vértices, tiene _n - 1_ aristas.
- La eliminación de cualquier arista desconecta el grafo.

Tipos:
- Árbol raíz (uno de los nodos se define como raíz).
- Árbol binario, AVL, etc., en estructuras de datos.

---

## Grafos Ponderados

Un grafo **ponderado** asocia un valor (peso o costo) a cada arista.

### Vértices Adyacentes y Matriz de Adyacencias

- **Vértices adyacentes**: están conectados por una arista.
- **Matriz de adyacencias**: matriz cuadrada donde la posición (i,j) indica el peso de la arista entre los vértices i y j.

Ejemplo:

|     | A | B | C |
|-----|---|---|---|
| A   | 0 | 5 | 0 |
| B   | 5 | 0 | 2 |
| C   | 0 | 2 | 0 |

---

## Árboles de Recubrimiento Mínimo

### El Problema de los Caminos Mínimos

Dado un grafo ponderado, encontrar el camino de costo mínimo entre dos vértices.

**Algoritmos usados**:
- Dijkstra
- Bellman-Ford
- A*

### Algoritmo de Kruskal

#### Descripción
Algoritmo voraz para encontrar el MST de un grafo no dirigido y ponderado.

#### Función Kruskal

```pseudo
Kruskal(G):
    A = ∅
    Para cada vértice v en G:
        Crear un conjunto disjunto {v}
    Ordenar las aristas por peso ascendente
    Para cada arista (u, v) en el grafo ordenado:
        Si u y v no están en el mismo conjunto:
            Añadir (u, v) a A
            Unir los conjuntos de u y v
    Devolver A
```

#### Demostración de Kruskal

- La estrategia voraz de Kruskal garantiza que el MST siempre incluirá las aristas más ligeras posibles sin formar ciclos.
- Utiliza estructuras de **conjuntos disjuntos** para unir componentes sin crear ciclos.
- Se basa en dos propiedades: **subestructura óptima** y **elección segura**.

**Complejidad**:
- O(E log E), donde E es el número de aristas.

---
