package entites;

import entites.Achat;
import entites.Adresse;
import entites.Civility;
import entites.ClientDetail;
import entites.Compte;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2018-05-15T09:38:43")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, Integer> idClient;
    public static volatile SingularAttribute<Client, Date> dateNaissance;
    public static volatile SetAttribute<Client, Achat> LesAchats;
    public static volatile SingularAttribute<Client, Adresse> adresse;
    public static volatile SingularAttribute<Client, Civility> sexe;
    public static volatile SingularAttribute<Client, String> telephone;
    public static volatile SingularAttribute<Client, ClientDetail> clientDetail;
    public static volatile SingularAttribute<Client, String> nom;
    public static volatile SingularAttribute<Client, String> prenom;
    public static volatile SetAttribute<Client, Compte> LesComptes;
    public static volatile SingularAttribute<Client, String> email;

}