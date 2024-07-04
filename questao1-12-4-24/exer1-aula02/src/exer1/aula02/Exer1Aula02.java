package exer1.aula02;

import java.util.Scanner;

public class Exer1Aula02 {

    public static void main(String[] args) {

        //declaração das variaeis
        Scanner lerTeclado = new Scanner(System.in);
        double qtdeProduto = 0;
        double precoUnitario = 0;
        double valorSemDesconto = 0;
        double valorComDesconto = 0;
        double taxaDesconto = 0;

        //aquisicao de dados do usuario
        System.out.println("Bem vindo a loja do MAURICIO");
        System.out.println("Digite a quantidade de produto: ");
        qtdeProduto = lerTeclado.nextDouble();

        System.out.println("Digite o valor unitario:  ");
        precoUnitario = lerTeclado.nextDouble();

        //procesamento de infos.
        valorSemDesconto = qtdeProduto * precoUnitario;
        if (valorSemDesconto <= 2500) {

            System.out.println("nenhum desconto concedido!");
        } else if (valorSemDesconto > 2500 && valorSemDesconto <= 6000) {

            taxaDesconto = 4.0;
            valorComDesconto = valorSemDesconto * (1 - (taxaDesconto / 100));
            System.out.println("O valor total com com desconto de 4% aplicado eh: " + valorComDesconto);
        } else if (valorSemDesconto >= 6000 && valorSemDesconto < 10000) {

            taxaDesconto = 7.0;
            valorComDesconto = valorSemDesconto * (1 - (taxaDesconto / 100));
            System.out.println("O valor total com com desconto de 7% aplicado eh: " + valorComDesconto);
        } else if (valorSemDesconto >= 10000) {

            taxaDesconto = 11.00;
            valorComDesconto = valorSemDesconto * (1 - (taxaDesconto / 100));
            System.out.println("O valor total com com desconto de 11% aplicado eh: " + valorComDesconto);
        } else {

            System.out.println("Valor nao reconhecido!");
        }

        //apresentacao
        System.out.println("valor unitario: " + precoUnitario);
        System.out.println("quantidade: " + qtdeProduto);
        System.out.println("o valor sem desconto e de: " + valorSemDesconto);
        System.out.println("o valor com desconto e de: " + valorComDesconto);

    }

}
