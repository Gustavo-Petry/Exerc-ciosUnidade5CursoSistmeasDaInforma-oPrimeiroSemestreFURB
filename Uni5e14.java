import java.util.Scanner;

public class Uni5e14 {public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        int abaixo10 = 0, entre10e20 = 0, acima20 = 0;
        double totalCompra = 0, totalVenda = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Informe o nome da mercadoria " + i + ": ");
            String nome = sc.next(); // pode trocar por nextLine() se quiser nomes compostos

            System.out.print("Preço de compra (PC): ");
            double pc = sc.nextDouble();

            System.out.print("Preço de venda (PV): ");
            double pv = sc.nextDouble();

            double lucroPercentual = (pv - pc) / pc * 100;

            if (lucroPercentual < 10) {
                abaixo10++;
            } else if (lucroPercentual <= 20) {
                entre10e20++;
            } else {
                acima20++;
            }

            totalCompra += pc;
            totalVenda += pv;
        }

        double lucroTotal = totalVenda - totalCompra;

        // Saída
        System.out.println("\nRelatório:");
        System.out.println("Mercadorias com lucro < 10%: " + abaixo10);
        System.out.println("Mercadorias com lucro entre 10% e 20%: " + entre10e20);
        System.out.println("Mercadorias com lucro > 20%: " + acima20);
        System.out.printf("Total de compra: R$ %.2f%n", totalCompra);
        System.out.printf("Total de venda: R$ %.2f%n", totalVenda);
        System.out.printf("Lucro total: R$ %.2f%n", lucroTotal);

        sc.close();
    
}
    
}
