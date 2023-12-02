public class Client {
    public static void main(String[] args) throws Exception {
        Element racine = new Dossier(" Ma racine");
        Element dossier1 = new Dossier("UE318");
        Element fichier1 = new FichierTXT("TP12m3456.txt");
        Element fichier2 = new FichierPDF("Fichier2.pdf");

        racine.ajouter(dossier1);
        dossier1.ajouter(fichier1);
        dossier1.ajouter(fichier2);

        racine.decrire();
    }
}
