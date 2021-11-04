public class PlaneteTellurique extends Planete {
    int totalVisiteur;
    Vaisseau[] vaisseauAccoste;

    PlaneteTellurique(String nomPlanete,int nbPlaceBaie) {
        super(nomPlanete);
        this.vaisseauAccoste= new Vaisseau[nbPlaceBaie];
    }

    void incrementTotalVisiteur (int nbPassager){
        this.totalVisiteur+=nbPassager;
    }

    boolean restePlaceLibre(){
        for (Vaisseau v : this.vaisseauAccoste){
            if(v==null){
                return true;
            }
        }
        return false;
    }

    void acceuillirVaisseau(Vaisseau vaisseau){
        if(vaisseau instanceof VaisseauGuerre){
            ((VaisseauGuerre) vaisseau).desactiverArmes();
        }


        boolean placeLibre = this.restePlaceLibre();

        if (!placeLibre){
            System.out.println("La baie d'accostage ne dispose plus de place libre!");
        }else {
            switch (vaisseau.typeVaisseau){
                case FREGATE:
                    this.incrementTotalVisiteur(vaisseau.nbPassager);
                    break;
                case CROISEUR:
                    this.incrementTotalVisiteur(vaisseau.nbPassager);
                    break;
                case CHASSEUR:
                    this.incrementTotalVisiteur(vaisseau.nbPassager);
                    break;
                case CARGO:
                    this.incrementTotalVisiteur(vaisseau.nbPassager);
                    break;
                case VAISSEAU_MONDE:
                    this.incrementTotalVisiteur(vaisseau.nbPassager);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + vaisseau.typeVaisseau);
            }

            for (int i=0;i<this.vaisseauAccoste.length;i++){
                if (this.vaisseauAccoste[i]==null){
                    this.vaisseauAccoste[i]=vaisseau;
                    System.out.println("La baie vient d'accueillir un vaisseau de type "+vaisseau.typeVaisseau);
                    break;
                }
            }
        }

    }
}
