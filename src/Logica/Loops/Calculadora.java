package Logica.Loops;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner dadosTeclado = new Scanner(System.in);
        int escolha;
        double numero1;
        double numero2;
        do {
            System.out.println("PARABENS VOCE ENTROU NA CALCULADORA DO RENAN GOSTOSINHO");
            System.out.println("----------------------------------------------------");
            System.out.println("Digite um numero");
            numero1 = dadosTeclado.nextDouble();
            System.out.println("1. Somar\n" +
                    "2. Subtrair\n" +
                    "3. Multiplicar\n" +
                    "4. Dividir\n" +
                    "5. Sair");
            escolha = dadosTeclado.nextInt();
            if (escolha != 5) {
                System.out.println("Digite o outro numero para calcular");
                numero2 = dadosTeclado.nextDouble();

                if (escolha == 1) {
                    double resultado1 = numero1 + numero2;
                    System.out.println("o resultado de " + numero1 + " + " + numero2 + " e igual a " + resultado1);
                }
                if (escolha == 2) {
                    double resultado2 = numero1 - numero2;
                    System.out.println("o resultado de " + numero1 + " - " + numero2 + " e igual a " + resultado2);
                }
                if (escolha == 3) {
                    double resultado3 = numero1 * numero2;
                    System.out.println("o resultado de " + numero1 + " x " + numero2 + " e igual a " + resultado3);
                }
                if (escolha == 4) {
                    double resultado4 = numero1 / numero2;
                    System.out.println("o resultado de " + numero1 + " / " + numero2 + " e igual a " + resultado4);
                }
            }
        } while (escolha != 5);
    }
}
