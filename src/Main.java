import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class Main{
    public static void main(String args[]) throws FileNotFoundException {
        File origenF = new File("a.txt");
        Scanner scanner = new Scanner(origenF);
        File destinoF = new File("b.txt");
        FileOutputStream destinoFOS = new FileOutputStream(destinoF);
        PrintStream destinoPS = new PrintStream(destinoFOS);
        File destinoFRep = new File("c.txt");
        FileOutputStream destinoFOSRep = new FileOutputStream(destinoFRep);
        PrintStream destinoPSRep = new PrintStream(destinoFOSRep);
        ArrayList<String> lineas = new ArrayList<>();
        TreeSet<String> lineasOk = new TreeSet<>();
        ArrayList<String> lineasRepetidas = new ArrayList<>();

//Lógica de copia
        while(scanner.hasNext()){
            String linea = scanner.nextLine().trim();
            if (!linea.isEmpty()) {
                if (!lineasOk.add(linea)) {
                    lineasRepetidas.add(linea);
                }
            }



        }
        Collections.sort(lineasRepetidas);

        for (String linea:lineasOk){
            destinoPS.println(linea);
        }

        for (String linea:lineasRepetidas){
            destinoPSRep.println(linea);
        }

        scanner.close();
        destinoPS.close();
        destinoPSRep.close();
    }
}