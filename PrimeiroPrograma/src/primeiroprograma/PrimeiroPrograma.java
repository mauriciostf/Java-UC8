package primeiroprograma;

import java.util.Scanner;

public class PrimeiroPrograma {

    public static void main(String[] args) {

        String nome = "";
        Scanner lerTeclado = new Scanner(System.in);

        System.out.println("Usuario, digite seu nome: ");
        nome = lerTeclado.next();
        System.out.println("O nome digitado e:" + nome);
    }
}
