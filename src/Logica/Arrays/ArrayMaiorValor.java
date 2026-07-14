package Logica.Arrays;

import java.util.Scanner;

// Crie um array de 6 números (digitados pelo usuário),
// e encontre o maior valor entre eles.

public class ArrayMaiorValor {
    public static void main(String[] args) {
        Scanner dadosTeclado = new Scanner(System.in);
        int[] numeros = new int[6];
        System.out.println("Digite 6 numeros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = dadosTeclado.nextInt();
        }
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior)
                maior = numeros[i];
        }
        System.out.println("o maior entre os numeros digitados e:");
        System.out.println(maior);
    }
}
