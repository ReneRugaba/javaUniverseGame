public class VaisseauCivil extends Vaisseau{

    VaisseauCivil(String typeVaisseau) {
        super(typeVaisseau);
        this.tonnageMax = TypeVaisseau.valueOf(typeVaisseau)==TypeVaisseau.CARGO? 500 : 2000;

    }

    @Override
    void emporterCargaison(int tonnage) {
        int tonnageRefuse=0;
        if (tonnage>this.tonnageMax){
            tonnageRefuse = this.typeVaisseau == TypeVaisseau.VAISSEAU_MONDE? tonnage-2000 : tonnage-500;
            System.out.println("Letonnage refusé est de "+tonnageRefuse);
        } else {
            System.out.println("Letonnage refusé est de "+tonnageRefuse);
        }
    }
}
