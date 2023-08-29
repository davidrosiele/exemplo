package medium;

import javax.swing.*;

public class exercico6 {

    public static void main(String[] args) {//inicio classe
        double nota1, nota2, resultado;
        String nota1sgt, nota2sgt;
        nota1sgt = JOptionPane.showInputDialog("por favor, digite a primeira nota: ");
        nota2sgt = JOptionPane.showInputDialog("por favor, digite a segunda nota: ");

        nota1 = Integer.parseInt(nota1sgt);
        nota2 = Integer.parseInt(nota2sgt);
        resultado = (nota1 + nota2) / 2;
        System.out.println(resultado);

        if(resultado > 5){//inicio
       System.out.println("Aprovado");
        }//fim se

        if(resultado < 5){//inicio se
            System.out.println("Reprovado");
        }//fim se

        if(resultado == 5){//inicio if
            System.out.println("Exame");

        }//fim if


        }//fim metodo
}//fim classe
