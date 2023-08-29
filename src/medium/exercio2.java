package medium;

import javax.swing.*;

public class exercio2 {




    public static void main(String[] args) {
        int numerodigitado, resultado;
        String numeroDigitadoUsuario = JOptionPane.showInputDialog("digite um numero");
        numerodigitado = Integer.parseInt(numeroDigitadoUsuario);
        resultado = numerodigitado * 2;
        System.out.println("o dobro do numero digitado e: " + resultado);
        JOptionPane.showInputDialog(null,"o dobro do numero digitado e: " + resultado);
    }

}
