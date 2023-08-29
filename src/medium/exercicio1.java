package medium;

import javax.swing.*;

public class exercicio1 {
    public static void main(String[] args) {
        double valorInvestimento, taxajuros = 0.05, totalAtualizadoComjuros;
        int ano = 1, tempoInvestido = 10;
        String valordoInvestimentoStg = JOptionPane.showInputDialog("Digite um valor de investimento:");
        valorInvestimento = Integer.parseInt(valordoInvestimentoStg);
        totalAtualizadoComjuros = valorInvestimento;
        while (ano<= tempoInvestido){
            totalAtualizadoComjuros = (totalAtualizadoComjuros * taxajuros)+ totalAtualizadoComjuros;
            ano++;
        }//fim while

        System.out.println("o valor do investimento sao: "+ valorInvestimento);
        System.out.println("o valor do juros sao: "+ (totalAtualizadoComjuros - valorInvestimento));
        System.out.println("o valor do investimento: "+ totalAtualizadoComjuros);

    }//fim main
}//fim classe
