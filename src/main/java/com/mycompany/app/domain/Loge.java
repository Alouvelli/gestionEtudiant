package com.mycompany.app.domain;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Loge extends Etudiant {
    public String batiment,chambre;
    public int typeBourse,montant;

    public String getBatiment() {
        return batiment;
    }

    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    public String getChambre() {
        return chambre;
    }

    public void setChambre(String chambre) {
        this.chambre = chambre;
    }

    public int getTypeBourse() {
        return typeBourse;
    }

    public void setTypeBourse(int typeBourse) {
        this.typeBourse = typeBourse;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
    public Loge(){

    }

    public Loge(String prenom, String nom, String matricule, String datenais, String tel ,String classe, String batiment, String chambre, int typeBourse, int montant) {
        super(prenom, nom, matricule, datenais,tel, classe);
        this.batiment = batiment;
        this.chambre = chambre;
        this.typeBourse = typeBourse;
        this.montant = montant;
    }
    public String show(){
        return "[ " +super.show() +", " +batiment +", " +chambre +" ," +typeBourse +", "+montant+"]";
    }
    public String toString(){
        return "[ " +super.toString() +", " +batiment +", " +chambre +" ," +typeBourse +", "+montant+"]";
    }
    public void saisie(){
        super.saisie();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer votre numero de batiment");
        batiment=sc.nextLine();
        System.out.println("Entrer votre numero de chambre");
        chambre=sc.nextLine();
        System.out.println("Saisir 0 pour demi bourse ou 1 pour bourse entiere");
        do{
            System.out.println("Entrer votre type de bourse");
            typeBourse=sc.nextInt();
        }while (typeBourse!=0&&typeBourse!=1);
        montant=(typeBourse==0?20000:40000);
        //sc.close();

    }
}
