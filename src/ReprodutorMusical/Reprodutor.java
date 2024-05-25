package ReprodutorMusical;

public class Reprodutor implements ReprodutorMusical{
    private String musica;

    public String getMusica(){
        return musica;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando "+ getMusica()+ " Tuts Tuts");
    }

    @Override
    public void pausar() {
        System.out.println("A musica "+ getMusica()+ " Pausado");
    }

    @Override
    public void selecionar(String musica) {
        this.musica = musica;
    }
}
