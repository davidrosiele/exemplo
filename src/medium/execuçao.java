package medium;

import javax.swing.*;

public class execuçao {
    public static void main(String[] args) {

        String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor ");
        String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor ");
        exercicio exercicio = new exercicio();// instanciando a classe exercicio
        System.out.println(exercicio.retornaValorTrocado(primeiroValor, segundoValor));//faço a chamada e valor
    }
}
