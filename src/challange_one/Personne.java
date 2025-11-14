package challange_one;

public class Personne {
    private String nom;
    private int age;
    Passeport passeport;

    public Personne(String nom, int age, Passeport passeport) {
        this.nom = nom;
        this.age = age;
        this.passeport = passeport;
    }
    public void assignerPasseport(Passeport P){
        this.passeport = P;
    }



    public void afficherInfo(){
        System.out.println("Nom: "+nom+"\nage: "+age+"\navoir un passeport Numero: "+passeport.getnumero()
                +"\nNationalite: "+passeport.getnationalite()+"\nDateExpiration: "+passeport.getdateExpiration());
    }

}
