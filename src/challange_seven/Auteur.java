package challange_seven;
import java.util.ArrayList;
import java.util.List;


public class Auteur {
private String nom;
List<Liver>liver;

public Auteur(String nom){
    this.nom=nom;
    liver= new ArrayList<>();
}

public String getAuteur(){
    return nom;
}

void ajouterLivre(Liver liver){
    this.liver.add(liver);
}

void afficherauteur(){
    System.out.println("==================================");
    System.out.println(" les liver de c'est Auteur " +nom+ " est : ");
    for(Liver liver : liver){
        System.out.println(" Liver : "+liver.getTite());
    }
}
}
