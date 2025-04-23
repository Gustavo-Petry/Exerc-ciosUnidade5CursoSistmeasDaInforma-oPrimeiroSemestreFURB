public class Uni5e04 {public static void main(String[] args) {
    
    double numerador = 3; //numero de cima
    double denominador = 2; //numero de baixo
    double acumulador = 2;  //padrao identificado que quando essa origem é 2 e depois é somado mais 2 na origem (4) e isso é somado no denomiandor (numero de baixo)
    double soma = 0;
    
    for(int i = 1; i<= 20; i++){
        soma = soma + (numerador / denominador);
        numerador +=2;
        acumulador +=2;
        denominador +=acumulador; // acumulador origem (2)+ soma de acumulador(2), total 4
    }
    System.out.println("Soma: "+ soma);
}
    
}
