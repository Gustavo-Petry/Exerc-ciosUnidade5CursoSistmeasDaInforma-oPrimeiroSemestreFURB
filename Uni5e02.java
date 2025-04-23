public class Uni5e02 {
    public static void main(String[] args) {

        int somapar = 0;
        int somaimpar = 0;

        for (int numero = 1; numero <= 100; numero++) {
            if ((numero % 2) == 0) {
                somapar += numero;
            } else {
                somaimpar += numero;
            }
        }
        System.out.println("A soma de par é " + somapar);
        System.out.println("A soma de impar é " + somaimpar);
    }
  
}
