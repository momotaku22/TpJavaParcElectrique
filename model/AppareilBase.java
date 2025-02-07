package model;

/**
 * La classe abstraite {@code AppareilBase} implémente l'interface {@code Appareil} et fournit des comportements 
 * Elle gère les propriétés communes comme l'identifiant, le nom, le prix de base et le type de l'appareil.
 */
public abstract class AppareilBase implements Appareil
{
   
    protected String identifiant;
    
     protected String nom;
    
    protected double prixDeBase;
    
     protected AppareilType type;

    /**
     * Constructeur permettant d'initialiser les propriétés de base d'un appareil.
     * @param identifiant L'identifiant unique de l'appareil.
     * @param nom Le nom de l'appareil.
     * @param prixDeBase Le prix de base de l'appareil, sans options supplémentaires.
     * @param type Le type de l'appareil (par exemple, ordinateur, imprimante).
     */
    public AppareilBase(String identifiant, String nom, double prixDeBase, AppareilType type) 
    {
        this.identifiant = identifiant;  
        this.nom = nom;  
        this.prixDeBase = prixDeBase;  
        this.type = type; 
    }

    /**
     * Récupère le prix final de l'appareil. Ici, la méthode retourne simplement le prix de base,
     * @return Le prix final de l'appareil.
     */
    @Override
    public double getPrixFinal() 
    {
        return prixDeBase;  
    }

    /**
     * Récupère la description de l'appareil sous forme de chaîne de caractères.
     
     * @return La description de l'appareil.
     */
    @Override
    public String getDescription() 
    {
        return "Appareil : " + nom + " (Type: " + type + ", Prix: " + prixDeBase + "€)";  
        
    }

    /**
    
     * @return L'identifiant de l'appareil.
     */
    @Override
    public String getIdentifiant() 
    {
        return identifiant;  
    }

}

