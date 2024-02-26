/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etterem;

import modell.Etterem;
import modell.Etel;
import modell.Asztal;
import java.io.IOException;

/**
 *
 * @author berta.z.anna
 */
public class Konzol {
    

    public Konzol() throws IOException{
        Etterem etterem = new Etterem();
        for (Asztal asztal : etterem.getAsztalok()) {
            System.out.println(asztal.getSzin());
            for (Etel etel : asztal.getRendelesek()) {
                System.out.println(etel.getNev()+etel.getAr());
            }
        }
    }
    
}
