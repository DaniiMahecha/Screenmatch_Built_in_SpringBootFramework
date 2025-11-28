package com.daniidev.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DTOTemporadas(
        @JsonAlias("Season") Integer numero,
        @JsonAlias("Episodes") List<DTOEpisodio> episodioList) {

}
