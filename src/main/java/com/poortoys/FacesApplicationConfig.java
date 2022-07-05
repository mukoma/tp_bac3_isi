
package com.poortoys;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;

/**
 * Initialise JavaServer Faces applications.
 *
 */
@FacesConfig
@ApplicationScoped
public class FacesApplicationConfig {
    private int Id;
    private String nom;
    private String prenom;
    private String competence;

    // le constructeur par defaut
    public FaccesApplicationConfig(){
     id  = 0;
     nom = "aucun_nom";
     prenom = "aucun_prenom";
     competence = "aucune competance"
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }
}
