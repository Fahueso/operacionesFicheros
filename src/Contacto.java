import java.io.Serializable;
import java.util.Objects;

public class Contacto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int edad;
    private String telefono;

    public Contacto(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return edad == contacto.edad && Objects.equals(nombre, contacto.nombre) && Objects.equals(telefono, contacto.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, telefono);
    }
}

