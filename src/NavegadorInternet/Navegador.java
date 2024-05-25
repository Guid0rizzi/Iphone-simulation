package NavegadorInternet;

public class Navegador implements NavegadorInternet{
    String url;
    public String getUrl(){
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
}
