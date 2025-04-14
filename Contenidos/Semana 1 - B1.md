# Semana 1
### Algoritmia elemental

La **Algoritmia** es el campo de la informática que comparte junto a las matemáticas que estudia los algoritmos, es decir, los procedimientos o instrucciones que permiten resolver problemas o realizar tareas de forma sistemática. Un algoritmo es una secuencia finita de pasos bien definidos, ejecutados en un orden específico, que llevan a la solución de un problema o a la realización de una operación particular.

### Características de un algoritmo

Un algoritmo debe cumplir con varias características importantes:
    
-   **Entrada**: Un algoritmo puede recibir uno o más valores de entrada, que son los datos sobre los cuales se realiza el cálculo.
    
-   **Salida**: Un algoritmo debe producir al menos un resultado o salida, que es el producto de la ejecución de las instrucciones.
    
-   **Eficiencia**: Un buen algoritmo debe ser eficiente en términos de tiempo y espacio, es decir, debe ejecutar sus tareas en el menor tiempo posible y con el mínimo uso de recursos.

-   **Adaptabilidad**: La adaptabilidad es especialmente importante en problemas que requieren optimización o en situaciones donde las condiciones cambian durante la ejecución.

### Tipos de algoritmos

Los algoritmos pueden clasificarse de diversas maneras según su propósito y la técnica que utilicen. Algunas clasificaciones comunes incluyen:

-   **Algoritmos de búsqueda**: Permiten encontrar un elemento dentro de una estructura de datos, como los algoritmos de búsqueda binaria o de búsqueda lineal.
    
-   **Algoritmos de ordenación**: Organizan un conjunto de datos en un orden específico, como el algoritmo de ordenación por burbuja o quicksort.

### Algoritmos de multiplicación

#### Multiplicación americana
Es utilizado tradicionalmente en algunos sistemas educativos, para realizar multiplicaciones en columnas. Este método es parecido a una multiplicacion larga, y a veces se conoce como multiplicación por descomposición o multiplicación por sucesivos pasos. Este método se basa en tomar numeros e ir multiplicandolos de derecha a izquierda y se escriben resultados intermedios.

$$
\begin{aligned}
&\ \ \ \ \ \ \ \ \ \ \ \ 981 \\
&\times \ \ \ \ \ \ 1234 \\
&\rule{2cm}{0.4pt} \\
&\ \ \ \ \ \ \ \ 3924 \\
&\ \ \ \ \ \ 2943 \\
&\ \ \ \ 1962 \\
&\ \ \ \  981 \\
&\rule{2cm}{0.4pt} \\
& \ 1210554 \\
\end{aligned}
$$

#### Multiplicación inglesa 

Es otro método tradicional de multiplicación que se emplea en algunos sistemas educativos. Aunque tiene similitudes con la multiplicación sucesiva americana, existen algunas diferencias clave en la forma en que los números son posicionados. Este método igual al anterior se basa en tomar numeros e ir multiplicandolos pero con la diferencia de ir tomandolos e ir posicionandolos de izquierda a derecha.

$$
\begin{aligned}
&\ \ \ \ \ \ \ \ \ \ \ \ 981 \\
&\times \ \ \ \ \ \ 1234 \\
&\rule{2cm}{0.4pt} \\
&\ \ \ \  981 \\
&\ \ \ \ 1962 \\
&\ \ \ \ \ \ 2943 \\
&\ \ \ \ \ \ \ \  3924 \\
&\rule{2cm}{0.4pt} \\
& \ 1210554 \\
\end{aligned}
$$

#### Multiplicación a la russe

Es un algoritmo tradicional e ingenioso para multiplicar números. Este metodo consiste en trazar dos columnas, hasta que llegue al numero uno, el numero de la izquierda sera divido por dos, ignorando el resto o el residuo y el numero de la derecha es duplicado, despues se excluyen los números de la columna de la derecha que corresponden a filas donde el número en la columna de la izquierda es par, para finalmente sumar  los números de la columna de la derecha correspondientes a las filas donde el número de la izquierda es impar. Este método lo convierte en una excelente alternativa cuando se necesita realizar multiplicaciones manualmente, especialmente cuando no se tiene acceso a herramientas modernas.

$$
\begin{array}{r|r|r}
981 	& 1.234  	& 1.234 	\\
490 	& 2.468 			\\
245 	& 4.936  	& 4.936 	\\
122 	& 9.872       			\\
61  	& 19.744   	& 19.744	\\
30  	& 39.488 	  		\\
15  	& 78.976   	& 78.976  	\\
7   	& 157.952 	& 157.952	\\
3   	& 315.904  	& 315.904 	\\
1   	& 631.808   	& {631.808}   	\\
      	&     		& \rule{1.8cm}{0.4pt} \\
      	&    	  	& \textbf{1.210.554}
\end{array}
$$

#### Importancia de los algoritmos

En conclusión, un algoritmo no solo debe ser finito, preciso y claro, sino también eficiente, correcto y adaptable. Estas características aseguran que un algoritmo no solo resuelva el problema que se le plantee, sino que lo haga de manera eficaz, comprensible y escalable. La construcción de algoritmos eficientes y robustos es crucial en la informática y la programación, ya que son la base de todo software y sistemas que usamos a diario.

En resumen, **la algoritmia** es esencial para resolver problemas de manera eficiente y estructurada, y su estudio es fundamental para entender y mejorar los sistemas computacionales que sustentan el mundo digital en el que vivimos.

---
