/**
* Classe que representa uma porta lógica AND com duas entradas.
*
* @author Aurio Venâncio evanilson03jose@gmail.com | deciphercode77@gmail.com
* @version 1.0
* <br>
* Copyright (C) 2024 Universidade Católica
* de Angola.
*/
public class PortaLogicaAND {
    /**
     * Variável de instância para armazenar a primeira entrada da porta.
     */
    private boolean entrada1;

    /**
     * Variável de instância para armazenar a segunda entrada da porta.
     */
    private boolean entrada2;

    /**
     * Construtor que inicializa as entradas da porta ao criar um objeto.
     *
     * @param entrada1 Valor da primeira entrada da porta.
     * @param entrada2 Valor da segunda entrada da porta.
     */
    public PortaLogicaAND(boolean entrada1, boolean entrada2) {
        this.entrada1 = entrada1;
        this.entrada2 = entrada2;
    }

    /**
     * Método para mostrar as entradas atuais da porta.
     */
    public void mostrarEntradas() {
        System.out.println("Entrada 1: " + entrada1);
        System.out.println("Entrada 2: " + entrada2);
    }

    /**
     * Método para calcular e retornar a saída da porta lógica AND.
     *
     * @return Valor resultante da operação lógica AND das duas entradas.
     */
    public boolean calcularSaida() {
        return entrada1 && entrada2;
    }

    /**
     * Método principal (main) para testar a classe.
     *
     * @param args Argumentos da linha de comando (não utilizado neste contexto).
     */
    public static void main(String[] args) {
        // Criar dois objetos da classe PortaLogicaAND com diferentes entradas
        PortaLogicaAND porta1 = new PortaLogicaAND(true, false);
        PortaLogicaAND porta2 = new PortaLogicaAND(true, true);

        // Exibir a saída para cada objeto
        System.out.println("Saída da Porta 1: " + porta1.calcularSaida());
        System.out.println("Saída da Porta 2: " + porta2.calcularSaida());
    }
}

