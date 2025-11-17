package challnage_composition;

public class main {
    public static void main(String[] args) {
        Piece p1 = new Piece("room1", "4m");
        Piece p2 = new Piece("room2", "10m");

        Maison M=new Maison("lot najah sidi jaber beni mellal");
        M.ajouterPiece(p1);
        M.ajouterPiece(p2);
        M.afficherPieces();
    }

}
