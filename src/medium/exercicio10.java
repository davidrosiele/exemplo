package medium;

public class exercicio10 {

    public static void main(String[] args) {
        double valorJuros, taxaJuros = 0.05, valorInvestimento, valorTotal;
       valorInvestimento = 1000.00;
       valorJuros = (10 * taxaJuros)* valorInvestimento;
       valorTotal = valorJuros + valorInvestimento;
       System.out.println("valor investido: R$ "+ valorInvestimento );
       System.out.println("valor Juros: R$ "+ valorJuros);
       System.out.println("valor total com juros: "+ valorTotal);


    }
}
