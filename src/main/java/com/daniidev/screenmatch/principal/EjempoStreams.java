package com.daniidev.screenmatch.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjempoStreams {
    public void muestraEjemplo(){
        List<String> nombres = Arrays.asList("Tralaleto", "Bombardiro", "Chimpansini", "Capushino", "Balerina");
        nombres.stream()
                .filter(s -> s.startsWith("C"))
                .forEach(System.out::println);
    }

}
