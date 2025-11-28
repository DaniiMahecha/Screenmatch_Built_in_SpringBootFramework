package com.daniidev.screenmatch.principal;

import com.daniidev.screenmatch.model.DTOEpisodio;
import com.daniidev.screenmatch.model.DTOSerie;
import com.daniidev.screenmatch.model.DTOTemporadas;
import com.daniidev.screenmatch.model.Episodio;
import com.daniidev.screenmatch.service.ConsumoAPI;
import com.daniidev.screenmatch.service.Deserializacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    private Scanner scanner = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private Deserializacion deserializacion = new Deserializacion();
    private List<DTOTemporadas> temporadas = new ArrayList<>();
    private final String URB_BASE = "http://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=35ec4bf9";


    public void muestraElMenu(){
        System.out.println("Ingrese el nombre de la Serie que desea consultar");
        //Busca los datos generales de las series
        var serieUsuario = scanner.nextLine();

        //Validar espacios a la hora de consumir un API
        var json = consumoApi.obtenerDatos(URB_BASE + serieUsuario.replaceAll(" ", "+") + API_KEY);
        var serie = deserializacion.deserializar(json, DTOSerie.class);
        System.out.println(serie);

//        //Busca los datos de todas las temporadas
//        for (int i = 1; i <= serie.totalDeTemporadas(); i++) {
//            var jsonTemporada = consumoApi.obtenerDatos(URB_BASE + serieUsuario.replaceAll(" ", "+") + "&Season=" + i + API_KEY);
//            var temporada = deserializacion.deserializar(jsonTemporada, DTOTemporadas.class);
//            temporadas.add(temporada);
//        }
//        //Recorro cada episodio de cada temporada de la serie
//        temporadas.forEach(t -> t.episodioList().forEach
//                (e -> System.out.println(e.titulo())));


//        //Filtrando las 5 mejores películas.
//        List<DTOEpisodio> dtoEpisodioList = temporadas.stream()
//                .flatMap(t -> t.episodioList().stream())
//                .collect(Collectors.toList());
//
//        dtoEpisodioList.stream()
//                .filter(e -> !e.evaluacion().equalsIgnoreCase("N/A"))
//                .sorted(Comparator.comparing(DTOEpisodio::evaluacion).reversed())
//                .limit(5)
//                .forEach(System.out::println);

//        //Convirtiendo los datos a una lista de la clase Episodio
        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodioList().stream()
                        .map(e -> new Episodio(t.numero(), e)))
                        .collect(Collectors.toList());
//
//        episodios.forEach(System.out::println);
//
//        //Filtrando objetos episodios por fechas
//        System.out.println("ingrese la fecha");
//        var fecha = scanner.nextInt();
//        scanner.nextLine();
//
//        LocalDate fechaFiltro = LocalDate.of(fecha, 1, 1);
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        episodios.stream().
//                filter(e -> e.getFechaDeLanzamiento() != null && e.getFechaDeLanzamiento().isAfter(fechaFiltro))
//                .forEach(e -> System.out.println(
//                        "Temporada: " + e.getTemporada() +
//                                "Episodio: " + e.getNumeroEpisodio() +
//                                "Fecha: " + e.getFechaDeLanzamiento().format(dtf)
//                ));

//        //Filtrando los objetos episodios por pedazo de Titulo
//        System.out.println("Ingrese el Titulo del episodio");
//        var titulo = scanner.nextLine();
//
//        //La clase Optional es un contenedor que puede o no contener un elemento que hayamos buscado
//        //Comparamos y validamos los datos, para eso convertimos el comparador y el comparado en minúsculas.
//        Optional<Episodio> coincidencias = episodios.stream()
//                .filter(e -> e.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
//                .findFirst();
//        //Si el contenedor tiene presente algún elemento, el dato fue encontrado y printeamos el elemento
//       //De lo contrario printeamos que no fue encontrado
//        System.out.println(coincidencias.isPresent() ? coincidencias.get() : "Episodio no encontrado");

        //Hallando una ranking global por temporada
        Map<Integer, Double> evaluacionPorTemporada = episodios.stream()
                                                        .filter(e -> e.getEvaluacion() > 0.0)
                                                        .collect(Collectors.groupingBy(Episodio::getTemporada,
                                                                Collectors.averagingDouble(Episodio::getEvaluacion)));
        System.out.println(evaluacionPorTemporada);


    }
}
