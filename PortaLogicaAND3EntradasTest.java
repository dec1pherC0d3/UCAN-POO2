import org.junit.Test;
import static org.junit.Assert.*;

public class PortaLogicaAND3EntradasTest {

    @Test
    public void testarSaidaTrue() {
        PortaLogicaAND3Entradas porta3Entradas = new PortaLogicaAND3Entradas(true, true, true);
        assertTrue(porta3Entradas.calcularSaida());
    }

    @Test
    public void testarSaidaFalse() {
        PortaLogicaAND3Entradas porta3Entradas = new PortaLogicaAND3Entradas(true, false, true);
        assertFalse(porta3Entradas.calcularSaida());
    }

    @Test
    public void testarMostrarEntradas() {
        PortaLogicaAND3Entradas porta3Entradas = new PortaLogicaAND3Entradas(false, true, false);
        assertEquals("Entrada 1: false\nEntrada 2: true\nEntrada 3: false\n", capturarSaida(porta3Entradas));
    }

    // Método auxiliar para capturar a saída do System.out
    private String capturarSaida(PortaLogicaAND3Entradas porta3Entradas) {
        // Redefinir System.out para capturar a saída
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Chamar o método mostrarEntradas
        porta3Entradas.mostrarEntradas();

        // Restaurar System.out
        System.setOut(System.out);

        return outContent.toString();
    }
}

