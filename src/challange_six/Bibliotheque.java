package challange_six;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private String nom;
    List<Liver> liver;

    public Bibliotheque(String nom){
        this.nom=nom;
        liver= new ArrayList<>();
    }

    public void ajouterLivre(Liver liver){
        this.liver.add(liver);
        System.out.println("                    -------                    ");
        System.out.println("le liver "+liver.getTitre()+" par "+liver.getauteur()+" a été Ajouter !");
    }
    public void supprimerLivre(Liver liver){
        this.liver.remove(liver);
        System.out.println("                    -------                    ");
        System.out.println("le liver "+liver.getTitre()+" par "+liver.getauteur()+" a été Supprimé !");
    }
    public void afficherLivers(){
        System.out.println("    ====================== "+nom+" =======================   ");
        for(Liver liver: liver){
            System.out.println("      ==============================                ");
            System.out.println("         Liver Nom : " + liver.getTitre());
            System.out.println("         Liver Auteur : " + liver.getauteur());
            System.out.println("         Liver isbn : " + liver.getisbn());
        }
    }

}
