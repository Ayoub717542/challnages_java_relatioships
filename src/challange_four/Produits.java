package challange_four;

public class Produits {
    private String nome;
    private double prixUnitaire;
    private int quantite;
    
    public Produits(String nome,double prixUnitaire,int quantite){
        this.nome=nome;
        this.prixUnitaire=prixUnitaire;
        this.quantite=quantite;
    }

    public  String getnome(){
        return nome;
    }
    public double getPrix(){
        return prixUnitaire;
    }
    public int getQuantite(){
        return quantite;
    }

}
