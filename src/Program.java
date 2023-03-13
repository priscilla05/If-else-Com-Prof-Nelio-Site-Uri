

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();

        if(n< 0.0 || n> 100.0){
            System.out.println("Fora de intervalo");
        }
        else if (n <= 25.0) {
            System.out.println("Intervalo [25,50]");
        } else if (n <=50.0){
            System.out.println("Intervalo (25,50]");
        } else if(n <= 75){
            System.out.println("Intervalo (50,75]");
        }else{
            System.out.println("Intervalo (75,100]");
        }
    }
}