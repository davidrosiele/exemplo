package medium;

import jdk.nashorn.internal.ir.WhileNode;

import javax.swing.*;


public class exercicio4 {
    public static void main(String[] args) {

        int numeroDigitado, menorNumero = 0, i = 1;
        String numerodigitadoString;

        while (i <= 5){
            numerodigitadoString = JOptionPane.showInputDialog("Digite um numero");
            numeroDigitado = Integer.parseInt(numerodigitadoString );

            if (numeroDigitado < menorNumero || i == 1) {
                menorNumero = numeroDigitado;

            }
            i++;
        }
        System.out.println("O numero: "+ menorNumero+ " e o menor.");

    }
}
