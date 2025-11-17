package challange_four;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    private int id;
    static int count=1;
    List<Produits> produits;

    public Commande(int id){
        this.id=count++;
        produits= new ArrayList<>();
    }

    public int getid(){
        return id;
    }
    
    public void ajouterProduit(Produits p){
        this.produits.add(p);
    }
        public void calculerTotal(){
        int total=produits.size();
        System.out.println("the total numbers of products is : "+total);
        }
        public void ajouter_produit(Produits p){
            this.produits.add(p);
        }
        public void afficher(){
            System.out.println("---------Commande "+this.id+" --------");
            System.out.println("the products : ");
            for(Produits p : produits){
                System.out.println("------------------");
                System.out.println(p.getnome());
                System.out.println(p.getPrix());
                System.out.println(p.getQuantite());
                
            }
        }
}
