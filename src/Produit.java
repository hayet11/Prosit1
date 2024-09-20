import java.util.Date;

public class Produit {

    int identifiant;
    String libelle;
    String marque;
    double prix;
    Date dateExpiration;

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
        return "Produit{" +
                "identifiant=" + identifiant +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration +
                '}';
    }

    public void afficher(){
        System.out.println("Identifiant : "+this.identifiant);
        System.out.println("Libellé : "+this.libelle);
        System.out.println("Marque : "+this.marque);
        System.out.println("Prix : "+this.prix);
    }
}
