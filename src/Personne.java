public class Personne {


    /**
     * Compteur STATIQUE — appartient à la classe Personne, pas à un objet.
    */

    public static int nbInstances;


    /**
     * Compteur NON STATIQUE (d'instance) — appartient à chaque objet Personne.
    */
    public int nbLocal;

    public Personne(){

        // Incrémente le compteur de classe (partagé par toutes les instances)
        nbInstances++;



        // Incrémente le compteur propre à cet objet (repart de 0 pour chaque instance)
        nbLocal++;

    }
}