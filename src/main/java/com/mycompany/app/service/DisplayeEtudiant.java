package com.mycompany.app.service;

import com.mycompany.app.domain.Etudiant;
import com.mycompany.app.domain.Loge;

public interface DisplayeEtudiant {
    void afficherBienvenu();
    void afficherMenuPrincipal();
    void afficherListeEtudiants(Etudiant[] etudiants);
    Etudiant addEtudiant();
    void  afficherOptionInconnue();
    Etudiant updateEtudiant();
    int deleteEtudiant();
    /*void afficherListeLoge(Loge[] loges);
    Loge addLoge();
    Loge updateLoge();
    int deleteLoge();*/
}
