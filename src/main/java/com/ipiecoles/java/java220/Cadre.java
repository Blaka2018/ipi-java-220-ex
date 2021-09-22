package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

public class Cadre extends Employe {

    //L'attribut de la classe cadre

    private Double coefficient = 1d;

    //Ajout Getter et setter de l'attribut coefficient

    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

    //Ajout du constructeur

    public Cadre() {

    }

    public Cadre(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Boolean tempsPartiel, String sexe, Double coefficient) {
        super(nom, prenom, matricule, dateEmbauche, salaire, tempsPartiel, sexe);
        this.coefficient = coefficient;
    }

    // Redéfinition de getPrimeAnnuelle pour que la méthode renvoie la prime de base des employés multiplié par le coefficient du cadre

    @Override
    public Double getPrimeAnnuelle(){
        return Entreprise.primeAnnuelleBase() * 1d;
    }

    //Ajout de toString, equals et hashCode

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cadre that = (Cadre) o;
        return Objects.equals(coefficient, that.coefficient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),coefficient);
    }
}
