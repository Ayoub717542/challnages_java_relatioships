package challange_nine;

public class Etudiant {
    private int id;
    private String nom;
    Certification certification;

    public Etudiant(int id, String nom){
        this.id=id;
        this.nom=nom;
        this.certification=certification;
    }

    public void attribuerCertification(Certification C){
        this.certification = C;
    }

    public void afficher(){
        System.out.println("=========== Certification =========");
        System.out.println("Etudiant id : "+id);
        System.out.println("Etudiant Nom : "+nom);
        System.out.println("Etudiant Certification titre : "+certification.getTitre());
        System.out.println("Etudiant Certification date : "+certification.getDate());
    }

}
