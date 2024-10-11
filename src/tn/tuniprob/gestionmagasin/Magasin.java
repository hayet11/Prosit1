package tn.tuniprob.gestionmagasin;

import java.util.Arrays;
import java.util.TreeMap;

public class Magasin {

    private static int nbrTotal;
    private int identifiant;
    private String adresse;
    private final int CAPACITE = 50;
    private Produit[] produits = new Produit[CAPACITE];
    private int nbrProduits;
    private int nbrEmp;
    private String nom;
    private Employe[] employes = new Employe[20];

    public Magasin(){}

    public Magasin(int id, String adresse){
        identifiant = id;
        this.adresse = adresse;
    }

    public Magasin(int id, String adresse, String nom){
        identifiant = id;
        this.adresse = adresse;
        this.nom = nom;
    }

    public Employe[] getEmployes() {
        return employes;
    }

    public void setEmployes(Employe[] employes) {
        this.employes = employes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

        for(int i = 0;i<nbrEmp;i++){
            System.out.println(employes[i]);
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

    public void ajouterEmploye(Employe emp){
        if(nbrEmp<20)
        {
            employes[nbrEmp] = emp;
            nbrEmp++;
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
            nbrProduits--;
            nbrTotal--;
        }
    }

    public static Magasin comparerMagasins(Magasin mg1, Magasin mg2){
        return mg1.nbrProduits> mg2.nbrProduits ? mg1 : mg2;
    }

    public void afficherPrime(){
        for (int i=0;i<nbrEmp;i++){
            if(employes[i] instanceof Responsable){
                System.out.println("Responsable : "+employes[i].getNom()+ " Prime : "+((Responsable) employes[i]).getPrime());
            }
        }

    }
    public void afficherSalaires(){
        double salaire = 0;
        for(int i=0;i<nbrEmp;i++){
            salaire+=employes[i].calculSalaire();
        }
        System.out.println("Salaire total = "+salaire);
    }

    public void afficherNbEmployeParType(){
        int nbR = 0, nbC =0,nbV=0;
        for (int i=0;i<nbrEmp;i++){
            if(employes[i] instanceof Responsable)
                nbR++;
            else if(employes[i] instanceof Caissier)
                nbC++;
            else if(employes[i] instanceof Vendeur)
                nbV++;
        }
        System.out.println("Nombre de responsables : "+ nbR);
        System.out.println("Nombre de cassiers : "+ nbC);
        System.out.println("Nombre de vendeurs : "+ nbV);
    }
}
