package Logica.Condicionais;// Programa que exibe a tabuada completa (0 a 10) usando for aninhado

public class TabuadaCompleta {
    public static void main(String[] args) {
        for (int numeroCalculo = 0; numeroCalculo <= 10; numeroCalculo++) {
            for (int numeroUsuario = 0; numeroUsuario <= 10; numeroUsuario++) {
                System.out.println(numeroCalculo + " x " + numeroUsuario + " = " + numeroCalculo * numeroUsuario);
            }
        }
    }
}
