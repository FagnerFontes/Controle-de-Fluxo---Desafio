

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner porta = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = porta.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = porta.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (parametroInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            porta.close();
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws parametroInvalidosException {
        if (parametroUm > parametroDois) {
            throw new parametroInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int quantidadeIteracoes = parametroDois - parametroUm;

        for (int i = 1; i <= quantidadeIteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
