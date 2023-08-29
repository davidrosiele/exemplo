package exercicioinstanciadeclasse;

public class execuçao {
    public static void main(String[] args) {
        cachorro objcachorro = new cachorro();
        System.out.println(objcachorro.nome);
        System.out.println(objcachorro.idade);
        objcachorro.latir();
        objcachorro.pular();
        objcachorro.deitar();
    }
}
