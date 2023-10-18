package br.com.bruna.mymusics.principal;

import br.com.bruna.mymusics.Modelos.Musica;
import br.com.bruna.mymusics.Modelos.Podcast;
import br.com.bruna.mymusics.Modelos.Preferidas;

public class Tela {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Plastic Hearts");
        minhaMusica.setAlbum("Plastic Hearts");
        minhaMusica.setCantor("Miley Cyrus");
        minhaMusica.setGenero("Rock");

// Testando a reprodução
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduza();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curta();

        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setHost("Marcos Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduza();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curta();
        }

        Preferidas favs = new Preferidas();
        favs.analise(minhaMusica);
        favs.analise(meuPodcast);
    }

}
