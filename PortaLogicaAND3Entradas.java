/**
* Classe que representa uma porta lógica AND com três entradas,
* utilizando a classe PortaLogicaAND para as duas primeiras.
*
* @author Aurio Venâncio evanilson03jose@gmail.com | deciphercode77@gmail.com
* @version 1.0
* <br>
* Copyright (C) 2024 Universidade Católica
* de Angola.
*/
public class PortaLogicaAND3Entradas {
    /**
     * Variável de instância para armazenar a porta lógica AND das duas primeiras entradas.
     */
    private PortaLogicaAND porta12;

    /**
     * Variável de instância para armazenar a terceira entrada da porta.
     */
    private boolean entrada3;

    /**
     * Construtor que inicializa as entradas da porta ao criar um objeto.
     *
     * @param entrada1 Valor da primeira entrada da porta.
     * @param entrada2 Valor da segunda entrada da porta.
     * @param entrada3 Valor da terceira entrada da porta.
     */
    public PortaLogicaAND3Entradas(boolean entrada1, boolean entrada2, boolean entrada3) {
        // Cria uma instância de PortaLogicaAND com as duas primeiras entradas
        this.porta12 = new PortaLogicaAND(entrada1, entrada2);
        // Inicializa a terceira entrada
        this.entrada3 = entrada3;
    }

    /**
     * Método para calcular e retornar a saída da porta lógica AND com três entradas.
     *
     * @return Valor resultante da operação lógica AND das três entradas.
     */
    public boolean calcularSaida() {
        // Calcula a saída da porta lógica AND para as duas primeiras entradas e a terceira entrada
        return porta12.calcularSaida() && entrada3;
    }

    /**
     * Método principal (main) para testar a classe.
     *
     * @param args Argumentos da linha de comando (não utilizado neste contexto).
     */
    public static void main(String[] args) {
        // Criar um objeto da classe PortaLogicaAND3Entradas com diferentes entradas
        PortaLogicaAND3Entradas porta3Entradas = new PortaLogicaAND3Entradas(true, true, true);

        // Exibir as entradas da porta lógica AND das duas primeiras entradas
        porta3Entradas.porta12.mostrarEntradas();
        // Exibir a terceira entrada
        System.out.println("Entrada 3: " + porta3Entradas.entrada3);
        // Exibir a saída da porta lógica AND com três entradas
        System.out.println("Saída da Porta 3 (3 entradas): " + porta3Entradas.calcularSaida());
    }
}

