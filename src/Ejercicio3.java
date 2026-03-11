import java.util.ArrayList;

public class Ejercicio3 {
    static void main() {
        Contacto c1 = new Contacto("A", 1,"1");
        Contacto c2 = new Contacto("B", 2,"2");
        ArrayList<Contacto> contactos = new ArrayList<>();
        contactos.add(c1); contactos.add(c2);

        guardarAgenda(contactos, "agenda.txt");
        contactos = cargarAgenda("agenda.txt");


    }

    private static ArrayList<Contacto> cargarAgenda(String file) {
    }

    private static void guardarAgenda(ArrayList<Contacto> contactos, String file) {

    }
}
