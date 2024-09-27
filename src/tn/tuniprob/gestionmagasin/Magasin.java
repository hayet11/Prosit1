package tn.tuniprob.gestionmagasin;

import java.util.Arrays;

public class Magasin {
    private int identifiant;
    private String adresse;
    private int capacite;
    private Produit[] produits;
    private int nbrProduits;

    public Magasin(){
        capacite = 50;
        produits = new Produit[capacite];
        nbrProduits = 0;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Produit[] getProduits() {
        return produits;
    }

    public void setProduits(Produit[] produits) {
        this.produits = produits;
    }

    @Override
    public String toString() {
        return "tn.tuniprob.gestionmagasin.Magasin{" +
                "  Adresse='" + adresse + '\'' +
                ", Capacite=" + capacite +
                ", Produits=" + Arrays.toString(produits) +
                '}';
    }

    public int nbrProduits(){
        return nbrProduits;
    }
    public void ajouter(Produit p){
        if(nbrProduits<capacite)
        {
            produits[nbrProduits] = p;
            nbrProduits++;
        }
    }
}
