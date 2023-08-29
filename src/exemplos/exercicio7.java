package exemplos;

import javax.swing.*;

public class exercicio7 { // inicio classe

    public static void main(String[] args) {

        double salario, inss = 0.0; // declaraçao das variaveis
        String salarioStg = "6101.07"; // Leitura da digitcão
        salario = Double.parseDouble(salarioStg);// Conversao e atribuiçao na variavel salario

        if (salario <= 1045.00) {// abertura
            inss = salario * 0.075; // 7,5%
        } //fechamento do if

        if (salario >= 1045.01 && salario <= 2089.60) {
            inss = salario * 0.9; //9%
        }
        if (salario >= 2089.61 && salario <= 3134.40) {
            inss = salario * 0.12;//12%
        }
        if (salario >= 3134.41 && salario <= 6101.06) {
            inss = salario * 0.14; //14%
        }
        if (salario >= 6101.06) {
            inss = 6101.06 * 0.14;
        }
        System.out.println("ovalor do inss a ser pago e R$ "+ inss);
    }
    }//fim da classe

