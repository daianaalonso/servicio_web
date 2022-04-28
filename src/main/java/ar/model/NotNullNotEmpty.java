package ar.model;

public class NotNullNotEmpty {

    private static final String MSG = "Envíe un valor distinto de nulo o vacío";
    public String value;
    public String[] values;

    public NotNullNotEmpty(String value) {
        if (value == null)
            throw new EstudianteException(MSG);
        if (value.isEmpty())
            throw new EstudianteException(MSG);
        if (value.isBlank())
            throw new EstudianteException(MSG);
        this.value = value;
    }

    public NotNullNotEmpty(String[] values) {
        if (values == null) {
            throw new EstudianteException(MSG);
        }
        if (values.length == 0) {
            throw new EstudianteException(MSG);
        }
        if (values[0] == null || values[0].isBlank() || values[0].isEmpty()) {
            throw new EstudianteException(MSG);
        }
        this.values = values;
    }

    public String value() {
        return this.value;
    }

    public String[] values() {
        return this.values;
    }
}
