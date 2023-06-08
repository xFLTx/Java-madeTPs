import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Plat p1 = new Plat("Cassoulet", "Plat");
        Plat p2 = new Plat("Pâtes au saumon", "Plat");
        Plat p3 = new Plat("Salade verte", "Entrée");
        Plat p4 = new Plat("Assiette Valaisanne", "Entrée/Plat");
        Plat p5 = new Plat("Coupe Danemark", "Dessert");
        Plat p6 = new Plat("Quiche Lorraine", "Plat");
        Plat p7 = new Plat("Pizza 4 saisons", "Plat");
        Plat p8 = new Plat("Tartare d'aubergines", "Entrée");
        Plat p9 = new Plat("Salade Niçoise", "Entrée/Plat");
        Plat p10 = new Plat("Profiteroles", "Dessert");
        Menu m1 = new Menu("du jour", 35);
        Menu m2 = new Menu("de saison", 40);
        Menu m3 = new Menu("duo", 60);
        Menu m4 = new Menu("enfant", 25);
        Menu m5 = new Menu("découverte", 45);

        // Add plats to menus
        m1.ajouterPlat(p1);
        m1.ajouterPlat(p2);
        m1.ajouterPlat(p3);
        m1.ajouterPlat(p4);
        m1.ajouterPlat(p5);
        m1.ajouterPlat(p6); //test for error message

        m2.ajouterPlat(p6);
        m2.ajouterPlat(p7);
        m2.ajouterPlat(p8);
        m2.ajouterPlat(p9);
        m2.ajouterPlat(p10);

        m3.ajouterPlat(p1);
        m3.ajouterPlat(p2);
        m3.ajouterPlat(p3);
        m3.ajouterPlat(p4);
        m3.ajouterPlat(p5);

        m4.ajouterPlat(p6);
        m4.ajouterPlat(p7);
        m4.ajouterPlat(p8);
        m4.ajouterPlat(p9);
        m4.ajouterPlat(p10);

        m5.ajouterPlat(p1);
        m5.ajouterPlat(p2);
        m5.ajouterPlat(p3);
        m5.ajouterPlat(p4);
        m5.ajouterPlat(p5);

        //methode pour rechercher un plat dans les menus et afficher les menus qui le contiennent
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom d'un plat :");
        String nomPlat = sc.nextLine();
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(m1);
        menus.add(m2);
        menus.add(m3);
        menus.add(m4);
        menus.add(m5);
        for (Menu menu : menus) {
            ArrayList<Plat> plats = menu.getPlats();
            for (Plat plat : plats) {
                if (plat.getNom().equals(nomPlat)) {
                    System.out.println(menu.getNom());
                }
            }
        }
    }
}
