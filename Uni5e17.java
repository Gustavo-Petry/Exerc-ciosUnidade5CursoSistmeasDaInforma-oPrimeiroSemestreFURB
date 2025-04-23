import java.util.Scanner;

public class Uni5e17 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int inscricaoAtleta = 0;
        int alturaAtleta = 0;

        int atletaAlturaMaisAlto = 0;
        int atletaAlturaMaisBaixo = 0;
        int inscricaoAtletaAlto = 0;
        int inscricaoAtletaBaixo = 0;

        int atletasQtd = 0;
        int somaAlturaAtletas = 0;

        double mediaAlturaAtletas = 0;

        System.out.println("Informe a Incrição do atleta: ");

        inscricaoAtleta = teclado.nextInt();

        if (inscricaoAtleta != 0) {

            System.out.println("Informe a Altura do atleta em CM: ");
            alturaAtleta = teclado.nextInt();

            atletaAlturaMaisAlto = alturaAtleta;

            atletaAlturaMaisBaixo = alturaAtleta;

            inscricaoAtletaAlto = inscricaoAtleta;

            inscricaoAtletaBaixo = inscricaoAtleta;
        }
        System.out.println("Informe a Incrição do atleta: ");
        inscricaoAtleta = teclado.nextInt();

        while (inscricaoAtleta != 0) {
            System.out.println("Informe a Altura do atleta em CM: ");
            alturaAtleta = teclado.nextInt();
            if (alturaAtleta > atletaAlturaMaisAlto) {
                atletaAlturaMaisAlto = alturaAtleta;
                inscricaoAtletaAlto = inscricaoAtleta;
            }
            if(alturaAtleta<atletaAlturaMaisBaixo){
                atletaAlturaMaisBaixo = alturaAtleta;
                inscricaoAtletaBaixo = inscricaoAtleta;
            }
            somaAlturaAtletas += alturaAtleta;
            atletasQtd++;
            System.out.println("Informe a Incrição do atleta: ");
            inscricaoAtleta = teclado.nextInt();
        }
        mediaAlturaAtletas = somaAlturaAtletas / atletasQtd;
        System.out.println("O atleta mais baixo tem " + atletaAlturaMaisBaixo + " cm e o seu número de inscrição é: " + inscricaoAtletaBaixo);
        System.out.println("O atelta mais alto tem " + atletaAlturaMaisAlto + " cm e o seu número de inscrição é: " + inscricaoAtletaAlto);
        System.out.println("A altura média do grupo de atletas é: " + mediaAlturaAtletas + "cm");
    
        teclado.close();
    }
}
