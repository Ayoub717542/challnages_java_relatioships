package challange_two;

import java.util.ArrayList;
import java.util.List;

public class Instructeur {
    int id;
    String nom;
    String specialisation;
    List<Cours> coursEnseignes=new ArrayList<>();

    public Instructeur(int id, String nom, String specialisation, List<Cours> coursEnseignes) {
        this.id = id;
        this.nom = nom;
        this.specialisation = specialisation;
        this.coursEnseignes = new ArrayList<>();
    }

    void ajouterCours(Cours c) {
        this.coursEnseignes.add(c);
    }
    void afficherCours(){
        System.out.println("les cours d’un instructeur "+nom+" :");
       for(Cours c:coursEnseignes){
           System.out.println(""+c.titre);
       }
    }
}