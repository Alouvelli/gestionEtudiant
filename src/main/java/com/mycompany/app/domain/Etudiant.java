package com.mycompany.app.domain;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Etudiant{

    private String prenom;
    private String nom;
    private String matricule;
    private String classe;
    private String datenais;
    private String tel;


    public static void setNbEtudiant(int nbEtudiant) {
        Etudiant.nbEtudiant = nbEtudiant;
    }


    private static int nbEtudiant = 0;

    public Etudiant(){
        nbEtudiant++;
    }

    public Etudiant(String prenom, String nom, String matricule, String datenais,String tel, String classe) {
        nbEtudiant++;
        this.prenom = prenom;
        this.nom = nom;
        this.matricule = matricule;
        this.datenais = datenais;
        this.tel = tel;
        this.classe = classe;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getDatenais() {
        return datenais;
    }

    public void setDatenais(String datenais) {
        this.datenais = datenais;
    }
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public String show(){
        return "[ " +matricule +", " +nom +", " +prenom +" ," +datenais +", " +classe +" ," +tel +"]";
    }
    public String toString(){
        return "[ " +matricule +", " +nom +", " +prenom +" ," +datenais +"]";
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    public static int getNbEtudiant() {
        return nbEtudiant;
    }
    public void saisie(){
        Scanner sc = new Scanner(System.in);
        matricule="M"+new DecimalFormat("0000").format(Etudiant.getNbEtudiant());
        System.out.println("matricule: "+matricule);
        System.out.println("Entrer le prenom");
        prenom=sc.nextLine();
        System.out.println("Entrer le nom");
        nom=sc.nextLine();
        System.out.println("Entrer la date de naisssance");
        datenais = sc.nextLine();
        System.out.println("entrer le téléphone");
        tel=sc.nextLine();
        System.out.println("entrer la classe");
        classe = sc.nextLine();
        //sc.close();

    }
}




/*
import java.time.LocalDate;

public abstract class Etudiant {
    private int id;
    private String nom;
    private  String prenom;
    private String tel, matricule;
    private LocalDate datenais;
    private Classe classe;

    public Etudiant(int id, String nom, String prenom, String tel, String matricule, LocalDate datenais, Classe classe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.matricule = matricule;
        this.classe = classe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public LocalDate getDatenais() {
        return datenais;
    }

    public void setDatenais(LocalDate datenais) {
        this.datenais = datenais;
    }


    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}
*/