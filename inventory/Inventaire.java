package inventory;

import java.util.HashMap;
import java.util.Map;

import model.Appareil;

/**
 * Dans la classe {@code Inventaire}, je gère un inventaire d'appareils. Cette classe est un singleton,
 * ce qui signifie qu'il ne peut y avoir qu'une seule instance de l'inventaire. Elle permet d'ajouter,

 */
public class Inventaire 
{
    private static Inventaire instance = null; 
    private Map<String, Appareil> appareils;   
    /**
     * Le constructeur privé empêche la création d'instances multiples de {@code Inventaire}.
  
     */
    private Inventaire() 
    {
        appareils = new HashMap<>();     }

    /**
     * Je crée et retourne l'instance unique de {@code Inventaire}.
 
     * 
     * @return L'unique instance de l'inventaire.
     */
    public static Inventaire getInstance() 
    {
        if (instance == null) 
        {
            instance = new Inventaire();  

        }
        return instance; 

    }

    /**
     * J'ajoute un appareil à l'inventaire. Si l'appareil est nul ou si son identifiant est invalide,
     r.
     * 
     * @param appareil L'appareil à ajouter.
     */
    public void ajouterAppareil(Appareil appareil) 
    {
        if (appareil == null) 
        {
            System.out.println(" Impossible d'ajouter un appareil null !");  
   return;
        }

        String id = appareil.getIdentifiant();  
  if (id == null || id.isEmpty()) 
        {
            System.out.println(" Identifiant invalide pour l'appareil !");  
       return;
        }

        if (appareils.containsKey(id)) 
        {
            System.out.println(" L'appareil avec l'identifiant " + id + " existe déjà !");  
      return;
        }

        appareils.put(id, appareil);  //

        System.out.println("Appareil ajouté : " + appareil.getDescription());  

    }

    /**
     * Je supprime un appareil de l'inventaire. Si l'appareil est nul ou si son identifiant n'existe pas,
     
     * 
     * @param appareil L'appareil à supprimer.
     */
    public void supprimerAppareil(Appareil appareil) 
    {
        if (appareil == null) 
        {
            System.out.println(" Impossible de supprimer un appareil null !");  
            return;
        }

        String id = appareil.getIdentifiant();  
        if (!appareils.containsKey(id)) 
        {
            System.out.println("Impossible de supprimer, appareil introuvable.");          return;
        }

        appareils.remove(id);  
        System.out.println(" Appareil supprimé : " + appareil.getDescription());   }

    /**
     * J'affiche la liste de tous les appareils présents dans l'inventaire. Si l'inventaire est vide,
    
     */
    public void afficherInventaire() 
    {
        System.out.println("\n Liste des appareils dans l'inventaire :");
        if (appareils.isEmpty()) 
        {
            System.out.println(" L'inventaire est vide.");  
        } else 
        {
            
            appareils.forEach((key, appareil) -> System.out.println("- " + appareil.getDescription() + " (ID: " + key + ")"));
        }
    }
}
