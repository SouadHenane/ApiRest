package entites;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Adresse implements Serializable {

private String rue;

private int numero;

@Column(name="code_postal")
    private String CodePostal;

    public Adresse() {
    }

    public Adresse(String rue, int numero, String codePostal, String ville) {
        this.rue = rue;
        this.numero = numero;
        CodePostal = codePostal;
        Ville = ville;
    }

    private String Ville;

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodePostal() {
        return CodePostal;
    }

    public void setCodePostal(String codePostal) {
        CodePostal = codePostal;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }
}

