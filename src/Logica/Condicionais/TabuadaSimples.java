package Logica.Condicionais;

import java.util.Scanner;

// Programa que calcule e exiba a tabuada de qualquer número (0 a 10)

public class TabuadaSimples {
    public static void main(String[] args) {
        Scanner dadosTeclado = new Scanner(System.in);
        int numeroUsuario;
        numeroUsuario = dadosTeclado.nextInt();
        for (int numeroCalculo = 0; numeroCalculo <= 10; numeroCalculo++) {
            System.out.println(numeroUsuario + " x " + numeroCalculo + " = " + numeroCalculo * numeroUsuario);
        }
    }
}
