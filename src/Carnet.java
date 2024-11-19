public class Carnet {

    Vol[] listVol = new Vol[10];
    int nbVol = 0;

    void ajouterVol(Vol v) {
        listVol[nbVol] = v;
        nbVol++;
    }

    void afficherVol() {
        for (int i = 0; i < nbVol; i++) {
            System.out.println(listVol[i]);
        }
    }

    double retourneTempsVolSeul(){
        double tempsVol = 0;
        for (int i = 0; i < nbVol; i++) {
            if (!listVol[i].estVolDouble) {
                tempsVol += listVol[i].duree;
            }
        }
        return tempsVol;
    }

    double retourneTempsVolDouble(){
        double tempsVol = 0;
        for (int i = 0; i < nbVol; i++) {
            if (listVol[i].estVolDouble) {
                tempsVol += listVol[i].duree;
            }
        }
        return tempsVol;
    }

    double retourneCoutVol(){
        double coutVol = 0;
        for (int i = 0; i < nbVol; i++) {
            coutVol += listVol[i].retourneCoutVol();
        }
        return coutVol;
    }


    void afficherTempsVol() {
        System.out.println("Temps de vol en commandant de bord : " + retourneTempsVolSeul());
        System.out.println("Temps de vol en double commande : " + retourneTempsVolDouble());
    }

    void afficherCoutVol() {
        System.out.println("Cout des vols total : " + retourneCoutVol());
    }

}
