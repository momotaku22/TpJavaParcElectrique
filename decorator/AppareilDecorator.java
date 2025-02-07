package decorator;

import model.Appareil;

/**
 * La on a la classe abstraite {@code AppareilDecorator}qui  implémente l'interface {@code Appareil}.

 * qu'on objets {@code Appareil}.
 */
public abstract class AppareilDecorator implements Appareil 
{

    protected Appareil appareil;

   
    public AppareilDecorator(Appareil appareil) 
    {
        this.appareil = appareil;  
    }

    /**
     * la on a la methode qui permet d'activer l'appareil  {@code activer()} de l'objet {@code Appareil} .
   
     */
    @Override
    public void activer() 
    {
        try {
            appareil.activer();  
        } catch (Exception e) {
            System.err.println("Erreur lors de l'activation de l'appareil : " + e.getMessage());
            e.printStackTrace(); 
        }
    }

    /**
     * Récupère la description de l'appareil décoré.
     * @return La description de l'appareil décoré. Si une erreur survient, une description par défaut est renvoyée.
     */
    @Override
    public String getDescription() 
    {
        try {
            return appareil.getDescription();  
        } catch (Exception e) {
            System.err.println("Erreur lors de la récupération de la description : " + e.getMessage());
            e.printStackTrace();  
            return "Erreur de description";  
        }
    }

    /**
     *  on Récupère le prix final de l'appareil.
     * 
     * @return Le prix final de l'appareil.
     */
    @Override
    public double getPrixFinal() 
    {
        try {
            return appareil.getPrixFinal();  
        } catch (Exception e) {
            System.err.println("Erreur lors de la récupération du prix final : " + e.getMessage());
            e.printStackTrace();  
            return 0.0;  
        }
    }

    /**
     * on Récupère l'identifiant unique de l'appareil décoré.
     * 
     * @return L'identifiant de l'appareil. Si une erreur survient, une valeur par défaut est renvoyée.
     */
    @Override
    public String getIdentifiant() 
    {
        try {
            return appareil.getIdentifiant();  
        } catch (Exception e) {
            System.err.println("Erreur lors de la récupération de l'identifiant : " + e.getMessage());
            e.printStackTrace();  
            return "Erreur d'identifiant";  
        }
    }
}
