/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Asztal {

    private String szin;
    private ArrayList<Etel> rendelesek;

    public Asztal(String szin) throws IOException {

        this.szin = szin;
        this.rendelesek = rendelesek;
    }

    public void ujEtel(Etel etel) {

    }

    public String getSzin() {
        return szin;
    }

    public List<Etel> getRendelesek() {
        return Collections.unmodifiableList(rendelesek);
    }

    public int getOsszAr() {

        return 0;
    }

}
