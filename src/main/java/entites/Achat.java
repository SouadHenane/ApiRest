package entites;



import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Achat implements Serializable {


    @EmbeddedId
    private KeyAchat idAchat;

    @Temporal(TemporalType.TIMESTAMP)
    private Date DateAchat;

    @NotNull
    @Min(0)
    private int Qte;

    public KeyAchat getIdAchat() {
        return idAchat;
    }

    public void setIdAchat(KeyAchat idAchat) {
        this.idAchat = idAchat;
    }

    public Date getDateAchat() {
        return DateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        DateAchat = dateAchat;
    }

    public int getQte() {
        return Qte;
    }

    public void setQte(int qte) {
        Qte = qte;
    }
}
