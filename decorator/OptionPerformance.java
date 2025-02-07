package decorator;

import model.Appareil;

/**
 * Ici, je crée la classe {@code OptionPerformance} qui est un décorateur. Elle permet d'ajouter 
 * une option de performance optimisée à un appareil. Elle hérite de la classe {@code AppareilDecorator},
 */
public class OptionPerformance extends AppareilDecorator 
{
    /**
     * Dans le constructeur, je décore l'appareil avec l'option de performance.
     * 
     * @param appareil L'appareil que je vais décorer avec cette option.
     */
    public OptionPerformance(Appareil appareil) 
    {
        super(appareil);
    }

    /**
     * Je récupère ici la description de l'appareil décoré avec l'option de performance optimisée.
     * 
     * @return La description de l'appareil, enrichie de l'option ajoutée.
     */
    @Override
    public String getDescription() 
    {
        return appareil.getDescription() + " + Performance Optimisée";  
    }

    /**
     * Je récupère le prix final de l'appareil après l'ajout de l'option de performance.
     * 
     * @return Le prix final de l'appareil, incluant le supplément de l'option.
     */
    @Override
    public double getPrixFinal() 
    {
        return appareil.getPrixFinal() + 100; 
    }

    /**
     * Je récupère l'identifiant unique de l'appareil décoré, en ajoutant une information supplémentaire.
     * 
     * @return L'identifiant de l'appareil avec l'option "momotaku" ajoutée à la fin.
     */
    @Override
    public String getIdentifiant() 
    {
        return appareil.getDescription() + " + momotaku";  
    }
}
