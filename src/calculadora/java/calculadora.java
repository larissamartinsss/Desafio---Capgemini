package calculadora.java;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        double valorInvestido;
        double quantMaxVisu;

        // Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("       CALCULADORA DE ANÚNCIOS"      );
        System.out.println("------------------------------------");
        System.out.println("Digite o valor que deseja investir: ");
        valorInvestido = input.nextDouble();
        quantMaxVisu = valorInvestido*30;
        double cliques = (quantMaxVisu*0.12);
        double compartilhamento = (cliques*0.15);
        double visualCompart = (compartilhamento*40);
        double totalVisualizacao = (quantMaxVisu+visualCompart);

        // saída
        System.out.println("--" +valorInvestido+ " Reais investidos equivale a "+quantMaxVisu+ " visualizações.");
        System.out.println("-- Gerando em torno de "+cliques+ " cliques");
        System.out.println("--"+ visualCompart +" novas visualizações são geradas a partir dos compartilhamentos!");
        System.out.println("-- Total de visualizações: "+totalVisualizacao);

        // FUNCIONANDO!
    }
}
