package com.daniidev.screenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;

public class ConsumoAPI {

    public String obtenerDatos(String url) {
        //client
        HttpClient client = HttpClient.newHttpClient();

        //request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        //response
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Return a json
        return response.body();

    }
}
