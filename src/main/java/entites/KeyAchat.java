package entites;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;


@Embeddable
public class KeyAchat implements Serializable {
    @ManyToOne
    @JoinColumn(name="idClient")
    private Client client;

    @ManyToOne
    @JoinColumn(name="idProduit")
    private Produit produit;

    public KeyAchat() {
    }

    public KeyAchat(Client client, Produit produit) {
        this.client = client;
        this.produit = produit;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}
