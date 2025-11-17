package challange_five;

public class CarteGrise {
    private int numero;
    private String dateEmission;

   public CarteGrise(int numero,String dateEmString){
       this.numero=numero;
       this.dateEmission=dateEmString;
    
   }
   public int getnumero(){
    return numero;
}
public String getdateEmission(){
    return dateEmission;
}


}
