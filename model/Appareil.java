package model;

/**
 * L'interface {@code Appareil} définit les comportements communs que tous les types d'appareils doivent implémenter.
 */
public interface Appareil 
{
    /**
     * Méthode qui permet d'activer l'appareil.
  
     */
    void activer();

    /**
     * Récupère la description de l'appareil.
     * @return La description de l'appareil sous forme de chaîne de caractères.
     */
    String getDescription();

    /**
     * Récupère le prix final de l'appareil.
     * @return Le prix final de l'appareil en double.
     */
    double getPrixFinal();

    /**
     * Récupère l'identifiant unique de l'appareil.
     * @return L'identifiant de l'appareil sous forme de chaîne de caractères.
     */
    String getIdentifiant();
}
