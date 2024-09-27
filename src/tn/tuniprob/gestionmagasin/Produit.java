package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class Produit {

    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration;

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if(prix>=0)
            this.prix = prix;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }



    public Produit() {}

    public Produit( int identifiant,String libelle, String marque) {
        this.libelle = libelle;
        this.identifiant = identifiant;
        this.marque = marque;
    }

    public Produit(int identifiant,String libelle, String marque, double prix) {
        this(identifiant,libelle,marque);
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "tn.tuniprob.gestionmagasin.Produit{" +
                "  libelle='" + libelle + '\'' +
                ", prix=" + prix +
                '}';
    }

    public void afficher(){
        System.out.println("Identifiant : "+this.identifiant);
        System.out.println("Libellé : "+this.libelle);
        System.out.println("Marque : "+this.marque);
        System.out.println("Prix : "+this.prix);
    }
}
