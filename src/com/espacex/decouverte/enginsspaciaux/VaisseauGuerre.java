package com.espacex.decouverte.enginsspaciaux;
import static com.espacex.decouverte.enginsspaciaux.TypeVaisseau.FREGATE;
import static com.espacex.decouverte.enginsspaciaux.TypeVaisseau.CHASSEUR;

public class VaisseauGuerre extends Vaisseau{
    private boolean armesDesactivees=true;

    public VaisseauGuerre(TypeVaisseau typeVaisseau) {
        super(typeVaisseau);
        if(typeVaisseau != CHASSEUR){
            this.tonnageActuel = this.nbPassager * 2;
            this.tonnageMax = typeVaisseau==FREGATE? 50 : 100;
        }
    }

    /*
        public void attaque(Vaisseau vaisseau,String arme,int dureeAttaqque){
        if(this.armesDesactivees) {
            System.out.println("Un vaisseau de type " + this.typeVaisseau + " attaque un vaisseau de type "
                    + vaisseau.typeVaisseau + " en utilisant " + arme + " pendant " + dureeAttaqque + " minute");
            vaisseau.blindage /= 2;
        }else {
            System.out.println("Aucune attaque ne peut être faite, armes inopérant.");
        }
        }
    */


    public void desactiverArmes(){
        this.armesDesactivees = false;
        System.out.println("Désactivation des armes du vaisseau de type "+this.typeVaisseau);
    }

    public void activerArmes(){
        this.armesDesactivees = true;
        System.out.println("Activation des armes du vaisseau de type "+this.typeVaisseau);
    }

    public void activebouclier(){
        this.armesDesactivees = false;
        System.out.println("Activation de bouclier de type "+typeVaisseau);
    }

    @Override
    public void emporterCargaison(int tonnage) throws CheckedException {
        this.tonnageActuel=tonnage;
        if(typeVaisseau != CHASSEUR && this.nbPassager>=12 ){
            if(tonnage>this.tonnageMax){
                tonnageRefuse = typeVaisseau == FREGATE ? tonnage-50 : tonnage-100;
                throw new CheckedException(tonnageRefuse);
            }else{
                System.out.println("La cargaison est acceptée!");
            }
        }else {
            System.out.println("Letonnage refusé est de "+tonnage);
        }
    }
}
