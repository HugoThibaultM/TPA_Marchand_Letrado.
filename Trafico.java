package Juego;

/**
 * La clase Trafico representa el estado del juego de tráfico, incluyendo la posición de diferentes elementos
 * como rocas, puntos, nivel, y otros atributos relacionados con el juego.
 */
public class Trafico {
    // Posiciones iniciales de las rocas
    public static int xRoca1 = 600, yRoca1 = 700;
    public static int xRoca2 = 700, yRoca2 = 100;
    public static int xRoca3 = -20, yRoca3 = 600;
    public static int xRoca4 = 300, yRoca4 = -20;

    // Puntuación del juego
    public static int puntos = 0;

    // Referencia al objeto Juego
    public Juego game;

    // Nivel actual del juego
    public static int nivel = 1;

    // Incremento de posición de los elementos
    int incremento = 2;

    // Límites del área de juego
    int inicioY = 0;
    int inicioX = 0;
    int finY = 900;
    int finX = 700;

    /**
     * Constructor de la clase Trafico que recibe una instancia de la clase Juego.
     *
     * @param game2 El objeto Juego al que se asocia esta instancia de Trafico.
     */
    public Trafico(Juego game2) {
        this.game = game2;
    }

    /**
     * Obtiene la puntuación actual del juego.
     *
     * @return La puntuación actual.
     */
    public int obtenerPuntos() {
        return puntos;
    }
}
