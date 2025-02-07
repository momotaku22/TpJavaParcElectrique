# Gestion d'un Parc d'Appareils Électroniques

Ce projet Java a été développé dans le cadre d'un TP de Bachelor 2 Informatique. Il permet de gérer un parc d'appareils électroniques professionnels (ordinateurs, imprimantes, scanners, etc.) en appliquant plusieurs design patterns avancés :

- **Singleton** : pour la gestion centralisée de l'inventaire.
- **Decorator** : pour la personnalisation dynamique des appareils en ajoutant des options.
- **Factory** : pour simplifier la création d'appareils en fonction de leur type.

Le projet met également en pratique les concepts d'encapsulation, d'héritage et de polymorphisme.

---

## Table des Matières

- [Fonctionnalités](#fonctionnalités)
- [Structure du Projet](#structure-du-projet)
- [Design Patterns Utilisés](#design-patterns-utilisés)
- [Installation et Exécution](#installation-et-exécution)
- [Génération de la Documentation JavaDoc](#génération-de-la-documentation-javadoc)
- [Contribuer](#contribuer)


---

## Fonctionnalités

- **Gestion de l'inventaire**  
  L'inventaire est géré via un design pattern Singleton. Vous pouvez ajouter, supprimer et afficher les appareils.
  
- **Personnalisation des Appareils**  
  Le design pattern Decorator est utilisé pour ajouter dynamiquement des options (ex. sécurité, performance) à un appareil de base.
  
- **Création d'Appareils via une Factory**  
  Une Factory centralise la création des appareils en fonction du type (ordinateur, imprimante, etc.), simplifiant ainsi leur instanciation.
  
- **Documentation JavaDoc**  
  Des commentaires JavaDoc sont ajoutés dans le code pour faciliter la compréhension et la maintenance.

---

## Structure du Projet

Le code est organisé en plusieurs packages pour une meilleure modularité :

- **model**  
  Contient les classes et interfaces qui modélisent les appareils :
  - `Appareil` : Interface définissant les méthodes de base.
  - `AppareilBase` : Classe abstraite qui implémente l'interface et définit les attributs communs.
  - `Ordinateur`, `Imprimante` : Classes concrètes représentant différents types d'appareils.

- **inventory**  
  Contient la classe `Inventaire` qui gère la collection d'appareils en utilisant le design pattern Singleton.

- **decorator**  
  Contient le design pattern Decorator pour la personnalisation des appareils :
  - `AppareilDecorator` : Classe abstraite décoratrice.
  - `OptionSecurite`, `OptionPerformance` : Décorateurs concrets pour ajouter des fonctionnalités spécifiques.

- **factory**  
  Contient la classe `AppareilFactory` pour créer des instances d'appareils en fonction de paramètres (type, identifiant, nom, prix).

- **main**  
  Contient la classe `Main` qui démontre le fonctionnement de l'inventaire, la création via la Factory et la personnalisation via des décorateurs.

---

## Design Patterns Utilisés

- **Singleton**  
  La classe `Inventaire` implémente ce pattern pour garantir une instance unique qui gère tous les appareils.

- **Decorator**  
  Le pattern Decorator permet d'ajouter dynamiquement des options aux appareils sans modifier les classes de base.

- **Factory**  
  La classe `AppareilFactory` simplifie la création d'appareils en centralisant leur instanciation selon le type.

---

## Installation et Exécution

### Prérequis

- Java JDK 8 (ou supérieur)
- Un IDE Java (Eclipse, IntelliJ IDEA, NetBeans, etc.) ou un éditeur de texte et un terminal.

## Génération de la Documentation JavaDoc

https://github.com/momotaku22/TpJavaParcElectrique/blob/main/doc/index.html


# Contribuer 

- Fréjus, Zino, Mouhamed
