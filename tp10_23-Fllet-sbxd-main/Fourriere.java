///imports
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

///methods
public class Fourriere {

    ///attributs de cette classe

    ///listes par etat
    private static ArrayList<Vehicule> vehiculesStationnement = new ArrayList<Vehicule>();
    private static ArrayList<Vehicule> vehiculesAbandon = new ArrayList<Vehicule>();
    private static ArrayList<Vehicule> vehiculesCasse = new ArrayList<Vehicule>();


    ///listes par type
    private static ArrayList<Vehicule> vehiculesVoiture = new ArrayList<Vehicule>();
    private static ArrayList<Vehicule> vehiculesMoto = new ArrayList<Vehicule>();


    private static void afficherParTypeVehicule(){
        ///methode qui va afficher les vehicules par type separé par une ligne "---------------"


        System.out.println("Voitures :");
        for (Vehicule v : vehiculesVoiture) {
            System.out.println(v);
        }

        System.out.println("---------------");

        System.out.println("Motos :");
        for (Vehicule v : vehiculesMoto) {
            System.out.println(v);
        }
        
    }

    private static void afficherParEtat(){
        ///methode qui va afficher les vehicules par etat separé par une ligne "---------------"
        System.out.println("__________________Affichage par etat__________________");
        System.out.println("Stationnement :");
        for (Vehicule v : vehiculesStationnement) {
            System.out.println(v);
        }

        System.out.println("-------Casse--------");
        for (Vehicule v : vehiculesCasse) {
            System.out.println(v);
        }

        System.out.println("-------Abandon--------");
        for (Vehicule v : vehiculesAbandon) {
            System.out.println(v);
        }


        
    }

    private static void insertionHashMap(Vehicule v, String etat){
        
    }

    private static void liberationVehicule()  {
        ///cette methode vide la les arraylist de vehicules abandonnés et cassés
        vehiculesAbandon.clear();
        vehiculesCasse.clear();

        ///partie du code qui va chercher dans la liste des vehicules et motos et vider les lignes avec Casse ou abbandon
        ///utiliser iterator pour parcourir la liste et supprimer les lignes avec Casse ou abbandon

        for (Iterator<Vehicule> iterator = vehiculesVoiture.iterator(); iterator.hasNext();) {
            Vehicule v = iterator.next();
            if (v.getEtat().equals("Casse") || v.getEtat().equals("Abandon")) {
                iterator.remove();
            } else {
                // Rien
            }}

         for (Iterator<Vehicule> iterator = vehiculesMoto.iterator(); iterator.hasNext();) {
            Vehicule v = iterator.next();
            if (v.getEtat().equals("Casse") || v.getEtat().equals("Abandon")) {
                iterator.remove();
            } else {
                // Rien
            }
         }

        
    }

    private static void chargerDonnees(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine(); // permet de sauter la première ligne (en-tête)
            while ((line = reader.readLine()) != null) {
                ///definition de chaque attribut en recuperant les données du fichier csv
                String[] data = line.split(";");
                String typeVehicule = data[0];
                String immatriculation = data[1];
                String marque = data[2];
                String modele = data[3];
                String etat = data[4];
                int cylindreeOuNbPortes = Integer.parseInt(data[5]);

                // Ajouter le véhicule à la structure de données globale
                Vehicule vehicule = null;
                if (typeVehicule.equals("Voiture")) {
                    vehicule = new Voiture(immatriculation, marque, modele, etat, cylindreeOuNbPortes);
                    vehiculesVoiture.add(vehicule);
                } else if (typeVehicule.equals("Moto")) {
                    vehicule = new Moto(immatriculation, marque, modele, etat, cylindreeOuNbPortes);
                    vehiculesMoto.add(vehicule);
                }


                // Ajouter le véhicule à la structure de données par état
                switch (etat) {
                    case "Stationnement":
                        vehiculesStationnement.add(vehicule);
                        break;
                    case "Abandon":
                        vehiculesAbandon.add(vehicule);
                        break;
                    case "Casse":
                        vehiculesCasse.add(vehicule);
                        break;
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Erreur de lecture du CSV : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String localDir = System.getProperty("user.dir");

        ///j'ai change l'appel a la fonction
        chargerDonnees("C:\\Users\\im_br\\Documents\\HEG_IG\\Prog 2\\codes\\TP's\\tp10_23-Fllet-sbxd-main\\vehicules.csv");

        afficherParTypeVehicule();
        afficherParEtat();

        liberationVehicule();

        System.out.println("__________________Apres liberation__________________");
        afficherParTypeVehicule();
        afficherParEtat();
    }
}
