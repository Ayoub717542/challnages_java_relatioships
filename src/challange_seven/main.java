package challange_seven;

public class main {
    public static void main(String[]args  ){
        Liver liver = new Liver("the call of the wild");
        Auteur auteur = new Auteur("jack London");
        Auteur auteur2 = new Auteur("James Joyce");
        liver.ajouterAuteur(auteur);
        liver.ajouterAuteur(auteur2);
        auteur.ajouterLivre(liver);
        liver.afficherauteur();
        auteur.afficherauteur();
    }
  

}
