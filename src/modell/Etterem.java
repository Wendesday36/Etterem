package modell;

import modell.Etel;
import modell.Asztal;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class Etterem {

    ArrayList<Asztal> asztalok;
    ArrayList<Etel> etlap;
  
    public static final String HUF="Ft";
    
    public Etterem() throws IOException {

        this.asztalok = asztalok;
        this.etlap = etlap;
    }

    public ArrayList<Asztal> getAsztalok() {
        return asztalok;
    }

    public void etlapotFajlbolFeltolt() throws IOException {
        //meg csak beolvas
        Path path = Path.of("Etelek.txt");
        List<String> sorok = Files.readAllLines(path);

        for (String sor : sorok) {
            String[] adatok = sor.split("\\|");
            String etelNev = adatok[0];
            int etelAr = Integer.parseInt(adatok[1]);
            Etel etel = new Etel(etelNev, etelAr);
            etlap.add(etel);

        }
        for (Etel etel : etlap) {
            System.out.println(etel);
        }
         ArrayList<Etel> nemMosodosithatoEtelek = (ArrayList<Etel>) etlap;
    }

    public void rendeleseketFajlbolFeltolt() throws IOException {
          //meg csak beolvas
        Path path = Path.of("rendeles.txt");
        List<String> sorok = Files.readAllLines(path);

        for (String sor : sorok) {
            String[] adatok = sor.split("\\n");
            String asztalSzin = adatok[0];
//            String etelek = adatok[1];
            Asztal asztal = new Asztal(asztalSzin);
            asztalok.add(asztal);

        }
        for (Asztal asztal : asztalok) {
            System.out.println(asztal);
        }
        
    }

    private Etel eteltKivalaszt(String etelNeve) {
        int i = 0;
        while (!(etlap.get(i).getNev().equals(etelNeve))) {            
            i++;
        }
        return etlap.get(i);

       
    }
//    
    

}
