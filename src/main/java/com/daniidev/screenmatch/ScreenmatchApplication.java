package com.daniidev.screenmatch;


import com.daniidev.screenmatch.model.DTOEpisodio;
import com.daniidev.screenmatch.model.DTOSerie;
import com.daniidev.screenmatch.model.DTOTemporadas;
import com.daniidev.screenmatch.principal.EjempoStreams;
import com.daniidev.screenmatch.principal.Principal;
import com.daniidev.screenmatch.service.ConsumoAPI;
import com.daniidev.screenmatch.service.Deserializacion;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.muestraElMenu();
//        EjempoStreams ejempoStreams = new EjempoStreams();
//        ejempoStreams.muestraEjemplo();
    }
}
