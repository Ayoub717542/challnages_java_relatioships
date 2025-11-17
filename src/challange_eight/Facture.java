package challange_eight;
import java.util.ArrayList;
import java.util.List;
public class Facture {
    private int id;
    List<Paiement> paiement;

    public Facture(int id){
        this.id=id;
        paiement=new ArrayList<>();
    }

    public void ajouterPaiement(Paiement p){
        this.paiement.add(p);
    }
    public double calculerTotalPaiements(){
        double total=0;
        for(Paiement p : paiement){
                total+=p.getmontant();
                if (total>=p.getmontant()) {
                    System.out.println("everything has been paid :"+total);
                }else{
                    System.out.println("the total is not paid in full !! ");
                    System.out.println("Paid: " + total + " / Total required: " + p.getmontant());
                }
        }
        return total;
             
    }

    public void afficher(){
           System.out.println("--------- Facture --------");
            System.out.println("les paiement de c'est facture id "+id+" : ");
            for(Paiement p : paiement){
                System.out.println("------------------");
                System.out.println(" montant : "+p.getmontant());
                System.out.println(" date : "+p.getdate());
            }
            System.out.print(" => "+calculerTotalPaiements());
        }
    }


