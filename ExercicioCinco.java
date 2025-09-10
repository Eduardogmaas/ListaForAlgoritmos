// No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos, até
// 20, 30, 40. Em um determinado momento, além desse cálculo demorar, vai começar a mostrar respostas
// completamente erradas. Por quê?

public class ExercicioCinco {
    public static void main(String[] args) {
        long fatorial = 1; 

        for (int n = 1; n <= 40; n++) {
            fatorial = fatorial * n;
            System.out.println("O fatorial de " + n + " é: " + fatorial);
        }
    }
}

//Com int o erro aparece cedo, no 13!. Já com long, o erro aparece depois no 21!.