import java.util.ArrayList;
import java.util.Scanner;


public class HelloUniverse {


   public static void main(String... args) {
        PlaneteTellurique mercure = new PlaneteTellurique("Mercure",10);
        mercure.diametre = 4880;
        mercure.matiere = "Tellurique";

        PlaneteGazeuse venus = new PlaneteGazeuse("Venus");
        venus.diametre = 12100;
        venus.matiere = "Tellurique";

        PlaneteTellurique terre = new PlaneteTellurique("Terre",4);
        terre.diametre = 12756;
        terre.matiere = "Tellurique";

        PlaneteTellurique mars = new PlaneteTellurique("Mars",3);
        mars.diametre = 6792;
        mars.matiere = "Tellurique";

        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";

        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        VaisseauCivil vMonde= new VaisseauCivil("VAISSEAU_MONDE");
        vMonde.nbPassager=150;
        VaisseauCivil cargo= new VaisseauCivil("CARGO");
        cargo.nbPassager=50;

        VaisseauGuerre fregate = new VaisseauGuerre("FREGATE");
        fregate.nbPassager=75;
        VaisseauGuerre chasseur = new VaisseauGuerre("CHASSEUR");
        chasseur.nbPassager=45;
        VaisseauGuerre croiseur = new VaisseauGuerre("CROISEUR");
        croiseur.nbPassager=145;

        Scanner sc = new Scanner(System.in);
        System.out.println("Type de vaisseau ?");
        TypeVaisseau vaisseau = TypeVaisseau.valueOf(sc.nextLine());

        ArrayList<Vaisseau> listVaisseau = new ArrayList<>();
        listVaisseau.add(vMonde);
        listVaisseau.add(cargo);
        listVaisseau.add(fregate);
        listVaisseau.add(chasseur);
        listVaisseau.add(croiseur);
        ArrayList<PlaneteTellurique> planeteArrayList = new ArrayList<>(){{
            add(mercure);
            add(terre);
            add(mars);
        }};

        int i=0;
        Vaisseau choix;
        PlaneteTellurique choixPl;
        while (i<listVaisseau.size()){
            if((listVaisseau.get(i)).typeVaisseau.equals(vaisseau)){
                choix = listVaisseau.get(i);
                System.out.println("Quelle planete?");
                String planete=sc.nextLine();
                for (PlaneteTellurique planeteTellurique : planeteArrayList) {
                    if (planeteTellurique.nom.equals(planete)) {
                        choixPl = planeteTellurique;
                        System.out.println("Choix tonnage ?");
                        choix.tonnageActuel = sc.nextInt();
                        choixPl.acceuillirVaisseau(choix);
                        choix.emporterCargaison(choix.tonnageActuel);
                    }
                }
            }
            i++;
        }

        Vaisseau v1 = new VaisseauCivil("VAISSEAU_MONDE");
        Vaisseau v2 = new VaisseauCivil("CARGO");
        Vaisseau v3 = new VaisseauGuerre("CHASSEUR");
        Vaisseau v4 = new VaisseauGuerre("FREGATE");
        Vaisseau v5 = new VaisseauGuerre("CROISEUR");

        terre.acceuillirVaisseau(v1,v2,v3,v4,v5);


    }

}
