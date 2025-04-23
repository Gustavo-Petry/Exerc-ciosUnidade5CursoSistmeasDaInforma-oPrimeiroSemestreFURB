
import java.util.Scanner;

public class Uni5e13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos reabastecimentos? ");
        int n = sc.nextInt();

        double totalKm = 0;
        double totalLitros = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Parada " + i + " - Quilometragem percorrida: ");
            double km = sc.nextDouble();

            System.out.print("Parada " + i + " - Combustível (litros): ");
            double litros = sc.nextDouble();

            double media = km / litros;
            System.out.printf("Parada %d: %.2f km por litro%n", i, media);

            totalKm += km;
            totalLitros += litros;
        }

        double mediaGeral = totalKm / totalLitros;
        System.out.printf("Quilometragem média obtida por litro: %.2f%n", mediaGeral);

        sc.close();


    }
}
