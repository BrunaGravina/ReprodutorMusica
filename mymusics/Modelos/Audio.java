package br.com.bruna.mymusics.Modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int curtidas;
    private int classficacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassficacao() {
        return classficacao;
    }


    public void curta() {
        System.out.println("Música curtida.");
        this.curtidas++;
    }

    public void reproduza() {
        System.out.println("Reproduzindo" + titulo);
        this.totalReproducoes++;
    }
}
