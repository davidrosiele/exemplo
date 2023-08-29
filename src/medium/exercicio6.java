package medium;

public class exercicio6 {
    public static void main(String[] args) {
        String [] vetorMeses;
        vetorMeses = new String [12];
        vetorMeses[0] = "janeiro";
        vetorMeses[1] = "fevereiro";
        vetorMeses[2] = "março";
        vetorMeses[3] = "abril";
        vetorMeses[4] = "maio";
        vetorMeses[5] = "junho";
        vetorMeses[6] = "julho";
        vetorMeses[7] = "agosto";
        vetorMeses[8] = "setembro";
        vetorMeses[9] = "outubro";
        vetorMeses[10] = "novembro";
        vetorMeses[11] = "dezembro";
        int i=0;
        while (i < 12) {
            System.out.println("O mes:" + (i + 1) + "-" + vetorMeses[i]);
            i++;
        }



        }


                }
