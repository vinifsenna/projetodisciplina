package util;

import java.util.Scanner;

public class InterfaceUsuario {

    private Scanner input;

    public InterfaceUsuario() {
        this.input = new Scanner(System.in);
    }

    public double pedirValorImovel() {
        double valorImovel;
        do {
            System.out.print("Valor do imóvel: ");
            valorImovel = input.nextDouble();
            if (valorImovel <= 0) {
                System.out.println("Erro: O valor do imóvel deve ser positivo.");
            }
        } while (valorImovel <= 0);
        return valorImovel;
    }

    public int pedirPrazoFinanciamento() {
        int prazoFinanciamento;
        do {
            System.out.print("Prazo do financiamento (em anos): ");
            prazoFinanciamento = input.nextInt();
            if (prazoFinanciamento <= 0) {
                System.out.println("Erro: O prazo do financiamento deve ser positivo.");
            }
        } while (prazoFinanciamento <= 0);
        return prazoFinanciamento;
    }

    public double pedirTaxaJuros() {
        double taxaJuros;
        do {
            System.out.print("Taxa de juros anual (%): ");
            taxaJuros = input.nextDouble();
            if (taxaJuros <= 0) {
                System.out.println("Erro: A taxa de juros deve ser positiva.");
            }
        } while (taxaJuros <= 0);
        return taxaJuros;
    }
}
