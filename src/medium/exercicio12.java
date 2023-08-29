package medium;

import javax.swing.*;

public class exercicio12 {

    public static void main(String[] args) {
        int numeroDigitado;
        int i = 1;
        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um numero");
        numeroDigitado = Integer.parseInt(numeroDigitadoStg);

        while (i <= 100){
            numeroDigitado = numeroDigitado +2;
            System.out.println("o total somado e:"+ numeroDigitado);
            i++;
        }
        System.out.println("o total somado e:"+ numeroDigitado);
}
}
