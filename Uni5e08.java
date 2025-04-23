import java.util.Scanner;

public class Uni5e08 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = teclado.nextInt();

        int menorNegativo = 0;
        int somaPositivos = 0;
        int contPositivos = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();

            if (numero < 0) {
                if (menorNegativo == 0 || numero < menorNegativo) {
                    menorNegativo = numero;
                }
            } else if (numero > 0) {
                somaPositivos += numero;
                contPositivos++;
            }
        }

        System.out.println("Menor valor negativo: " + menorNegativo);

        if (contPositivos > 0) {
            double media = (double) somaPositivos / contPositivos;
            System.out.println("Média dos números positivos: " + media);
        } else {
            System.out.println("Não há números positivos.");
        }
        teclado.close();
    }
}
