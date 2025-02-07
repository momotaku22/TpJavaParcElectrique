package decorator;

import model.Appareil;

/**
 * Dans la classe {@code OptionSecurite}, je crée un décorateur pour ajouter une option de sécurité antivirus
 * à un appareil. Cette classe hérite de {@code AppareilDecorator} et modifie certains comportements de l'appareil,

 */
public class OptionSecurite extends AppareilDecorator 
{
    /**
     * Le constructeur permet de décorer un appareil avec l'option de sécurité antivirus.
     * 
     * @param appareil L'appareil à décorer avec l'option de sécurité.
     */
    public OptionSecurite(Appareil appareil) 
    {
        super(appareil); 
    }

    /**
     * Je récupère la description de l'appareil décoré, en ajoutant l'option "Sécurité Antivirus".
     * 
     * @return La description complète de l'appareil avec l'option de sécurité.
     */
    @Override
    public String getDescription() 
    {
        return appareil.getDescription() + " + Sécurité Antivirus";  
    }

    /**
     * Je récupère le prix final de l'appareil après l'ajout de l'option de sécurité antivirus.
     * 
     * @return Le prix final de l'appareil, avec l'ajout de 50 pour l'option.
     */
    @Override
    public double getPrixFinal() 
    {
        return appareil.getPrixFinal() + 50; 
    }

    /**
     * Je récupère l'identifiant unique de l'appareil décoré, en ajoutant un suffixe personnalisé.
     * 
     * @return L'identifiant de l'appareil, modifié avec l'ajout de "momotaku".
     */
    @Override
    public String getIdentifiant() 
    {
        return appareil.getIdentifiant() + "momotaku"; 
    }
}

