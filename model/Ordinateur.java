package model;

/**
 * La classe {@code Ordinateur} représente un appareil de type ordinateur.
 * Elle hérite de {@code AppareilBase} et implémente la méthode {@code activer} 

 */
public class Ordinateur extends AppareilBase 
{
    /**
     * Le constructeur initialise un ordinateur avec un identifiant, un nom, 
     * @param identifiant L'identifiant unique de l'ordinateur.
     * @param nom Le nom de l'ordinateur.
     * @param prixDeBase Le prix de base de l'ordinateur.
     */
    public Ordinateur(String identifiant, String nom, double prixDeBase) 
    {
        super(identifiant, nom, prixDeBase, AppareilType.ORDINATEUR);   }

    /**
     * Cette méthode simule l'activation de l'ordinateur en affichant un message indiquant
     */
    @Override
    public void activer() 
    {
        System.out.println("L'ordinateur " + nom + " est en cours de démarrage...");  
    }
}
