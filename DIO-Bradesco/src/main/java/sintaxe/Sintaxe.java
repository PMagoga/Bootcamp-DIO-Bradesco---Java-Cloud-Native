package sintaxe;

import java.util.Scanner;

public class Sintaxe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        double transcacao1 = scanner.nextDouble();
        double transacao2 = scanner.nextDouble();
        double transacao3 = scanner.nextDouble();

        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        double saldoFinal = saldoInicial + transcacao1 + transacao2 + transacao3;
        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}
