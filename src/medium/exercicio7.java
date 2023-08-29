package medium;

import javax.swing.*;

public class exercicio7 {
    public static void main(String[] args) {
        String alunosVetor[]= new String [5];
        int numeroAlunosVetor [] = new int [5];
        int i = 0;

        while (i < 5){
            alunosVetor[i] = JOptionPane.showInputDialog("digite o nome do aluno");
            numeroAlunosVetor[i] = Integer.parseInt(JOptionPane.showInputDialog("digite o numero do aluno"));
            i++;

        }
        i=0;

        while (i < 5){
            System.out.println("nome do Aluno: "+ alunosVetor[i] + "-" + "numero do Aluno:" + numeroAlunosVetor [i]);
            i++;

        }



    }
}
