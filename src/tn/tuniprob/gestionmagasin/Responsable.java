package tn.tuniprob.gestionmagasin;

public class Responsable extends Employe{
    private double prime;

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public Responsable(int identifiant, String nom, String adresse, double nbr_heures , double prime){
        super(identifiant,nom,adresse,nbr_heures);
        this.prime = prime;
    }

    public Responsable(){}

    @Override
    public String toString() {
        return super.toString()+
                "\nPrime : "+prime;
    }

    @Override
    public double calculSalaire() {
        return getNbr_heures()*10 +prime + (getNbr_heures()>160?(getNbr_heures()*10*0.2):0);
    }

}
