/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author hp
 */
public class CompteService {

    public Compte ouvrirCompte(String rib, double soldeInitial) {
        Compte compte = new Compte();
        compte.setRib(rib);
        compte.setSolde(soldeInitial);
        compte.setOuvert(true);
        if (compte.getSolde() >= 0 && compte.getSolde() < 200) {
            compte.setGroupe('D');
        } else if (compte.getSolde() < 1000) {
            compte.setGroupe('C');
        } else if (compte.getSolde() < 6000) {
            compte.setGroupe('B');
        } else if (compte.getSolde() >= 6000) {
            compte.setGroupe('A');
        }
        return compte;
    }

    public int fermerCompte(Compte compte) {
        if (compte.isOuvert() == false) {
            return -1;
        } else if (compte.getSolde() != 0) {
            return -2;
        } else {
            compte.setOuvert(false);
            return 1;
        }

    }

    public int crediter(Compte compte, double montantCredit) {
        if (compte.isOuvert() == false) {
            return -1;
        } else {
            double nvSolde = compte.getSolde() + montantCredit;
            compte.setSolde(nvSolde);
            return 1;
        }

    }

    public int debiter(Compte compte, double montantDebit) {
        if (compte.isOuvert() == false) {
            return -1;
        } else if (compte.getSolde() < montantDebit) {
            return -2;

        } else {
            double soldeRestant = compte.getSolde() - montantDebit;
            if (soldeRestant < 100) {
                return -3;
            } else if (montantDebit > 6000) {
                return -4;
            } else {
                compte.setSolde(soldeRestant);
                return 1;
            }
        }

    }
    
    public int transferer(Compte compteSource, Compte compteDestination ,double montant){
    double nvSolde = compteSource.getSolde() - montant;
        if (nvSolde < 0) {
            return -1;
        } else {
            compteSource.setSolde(nvSolde);
            compteDestination.setSolde(compteDestination.getSolde() + montant);
            return 1;
        }
    
    }
     public Compte findByRib(String rib, List<Compte> comptes) {
        for (int i = 0; i < comptes.size(); i++) {
            Compte compte = comptes.get(i);
            if (compte.getRib() == null ? rib == null : compte.getRib().equals(rib)) {
                return compte;
            }
        }
        return null;
    }

    
}
