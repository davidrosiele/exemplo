package medium;

public class exercicio2 {
    public static void main(String[] args) {
        int i=0, soma = 0;

        while (i <= 1000){
        soma = soma + i;
        System.out.println(soma);
        i++;
        if (soma >= 1500) {
            break;
        }
        }//enquanto
    }//fim main
}//fim classe
