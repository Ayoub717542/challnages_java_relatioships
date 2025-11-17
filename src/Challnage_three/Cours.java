package Challnage_three;
import java.util.ArrayList;
import java.util.List;
public class Cours
{
    private int id;
    private String titre;
    List<Etudiant> etudiant;
 

    public Cours(int id, String titre){
        this.id = id;
        this.titre = titre;
        this.etudiant = new ArrayList<>();
    }
    public int getId(){
        return this.id;
    }
    public String getTitre(){
        return this.titre;
    }

    public void ajouterEtudiant(Etudiant etudiant){
        this.etudiant.add(etudiant);
    }

    public void affecherEtudiant(){
        for(Etudiant etudiant:etudiant){
            System.out.println("========C'est etudiant=========");
            System.out.println("etudiant id:"+etudiant.getId());
            System.out.println("etudiant Nom:"+etudiant.getNom());
            System.out.println("========inscrit des coures========");
            for(Cours coure : etudiant.getCours()){
                System.out.println("Coure : id "+coure.getId()+", titre : "+coure.getTitre());

            }
        }

    }

}
