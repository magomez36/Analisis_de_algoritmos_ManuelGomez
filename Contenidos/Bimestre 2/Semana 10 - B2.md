# Semana 10

# Algoritmos en Grafos

---

## Grafo Dirigido: Definición y Características

Un **grafo dirigido** \( G \) consiste en un conjunto de **vértices** \( V \) y un conjunto de **arcos dirigidos** \( A \).

- Los vértices se denominan **nodos** o **puntos**.
- Los arcos pueden llamarse **arcos dirigidos** o **líneas dirigidas**.
- Un **arco** es un **par ordenado** de vértices \( (v, w) \), donde:
  - \( v \) es la **cola** del arco.
  - \( w \) es la **cabeza** del arco.
- El orden en los arcos importa: \( (v, w) \neq (w, v) \).

![](https://github.com/magomez36/Analisis_de_algoritmos_ManuelGomez/blob/main/Contenidos/Recursos/Recursos%20Semana%2010/imagen%201%20-%20Semana%2010.png?raw=true)

## Representación

![](https://github.com/magomez36/Analisis_de_algoritmos_ManuelGomez/blob/main/Contenidos/Recursos/Recursos%20Semana%2010/imagen%202%20-%20Semana%2010.png?raw=true)

---

## Algoritmo de Kruskal

```plaintext
Kruskal(G):
  Inicializar un conjunto vacío T para el árbol de expansión mínima
  Inicializar un conjunto disjunto (disjoint-set) para los vértices de G
  Ordenar los arcos de G en orden creciente de peso

  Para cada arco (u, v) en el conjunto ordenado:
    Si find(u) ≠ find(v):
      Añadir (u, v) a T
      Union(u, v)

  Retornar T
```

---

## Algoritmo de Prim 

```plaintext
Prim(G, nodo_inicial):
  Crear un conjunto vacío MST (árbol de expansión mínima)
  Asignar distancia = ∞ a todos los nodos excepto nodo_inicial, que se pone en 0
  Usar una cola de prioridad Q con todos los vértices de G

  Mientras Q no esté vacía:
    u = extraer_min(Q)
    Añadir u a MST

    Para cada vecino v de u:
      Si v está en Q y peso(u, v) < distancia[v]:
        distancia[v] = peso(u, v)
        actualizar v en Q

  Retornar MST
```

---

## Algoritmo de Dijkstra  

```plaintext
Dijkstra(G, origen):
  Para cada vértice v en G:
    distancia[v] = ∞
    previo[v] = indefinido
  distancia[origen] = 0

  Crear una cola de prioridad Q con todos los vértices

  Mientras Q no esté vacía:
    u = extraer_min(Q)
    
    Para cada vecino v de u:
      alt = distancia[u] + peso(u, v)
      Si alt < distancia[v]:
        distancia[v] = alt
        previo[v] = u
        actualizar v en Q

  Retornar distancia y previo
```

---

## Algoritmo de Floyd   

```plaintext
Floyd(G):
  Crear una matriz D de distancias tal que:
    D[i][j] = peso(i, j) si hay arco de i a j
    D[i][j] = 0 si i = j
    D[i][j] = ∞ si no hay arco de i a j

  Para cada vértice k en G:
    Para cada vértice i en G:
      Para cada vértice j en G:
        Si D[i][j] > D[i][k] + D[k][j]:
          D[i][j] = D[i][k] + D[k][j]

  Retornar D
```

---
