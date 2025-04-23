import java.util.Scanner;

public class Uni5e15 {public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);

String nome = "";
double nota1=0;
double nota2=0;
double media=0;

while (!nome.equals("fim")){
    System.out.println("Entre com o nome do aluno");
    nome = teclado.next().toLowerCase();
    System.out.println("Entre com a nota1: ");
    nota1 = teclado.nextDouble();
    System.out.println("Entre com a nota2: ");
    nota2 = teclado.nextDouble();
    media = ((nota1+nota2)/2);
    System.out.println("A média do(a) "+ nome + " é: " + media);

    
}
teclado.close();

    
}
    
}
