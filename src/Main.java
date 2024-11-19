public class Main {

    public static void main(String[] args) {

        Avion cessna150 = new Avion("F-BUBK", 100);
        Avion dr400 = new Avion("F-GKQA", 130);
        Carnet carnet = new Carnet();

        Vol vol1 = new Vol(cessna150, "19/11/2024", 60, false);
        Vol vol2 = new Vol(dr400, "19/11/2024", 180, true);
        Vol vol3 = new Vol(cessna150, "19/11/2024", 30, false);

        carnet.ajouterVol(vol1);
        carnet.ajouterVol(vol2);
        carnet.ajouterVol(vol3);

        carnet.afficherVol();
        carnet.afficherTempsVol();
        carnet.afficherCoutVol();

    }
}
