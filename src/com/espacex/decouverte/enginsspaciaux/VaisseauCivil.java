package com.espacex.decouverte.enginsspaciaux;
import static com.espacex.decouverte.enginsspaciaux.TypeVaisseau.VAISSEAU_MONDE;
import static com.espacex.decouverte.enginsspaciaux.TypeVaisseau.CARGO;

public class VaisseauCivil extends Vaisseau{

    public VaisseauCivil(TypeVaisseau typeVaisseau) {
        super(typeVaisseau);
        this.tonnageMax = typeVaisseau==CARGO? 500 : 2000;

    }

    @Override
    public void emporterCargaison(int tonnage) {
        int tonnageRefuse=0;
        if (tonnage>this.tonnageMax){
            tonnageRefuse = this.typeVaisseau == VAISSEAU_MONDE? tonnage-2000 : tonnage-500;
            System.out.println("Letonnage refusé est de "+tonnageRefuse);
        } else {
            System.out.println("Letonnage refusé est de "+tonnageRefuse);
        }
    }
}
