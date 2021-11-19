import java.io.Serializable;

public class Camion extends Vehicule implements Serializable {

    protected float capacite;

    /**
     *
     * @param marque
     * @param modele
     * @param couleur
     * @param capacite
     */
    public Camion(String marque, String modele, String couleur, float capacite){
        super(marque, modele, couleur);
        this.capacite = capacite;

    }
    //getters setters
    public float getCapacite() {
        return capacite;
    }

    public void setCapacite(float capacite) {
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return super.toString() + "capacité : " + capacite;


    }
}
