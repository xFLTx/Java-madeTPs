import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;




public class GestionnaireTaches {
    private static ArrayList<Tache> listeTaches = new ArrayList<>();
    ///private static HashMap<String, ArrayList<Tache>> mapTaches = new HashMap<>();


    public static void chargerDonnees(String[][] donnees) {
        //Buffered reader to read the file taches.csv
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("taches.csv"));
            String line = br.readLine();
            while (line != null) {
                String[] a = line.split(";"); /// split the line by comma
                ///declare what is what
                Integer priorite = Integer.valueOf(a[0]); ///this will convert my string to integer
                String dateEcheance = a[1];
                String description = a[2];
                ///create a new object tache
                Tache tache = new Tache(priorite, dateEcheance, description);
                ///add the object to the arraylist
                listeTaches.add(tache);
                ///read the next line
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        public static void separateur(String nom) {
            if (nom.equals("no"))
                System.out.println("\n------------------------------\n");
            else {
                System.out.println("\n------------------------------\n");
                System.out.println("\033[1m Tâches triées par " + nom + " \033[0m");
            }
        }

      public static void afficherTaches(String tri) {
        ///methode qui print la tout la liste des taches 1 par ligne
        for (Tache tache : listeTaches) {
            System.out.println(tache);
        }
    }

    ///methode create or delete csv file
    ///cette methode va analyser si le fichier existe deja ou pas effacer et creer un nouveau a chaque fois
    public static void createOrDeleteCSVFile(String filename, String filename2, String filename3) {
        ///create a new file
        File file = new File(filename);
        File file2 = new File(filename2);
        File file3 = new File(filename3);
        ///check if the file exist
        try {
            if (file.exists() || file2.exists() || file3.exists()) {
                if (file.delete() && file2.delete() && file3.delete()) {
                    System.out.println("Existing CSV files deleted successfully.");
                } else {
                    System.out.println("Failed to delete the existing CSV files.");
                    return; // Exit the method if deletion fails
                }
            }

            if (file.createNewFile() && file2.createNewFile() && file3.createNewFile()) {
                System.out.println("New CSV files created successfully.");
            } else {
                System.out.println("Failed to create the new CSV files.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    ///filewriter qui va ecrire dans le fichier taches.csv
    public static void sauvegarderTaches(String filename, ArrayList<Tache> listeTaches) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(filename);
            for (Tache tache : listeTaches) {
                fw.write(tache.toString() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    ///ignore VV
    ///methode qui va mettre l'arraylist dans le hashmap, elle verifie si la cle existe deja ou pas et va la creer ou pas meme chose pour la liste
    //public static void ajoutMap(String cle, ArrayList<Tache> listeTaches){
      //  if (mapTaches.containsKey(cle)) {
        //    mapTaches.get(cle).addAll(listeTaches);
        //} else {
         //   mapTaches.put(cle, listeTaches);
        //}
    //}
    

    public static void main(String[] args) {

        ///calling the method chargerDonnees and giving the file taches.csv
        chargerDonnees(FileToStr.lireCsv("taches.csv"));

        ///calling the method create or delete csv file and giving names to each file
        String filename = "tachesPriorite.csv";
        String filename2 = "tachesDate.csv";
        String filename3 = "tachesDescription.csv";
        createOrDeleteCSVFile(filename, filename2, filename3);

        ///creation des 3 arraylist pour chaque tri
        ArrayList<Tache> listeTachesPriorite = new ArrayList<>();
        ArrayList<Tache> listeTachesDate = new ArrayList<>();
        ArrayList<Tache> listeTachesDescription = new ArrayList<>();

        ///ignore VV
        //ajoutMap("Priorité DSC", listeTachesPriorite);
        //ajoutMap("Date d'échéance", listeTachesDate);
        //ajoutMap("Description", listeTachesDescription);

        ///debut main
        separateur("Aucun tri");
        afficherTaches(" Aucun tri (ordre d'insertion)");

        ///partie des priorites
        separateur("Priorité DSC");
        Collections.sort(listeTaches, new SortPriorite());
        listeTachesPriorite.addAll(listeTaches); /// add all the elements of listeTaches to listeTachesPriority for this example
        afficherTaches("Priorité DSC");
        sauvegarderTaches(filename, listeTachesPriorite);

        ///partie des dates
        separateur("Date d'échéance");
        Collections.sort(listeTaches, new SortDate());
        listeTachesDate.addAll(listeTaches);
        afficherTaches("Date d'échéance");
        sauvegarderTaches(filename2, listeTachesDate);

        ///partie des descriptions
        separateur("Description");
        Collections.sort(listeTaches, new SortDescription());
        listeTachesDescription.addAll(listeTaches);
        afficherTaches("Description");
        sauvegarderTaches(filename3, listeTachesDescription);

        ///partie des taches triees par tri naturel
        separateur("naturel");
        Collections.sort(listeTaches);
        afficherTaches("naturel");

        separateur("no");

    }
}
