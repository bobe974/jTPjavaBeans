import java.io.Serializable;

public  class Vehicule implements Serializable {
    protected String marque, modele, couleur;

    public Vehicule(String marque, String modele, String couleur){
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
    }
    public String affiche(){
        return toString();
    }
    //getter et setter
    public void setMarque(String marque){
        this.marque = marque;
    }
    public String getMarque(){
        return this.marque;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
