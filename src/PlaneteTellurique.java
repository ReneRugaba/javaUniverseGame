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

    void acceuillirVaisseau(Vaisseau... vaisseau){
        for (Vaisseau vs : vaisseau){
            if(vs instanceof VaisseauGuerre){
                ((VaisseauGuerre) vs).desactiverArmes();
            }


            boolean placeLibre = this.restePlaceLibre();

            if (!placeLibre){
                System.out.println("La baie d'accostage ne dispose plus de place libre!");
            }else {
                switch (vs.typeVaisseau){
                    case FREGATE:
                        this.incrementTotalVisiteur(vs.nbPassager);
                        break;
                    case CROISEUR:
                        this.incrementTotalVisiteur(vs.nbPassager);
                        break;
                    case CHASSEUR:
                        this.incrementTotalVisiteur(vs.nbPassager);
                        break;
                    case CARGO:
                        this.incrementTotalVisiteur(vs.nbPassager);
                        break;
                    case VAISSEAU_MONDE:
                        this.incrementTotalVisiteur(vs.nbPassager);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + vs.typeVaisseau);
                }

                for (int i=0;i<this.vaisseauAccoste.length;i++){
                    if (this.vaisseauAccoste[i]==null){
                        this.vaisseauAccoste[i]=vs;
                        System.out.println("La baie vient d'accueillir un vaisseau de type "+vs.typeVaisseau);
                        break;
                    }
                }
            }

        }

    }
}
