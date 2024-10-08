import tn.tuniprob.gestionmagasin.Magasin;
import tn.tuniprob.gestionmagasin.Produit;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //creation
        Produit produit = new Produit();
        Produit produit1 = new Produit(1021,"Lait","Delice");
        Produit produit2 = new Produit(2510,"Yaourt","Vitalait");
        Produit produit3 = new Produit(3250,"Tomate","Sicam",1.200);

        //affichage
        produit.afficher();
        produit1.afficher();
        produit2.afficher();
        produit3.afficher();
        produit1.setPrix(0.700);
        produit1.afficher();
        produit2.setPrix(0.500);
        produit2.afficher();

        //avec toString()
        System.out.println(produit1);
        System.out.println(produit2);
        System.out.println(produit3);

        //ajout dateExpiration
        produit1.setDateExpiration(new Date("11/09/2024"));
        produit2.setDateExpiration(new Date("11/10/2024"));
        produit3.setDateExpiration(new Date("01/12/2024"));

        ////////////////////////////////
        //prosit2
        ///////////////////////////////
        Magasin magasin1 = new Magasin();
        magasin1.ajouter(produit1);
        magasin1.ajouter(produit2);
        magasin1.ajouter(produit3);
        magasin1.afficherMagasin();
        Magasin magasin2 = new Magasin();
        magasin2.ajouter(produit1);
        magasin2.ajouter(produit2);
        magasin2.ajouter(produit3);
        System.out.println(magasin1);
        System.out.println("Nombre produits de tous les magasins = "+Magasin.getNbrTotal());

        //prosit3

        System.out.println(produit1.comparer(produit2));
        System.out.println(Produit.comparer(produit1,produit2));
        System.out.println("Avant la suppression");
        magasin1.afficherMagasin();
        magasin1.supprimerProduit(produit1);
        System.out.println("Apres la suppression");
        magasin1.afficherMagasin();

        //ajouter produit
        magasin1.ajouter(produit1);
        //ajouter mm produit
        magasin1.ajouter(produit1);

        //comparer magasin1 et magasin2
        Magasin.comparerMagasins(magasin1,magasin2).afficherMagasin();
    }
}