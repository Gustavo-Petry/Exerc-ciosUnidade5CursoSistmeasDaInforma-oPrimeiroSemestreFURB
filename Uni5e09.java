import java.util.Scanner;

public class Uni5e09 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        int n = teclado.nextInt();

        String nomes18 = "";
        int contAcima20 = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            String nome = teclado.next(); // lê apenas uma palavra

            System.out.print("Idade: ");
            int idade = teclado.nextInt();

            if (idade == 18) {
                if (!nomes18.isEmpty()) {
                    nomes18 += " e ";
                }
                nomes18 += nome;
            }

            if (idade > 20) {
                contAcima20++;
            }
        }

        System.out.println("Nomes dos alunos que tem 18 anos: " + nomes18);
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: " + contAcima20);

        teclado.close();
    }
}
