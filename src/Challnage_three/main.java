package Challnage_three;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Etudiant etudiant =new Etudiant(1,"Amin");
        Cours coure = new Cours(1,"INFORMATIQUE");
        Cours.ajouterEtudiant(etudiant);
        Etudiant.inscrire(coure);
        coure.affecherEtudiant();


    }
}
