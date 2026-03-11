import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class GestionPersona {
    private static final String ARCHIVO = "persona.ser";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Serializar Persona");
            System.out.println("2. Deserializar Persona");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    serializarPersona();
                    break;
                case 2:
                    deserializarPersona();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public static void serializarPersona() {
        Libro l1 = new Libro("1","A","B");
        Libro l2 = new Libro("2","C","D");
        ArrayList<Libro> biblioteca = new ArrayList<>();
        biblioteca.add(l1); biblioteca.add(l2);
        Persona persona1 = new Persona("Humano", LocalDate.now(), "Juan", 30, biblioteca);

        Libro l3 = new Libro("3","A","B");
        Libro l4 = new Libro("4","C","D");
        ArrayList<Libro> biblioteca2 = new ArrayList<>();
        biblioteca2.add(l3); biblioteca2.add(l4);
        Persona persona2 = new Persona("Humano", LocalDate.now() , "Luis", 40, biblioteca2);
        ArrayList<Persona> clase = new ArrayList<>();
        clase.add(persona1);clase.add(persona2);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(clase);
            System.out.println("Objeto serializado en " + ARCHIVO);
        } catch (IOException e) {
            System.out.println("Error al serializar el objeto");
            e.printStackTrace();
        }
    }

    public static void deserializarPersona() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            ArrayList<Persona> clase = (ArrayList<Persona>) ois.readObject();
            System.out.println("Objeto deserializado: " + clase);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar el objeto");
            e.printStackTrace();
        }

    }
}

