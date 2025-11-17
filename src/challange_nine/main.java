package challange_nine;

public class main {
    public static void main(String[]args){
        Certification certification= new Certification("Java", "24/05/2014");
        Certification certification1= new Certification("JS", "20/05/2025");
        Etudiant etudiant1= new Etudiant(1, "Ayoub Hadi");
        etudiant1.attribuerCertification(certification);
        etudiant1.afficher();

        Etudiant etudiant= new Etudiant(2, "Zakaria benghanem");
        etudiant.attribuerCertification(certification1);
        etudiant.afficher();
    }

}
