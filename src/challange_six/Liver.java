package challange_six;

public class Liver {
    private String titre;
    private String auteur;
    private int isbn;

    public Liver(String titre, String auteur, int isbn){
        this.titre=titre;
        this.auteur=auteur;
        this.isbn=isbn;

    }
    public String getTitre(){
        return titre;
    }
    public String getauteur(){
        return auteur;
    }
    public int getisbn(){
        return isbn;
    }
}
