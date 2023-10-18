package br.com.bruna.mymusics.Modelos;

public class Preferidas {
    public void analise(Audio audio) {
        if (audio.getClassficacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado um dos tops!");
        } else {
            System.out.println(audio.getTitulo() + " é uma excelente opção para ouvir depois.");
        }
    }
}
