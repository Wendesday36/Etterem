package modell;

import java.io.IOException;

public class Etel {

    String nev;
    int ar;

    public Etel(String nev, int ar) throws IOException {
        this.nev = nev;
        this.ar = ar;
    }

    //Babgulyás|1700
    public Etel(String sor) {
        sor.split("\\|");
    }

    public String getNev() {
        return nev;
    }

    public int getAr() {
        return ar;
    }

}
