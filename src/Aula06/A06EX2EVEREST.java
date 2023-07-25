package Aula06;

import java.util.Scanner;
/*Enunciado: Crie uma função que receberá um array com três valores que correspondem
a possíveis lados de um triângulo. Na função, validar se os dados fornecidos formam
um triângulo. Caso afirmativo, retornar true; do contrario, retornar false.
OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
dos outros 2 lados.*/

public class A06EX2EVEREST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o tamanho do lado 1 do triângulo:");
        int[] lados = new int[3];
        lados[0] = scanner.nextInt();

        System.out.println("Insira o tamanho do lado 2 do triângulo:");
        lados[1] = scanner.nextInt();

        System.out.println("Insira o tamanho do lado 3 do triângulo:");
        lados[2] = scanner.nextInt();

        boolean eUmTriangulo = eUmTriangulo(lados);

        if (eUmTriangulo) {
            System.out.println("É um triângulo.");
        } else {
            System.out.println("Não pode ser um triângulo.");
        }
    }

    public static boolean eUmTriangulo(int[] lados) {
        if (lados[0] + lados[1] <= lados[2] || lados[0] + lados[2] <= lados[1] || lados[1] + lados[2] <= lados[0]) {
            return false;
        } else {
            return true;
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
