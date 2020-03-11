package entites;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduit;

    @NotNull
    private String designation;

    @NotNull
    private double prix;

    @OneToMany(mappedBy = "idAchat.produit", cascade = CascadeType.ALL)
    private Set<Achat> LesAchats=new HashSet<>();

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Set <Achat> getLesAchats() {
        return LesAchats;
    }

    public void setLesAchats(Set <Achat> lesAchats) {
        LesAchats = lesAchats;
    }
}
