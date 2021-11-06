package com.espacex.decouverte.enginsspaciaux;

public abstract class Vaisseau {
    final public TypeVaisseau typeVaisseau;
    public int nbPassager;
    //public int blindage;
    public int resistanceBouclier;
    public int tonnageMax;
    protected int tonnageActuel;

    Vaisseau(TypeVaisseau typeVaisseau){
        this.typeVaisseau=typeVaisseau;
    }



    abstract public void emporterCargaison(int tonnage);
}
