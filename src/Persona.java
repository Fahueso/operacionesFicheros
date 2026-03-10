import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Persona implements Serializable {
    private static final long serialVersionUID = 2L;
    private String nombre;
    private int edad;
    private ArrayList<Libro> biblioteca = new ArrayList<>();

    public Persona(String nombre, int edad, ArrayList<Libro> biblioteca) {
        this.nombre = nombre;
        this.edad = edad;
        setBiblioteca(biblioteca);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Libro> getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(ArrayList<Libro> biblioteca) {
        if (biblioteca!=null)
            this.biblioteca = biblioteca;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", biblioteca=" + biblioteca +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}


