public class PlaneteTellurique extends Planete {
    int totalVisiteur;
    Vaisseau[][] vaisseauAccoste;

    PlaneteTellurique(String nomPlanete,int nbPlaceBaie) {
        super(nomPlanete);
        this.vaisseauAccoste= new Vaisseau[2][nbPlaceBaie];
    }

    void incrementTotalVisiteur (int nbPassager){
        this.totalVisiteur+=nbPassager;
    }

    boolean restePlaceLibre(Vaisseau vaisseau){
        int indexZone=0;
        switch (vaisseau.typeVaisseau){
            case CARGO:
            case VAISSEAU_MONDE:
                indexZone=1;
        }
        for (int i=0;i<this.vaisseauAccoste[indexZone].length;i++){

                if(vaisseauAccoste[indexZone][i]==null){
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


            boolean placeLibre = this.restePlaceLibre(vs);

            if (!placeLibre){
                System.out.println("La baie d'accostage ne dispose plus de place libre!");
            }else {
                int indexZone=0;
                switch (vs.typeVaisseau){
                    case FREGATE:
                    case CROISEUR:
                    case CHASSEUR:
                        this.incrementTotalVisiteur(vs.nbPassager);
                        break;
                    case CARGO:
                    case VAISSEAU_MONDE:
                        indexZone=1;
                        this.incrementTotalVisiteur(vs.nbPassager);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + vs.typeVaisseau);
                }



                    for (int j=0;j<this.vaisseauAccoste[indexZone].length;j++){
                        if (vs instanceof VaisseauGuerre && this.vaisseauAccoste[indexZone][j]==null){
                            this.vaisseauAccoste[indexZone][j]=vs;
                            System.out.println("La baie pour les vaisseau de guerre vient d'accueillir un vaisseau de type "+vs.typeVaisseau);
                            break;
                        }else if(vs instanceof VaisseauCivil && this.vaisseauAccoste[indexZone][j]==null) {
                            this.vaisseauAccoste[indexZone][j]=vs;
                            System.out.println("La baie pour les vaisseau civiles vient d'accueillir un vaisseau de type "+vs.typeVaisseau);
                            break;
                        }
                    }

                }
            }

        }

}
