package ar.model;

import java.util.Map;

public class Curso {
    private Long id;
    private String nombre;

    public Curso(String nombre) {
        var check = new NotNullNotEmpty("nombre", nombre);
        check.throwOnError();

        this.nombre = nombre;
        long leftLimit = 1L;
        long rightLimit = 1000L;
        this.id = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
    }

    public Map<String, Object> toMap() {
        return Map.of("id", id, "nombre", nombre);
    }

    @Override
    public String toString() {
        return "curso [nombre=" + nombre + "]";
    }

}
