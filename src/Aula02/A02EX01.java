package Aula02;

import java.util.Scanner;

public class A02EX01 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Conversor de graus Fahrenheit para Celsius.\n Insira a temperatura em Fahrenheit (se necessário, use ponto em vez de vírgula):");

        double fahrenheit = scan.nextDouble();
        double celsius = 5 * ((fahrenheit-32)/9);
        System.out.printf("A temperatura em graus Celsius é de: %.2f%s", celsius, " C");

        scan.close();
    }

}
