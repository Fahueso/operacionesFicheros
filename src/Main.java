import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) throws FileNotFoundException {
        File origenF = new File("a.txt");
        Scanner scanner = new Scanner(origenF);
        File destinoF = new File("b.txt");
        FileOutputStream destinoFOS = new FileOutputStream(destinoF);
        PrintStream destinoPS = new PrintStream(destinoFOS);
        ArrayList<String> lineas = new ArrayList<>();
//Lógica de copia
        while(scanner.hasNext()){
            lineas.add(scanner.nextLine());

        }
        Collections.sort(lineas);

        for (String linea:lineas){
            destinoPS.println(linea);
        }

        scanner.close();
        destinoPS.close();
    }
}