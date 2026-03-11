import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    static void main() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Di el nombre del archivo : ");
        String nombreArchivo = scanner.nextLine();
        File file = new File(nombreArchivo);
        if (file.exists()){
            System.out.println("El archivo existe");
            if (file.isFile()){
                System.out.println("Tu archivo es un fichero");
                System.out.println(file.length());
            } else if (file.isDirectory()) {
                System.out.println("Tu archivo es un directorio");
            }
            System.out.println(file.getAbsolutePath());
        } else {
            System.out.println("No existe");
            file.createNewFile();
        }
    }
}
