// Imprima a seguinte tabela, usando fors encadeados:
// 1
// 2 4
// 3 6 9
// 4 8 12 16
// n n*2 n*3 .... n*n

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Informe o número de linhas: ");
        int n = sc.nextInt();
        sc.close();

        // Processamento
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println(); 
        }
    }
}
