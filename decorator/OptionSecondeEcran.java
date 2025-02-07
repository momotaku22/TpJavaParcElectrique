package decorator;

import model.Appareil;

/**
 * Dans la classe {@code OptionSecondeEcran}, je crée un décorateur pour ajouter une option de seconde écran
 * à un appareil. Cette classe hérite de {@code AppareilDecorator} et modifie certains comportements de l'appareil,
 
 */
public class OptionSecondeEcran extends AppareilDecorator 
{
    /**
     * Le constructeur permet de décorer un appareil avec l'option de seconde écran.
     * 
     * @param appareil L'appareil à décorer avec l'option.
     */
    public OptionSecondeEcran(Appareil appareil) 
    {
        super(appareil); 
    }

    /**
     * Je récupère ici la description de l'appareil décoré, avec l'ajout de l'option "Seconde Écran".
     * 
     * @return La description de l'appareil, enrichie de l'option.
     */
    @Override
    public String getDescription() 
    {
        return appareil.getDescription() + " + Seconde Écran";  
    }

    /**
     * Je récupère le prix final de l'appareil après l'ajout de l'option de seconde écran.
     * 
     * @return Le prix final de l'appareil, avec l'ajout de 150 pour l'option.
     */
    @Override
    public double getPrixFinal() 
    {
        return appareil.getPrixFinal() + 150;
    }

    /**
     * Je récupère l'identifiant unique de l'appareil décoré, en ajoutant "-SE" pour l'option de seconde écran.
     * 
     * @return L'identifiant de l'appareil, avec l'option ajoutée.
     */
    @Override
    public String getIdentifiant() 
    {
        return appareil.getIdentifiant() + "-SE"; 
    }
}

