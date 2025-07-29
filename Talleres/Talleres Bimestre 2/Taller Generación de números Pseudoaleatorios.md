# Generación de números Pseudoaleatorios

```java
public class GeneradorPseudoaleatorio {

    public static void main(String[] args) {
        int cantidad = 10;
        long semilla = 12345;

        GeneradorCongruencial generador = new GeneradorCongruencial(semilla);
        double[] numeros = generador.generarNumeros(cantidad);

        System.out.println("Números pseudoaleatorios generados:");
        for (double numero : numeros) {
            System.out.println(numero);
        }
    }
}

// Clase que implementa el generador congruencial lineal
class GeneradorCongruencial {
    private long multiplicador = 1664525;
    private long incremento = 1013904223;
    private long modulo = (1L << 32); // 2^32
    private long estado; // Valor actual de la secuencia

    public GeneradorCongruencial(long semilla) {
        this.estado = semilla;
    }

    public double[] generarNumeros(int cantidad) {
        double[] resultados = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            estado = (multiplicador * estado + incremento) % modulo;
            resultados[i] = (double) estado / modulo;
        }

        return resultados;
    }
}

```
