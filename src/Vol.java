public class Vol {

    String date;
    double duree;
    Avion avion;
    boolean estVolDouble;
    final double tauxMajoration = 1.15;

    public Vol(Avion avion, String date, double duree, boolean estVolDouble) {
        this.avion = avion;
        this.date = date;
        this.duree = duree;
        this.estVolDouble = estVolDouble;
    }

    double retourneCoutVol(){
        double coutVol;

        if (estVolDouble){
            coutVol = avion.coutHoraire * duree/60 * tauxMajoration;
        }
        else{
            coutVol = avion.coutHoraire * duree/60;
        }
        return coutVol;
    }

    @Override
    public String toString() {
        String typeVol;
        if (estVolDouble) {
            typeVol = "Double commande";
        }
        else {
            typeVol = "Commandant de bord";
        }

        return "Date : " + date +
                " | Durée : " + duree + " min" +
                " | " + typeVol +
                " | " + avion.immatriculation +
                " | " + retourneCoutVol();
    }
}
