package challange_ten;

public class main {
    public static void main(String[]args){
        Employe e1= new Employe("Sami");
        Employe e2= new Employe("amin");
        Employe e3= new Employe("Ayoub");
        Projet p1 =new Projet("Gestion d'une ecole");
        Projet p2 =new Projet("Gestion d'une coffee");
        Projet p3 =new Projet("Gestion d'une Gym");

        e1.ajouterEmploye(p1);
        e1.ajouterEmploye(p2);
        e1.ajouterEmploye(p3);
        
        p2.ajouterEmploye(e1);
        p2.ajouterEmploye(e2);
        p2.ajouterEmploye(e3);

        e1.afficherUneProjectEmploye();
        p2.afficherEmployeUneProject();


    }

}
