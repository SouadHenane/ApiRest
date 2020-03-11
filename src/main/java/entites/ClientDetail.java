package entites;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ClientDetail implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClientDetail;

    private String description;

    @OneToOne
    @JoinColumn(name="idClient")
    private Client client;

    public ClientDetail() {
    }

    public ClientDetail(String description, Client client) {
        this.description = description;
        this.client = client;
    }

    public int getIdClientDetail() {
        return idClientDetail;
    }

    public void setIdClientDetail(int idClientDetail) {
        this.idClientDetail = idClientDetail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
