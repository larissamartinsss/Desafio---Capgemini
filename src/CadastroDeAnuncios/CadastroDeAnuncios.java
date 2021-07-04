package CadastroDeAnuncios;

public class CadastroDeAnuncios {
    //variaveis
    public String nome;
    public String cliente;
    public String dataInicial;
    public String dataFinal;
    public double investPorDia;
    public int totalDias;

    // variaveis para os relatorios

    public double valorTotalInvestido = (investPorDia * totalDias);
    public double quantMaxVisualizacao;
    public double quantMaxClique;
    public double quantMaxCompart = (quantMaxClique * 10);

}



