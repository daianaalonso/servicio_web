package ar.web;

public class EstudianteDto {

    private String nombre;
    private String apellido;
    private String[] listaCursos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String[] getCursos() {
        return listaCursos;
    }

    public void setCursos(String[] cursos) {
        this.listaCursos = cursos;
    }

}
