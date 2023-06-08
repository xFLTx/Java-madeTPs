import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

import static java.lang.Math.round;

public class Etudiant {
    //attributs

    private int id;
    private String nom;
    private String prenom;

    //constructeur
    public Etudiant(int id, String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;

    }

    //getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }



    // Override toString() method to return a string representation of the object.
    @Override
    public String toString(){
        return nom;
    }





}
