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
        produit1.prix = 0.700;
        produit1.afficher();
        produit2.prix = 0.500;
        produit2.afficher();

        //avec toString()
        System.out.println(produit1);
        System.out.println(produit2);
        System.out.println(produit3);

        //ajout dateExpiration
        produit1.dateExpiration = new Date("11/09/2024");
        produit2.dateExpiration = new Date("11/10/2024");
        produit3.dateExpiration = new Date("01/12/2024");

    }
}