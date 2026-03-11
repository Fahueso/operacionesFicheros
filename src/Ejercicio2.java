import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
    static void main() throws FileNotFoundException {
        File f = new File("quijote.txt");
        Scanner sc = new Scanner(f);
        int contador=0;
        while (sc.hasNext()){
            sc.next();
            contador++;
        }
        System.out.println("El archivo tiene "+contador+" palabras");
    }
}
