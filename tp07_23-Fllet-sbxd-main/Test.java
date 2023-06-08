import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class Test {


    private static void chargerDonneesEtudiants(String path) {
        ///FileToStr.lireCsv pour lire le fichier et stocker les donnees dans une liste appelée lignes
        String[] lignes = FileToStr.lireCsv("C:/Users/im_br/Documents/HEG_IG/Prog 2/codes/TP's/Tp07_23-Fllet-sbxd-main/etudiants.csv");

        //declaration de la liste etudiants
        ArrayList<Etudiant> etudiants = new ArrayList<>();

        //Pour chaque ligne de la liste lignes, on split la ligne en fonction du caractère ";" et on stocke les valeurs dans une liste appelée valeurs
        for (String ligne : lignes) {
            String[] valeurs = ligne.split(";");

            //stocker les valeurs qu'on a besoin dans la liste etudiants
            Etudiant etudiant = new Etudiant(Integer.parseInt(valeurs[0]), valeurs[1], valeurs[2]);
            etudiants.add(etudiant);


        }
        //test pour voir ce qu'on a dans la liste etudiants - result ok
        //System.out.println(etudiants);

    }

    private static HashMap<Integer, ArrayList<Note>> chargerDonneesNotes(String path) {
        // Read in data from CSV file
        String[] lignes = FileToStr.lireCsv("C:/Users/im_br/Documents/HEG_IG/Prog 2/codes/TP's/Tp07_23-Fllet-sbxd-main/notes.csv");

        // Create HashMap to store notes by student ID
        HashMap<Integer, ArrayList<Note>> notesByStudent = new HashMap<>();

        // Loop through each line of CSV file and create Note objects
        for (String ligne : lignes) {
            String[] valeurs = ligne.split(";");

            int idEtudiant = Integer.parseInt(valeurs[0]);
            String cours = valeurs[1];
            double resultat = Double.parseDouble(valeurs[2]);
            int coefficient = Integer.parseInt(valeurs[3]);

            Note note = new Note(cours, resultat, coefficient);

            // Add note to list for this student ID in HashMap
            if (!notesByStudent.containsKey(idEtudiant)) {
                notesByStudent.put(idEtudiant, new ArrayList<>());
            }

            notesByStudent.get(idEtudiant).add(note);
        }
        //test pour voir ce qu'on a dans la liste notesByStudent - result ok
        //System.out.println(notesByStudent);

        return notesByStudent;
    }

    private static void afficheMoyenneEtudiant() {
        // Call method chargerDonneesNotes
        HashMap<Integer, ArrayList<Note>> notesByStudent = chargerDonneesNotes("C:/Users/im_br/Documents/HEG_IG/Prog 2/codes/TP's/Tp07_23-Fllet-sbxd-main/notes.csv");

        // Loop through each student ID and list of notes
        for (Map.Entry<Integer, ArrayList<Note>> entry : notesByStudent.entrySet()) {
            int idEtudiant = entry.getKey();
            ArrayList<Note> notes = entry.getValue();

            // Calculate the overall average grade for the student
            double totalCoefficient = 0.0;
            double totalResultat = 0.0;
            for (Note note : notes) {
                totalCoefficient += note.getCoefficient();
                totalResultat += (note.getResultat() * note.getCoefficient());
            }
            double moyenneGenerale = (totalResultat / totalCoefficient);

            //convertir la moyenneGenerale avec 1 chiffre après la virgule avec le decimal superieur - Error quelque part!!!
               moyenneGenerale = Math.ceil(moyenneGenerale * 10) / 10;

            // test to print out the results for the student - result ok ,  error calcul moyenneGenerale
            //System.out.println("id " + idEtudiant);
            //System.out.println(moyenneGenerale);
        }
    }

    private static void afficheNoteEtudiant(Etudiant e){
        // method qui va afficher les notes des tous les etudiants par cours

        // Call method chargerDonneesNotes
        HashMap<Integer, ArrayList<Note>> notesByStudent = chargerDonneesNotes("C:/Users/im_br/Documents/HEG_IG/Prog 2/codes/TP's/Tp07_23-Fllet-sbxd-main/notes.csv");
        //declaration de la liste notesEtudiant
        ArrayList<Note> notesEtudiant = new ArrayList<>();

        //call method chargerDonneesEtudiants
        chargerDonneesEtudiants("C:/Users/im_br/Documents/HEG_IG/Prog 2/codes/TP's/Tp07_23-Fllet-sbxd-main/etudiants.csv");
        //declaration de la liste etudiants
        ArrayList<Etudiant> etudiants = new ArrayList<>();

        ///recuperer l'id du etudiant e
        int idEtudiant = e.getId();

        // Loop through each student ID and list of notes
        for (Map.Entry<Integer, ArrayList<Note>> entry : notesByStudent.entrySet()) {
            int idEtudiant2 = entry.getKey();
            ArrayList<Note> notes = entry.getValue();

            //si l'id du etudiant e est egal a l'id du etudiant dans la liste notesByStudent
            if (idEtudiant == idEtudiant2) {
                //on stocke les notes de l'etudiant e dans la liste notesEtudiant
                notesEtudiant = notes;
            }

        }
        }



    private static void afficheMoyenneParMatiere(){
        // A développer - pas reussi a finir

    }

    public static void main(String[] args) {
        String localDir = System.getProperty("user.dir");
        if(System.getProperty("os.name").contains("Windows")){
           chargerDonneesEtudiants(localDir + "\\src\\etudiants.csv");
           chargerDonneesNotes(localDir + "\\src\\notes.csv");
        }else{
          chargerDonneesEtudiants(localDir + "/src/etudiants.csv");
            chargerDonneesNotes(localDir + "/src/notes.csv");
        }

        afficheMoyenneEtudiant();
        System.out.println();
        afficheNoteEtudiant(new Etudiant("Cerizo","Cecilia"));
        System.out.println();
        afficheMoyenneParMatiere();
    }
}
