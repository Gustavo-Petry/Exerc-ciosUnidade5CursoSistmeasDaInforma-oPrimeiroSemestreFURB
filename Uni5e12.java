import java.util.Scanner;

public class Uni5e12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int n = sc.nextInt();

        int numero = 1;

        for (int linha = 1; linha <= n; linha++) { // para cada linha
            for (int i = 1; i <= linha; i++) { // para cada número na linha define o limite da  linha 
                System.out.print(numero + " ");
                numero++;
            }
            System.out.println(); // pula pra próxima linha
        }

        sc.close();

    }

}
