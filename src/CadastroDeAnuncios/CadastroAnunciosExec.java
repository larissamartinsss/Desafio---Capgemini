package CadastroDeAnuncios;

import java.util.Scanner;

public class CadastroAnunciosExec {
    public static void main(String[] args) {
        CadastroDeAnuncios cadastro = new CadastroDeAnuncios();
        System.out.println("------------------------------------");
        System.out.println("         CADASTRO DE ANÚNCIOS       ");
        System.out.println("------------------------------------");
        System.out.println();

        // Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.println("Para iniciarmos o cadastro, digite os dados a seguir: ");
        System.out.println("Nome do anúncio: ");
        cadastro.nome = input.nextLine();
        System.out.println("Nome do cliente: ");
        cadastro.cliente = input.nextLine();
        System.out.println("Por favor, digite as datas no formato: dd/mm/yyyy");
        System.out.println("Data de início: ");
        cadastro.dataInicial = input.nextLine();
        System.out.println("Data de término: ");
        cadastro.dataFinal = input.nextLine();
        System.out.println("Investimento por dia: ");
        cadastro.investPorDia = input.nextDouble();

        System.out.println("------------------------------------");
        System.out.println("              RELATORIO             ");
        System.out.println("------------------------------------");

        cadastro.valorTotalInvestido = (cadastro.investPorDia * cadastro.totalDias);
        System.out.println("Valor total investido: " + cadastro.valorTotalInvestido);
        System.out.println("Quantidade máxima de cliques: " + cadastro.quantMaxClique);
        cadastro.quantMaxCompart = (cadastro.quantMaxClique * 0.15);
        System.out.println("Quantidade máxima de compartilhamentos: " + cadastro.quantMaxCompart);
        cadastro.quantMaxVisualizacao = ((cadastro.valorTotalInvestido * 30) + cadastro.quantMaxCompart * 40);
        System.out.println("Quantidade máxima de visualizações: " + cadastro.quantMaxVisualizacao);
        cadastro.quantMaxClique = (cadastro.quantMaxVisualizacao * 0.12);

        // Obs: #BUGOU# Fui até onde os meus conhecimentos de java ATUAIS me permitiram ir!
        // Obrigada pela oportunidade :D

    }

}
