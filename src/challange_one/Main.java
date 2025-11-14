package challange_one;

public class Main {
    public static void main(String[] args) {
       Passeport passeport = new Passeport(1,"Morrocco","30/04/2036");
       Personne personne = new Personne("Ayoub Hadi",23,passeport);
       personne.assignerPasseport(passeport);
       personne.afficherInfo();
    }
}