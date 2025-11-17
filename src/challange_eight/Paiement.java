package challange_eight;

public class Paiement {
    private double montant;
    private String date;


    public Paiement(double montant, String date){
        this.montant=montant;
        this.date=date;
    }

    public double getmontant(){
        return montant;
    }

    public String getdate(){
        return date;
    }
}
