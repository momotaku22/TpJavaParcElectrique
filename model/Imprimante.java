package model;

/**
 * La classe {@code Imprimante} représente un appareil de type imprimante.
 * Elle hérite de {@code AppareilBase} et implémente la méthode {@code activer} pour spécifier 

 */
public class Imprimante extends AppareilBase {

    /**
     * Le constructeur initialise une imprimante avec un identifiant, un nom, 
     
     * @param identifiant L'identifiant unique de l'imprimante.
     * @param nom Le nom de l'imprimante.
     * @param prixDeBase Le prix de base de l'imprimante.
     */
    public Imprimante(String identifiant, String nom, double prixDeBase) {
        super(identifiant, nom, prixDeBase, AppareilType.IMPRIMANTE); }

    /**
     * Cette méthode simule l'activation de l'imprimante en affichant un message indiquant
    .
     */
    @Override
    public void activer() {
        System.out.println("L'imprimante " + nom + " commence l'impression...");  }
}
