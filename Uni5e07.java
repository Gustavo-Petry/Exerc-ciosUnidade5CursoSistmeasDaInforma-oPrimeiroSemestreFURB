import java.util.Scanner;

public class Uni5e07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva um número inteiro");
        double valor = teclado.nextInt();

        System.out.println("Com quantos números reais você irá entrar?");
        double reais = teclado.nextDouble();

        double maior = valor;
        double menor = valor;

        for (int i = 1; i <= reais; i++) {
            System.out.println("Digite o " + i + " número real");
            valor = teclado.nextDouble();
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é:" + menor);
        teclado.close();
    }
}
