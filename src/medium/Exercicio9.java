package medium;

public class Exercicio9 {

    public void calculaTabuada(int numeroDigitado) {
        int i = 1, resultado;
        while (i <= 10) {
            resultado = numeroDigitado * i;
            System.out.println(numeroDigitado + " X " + i + " = " + resultado);
            i++; //soma do i +1 para entrar em loop infinito10
        }

    }
}//fim da classe
