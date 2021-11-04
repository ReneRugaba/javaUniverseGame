public class VaisseauGuerre extends Vaisseau{
    boolean armesDesactivees=true;

    VaisseauGuerre(String typeVaisseau) {
        super(typeVaisseau);
        if(typeVaisseau != "CHASSEUR"){
            this.tonnageActuel = this.nbPassager * 2;
            this.tonnageMax = typeVaisseau=="FREGATE"? 50 : 100;
        }
    }

    void attaque(Vaisseau vaisseau,String arme,int dureeAttaqque){
        if(this.armesDesactivees) {
            System.out.println("Un vaisseau de type " + this.typeVaisseau + " attaque un vaisseau de type "
                    + vaisseau.typeVaisseau + " en utilisant " + arme + " pendant " + dureeAttaqque + " minute");
            vaisseau.blindage /= 2;
        }else {
            System.out.println("Aucune attaque ne peut être faite, armes inopérant.");
        }
    }

    void desactiverArmes(){
        this.armesDesactivees = false;
        System.out.println("Désactivation des armes du vaisseau de type "+this.typeVaisseau);
    }

    void activebouclier(){
        this.armesDesactivees = false;
        System.out.println("Activation de bouclier de type "+typeVaisseau);
    }

    @Override
    void emporterCargaison(int tonnage) {
        if(typeVaisseau != TypeVaisseau.CHASSEUR && this.nbPassager>=12 ){
            int tonnageRefuse=0;
            if(tonnage>this.tonnageMax){
                tonnageRefuse = typeVaisseau == TypeVaisseau.FREGATE ? tonnage-50 : tonnage-100;
                System.out.println("Letonnage refusé est de "+tonnageRefuse);
            }else{
                System.out.println("Letonnage refusé est de "+tonnageRefuse);
            }
        }else {
            System.out.println("Letonnage refusé est de "+tonnage);
        }
    }
}
