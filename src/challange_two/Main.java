package challange_two;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cours> coursEnseignes=new ArrayList<>();
        Cours cour = new Cours(1,"java","un langage de programmation.");
        Cours cour1 = new Cours(1,"JS","un langage de programmation.");

        Instructeur inst = new Instructeur(1,"Ayoub Hadi","developpment",coursEnseignes);
        inst.ajouterCours(cour);
        inst.ajouterCours(cour1);
        inst.afficherCours();
    }
}
