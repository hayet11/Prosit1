package tn.tuniprob.gestionmagasin;

public class Vendeur extends Employe{
    private double tauxDeVente;

    public double getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(double tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    public Vendeur(int identifiant, String nom, String adresse, double nbr_heures , double tauxDeVente){
        super(identifiant,nom,adresse,nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }

    public Vendeur(){}

    @Override
    public String toString() {
        return super.toString()+
                "\nTaux de vente : "+tauxDeVente;
    }

    @Override
    public double calculSalaire() {
        return 450*tauxDeVente*100;
    }

}
