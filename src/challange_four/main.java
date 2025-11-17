package challange_four;

public class main {
    public static void main(String[]args){
        Produits produit = new Produits("Phone", 1850, 50);
        Produits produit2 = new Produits("pc", 6550, 10);
        Produits produit3 = new Produits("sorie", 180, 50);
        Commande C = new Commande(1);
        Commande C1 = new Commande(1);

        C.ajouter_produit(produit);
        C.ajouterProduit(produit2);
        C.ajouterProduit(produit3);
        C.afficher();
        Produits pro1 = new Produits("EUA", 10, 50);
        Produits pro2 = new Produits("chiar", 50, 100);
        C1.ajouterProduit(pro1);
        C1.ajouterProduit(pro2);
        C1.afficher();
        C.calculerTotal();
   
     




    }
   
    
}
