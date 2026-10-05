/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.contenidomedia;

import com.mycompany.contenidomedia.modelo.EventoEnVivo;
import com.mycompany.contenidomedia.modelo.PeliculaCinema;
import com.mycompany.contenidomedia.modelo.PodcastEpisodio;
import com.mycompany.contenidomedia.modelo.ServidorCDN;

public class ContenidoMedia {

    public static void main(String[] args) {
        PeliculaCinema pelicula = new PeliculaCinema("PEL-001", "Película de ejemplo", 7200, "Director Ejemplo");
        PodcastEpisodio podcast = new PodcastEpisodio("POD-001", "Episodio de ejemplo", 1800, 1);
        ServidorCDN servidor = new ServidorCDN("192.168.1.100", 10.0);
        EventoEnVivo evento = new EventoEnVivo("EVT-001", "Evento en vivo", 3600, 80, servidor);

        pelicula.reproducir();
        pelicula.mostrarTrailer();
        podcast.reproducir();
        podcast.guardarEnCache();
        evento.ajustarCalidadDynamic();
        servidor.balancearCarga();
    }
}
