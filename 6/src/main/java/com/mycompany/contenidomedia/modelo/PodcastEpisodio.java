package com.mycompany.contenidomedia.modelo;

public class PodcastEpisodio extends ContenidoMedia implements DescargableOffline {
    private int numEpisodio;

    public PodcastEpisodio(String idMedia, String titulo, int duracionSeg, int numEpisodio) {
        super(idMedia, titulo, duracionSeg);
        this.numEpisodio = numEpisodio;
    }

    public PodcastEpisodio() {
        super();
    }

    @Override
    public boolean guardarEnCache() {
        if (verificarEspacioDisk()) {
            System.out.println("Podcast guardado en caché: " + getTitulo());
            return true;
        }
        System.out.println("No hay espacio suficiente para guardar: " + getTitulo());
        return false;
    }

    @Override
    public boolean verificarEspacioDisk() {
        return true;
    }

    public int getNumEpisodio() { return numEpisodio; }
    public void setNumEpisodio(int numEpisodio) { this.numEpisodio = numEpisodio; }
}
