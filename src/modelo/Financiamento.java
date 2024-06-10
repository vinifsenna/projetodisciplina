package modelo;

public class Financiamento {

    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public double getValorFinanciamento() {
        return calcularTotalPagamento();
    }

    public double calcularPagamentoMensal() {
        double taxaMensal = taxaJurosAnual / 12 / 100;
        int prazoMeses = prazoFinanciamento * 12;
        return (valorImovel * taxaMensal) / (1 - Math.pow(1 + taxaMensal, -prazoMeses));
    }

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamento * 12;
    }

    public void mostrarDadosFinanciamento() {
        System.out.println("Valor do imóvel: R$ " + valorImovel);
        System.out.println("Prazo do financiamento: " + prazoFinanciamento + " anos");
        System.out.println("Taxa de juros anual: " + taxaJurosAnual + "%");
        System.out.println("Valor total do financiamento: R$ " + getValorFinanciamento());
    }
}
