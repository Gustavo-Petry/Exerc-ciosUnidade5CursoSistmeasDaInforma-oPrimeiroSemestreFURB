public class Uni5e01{
    public static void main(String[] args) {
        
        int numero = 0;

        for(int i = 1; i<=20; i++){
            System.out.print("Digite um numero " + i + ": ");
            if((numero%2)==0){
                System.out.println("par");
            }else{
                System.out.println("Impar");
            }
        }
    }
}