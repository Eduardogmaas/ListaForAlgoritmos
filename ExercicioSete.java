// Escreva um programa que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:


import java.util.Scanner;

public class ExercicioSete {
     public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Informe um número inteiro: ");
        x = sc.nextInt();
        sc.close();


        System.out.print(x);

        // Processamento
        for (int i = x; i != 1; ) {
            if (i % 2 == 0) {  // par
                i = i / 2;
            } else {           // ímpar
                i = 3 * i + 1;
            }

            System.out.print(" -> " + i);
        }
    }
}
