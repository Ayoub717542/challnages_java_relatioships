package challange_ten;

import java.util.ArrayList;
import java.util.List;

public class Projet {
    private String nom;
    List<Employe>equipe;

       public Projet(String nom){
        this.nom=nom;
        equipe=new ArrayList<>();
    }
    public String getNom(){
        return nom;
    }
    public void ajouterEmploye(Employe E){
        this.equipe.add(E);
    }

    public void afficherEmployeUneProject(){
        System.out.println("============================================");
        System.out.println(" la liste des employés d'un projet '"+nom+"' : ");
        for(Employe E:equipe){
            System.out.println(E.getNom());
        }
       
    }

}
