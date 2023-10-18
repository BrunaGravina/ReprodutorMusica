package br.com.bruna.mymusics.Modelos;

public class Musica extends Audio {
    private String genero;
    private String album;
    private String cantor;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    @Override
    public int getClassficacao() {
        if (this.getTotalReproducoes() > 2800) {
            return 10;
        } else {
            return 7;
        }
    }
}
