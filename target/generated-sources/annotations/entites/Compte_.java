package entites;

import entites.Client;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2018-05-15T09:38:43")
@StaticMetamodel(Compte.class)
public class Compte_ { 

    public static volatile SingularAttribute<Compte, String> password;
    public static volatile SingularAttribute<Compte, Date> dateCreation;
    public static volatile SingularAttribute<Compte, Client> client;
    public static volatile SingularAttribute<Compte, String> login;

}