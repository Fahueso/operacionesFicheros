import java.io.Serializable;
import java.time.LocalDate;

public abstract class SerVivo implements Serializable{
    private String especie;
    private LocalDate fechaNacimiento;

    public SerVivo(String especie, LocalDate fechaNacimiento) {
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "SerVivo{" +
                "especie='" + especie + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

}
