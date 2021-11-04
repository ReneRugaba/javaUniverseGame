public abstract class Vaisseau {
    TypeVaisseau typeVaisseau;
    int nbPassager;
    int blindage;
    int resistanceBouclier;
    int tonnageMax;
    int tonnageActuel;

    Vaisseau(String typeVaisseau){
        this.typeVaisseau=TypeVaisseau.valueOf(typeVaisseau);
    }

    void activebouclier(){
        System.out.println("Activation de bouclier de type "+typeVaisseau);
    }

    void desactiveBouclier(){
        System.out.println("Desactivation de bouclier du vaisseau de type "+typeVaisseau);
        this.resistanceBouclier=0;
    }

    abstract void emporterCargaison(int tonnage);
}
