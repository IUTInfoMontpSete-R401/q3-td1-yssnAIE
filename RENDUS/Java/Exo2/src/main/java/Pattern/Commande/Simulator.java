package Commande;

import java.util.HashMap;
import java.util.Map;

public class Simulator {

    private Map<String, Commande> listeCommande;

    public Simulator() {
        this.listeCommande = new HashMap<>();
    }

    public void setCommande(String nom, Commande c) {
        listeCommande.put(nom, c);
    }

    public void executeCommande(String c){
        listeCommande.get(c).execute();
    }
}
