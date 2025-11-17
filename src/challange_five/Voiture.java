package challange_five;

public class Voiture {
private String immatriculation;
private String marque;
private String model;
CarteGrise carteGrise;

    public Voiture(String immatriculation , String marque,String model,CarteGrise carteGrise){
        this.immatriculation= immatriculation;
        this.marque=marque;
        this.model=model;
        this.carteGrise = carteGrise;
    }

    public void lierCarteGrise(CarteGrise c){
        this.carteGrise=c;
    }

 
    public void afficher(){
        System.out.println("========voiture proprietaire=========");
        System.out.println("voiture immatriculation :"+immatriculation);
        System.out.println("voiture marque :"+marque);
        System.out.println("voiture model :"+model);
        System.out.println("========voiture carteGrise=========");
        System.out.println("voiture carteGrise numero :"+carteGrise.getnumero());
        System.out.println("voiture carteGrise date Emission :"+carteGrise.getdateEmission());
        System.out.println("=====================================");
    
       }
}
