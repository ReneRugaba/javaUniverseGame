package com.espacex.decouverte.enginsspaciaux;
import static com.espacex.decouverte.enginsspaciaux.TypeVaisseau.VAISSEAU_MONDE;
import static com.espacex.decouverte.enginsspaciaux.TypeVaisseau.CARGO;

public class VaisseauCivil extends Vaisseau{


    public VaisseauCivil(TypeVaisseau typeVaisseau) {
        super(typeVaisseau);
        this.tonnageMax = typeVaisseau==CARGO? 500 : 2000;

    }

    @Override
    public void emporterCargaison(int tonnage) throws CheckedException {
        this.tonnageActuel=tonnage;
        if (tonnage>this.tonnageMax){
            this.tonnageRefuse = this.typeVaisseau == VAISSEAU_MONDE? tonnage-2000 : tonnage-500;
            throw new CheckedException(tonnageRefuse);
        } else {
            System.out.println("La cargaison est acceptée!");
        }
    }
}
