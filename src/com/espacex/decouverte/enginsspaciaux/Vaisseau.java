package com.espacex.decouverte.enginsspaciaux;

public abstract class Vaisseau {
    public TypeVaisseau typeVaisseau;
    public int nbPassager;
    public int blindage;
    public int resistanceBouclier;
    public int tonnageMax;
    public int tonnageActuel;

    Vaisseau(TypeVaisseau typeVaisseau){
        this.typeVaisseau=typeVaisseau;
    }

    void activebouclier(){
        System.out.println("Activation de bouclier de type "+typeVaisseau);
    }

    void desactiveBouclier(){
        System.out.println("Desactivation de bouclier du vaisseau de type "+typeVaisseau);
        this.resistanceBouclier=0;
    }

    abstract public void emporterCargaison(int tonnage);
}
