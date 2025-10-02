# Carte_De_Visite_App
## Description

Projet scolaire Android Studio Application  qui affiche une carte de visite réalisée avec Jetpack Compose.  
Elle affiche une carte de visite numérique avec :  
- Logo android
- Mon Nom et Ma fonction  
- Mes informations de contact (Téléphone, Email et LinkedIn)
Projet scolaire Android Studio-Application  qui affiche une carte de visite.

## Technologies utilisées

Kotlin : langage de programmation officiel pour Android.
Jetpack Compose : framework moderne pour créer des interfaces utilisateur déclaratives.
Material3 : pour les icônes (Call, Email) et le style général.
PNG : pour les logo  (Android et LinkedIn).

## Organisation du code

## MainActivity.kt
Point d’entrée de l’application.
setContent : lance l’interface avec Jetpack Compose.
enableEdgeToEdge() : permet à l’application de s’afficher sur tout l’écran.

## Composable CartedevisiteApp()
Structure la carte de visite en deux parties :
Partie centrale : logo + nom + titre.
Partie basse : coordonnées et contacts.
Utilisation de Column pour empiler les éléments verticalement et Spacer pour gérer l’espacement.
Alignement au centre pour que la carte soit équilibrée et esthétique.

## Composables Cordonnees et CordonneesCustomIcon
Cordonnees : pour les icônes Material (Call, Email, Public).
CordonneesCustomIcon : pour l'icône personnalisée LinkedIn en PNG.
Les icônes et le texte sont alignés horizontalement avec Row et Spacer.

## Détails techniques

Image : affiche les logos, avec contentScale = ContentScale.Crop pour que l’image garde ses proportions et remplisse le cadre.
Text : style du texte avec fontSize, fontWeight, color et textAlign pour personnaliser l’apparence.
Couleurs : le vert #3DDC84 est utilisé pour rappeler la couleur Android et donner un style moderne.
verticalArrangement = Arrangement.SpaceBetween : permet de séparer la partie centrale et la partie contact, pour que tout soit visible sur l’écran.

## Fonctionnement de l’application

L’utilisateur ouvre l’application.
La carte de visite s’affiche avec :
Le logo au centre.
Le nom et le titre en dessous du logo.
Les informations de contact alignées en bas de l’écran.
Les icônes facilitent l’identification des informations (téléphone, email, LinkedIn).
