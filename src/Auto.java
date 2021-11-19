

import java.io.Serializable;

public class Auto extends Vehicule implements Serializable {
    /**
     *
     * @param marque
     * @param modele
     * @param couleur
     */
    public Auto(String marque, String modele, String couleur){
        super(marque, modele, couleur);
    }


    public String affiche() {
        return super.toString();
    }

}
