package challnage_composition;

import java.util.ArrayList;
import java.util.List;

public class Maison {
    private String adresse;
    List<Piece> piece;

    public Maison(String adresse){
        this.adresse=adresse;
        piece=new ArrayList<>();
    }

public void ajouterPiece(Piece p){
    this.piece.add(p);
}

public void afficherPieces(){
    System.out.println("les pieces de c'est maison "+adresse+" est : ");
    for(Piece p : piece){
        System.out.println(p.getNom());
        System.out.println(p.getSuperficie());
    }
}

}
