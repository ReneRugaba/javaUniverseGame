package com.espacex.decouverte.enginsspaciaux;

public enum TypeVaisseau {
    FREGATE("FREGATE"),
    CARGO("CARGO"),
    CHASSEUR("CHASSEUR"),
    CROISEUR("CROISEUR"),
    VAISSEAU_MONDE("VAISSEAU_MONDE");

    public String typeVaisseau;

    TypeVaisseau(String typeVaisseau){
        this.typeVaisseau=typeVaisseau;
    }
}
