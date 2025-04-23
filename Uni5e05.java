import java.util.Scanner;

public class Uni5e05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int qtd = teclado.nextInt();
        int numero = 8;
        int soma = 0;
        for (int cont = 2; cont <= qtd; cont++) {
            System.out.print(numero + ", " + (numero + 2) + ", ");
            soma = soma + numero + (numero + 2);
            numero = numero * 2;
        }
        teclado.close();
    }

}
