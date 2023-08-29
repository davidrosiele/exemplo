package medium;

import javax.swing.*;

public class exercicio5 {
    public static void main(String[] args) {
        int fatorial, i;
        String fatorialDigitadoString = JOptionPane.showInputDialog("digite um numero pra calcular o fatorial");
        fatorial = Integer.parseInt(fatorialDigitadoString);
        i = fatorial;

        while (i > 1){
            fatorial = fatorial * (i - 1);
            i--;
        }//fim while
        System.out.println("O fatorial do numero digitado e "+ fatorial);
    }
}
