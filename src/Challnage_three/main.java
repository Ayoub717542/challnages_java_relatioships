package Challnage_three;
public class main {
    public static void main(String[] args) {
       
        Etudiant etudiant2 =new Etudiant("ayoub");
        Etudiant etudiant3 =new Etudiant("Sami");
        Cours coure = new Cours(1,"INFORMATIQUE");
        Cours coure1 = new Cours(2,"java");
        etudiant2.inscrire(coure);
        etudiant2.inscrire(coure1);
        etudiant3.inscrire(coure1);
        etudiant3.inscrire(coure);
        
        coure.affecherEtudiant();

       

    }
}
