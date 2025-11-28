package com.daniidev.screenmatch.service;

public interface IDeserializacion {
    <T> T deserializar(String json, Class<T> clase);
}
