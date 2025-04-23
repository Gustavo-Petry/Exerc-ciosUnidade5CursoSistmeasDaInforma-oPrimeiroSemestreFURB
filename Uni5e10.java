public class Uni5e10 {
    public static void main(String[] args) {

        int contador = 0;

        for (int i = 1; contador < 10; i++) {
            for (int divisor = 1; divisor <= i; divisor *= 10) {
                int parte1 = i / divisor;
                int parte2 = i % divisor;

                int soma = parte1 + parte2;

                if (soma * soma == i) {
                    System.out.println(i);
                    contador++;
                    break; // evita repetir o mesmo número várias vezes
                }
            }
        }
    }
}