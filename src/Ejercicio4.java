import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    static void main() throws FileNotFoundException {
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

    private static ArrayList<Contacto> cargarAgenda() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("agenda.txt");
        Scanner sc = new Scanner(fis);
        ArrayList<Contacto> contactos = new ArrayList<>();
        while (sc.hasNext()){
            String nombre = sc.nextLine();
            int edad = Integer.parseInt(sc.nextLine());
            String telefono = sc.nextLine();
            Contacto c = new Contacto(nombre, edad, telefono);
            contactos.add(c);
        }
        return contactos;

    }

    private static void guardarAgenda(ArrayList<Contacto> contactos) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("agenda.txt");
        PrintStream ps = new PrintStream(fos);
        for (Contacto c:contactos){
            ps.println(c.getNombre());
            ps.println(c.getEdad());
            ps.println(c.getTelefono());
        }
        ps.close();
    }
}
