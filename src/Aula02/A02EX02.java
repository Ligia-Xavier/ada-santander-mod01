package Aula02;

import java.util.Scanner;

public class A02EX02 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] frutasPromocao = {"Pera", "Laranja", "Maçã", "Tomate", "Caqui"};
        System.out.println("Frutas em Promoção: pera, laranja, maçã, tomate e caqui. \nComprando mais de 10 frutas do mesmo tipo, você paga apenas R$1,25.");

        System.out.println("Insira o nome da fruta: ");
        String fruta = scanner.nextLine();

        System.out.println("Insira a quantidade que você irá comprar dessa fruta: ");
        int quantidade = scanner.nextInt();

        double precoUnFruta;
        if (isFrutaPromocao(fruta, frutasPromocao) && quantidade > 10){
            precoUnFruta = 1.25;
        } else {
            precoUnFruta = 1.45;
        }

        double valorFinalFruta = quantidade * precoUnFruta;

        System.out.printf("Valor a pagar por %d %s(s): R$ %.2f", quantidade, fruta, valorFinalFruta);

        scanner.close();
    }
    public static boolean isFrutaPromocao(String fruta, String[] frutasPromocao){
        for (String frutaPromocao: frutasPromocao){
            if (frutaPromocao.equalsIgnoreCase(fruta)){
                return true;
            }
        }
        return false;
    }

}
