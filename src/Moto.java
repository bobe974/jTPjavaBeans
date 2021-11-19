import java.io.Serializable;

public class Moto extends Vehicule implements Serializable {

    /**
     *
     * @param marque
     * @param modele
     * @param couleur
     */
    public Moto(String marque, String modele, String couleur){
        super(marque, modele, couleur);
    }


    @Override
    public String toString() {
        return super.toString();

    }
}
