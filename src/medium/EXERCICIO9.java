package medium;

import javax.swing.*;

import static javafx.scene.input.KeyCode.X;

public class EXERCICIO9 {

    public static void main(String[] args) {
        int numeroDigitado, i =2 , resultado;
        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um numero para calcular a tabuada: ");
        numeroDigitado = Integer.parseInt(numeroDigitadoStg);

        while (i <= 10) {
            resultado = numeroDigitado * i;
            System.out.println(numeroDigitado + " X " + i + " = " + resultado);
            i++; //soma do i +1 para entrar em loop infinito10
    }

    }
}//fim da classe
