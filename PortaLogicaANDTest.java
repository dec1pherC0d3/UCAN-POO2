import org.junit.Test;
import static org.junit.Assert.*;

public class PortaLogicaANDTest {

    @Test
    public void testarSaidaTrue() {
        PortaLogicaAND porta = new PortaLogicaAND(true, true);
        assertTrue(porta.calcularSaida());
    }

    @Test
    public void testarSaidaFalse() {
        PortaLogicaAND porta = new PortaLogicaAND(true, false);
        assertFalse(porta.calcularSaida());
    }

    @Test
    public void testarMostrarEntradas() {
        PortaLogicaAND porta = new PortaLogicaAND(false, true);
        assertEquals("Entrada 1: false\nEntrada 2: true\n", capturarSaida(porta));
    }

    // Método auxiliar para capturar a saída do System.out
    private String capturarSaida(PortaLogicaAND porta) {
        // Redefinir System.out para capturar a saída
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Chamar o método mostrarEntradas
        porta.mostrarEntradas();

        // Restaurar System.out
        System.setOut(System.out);

        return outContent.toString();
    }
}

