package medium;

public class exercicio3 {

    public static void main(String[] args) {
        int i=1, resultadoMultiplicacao = 1;
        while (i <= 1000){
            resultadoMultiplicacao = resultadoMultiplicacao * i;
            System.out.println("o resultado  da Multiplicacao e: "+ resultadoMultiplicacao);
            if (resultadoMultiplicacao >= 1000){
                resultadoMultiplicacao = 1;
            }
            i++;
        }//fim while
    }//fim main
    }//fim classe