package tn.tuniprob.gestionmagasin;

import java.util.Arrays;
import java.util.TreeMap;

public class Magasin {

    private static int nbrTotal;
    private int identifiant;
    private String adresse;
    private final int CAPACITE;
    private Produit[] produits;
    private int nbrProduits;

    public Magasin(){
        CAPACITE = 50;
        produits = new Produit[CAPACITE];
        nbrProduits = 0;
    }

    public Magasin(int id, String adresse, int capacite){
        identifiant = id;
        this.adresse = adresse;
        CAPACITE = capacite;
    }

    public static int getNbrTotal(){
        return nbrTotal;
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
        return CAPACITE;
    }

    public Produit[] getProduits() {
        return produits;
    }

    public void setProduits(Produit[] produits) {
        this.produits = produits;
    }

    public void afficherMagasin(){
        System.out.println("Adresse : "+this.adresse);
        System.out.println("Produits : ");
        for(int i = 0;i<nbrProduits;i++){
            System.out.println(produits[i]);
        }
    }

    public int nbrProduits(){
        return nbrProduits;
    }


    public void ajouter(Produit p){
        if(nbrProduits<CAPACITE && !chercherProduit(p))
        {
            produits[nbrProduits] = p;
            nbrProduits++;
            nbrTotal++;
        } else if (chercherProduit(p)) {
            System.out.println("Le produit deja existe");

        }
    }

    public boolean chercherProduit(Produit produit){
        boolean exist = false;
        int i = 0;
        while (i<this.nbrProduits && !exist){
            exist = produit.comparer(produits[i]);
            i++;
        }
        return exist;
    }

    public void supprimerProduit(Produit p){
        if(chercherProduit(p)){
            int i = 0;
            while (i<nbrProduits){
                if(produits[i].comparer(p)){
                    if(i<(nbrProduits-1)){
                        produits[i] = produits[i+1];
                    }
                    nbrProduits--;
                }
                i++;
            }
            produits[i] = null;
        }
    }

    public static Magasin comparerMagasins(Magasin mg1, Magasin mg2){
        return mg1.nbrProduits> mg2.nbrProduits ? mg1 : mg2;
    }
}
