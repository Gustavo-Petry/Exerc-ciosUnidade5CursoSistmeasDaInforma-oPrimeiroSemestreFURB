import java.util.Scanner;

public class Uni5e03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int termos = 100;
        int i = 1;
        double numerador = 1;
        double denominador = 1;

        double soma = 0;

        for (i = 1; i <= termos; i++) {

            soma = soma + (numerador / denominador);
            denominador += 1;
        }
        System.out.println("Soma é: " + soma);

        teclado.close();

    }

}
