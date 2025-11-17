package challange_five;

public class main {
    public static void main(String[]args){
        CarteGrise carteGrise= new CarteGrise(2, "23/03/2025");
        CarteGrise carteGrise1= new CarteGrise(3, "04/04/2028");
        Voiture voiture =new Voiture("1234-A-56", "Toyota", "Corolla",carteGrise);
        Voiture voiture1 =new Voiture("4834-B-86", "Toyota", "Corolla",carteGrise1);
        voiture.lierCarteGrise(carteGrise);
        voiture.afficher();
        voiture1.lierCarteGrise(carteGrise1);
        voiture1.afficher();

      
    }

}
