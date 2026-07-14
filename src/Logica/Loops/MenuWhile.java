package Logica.Loops;

import java.util.Scanner;

// Como usuário eu gostaria de ter um menu visual que seja
// navegável através de números. O menu deve ficar disponível
// enquanto eu não digitar o número 3.

public class MenuWhile {
    public static void main(String[] args) {
        Scanner DadosTeclado = new Scanner(System.in);
        int escolha = 0;
        while (escolha != 3) {
            System.out.println("1. Calcular Imposto\n" +
                    "2. Depositar Salário\n" +
                    "3. Sair");
            escolha = DadosTeclado.nextInt();
            if (escolha == 1) {
                System.out.println("Calculou imposto");
            }
            if (escolha == 2) {
                System.out.println("Depositou Salário");
            }
            if (escolha == 3) {
                System.out.println("Voce saiu do menu");
            }
        }
    }
}
