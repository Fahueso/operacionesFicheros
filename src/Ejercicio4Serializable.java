import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4Serializable {
    static void main() throws IOException, ClassNotFoundException {
        Contacto c1 = new Contacto("A", 1,"1");
        Contacto c2 = new Contacto("B", 2,"2");
        ArrayList<Contacto> contactos = new ArrayList<>();
        contactos.add(c1); contactos.add(c2);

        guardarAgenda(contactos);
        ArrayList<Contacto> contactos2 = cargarAgenda();
        if (contactos2.equals(contactos))
        {
            System.out.println("Son iguales");
        }


    }

    private static ArrayList<Contacto> cargarAgenda() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("agenda.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Contacto> contactos = new ArrayList<>();

        contactos = (ArrayList<Contacto>) ois.readObject();
        ois.close();

        return contactos;

    }

    private static void guardarAgenda(ArrayList<Contacto> contactos) throws IOException {
        FileOutputStream fos = new FileOutputStream("agenda.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(contactos);

        oos.close();

    }
}
