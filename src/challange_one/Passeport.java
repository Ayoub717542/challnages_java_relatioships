package challange_one;

public class Passeport {
    private int numero;
    private String nationalite;
    private String dateExpiration;

    public Passeport(int numero, String nationalite, String dateExpiration) {
        this.numero = numero;
        this.nationalite = nationalite;
        this.dateExpiration = dateExpiration;

    }
    public int getnumero() {
        return numero;
    }
    public String getnationalite() {
        return nationalite;
    }
    public String getdateExpiration() {
        return dateExpiration;
    }


}
