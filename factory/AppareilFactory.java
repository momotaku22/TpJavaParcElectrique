package factory;

import model.*;

/**
 * Dans la classe {@code AppareilFactory}, je crée une fabrique d'appareils. Cette classe permet de créer des objets
 * de type {@code Appareil} en fonction de leur type, comme des ordinateurs ou des imprimantes.
 */
public class AppareilFactory 
{
    /**
     * Cette méthode permet de créer un appareil en fonction des paramètres donnés. Selon le type spécifié,
     
     * 
     * @param identifiant L'identifiant unique de l'appareil.
     * @param nom Le nom de l'appareil.
     * @param prixDeBase Le prix de base de l'appareil.
     * @param type Le type d'appareil à créer (par exemple ORDINATEUR, IMPRIMANTE).
     * @return L'appareil créé en fonction du type. Si une erreur survient, null est retourné.
     */
    public static Appareil createAppareil(String identifiant, String nom, double prixDeBase, AppareilType type) 
    {
        try 
        {
            switch (type) 
            {
                case ORDINATEUR:
                    return new Ordinateur(identifiant, nom, prixDeBase);  
                case IMPRIMANTE:
                    return new Imprimante(identifiant, nom, prixDeBase); 
                default:
                    
                    throw new IllegalArgumentException("Type d'appareil inconnu: " + type);
            }
        } catch (IllegalArgumentException e) {
           
            System.err.println("Erreur lors de la création de l'appareil : " + e.getMessage());
            return null;  
        }
    }
}
