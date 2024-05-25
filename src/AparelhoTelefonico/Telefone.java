package AparelhoTelefonico;



public class Telefone implements AparelhoTelefonico{
    int numero;

    public int getNumero() {
        return numero;
    }


    @Override
    public void ligar(int numero) {
        this.numero = numero;
    }

    @Override
    public void atender() {
        System.out.println("Alo, vamos conversar");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixe o seu recado");
    }
}
