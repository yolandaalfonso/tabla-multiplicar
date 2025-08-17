package dev.yolanda;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        TablaMultiplicar tabla = new TablaMultiplicar();

        tabla.createTable(5);
    }
}
