package entites;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@XmlRootElement
@Entity
public class Compte implements Serializable{

    @Id
    private String login;

    @Size(min=6, max=20)
    @NotNull
    private String password;

    @Past
    private Date dateCreation;

    @ManyToOne
    @JoinColumn(name="idClient")
    private Client client;

    public Compte() {
    }

    public Compte(String login, @Size(min = 6, max = 20) @NotNull String password, @Past Date dateCreation, Client client) {
        this.login = login;
        this.password = password;
        this.dateCreation = dateCreation;
        this.client = client;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
