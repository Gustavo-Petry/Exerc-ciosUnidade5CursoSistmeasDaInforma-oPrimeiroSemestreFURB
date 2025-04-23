import java.util.Scanner;

public class Uni5e16 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int altura = 0;
        double mediaAlturaMulheres = 0;
        double mediaAlturaGrupo = 0;
        int somaAlturaMulheres = 0;
        int mulheresQtd = 0;
        int somaAlturaGeral = 0;
        int geralQtd = 0;

        char genero = ' ';
        System.out.println("Informe sua altura em CM: ");
        altura = teclado.nextInt();
        // leitura deve finalizar ao ler uma alura == 0

        while (altura != 0) {

            System.out.println("Infome seu sexo: [M] Masculino [F] Feminino [O] Outro ");
            genero = teclado.next().charAt(0);
            genero = Character.toUpperCase(genero);

            if (genero == 'F') {
                somaAlturaMulheres += altura;
                mulheresQtd++;
            }
            somaAlturaGeral += altura;
            geralQtd++;

            System.out.println("Informe sua altura em CM: ");
            altura = teclado.nextInt();

        }
        mediaAlturaMulheres = somaAlturaMulheres / mulheresQtd;
        mediaAlturaGrupo = somaAlturaGeral / geralQtd;
        System.out.println("A média da altura das mulhes é: " + mediaAlturaMulheres);
        System.out.println("A média da altura do grupo é: " + mediaAlturaGrupo);
    }

}
