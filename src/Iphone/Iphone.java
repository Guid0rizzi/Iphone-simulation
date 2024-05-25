package Iphone;


import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class  Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    private String musica;
    private String url;
    public int numero;
    @Override
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

    @Override
    public String getUrl() {

        return url;
    }

    @Override
    public void exibirPagina(String url) {
        this.url = url;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo uma nova aba de pesquisa");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina "+getUrl());
    }

    @Override
    public void tocar() {
        System.out.println("Tocando "+ getMusica()+ " Tuts Tuts");
    }

    @Override
    public void pausar() {
        System.out.println("A musica "+ getMusica()+ " Pausado");
    }

    private String getMusica() {
        return musica;
    }

    @Override
    public void selecionar(String musica) {
        this.musica = musica;
    }
}
