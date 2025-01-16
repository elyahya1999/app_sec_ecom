## Description
Ce projet est une application de commerce électronique conçue pour mettre en œuvre une architecture sécurisée et modulaire basée sur des microservices.
Le projet comprend plusieurs services indépendants qui communiquent via des API REST, et une interface utilisateur développée en Angular.
## Structure des Microservices
- **Rôle :**
 - Le Discovery Service utilise **Spring Cloud Netflix Eureka** pour permettre l'enregistrement et la découverte des autres microservices.
  - Cela simplifie la communication entre les services, car ils n'ont pas besoin de connaître leurs adresses exactes.
- **Points Clés :**
  - Fournit une liste actualisée des services disponibles.
  - Assure la haute disponibilité des services grâce à la redondance.
- **Configuration :**
  - Port par défaut : `8761`
  - URL d'accès : `http://localhost:8761`
### 2. **API Gateway**
- **Rôle :**
  - La passerelle API agit comme
  -  un point d'entrée unique pour toutes les requêtes vers les microservices.
  - Elle gère  le routage des requêtes.
- **Fonctionnalités :**
  - Routage des requêtes vers les microservices appropriés.
- **Configuration :**
  - Port par défaut : `9999`
  - Exemple de routage :
    - `/inventory/**` vers le service `Inventory`.
    - `/orders/**` vers le service `Order`.
### 3. **Inventory Service**
- **Rôle :**
  - Gère les informations sur les produits, notamment leurs stocks.
  - Permet de créer, lire, mettre à jour et supprimer des produits (CRUD).
- **Base de Données :**
  - Utilise **MySQL** pour stocker les détails des produits et leurs niveaux de stock.
- **Endpoints :**
  - `GET /api/inventory/products` : Liste tous les produits.
  - `POST /api/inventory/products` : Ajoute un nouveau produit.
  - `PUT /api/inventory/products/{id}` : Met à jour les informations d'un produit.
  - `DELETE /api/inventory/products/{id}` : Supprime un produit.
### 4. **Order Service**
- **Rôle :**
  - Gère les commandes passées par les utilisateurs.
  - Traite les données concernant les produits achetés, les clients, et les statuts des commandes.
- **Base de Données :**
  - Utilise **MySQL** pour stocker les informations des commandes.
- **Endpoints :**
  - `POST /orders` : Crée une nouvelle commande.
  - `GET /orders/{id}` : Récupère les détails d'une commande.
  - `PUT /orders/{id}` : Met à jour le statut d'une commande.
  - `GET /orders` : Liste toutes les commandes.
### 5. **Frontend (ecom-app-angular)**
- **Rôle :**
  - Interface utilisateur développée avec Angular pour permettre aux utilisateurs de naviguer dans la boutique, consulter les produits, et passer des commandes.
- **Fonctionnalités :**
  - Authentification sécurisée avec JWT.
  - Gestion de panier d'achat.
  - Affichage des produits et gestion des stocks en temps réel.
- **Configuration :**
  - Serveur de développement : `http://localhost:4200`
- **Commandes importantes :**
  - `ng serve` : Démarre l'application Angular en mode développement.
  - `ng build` : Génère une version de production de l'application.

    
![WhatsApp Image 2024-12-29 à 16 07 39_9c3a9c4a](https://github.com/user-attachments/assets/108050fd-59f6-4035-9b66-bd5ab200b388)
![WhatsApp Image 2024-12-29 à 15 39 18_fa6b6277](https://github.com/user-attachments/assets/7884c543-2421-4ef6-990d-48fa1275b199)
![WhatsApp Image 2024-12-30 à 00 37 07_e2758fb5](https://github.com/user-attachments/assets/d43e6ac2-3d8f-43f8-805b-08499c2424d2)
![WhatsApp Image 2024-12-30 à 00 38 01_9b047feb](https://github.com/user-attachments/assets/687df2ba-5355-4194-a772-4d9195b1d8c8)
![WhatsApp Image 2024-12-30 à 01 16 20_36a9bd56](https://github.com/user-attachments/assets/a2e93ff0-3968-4c11-8360-e41080a10f63)
![WhatsApp Image 2024-12-31 à 19 53 31_79608ebe](https://github.com/user-attachments/assets/311c8429-034c-4c4e-812e-f2268adbd45c)
![WhatsApp Image 2024-12-31 à 19 57 32_27519bd5](https://github.com/user-attachments/assets/d3bd93f4-f712-4f64-826e-3dafbf4a1932)
![WhatsApp Image 2024-12-31 à 20 07 40_e980a320](https://github.com/user-attachments/assets/bc17c585-c2be-4b0c-bc90-f5d45304a6c6)
![WhatsApp Image 2025-01-02 à 01 39 51_ff0d6c5f](https://github.com/user-attachments/assets/d3d5f578-4935-45f9-97db-6fa92f0411f1)
![WhatsApp Image 2025-01-02 à 17 22 37_b4b0788d](https://github.com/user-attachments/assets/0bfa0e6e-8ee2-4ece-b427-cd197d20a368)
![WhatsApp Image 2025-01-02 à 17 22 51_41ec5cf8](https://github.com/user-attachments/assets/b50cd500-71fb-4647-9245-ba99e963fc03)
![WhatsApp Image 2025-01-16 à 20 51 15_911706ab](https://github.com/user-attachments/assets/ece281c5-1f06-4f16-b1be-fd12058a810d)
![WhatsApp Image 2025-01-16 à 20 51 39_062f3fea](https://github.com/user-attachments/assets/898442a2-19c2-4e06-aec2-458c46fccd07)












