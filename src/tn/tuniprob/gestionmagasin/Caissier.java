package tn.tuniprob.gestionmagasin;

public class Caissier extends Employe{
    private int numeroDeCaisse;

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public Caissier(int identifiant, String nom, String adresse, double nbr_heures , int numeroDeCaisse){
        super(identifiant,nom,adresse,nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public Caissier(){}

    @Override
    public String toString() {
        return super.toString()+
                "\nNumero de caisse : "+numeroDeCaisse;
    }

    @Override
    public double calculSalaire() {
        return getNbr_heures()*5 + (getNbr_heures()>180?(getNbr_heures()*5*0.15):0);
    }
}
