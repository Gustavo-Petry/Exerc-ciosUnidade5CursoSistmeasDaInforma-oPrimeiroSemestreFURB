public class Uni5e11 {
    public static void main(String[] args) {

        int biscoitos = 1;
        int total = 1;

        for (int hora = 2; hora <= 16; hora++) {
            biscoitos = biscoitos * 3;
            total += biscoitos;
        }

        System.out.println("Total de biscoitos quebrados em 16 horas: " + total);
    }

}
