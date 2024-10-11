package tn.tuniprob.gestionmagasin;

import java.util.Objects;

public abstract class Employe {
    private int identifiant;
    private String nom;
    private String adresse;
    private double nbr_heures;

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getNbr_heures() {
        return nbr_heures;
    }

    public void setNbr_heures(double nbr_heures) {
        this.nbr_heures = nbr_heures;
    }

    public Employe() {}

    public Employe(int identifiant, String nom, String adresse, double nbr_heures) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }

    @Override
    public String toString(){
        return "Identitfiant : "+identifiant
                +"\nNom : "+nom
                +"\nAdresse  : "+adresse
                +"\nNombre d'heures par mois : "+nbr_heures;
    }

    public abstract double calculSalaire();

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employe){
            Employe emp = (Employe) obj;
            return this.identifiant==emp.getIdentifiant() && Objects.equals(this.nom, emp.nom)&& Objects.equals(this.adresse, emp.getAdresse());
        }
        return false;
    }
}
