import java.util.Scanner;

public class ArrayParesImpares {
    public static void main(String[] args) {
        Scanner dadosTeclado = new Scanner(System.in);
        int[] numeros = new int[5];
        int par = 0;
        int impares = 0;
        System.out.println("Digite os numeros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = dadosTeclado.nextInt();

            if (numeros[i] % 2 == 1) {
                impares++;
            }
            else par++;
        }
        System.out.println("o numero de pares e: " + par);
        System.out.println("o numero de impares e: " + impares);
    }
}
