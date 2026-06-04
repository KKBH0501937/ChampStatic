# ChampStatic — Compteurs statique et non statique en Java

##  Description

Ce projet illustre la différence fondamentale entre un **attribut statique** et un **attribut non statique (d'instance)** en Java, à travers une classe `Personne` simple munie de deux compteurs.

| Compteur | Type | Appartient à | Valeur après 4 créations |
|---|---|---|---|
| `nbInstances` | `static` | La **classe** `Personne` | **4** (global) |
| `nbLocal` | non static | Chaque **objet** individuel | **1** (par objet) |

---

## 🗂️ Structure du projet

```
ChampStatic/
├── src/
│   ├── Personne.java   # Classe Personne avec les deux compteurs
│   └── Main.java       # Classe principale avec la méthode main()
├── .gitignore
└── README.md
```

---

## ⚙ Prérequis

- [Java JDK 21] installé sur votre machine


Vérification :
```bash
java --version
javac --version
```

---

##  Compilation et exécution

### 1. Cloner le dépôt

```bash
git clone https://github.com/<votre-username>/ChampStatic.git
cd ChampStatic
```

### 2. Compiler

```bash
mkdir -p out
javac -d out src/Personne.java src/Main.java
```

### 3. Exécuter

```bash
java -cp out Main
```

### 4. Sortie attendue

```
(1,4)
Vérification de nbLocal pour chaque instance :
  personne1.nbLocal = 1
  personne2.nbLocal = 1
  personne3.nbLocal = 1
  personne4.nbLocal = 1
Nombre total d'instances créées (nbInstances) : 4
```

---

##  Concept clé : `static` vs non `static`

### Attribut `static` — `nbInstances`

```java
public static int nbInstances;
```

- Initialisé **une seule fois** à `0` au chargement de la classe.
- **Partagé** par toutes les instances : il n'existe qu'**une seule copie**, liée à la classe elle-même.
- Chaque appel à `new Personne()` l'incrémente → il compte le **nombre total d'objets créés**.


### Attribut non statique — `nbLocal`

```java
public int nbLocal;
```

- Initialisé à `0` pour **chaque nouvel objet** créé.
- Chaque instance possède sa **propre copie indépendante** de `nbLocal`.
- Le constructeur l'incrémente une fois → il vaut toujours **`1`** après construction.




##  Description des fichiers

### `Personne.java`

Déclare la classe `Personne` avec :
- `public static int nbInstances` : compteur partagé par toutes les instances
- `public int nbLocal` : compteur propre à chaque objet
- Un constructeur sans paramètre qui incrémente les deux compteurs

### `Main.java`

Point d'entrée du programme. Crée 4 instances de `Personne` et affiche :
- `personne4.nbLocal` (toujours 1)
- `Personne.nbInstances` (égal au nombre total d'instances)

---

## 👤 Auteur

**KOUASSI KOUADIO BRICE HERMANE**

