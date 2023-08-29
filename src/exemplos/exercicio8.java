package exemplos;

import javax.swing.*;

public class exercicio8 {

    public static void main(String[] args) {
        double salario, salarioLiquido = 0.0, impostoRenda = 0;
        String salarioStg = "4664.69";
        salario = Double.parseDouble(salarioStg);

        if (salario <= 1903.98){
            impostoRenda = 0;
            salarioLiquido = salario - impostoRenda;
        }
        if (salario >= 1903.99 && salario <= 2826.65){
            impostoRenda = (salario * 0.075) - 142.80;
            salarioLiquido = salario - impostoRenda;
        }
        if (salario >= 2826.66 && salario <= 3751.05){
            impostoRenda = (salario * 0.15) - 354.8;
            salarioLiquido = salario - impostoRenda;
        }
        if (salario >= 3751.06 && salario <= 4664.68){
            impostoRenda = (salario * 0.225) - 636.13;
            salarioLiquido = salario - impostoRenda;
        }
        if (salario > 4664.68){
            impostoRenda = (salario * 0.275) - 869.36;
            salarioLiquido = salario - impostoRenda;
        }//fim if
        System.out.println("seu salario bruto sera: R$ "+ salario);
        System.out.println("seu salario Liquido sera: R$ "+ salarioLiquido);
        System.out.println("O valor a ser pago de imposto de renda sera: R$ "+ impostoRenda);
        }
}
