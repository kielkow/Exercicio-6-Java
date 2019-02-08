package exercicio6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero:");
        numero = input.nextInt();
        System.out.println(verificarNumero(numero));
    }
    static boolean verificarNumero(int n){
        
        if(n > 0){
            return true;
        }
        return false;
           
    }
}
