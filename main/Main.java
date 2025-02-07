package main;

import decorator.OptionPerformance;
import decorator.OptionSecurite;
import factory.AppareilFactory;
import inventory.Inventaire;
import model.Appareil;
import model.AppareilType;

public class Main {
    public static void main(String[] args) 
    {
        try {
            // Ici, je crée des appareils en utilisant la méthode statique de la Factory.
            
            Appareil ordi = AppareilFactory.createAppareil("momotaku","mouhamed",100,AppareilType.ORDINATEUR);
            Appareil imprimante = AppareilFactory.createAppareil("ZZED","ZINO",100,AppareilType.IMPRIMANTE);

            // Ici, je récupère l'instance unique de l'inventaire grâce au singleton Inventaire.
           
            Inventaire inventaire = Inventaire.getInstance();
            inventaire.ajouterAppareil(ordi);
            inventaire.ajouterAppareil(imprimante);

            // Ici, je décore l'ordinateur avec l'option Performance et Sécurité.
          
            Appareil ordiBoost = new OptionPerformance(new OptionSecurite(ordi));

            System.out.println("\n Ordinateur avec options :");
            // Je récupère et affiche la description de l'ordinateur boosté, ainsi que son prix final.
           
            System.out.println(ordiBoost.getDescription() + " - Prix Final: " + ordiBoost.getPrixFinal() + "€");

            // J'active l'ordinateur après avoir appliqué les décorateurs (options de performance et de sécurité).
            ordiBoost.activer();
        } catch (Exception e) 
        {
            // En cas d'erreur, je capture et affiche le message d'exception.
            System.err.println("Erreur inattendue : " + e.getMessage());
        }
    }
}

