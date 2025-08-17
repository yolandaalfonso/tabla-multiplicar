package dev.yolanda;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TablaMultiplicarTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }
        @Test
        void testTablaDel5() {
            // Given: una instancia de la clase TablaMultiplicar
            TablaMultiplicar tabla = new TablaMultiplicar();

            // When: generamos la tabla del 5
            tabla.createTable(5);

            // Then: el resultado impreso debe coincidir con la salida esperada
            String expectedOutput =
                    "5 x 1 = 5\n" +
                    "5 x 2 = 10\n" +
                    "5 x 3 = 15\n" +
                    "5 x 4 = 20\n" +
                    "5 x 5 = 25\n" +
                    "5 x 6 = 30\n" +
                    "5 x 7 = 35\n" +
                    "5 x 8 = 40\n" +
                    "5 x 9 = 45\n" +
                    "5 x 10 = 50\n";

            assertEquals(expectedOutput, outputStream.toString());
        }
}
