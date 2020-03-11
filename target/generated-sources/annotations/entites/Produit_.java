package entites;

import entites.Achat;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2018-05-15T09:38:43")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile SingularAttribute<Produit, Integer> idProduit;
    public static volatile SingularAttribute<Produit, Double> prix;
    public static volatile SetAttribute<Produit, Achat> LesAchats;
    public static volatile SingularAttribute<Produit, String> designation;

}