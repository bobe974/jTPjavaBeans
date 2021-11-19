import java.beans.*;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IntrospectionException, IOException {

       /** Class vehicule = Class.forName("Vehicule");
        BeanInfo beanInfo = Introspector.getBeanInfo(vehicule,vehicule.getSuperclass());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for(int i=0;i<propertyDescriptors.length;i++){
            System.out.println("Nom propriété: "+ propertyDescriptors[i].getName());
            System.out.println("Type propriété: "+ propertyDescriptors[i].getPropertyType());
            System.out.println("Getter propriété: "+ propertyDescriptors[i].getReadMethod());
            System.out.println("Setter propriété: "+ propertyDescriptors[i].getWriteMethod());
        }
        //recupération des méthodes
        MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();
        for(int k=0;k<methodDescriptors.length;k++){
            System.out.println("Méthode: "+methodDescriptors[k].getName());
        }
**/
       /**
        //sérialisation
        Vehicule uncamion = new Camion("Renault","PoidsLourd","rose",19);
        FileOutputStream fos;

        try {
            fos = new FileOutputStream("fichier");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(uncamion);
            System.out.println("sérialisation de du véhicule");
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //désérialisation
        FileInputStream fis = new FileInputStream("fichier");
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);
        Camion vehiculeDeserialisé = (Camion) objectInputStream.readObject();
        System.out.println("objet désérialisé: "+ vehiculeDeserialisé);

        **/
        //nouvelle  liste de véhicule
        ArrayList<Vehicule> lesvehicules = new ArrayList<Vehicule>();
        lesvehicules.add(new Moto("honda","inconnu","bleue"));
        lesvehicules.add(new Camion("Renault","PoidsLourd","rose",19));
        lesvehicules.add(new Auto("peugeot","208","grise"));

        //sérialisation
        FileOutputStream fileOutputStream;

        try {
            fileOutputStream= new FileOutputStream("fichier");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //sérialise la liste
            objectOutputStream.writeObject(lesvehicules);
            System.out.println("sérialisation de du véhicule");
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //désérialisation liste
        FileInputStream fis = new FileInputStream("fichier");
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);
        ArrayList<Vehicule> lesvehiculedesarialise = (ArrayList<Vehicule>) objectInputStream.readObject();
        //parcours de la liste
        for (Vehicule unvehicule : lesvehiculedesarialise){
            System.out.println("marque: "+unvehicule.getMarque()+" modele: "+unvehicule.getModele()+
                    " couleur: "+unvehicule.getCouleur());
        }
        objectInputStream.close();
    }




}
