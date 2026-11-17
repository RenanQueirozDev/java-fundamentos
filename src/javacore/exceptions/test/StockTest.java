package javacore.exceptions.test;

import javacore.exceptions.domain.Stock;

//Main: cria new Stock(100) e percorre int[] orders = {30, 80, 0, 50, -5, 20}. Para cada pedido:
//chama withdraw dentro de um try
//se funcionou, imprime Retirou N. Restante: R
//se falhou, imprime Erro: + mensagem
//use um catch para cada exceção
//ao final, imprime Estoque final: X
public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock(100);
        System.out.println("Initial stock : " + stock.getQuantity());
        int[] orders = {30, 80, 0, 50, -5, 20};
        for (int i = 0; i < orders.length; i++) {
            try {
                stock.withdraw(orders[i]);
                System.out.println("Withdrew " + orders[i] + ". Remaining: " + stock.getQuantity());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }

        }
        System.out.println("Final stock: " + stock.getQuantity());
    }
}
