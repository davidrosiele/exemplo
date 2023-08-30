package medium;

import javax.swing.*;

public class execuçao {
    public static void main(String[] args) {
        String numeroDigitadoStg = JOptionPane.showInputDialog("Por favor, digite um numero inteiro para calcula a tabuada:");
       int numerDigitado = Integer.parseInt(numeroDigitadoStg);
       Exercicio9 exercicio9 = new Exercicio9();
       exercicio9.calculaTabuada(numerDigitado);
        }
}