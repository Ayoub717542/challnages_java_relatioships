package challange_ten;

import java.util.ArrayList;
import java.util.List;

public class Employe {
    private String nom;
    List<Projet> projets;

    public Employe(String nom){
        this.nom=nom;
        projets=new ArrayList<>();
    }


    public void ajouterEmploye(Projet P){
        this.projets.add(P);
    }
    
    public String getNom(){
        return nom;
    }
    public void afficherUneProjectEmploye(){
        System.out.println("============================================");
        System.out.println(" la liste des project d'un employe '"+nom+"' : ");
        for(Projet P:projets){
        
            System.out.println(P.getNom());
        }
       
    }

}
