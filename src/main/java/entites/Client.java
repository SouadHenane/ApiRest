package entites;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@XmlRootElement
@Entity
@Table(name = "Clienttable",
        uniqueConstraints = {
                @UniqueConstraint(name = "nom_prenom", columnNames = {"nom", "prenom"})
        })


public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;

    @Column(nullable = false, length = 20)
    private String nom;

    @Column(nullable = false, length = 20)
    private String prenom;

    @Column(nullable = false, length = 5)
    @Enumerated(EnumType.STRING)
    private Civility sexe;


    private String telephone;


    @Column(unique = true)
    private String email;

    @Transient
    private Integer age;


    @Column(name = "date_naissance")
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;


    @Embedded
    private Adresse adresse;


    @OneToOne(mappedBy = "client", cascade = CascadeType.PERSIST,fetch=FetchType.LAZY)
    private ClientDetail clientDetail;


    @OneToMany(mappedBy = "client", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch=FetchType.LAZY)
    private Set<Compte> LesComptes=new HashSet <>();


    @OneToMany(mappedBy = "idAchat.client", cascade = {CascadeType.PERSIST, CascadeType.REMOVE},fetch=FetchType.LAZY)
    private Set<Achat> LesAchats=new HashSet <>();

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    @XmlTransient
    public Set <Compte> getLesComptes() {
        return LesComptes;
    }

    public void setLesComptes(Set <Compte> lesComptes) {
        LesComptes = lesComptes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public Civility getSexe() {
        return sexe;
    }

    public void setSexe(Civility sexe) {
        this.sexe = sexe;
    }



    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @XmlTransient
    public ClientDetail getClientDetail() {
        return clientDetail;
    }

    public void setClientDetail(ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }
@XmlTransient
    public Set <Achat> getLesAchats() {
        return LesAchats;
    }

    public void setLesAchats(Set <Achat> lesAchats) {
        LesAchats = lesAchats;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
