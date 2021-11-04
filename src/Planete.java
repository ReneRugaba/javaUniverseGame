public abstract class Planete {
    String nom;
    long diametre;
    String matiere;

    Atmosphere atmosphere;

    static String formePlanete="Sphérique";
    static int nbPlanetesDecouvertes;

    Planete(String nomPlanete){
        this.nom = nomPlanete;
        ++nbPlanetesDecouvertes;

    }




    int revolution(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne autour de mon étoile de "+degres+" degrés.");
        return degres/360;
    }

    int rotation(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne sur moi-même de "+degres+" degrés.");
        return degres/360;
    }
}