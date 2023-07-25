package Aula06;

/*Aula 06 Exercicio 01
Uma empresa vende o mesmo produto para 3 diferentes estados.
Cada estado possui uma taxa diferente de imposto sobre o produto
(MG 7%; SP 12%; RJ 15%;). Faça um programa que recebe o valor
do produto e o estado de destino do produto e, então,
calcule o preço final do produto acrescido do imposto
baseado no estado em que ele será vendido.

Considerar as seguintes restrições quanto a entrada e saída dos dados:

Fazer um arredondamento de 4 casas no valor final do produto*/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class A06EX01 {
    public static void main(String[] args) {

        System.out.println(valorProdutoFinal(250.10, Estado.MG) == 267.607);
        System.out.println(valorProdutoFinal(250.10, Estado.RJ) == 287.615);
        System.out.println(valorProdutoFinal(250.10, Estado.SP) == 280.112);
    }

    public static double valorProdutoFinal(double valorProduto, Estado estado) {
        double finalPrice = valorProduto * (estado.getTax() + 1);
        return arredondar(finalPrice);
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }

    public enum Estado {
        MG(0.07), SP(0.12), RJ(0.15);

        private double tax;

        Estado(double tax) {
            this.tax = tax;
        }

        public double getTax() {
            return tax;
        }
    }
}