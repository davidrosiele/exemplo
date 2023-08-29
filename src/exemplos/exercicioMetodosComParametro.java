package exemplos;

public class exercicioMetodosComParametro {

    public static void main (String[] args){
        //com retorno
        System.out.println(exibirNomeEIdade (33,"Flavio"));
        System.out.println(retornarPalavra(" Teste "));
        System.out.println(retornarDobro(10));
        System.out.println(retornarNomeSobrenome("Flavio", "dias"));
        System.out.println(retornarSalario("Flavio"));
        //sem retorno
        exibirNomeEIdadesemRetorno(33,"Flavio");
        retornarPalavrasemRetorno(" Teste ");
        retornarDobrosemRetorno(10);
        retornarNomeSobrenomesemRetorno("Flavio", "dias");
        retornarSalariosemRetorno("Flavio");
    }
    public static String exibirNomeEIdade(int idade, String nome){
        return "Nome: " +nome + " - idade: "+ idade;
    }
    public static String retornarPalavra(String palavra){
        return palavra;
    }
    public static int retornarDobro(int numero){
        return numero * 2;
    }
    public static String retornarNomeSobrenome(String nome, String sobreNome){
        return nome  + " " + sobreNome;
    }
    public static double retornarSalario(String nome){
        return 2000.00;
}
//mais 5 sem retorno
    public static void exibirNomeEIdadesemRetorno(int idade, String nome){

       System.out.println("Nome: " +nome+ " - idade"+ idade);
}
    public static void retornarPalavrasemRetorno(String palavra){
        System.out.println (palavra);
    }
    public static void retornarDobrosemRetorno(int numero){
        System.out.println (numero * 2);
    }
    public static void retornarNomeSobrenomesemRetorno(String nome, String sobreNome){
        System.out.println (nome  + " " + sobreNome);
    }
    public static void retornarSalariosemRetorno(String nome){
        System.out.println (2000.00);
  }

}