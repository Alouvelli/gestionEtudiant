package com.mycompany.app.domain;


import java.time.LocalDate;
import java.util.Scanner;

public class NonLoge extends Etudiant{
    private String adresse;
    private static int aide=1000000;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public static int getAide() {
        return aide;
    }

    public static void setAide(int aide) {
        NonLoge.aide = aide;
    }

    public NonLoge() {

    }

    public NonLoge(String prenom, String nom, String matricule,String tel, String classe, String datenais, String adresse) {
        super(prenom, nom, matricule, datenais, tel, classe);
        this.adresse = adresse;
    }
    public String show(){
        return "[ " +super.show() +", " +adresse+", " +aide+"]";
    }
    public String toString(){
        return "[ " +super.show() +", " +adresse+", " +aide+"]";
    }
    /*public void saisie(){
        super.saisie();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer votre adresse");
        adresse=sc.nextLine();
        // sc.close();

    }*/

}

