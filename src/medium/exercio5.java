package medium;

import javax.swing.*;

public class exercio5 {//inico classe

    public static void main(String[] args) {
        int primeiroNumero, segundoNumero, terceiroNumero;
        String primeiroDigitadosgt = JOptionPane.showInputDialog("digite o primeiro numero");
        String segundoDigitadosgt = JOptionPane.showInputDialog("digite o segundo numero");
        String terceiroDigitadosgt = JOptionPane.showInputDialog("digite o terceiro numero");

        primeiroNumero= Integer.parseInt(primeiroDigitadosgt);
        segundoNumero= Integer.parseInt(segundoDigitadosgt);
        terceiroNumero= Integer.parseInt(terceiroDigitadosgt);
        System.out.println("a soma dos tres numero digitado e: " +(primeiroNumero+ segundoNumero+ terceiroNumero));
        System.out.println("a subtraçao dos tres numero digitado e: " +(primeiroNumero- segundoNumero- terceiroNumero));
        System.out.println("a multiplicaão dos tres numero digitado e: " +(primeiroNumero* segundoNumero* terceiroNumero));
        System.out.println("a media dos tres numero digitado e: " +((primeiroNumero+ segundoNumero+ terceiroNumero)/3));
    }
}//fim classe
