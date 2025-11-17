package challange_six;

public class main {
    public static void main(String[]agrs){
        Bibliotheque bibliotheque =new Bibliotheque("Congress");
        Liver liver1 = new Liver("The call of the wild", "jack London", 3424445);
        Liver liver2 = new Liver("Ulysses", "James Joyce", 4724445);
        Liver liver3 = new Liver("In Search of Lost Time", "Marcel Proust", 1202975);
        bibliotheque.ajouterLivre(liver1);
        bibliotheque.ajouterLivre(liver2);
        bibliotheque.ajouterLivre(liver3);
        bibliotheque.supprimerLivre(liver3);
        bibliotheque.afficherLivers();
       
    }

}
