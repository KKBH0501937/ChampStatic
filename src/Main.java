public class Main {
    public static void main(String[] args){





        // --- Création des instances ---
        // Chaque appel à new Personne() :
        //   - incrémente Personne.nbInstances (compteur de classe, partagé)
        //   - incrémente nbLocal de l'objet nouvellement créé (compteur d'instance)


        Personne personne1 = new Personne();

        Personne personne2 = new Personne();

        Personne personne3 = new Personne();

        Personne personne4 = new Personne();

        // Affichez les valeurs des deux compteurs

        System.out.println("(" + personne4.nbLocal + "," + Personne.nbInstances + ")");

    }
}
