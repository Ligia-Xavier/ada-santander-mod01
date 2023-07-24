package Aula03;

public class A03EX01 {

    public static double custoCompra(double input){
        double precoUn;
        double valorTotal;

        if (input > 10){
            precoUn = 1.25;
        } else {
            precoUn = 1.45;
        }
        valorTotal = input * precoUn;

        return valorTotal;
    }
    public static void main(String[] args){
        double valorTotal = A03EX01.custoCompra(11);
        System.out.printf("O valor total da compra é de R$%.2f", valorTotal);
    }
}
