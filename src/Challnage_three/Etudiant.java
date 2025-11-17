package Challnage_three;
import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private int id;
    private String nom;
    List<Cours> coursSuivis;
    static int count = 1;

    Etudiant(String nom) {
        this.id = count++;
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
        cour.ajouterEtudiant(this);
    }

    public List<Cours> getCours() {
        return this.coursSuivis;
    }


}
