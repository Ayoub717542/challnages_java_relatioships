package challange_seven;

import java.util.ArrayList;
import java.util.List;

public class Liver {

private String titre;
List<Auteur>auteur;


public Liver(String titre){
    this.titre=titre;
    auteur =new ArrayList<>();
}

void ajouterAuteur(Auteur auteur){
    this.auteur.add(auteur);
}
public String getTite(){
    return titre;
}


void afficherauteur(){
    System.out.println("==================================");
    System.out.println(" les auteur de c'est Liver"+titre+" est : ");
    for(Auteur auteur : auteur){
        System.out.println(" Auteur : "+auteur.getAuteur());
    }
}


}
