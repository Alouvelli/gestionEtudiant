package com.mycompany.app.service.console;

import com.mycompany.app.domain.Etudiant;
import com.mycompany.app.domain.Loge;
import com.mycompany.app.service.DisplayeEtudiant;

import java.util.Scanner;

public class ConsoleDisplayEtudiant implements DisplayeEtudiant {
    @Override
    public void afficherBienvenu() {
        System.out.println("Bienvenue sur La plateForme ");
    }

    @Override
    public void afficherMenuPrincipal() {
        System.out.println("-------------- -1- liste des etudiants----------------");
        System.out.println("-------------- -2- ajouter un etudiant----------------");
        System.out.println("-------------- -3- modifier un etudiant---------------");
        System.out.println("-------------- -4- supprimer un etudiant--------------");
    }

    @Override
    public void afficherListeEtudiants(Etudiant[] etudiants) {
        System.out.println("Les etudiants disponibles sont:");
        for (int i = 0; i < etudiants.length; i++) {
            Etudiant etudiant = etudiants[i];
            System.out.println(String.format("> %s %s %s %s %s %s", etudiant.getMatricule(), etudiant.getNom(), etudiant.getPrenom(), etudiant.getDatenais(), etudiant.getTel(), etudiant.getClasse()));
        }
    }

    @Override
    public Etudiant addEtudiant() {
        Etudiant etudiant = new Etudiant();
        Scanner sc = new Scanner(System.in);
        etudiant.saisie();
       /* System.out.println("entrer le matricule");
        etudiant.setMatricule(sc.nextLine());
        System.out.println("entrer le nom");
        etudiant.setNom(sc.nextLine());
        System.out.println("entrer le prénom");
        etudiant.setPrenom(sc.nextLine());
        System.out.println("entrer la date de naissance");
        etudiant.setDatenais(sc.nextLine());
        System.out.println("entrer le téléphone");
        etudiant.setTel(sc.nextLine());
        System.out.println("entrer la classe");
        etudiant.setClasse(sc.nextLine());*/

        return etudiant;
    }

    @Override
    public void afficherOptionInconnue() {
        System.out.println("Menu Introuvable");
    }

    @Override
    public Etudiant updateEtudiant() {
        Etudiant etudiant = new Etudiant();
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer l'id de l'étudiant");
        System.out.println("entrer le matricule de l'etudiant");
        etudiant.setMatricule(sc.nextLine());
        System.out.println("entrer le nom");
        etudiant.setNom(sc.nextLine());
        System.out.println("entrer le prénom");
        etudiant.setPrenom(sc.nextLine());
        System.out.println("entrer la date de naissance");
        etudiant.setDatenais(sc.nextLine());
        System.out.println("entrer le téléphone");
        etudiant.setTel(sc.nextLine());
        System.out.println("entrer la classe");
        etudiant.setClasse(sc.nextLine());

        return  etudiant;
    }

    @Override
    public int deleteEtudiant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir l'id de l'étudiant à supprimer");
        return  scanner.nextInt();
    }
}
