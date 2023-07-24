package Aula04;

import java.util.Scanner;

public class A04EXTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o tamanho do lado 1 do triângulo:");
        int lado1 = scanner.nextInt();

        System.out.println("Insira o tamanho do lado 2 do triângulo:");
        int lado2 = scanner.nextInt();

        System.out.println("Insira o tamanho do lado 3 do triângulo:");
        int lado3 = scanner.nextInt();

        boolean eUmTriangulo = eUmTriangulo(lado1, lado2, lado3);

        if (eUmTriangulo) {
            System.out.println("É um triângulo.");
        } else {
            System.out.println("Não pode ser um triângulo.");
        }
    }

    public static boolean eUmTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            return false;
        } else {
            return true;
        }
    }
}
