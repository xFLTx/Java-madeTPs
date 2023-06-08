//Main class pour ecole.java


public class Main {
    public static void main(String[] args ){
    //creation des objets
        ecole e1 = new ecole("Haute ecole de gestion", "Route de drize 19", "publique", 5, "superieur", "gestion", 1500);
        ecole e2 = new ecole("Shultz", "Route du lac 29", "privee", 2, "secondaire", "Economie", 200);
        ecole e3 = new ecole("Collège Saint-Louis", "Route de Corzier 23", "privee", 3, "Secondaire", "General", 400);
        ecole e4 = new ecole("Collège Saint-Louis", "Route de Corsier 23", "Privee", 3, "Secondaire", "Mathématiques", 50);
        ecole e5 = new ecole("Collège de Carouge", "Route des Centenaires 34", "Publique", 4, "Secondaire", "Général", 1500);
        ecole e6 = new ecole("Collège de Carouge", "Route des Centenaires 34", "Publique", 4, "Secondaire", "Général", 500);


        //println
        System.out.println("Affichage des écoles: \n-----------------------------");
        System.out.println(e1 + "\n");
        System.out.println(e2 + "\n");
        System.out.println(e3 + "\n");
        System.out.println(e4 + "\n");
        System.out.println(e5 + "\n");
        System.out.println(e6 + "\n");

        System.out.println();

        //equals
        System.out.println("Test des égalités: \n -----------------------------");
        System.out.println(e3.equals(e4)+"\n");
        System.out.println(e5.equals(e6)+"\n");

        }
}



