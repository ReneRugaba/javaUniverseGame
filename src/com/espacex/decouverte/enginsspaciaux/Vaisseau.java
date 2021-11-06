package com.espacex.decouverte.enginsspaciaux;

public abstract class Vaisseau {
    final public TypeVaisseau typeVaisseau;
    public int nbPassager;
    //public int blindage;
    public int resistanceBouclier;
    public int tonnageMax;
    public int tonnageActuel;
    public int tonnageRefuse;

    Vaisseau(TypeVaisseau typeVaisseau){
        this.typeVaisseau=typeVaisseau;
    }



    abstract public void emporterCargaison(int tonnage) throws CheckedException;
}
