package challange_eight;

public class main {
    public static void main(String[]args){
    Facture f= new Facture(1);
    Paiement p= new Paiement(154.214, "30/07/2020");
    Paiement p2= new Paiement(0, "10/04/2022");
    Paiement p3= new Paiement(84.44, "14/12/2021");
    f.ajouterPaiement(p);
    f.ajouterPaiement(p2);
    f.ajouterPaiement(p3);
    f.afficher();
    }

}
