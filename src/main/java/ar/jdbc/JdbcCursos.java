package ar.jdbc;

import java.util.List;

import ar.model.Curso;
import ar.servicios.Cursos;

public class JdbcCursos implements Cursos {

    @Override
    public List<Curso> cursos() {
        return List.of(
                new Curso("Introduccion a las bases de datos I"),
                new Curso("Seminario de Lenguajes"),
                new Curso("Orientacion a Objetos I"),
                new Curso("Proyecto de Software"),
                new Curso("Bases de datos I"),
                new Curso("Redes y Comunicaciones"));
    }

}
