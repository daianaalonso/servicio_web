package ar.jdbc;

import java.util.List;
import java.util.stream.Collectors;

import ar.model.Estudiante;
import ar.servicios.Estudiantes;

public class JdbcEstudiantes implements Estudiantes {

    //constructor con dependencias

    @Override
    public List<Estudiante> estudiantes(String apellido) {
        Estudiante estudiante1 = new Estudiante("Daiana", "Alonso");
        Estudiante estudiante2 = new Estudiante("Andres", "Blanco");
        Estudiante estudiante3 = new Estudiante("Xiomara", "Pallalaf");
        Estudiante estudiante4 = new Estudiante("Valentin", "Pallalaf");
        Estudiante estudiante5 = new Estudiante("Lorena", "Ramos");

        estudiante1.addCurso("Introduccion a las bases de datos I");
        estudiante1.addCurso("Seminario de Lenguajes");
        estudiante2.addCurso("Orientacion a Objetos I");
        estudiante2.addCurso("Seminario de Lenguajes");
        estudiante3.addCurso("Proyecto de Software");
        estudiante4.addCurso("Bases de datos I");
        estudiante5.addCurso("Redes y Comunicaciones");
        estudiante5.addCurso("Bases de datos I");

        var estudiante = List.of(estudiante1, estudiante2, estudiante3, estudiante4, estudiante5);

        if (apellido == null || apellido.isEmpty())
            return estudiante;

        return estudiante.stream().filter((e) -> {
            return e.containsApellido(apellido);
        }).collect(Collectors.toList());
    }

    @Override
    public void crearEstudiante(String nombre, String apellido,
                                String[] listaCursos) {

        Estudiante e = new Estudiante(nombre, apellido);

        System.out.println(e.toString());
        System.out.println(listaCursos);
    }
}
