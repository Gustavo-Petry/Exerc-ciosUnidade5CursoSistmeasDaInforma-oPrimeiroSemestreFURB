import java.util.Scanner;

public class Uni5e06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int i = 1;
        double altura = 0;
        System.out.println("Informe a quantidade de pessoas");
        int qtdpessoas = teclado.nextInt();

        for (i = 1; i <= qtdpessoas; i++) {
            System.out.println("Digite a altura da pessoa " + i);
            altura += teclado.nextInt();
        }
        System.out.println("A média das alturas é: " + (altura / qtdpessoas));

        teclado.close();
    }

}
