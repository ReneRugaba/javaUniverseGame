package com.espacex.decouverte.objectsastro;

import java.util.Objects;

public abstract class Planete implements Comparable {
    public String nom;
    public long diametre;
    public String matiere;

    public Atmosphere atmosphere=new Atmosphere();
    public Float dispanceEtoile;
    public static String formePlanete="Sphérique";
    public static int nbPlanetesDecouvertes;

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

    @Override
    public int compareTo(Object o) {
        Planete p=(Planete) o;
        return dispanceEtoile.compareTo(p.dispanceEtoile);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planete)) return false;
        Planete planete = (Planete) o;
        return diametre == planete.diametre && nom.equals(planete.nom) && matiere.equals(planete.matiere) && atmosphere.equals(planete.atmosphere) && dispanceEtoile.equals(planete.dispanceEtoile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, diametre, matiere, atmosphere, dispanceEtoile);
    }
}