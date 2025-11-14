package Challnage_three;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private int id;
    private String nom;
    List<Cours> coursSuivis;

    Etudiant(int id, String nom) {
        this.id = id;
        this.nom = nom;
        coursSuivis = new ArrayList<>();
    }
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void inscrire(Cours cour) {
        this.coursSuivis.add(cour);
    }



}
