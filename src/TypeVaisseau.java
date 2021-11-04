public enum TypeVaisseau {
    FREGATE("FREGATE"),
    CARGO("CARGO"),
    CHASSEUR("CHASSEUR"),
    CROISEUR("CROISEUR"),
    VAISSEAU_MONDE("VAISSEAU_MONDE");

    String typeVaisseau;

    TypeVaisseau(String typeVaisseau){
        this.typeVaisseau=typeVaisseau;
    }
}
