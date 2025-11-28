package com.daniidev.screenmatch.model;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Episodio {
    private Integer temporada;
    private String titulo;
    private Integer numeroEpisodio;
    private Double evaluacion;
    private LocalDate fechaDeLanzamiento;

    public Integer getTemporada() {return temporada;}
    public void setTemporada(Integer temporada) {this.temporada = temporada;}

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public Integer getNumeroEpisodio() {return numeroEpisodio;}
    public void setNumeroEpisodio(Integer numeroEpisodio) {this.numeroEpisodio = numeroEpisodio;}

    public Double getEvaluacion() {return evaluacion;}
    public void setEvaluacion(Double evaluacion) {this.evaluacion = evaluacion;}

    public LocalDate getFechaDeLanzamiento() {return fechaDeLanzamiento;}
    public void setFechaDeLanzamiento(LocalDate fechaDeLanzamiento) {this.fechaDeLanzamiento = fechaDeLanzamiento;}

    public Episodio(Integer numeroTemporada, DTOEpisodio dtoEpisodio) {
        this.temporada = numeroTemporada;
        this.titulo = dtoEpisodio.titulo();
        this.numeroEpisodio = dtoEpisodio.numeroDeEpisodio();

        try {
            this.evaluacion = Double.valueOf(dtoEpisodio.evaluacion());
        } catch (NumberFormatException e) {
            this.evaluacion = 0.0;
        }

        try {
            this.fechaDeLanzamiento = LocalDate.parse(dtoEpisodio.fechaDeLanzamiento());
        } catch (DateTimeException e) {
            this.fechaDeLanzamiento = null;
        }
    }

    @Override
    public String toString() {
        return "Episodio{" +
                "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", numeroEpisodio=" + numeroEpisodio +
                ", evaluacion=" + evaluacion +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                '}';
    }
}

