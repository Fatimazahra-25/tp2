/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author hp
 */
public class Compte {
    private String rib;
    private double solde;
    private boolean ouvert;
   private  char groupe;

    public Compte() {
    }

    public Compte(String rib, double solde, boolean overt, char groupe) {
        this.rib = rib;
        this.solde = solde;
        this.ouvert = overt;
        this.groupe = groupe;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public boolean isOvert() {
        return ouvert;
    }

    public void setOvert(boolean ouvert) {
        this.ouvert = ouvert;
    }

    public char getGroupe() {
        return groupe;
    }

    public void setGroupe(char groupe) {
        this.groupe = groupe;
    }

    public boolean isOuvert() {
        return ouvert;
    }

    public void setOuvert(boolean ouvert) {
        this.ouvert = ouvert;
    }
    
    

    @Override
    public String toString() {
        return "Compte{" + "rib=" + rib + ", solde=" + solde + ", overt=" + ouvert + ", groupe=" + groupe + '}';
    }


}

