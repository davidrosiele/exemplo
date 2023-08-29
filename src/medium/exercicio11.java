package medium;

public class exercicio11 {

    public static void main(String[] args) {
        double valorJuros = 0.0,taxaJuros = 0.05, valorInvestimento, valorTotal, ano = 1;
        valorInvestimento = 1000.00;


        while (ano<=10){
            valorJuros = valorJuros +(valorInvestimento* taxaJuros);
            ano = ano +1;
        }

        valorTotal = valorJuros + valorInvestimento;

        System.out.println("valor investido: R$ "+ valorInvestimento );
        System.out.println("valor Juros: R$ "+ valorJuros);
        System.out.println("valor total com juros: "+ valorTotal);
    }
}
