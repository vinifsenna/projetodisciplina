package main;

import util.InterfaceUsuario;
import modelo.Financiamento;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        ArrayList<Financiamento> financiamentos = new ArrayList<>();
        financiamentos.add(new Financiamento(200000, 30, 5.0));
        financiamentos.add(new Financiamento(300000, 30, 4.0));
        financiamentos.add(new Financiamento(150000, 20, 3.5));
        financiamentos.add(new Financiamento(250000, 25, 4.5));

        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        for (Financiamento financiamento : financiamentos) {
            totalImoveis += financiamento.getValorImovel();
            totalFinanciamentos += financiamento.getValorFinanciamento();
        }

        System.out.println("Total de todos os imóveis: R$ " + totalImoveis);
        System.out.println("Total de todos os financiamentos: R$ " + totalFinanciamentos);

        double taxaJuros = interfaceUsuario.pedirTaxaJuros();
        int prazoFinanciamentoEmAnos = interfaceUsuario.pedirPrazoFinanciamento();
        double valorImovel = interfaceUsuario.pedirValorImovel();

        Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamentoEmAnos, taxaJuros);

        System.out.println("Novo financiamento adicionado:");
        novoFinanciamento.mostrarDadosFinanciamento();
    }
}
