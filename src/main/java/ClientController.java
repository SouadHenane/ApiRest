import DAO.IClientDAOLocal;
import entites.Adresse;
import entites.Civility;
import entites.Client;
import org.primefaces.event.RowEditEvent;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

@Named
@ViewScoped
public class ClientController implements Serializable {

    private String nom, prenom, sexe, email, telephone;
    private Date Datenaissance;
    private Adresse ad;
    private ArrayList<Client> lesClients;
    @EJB
    IClientDAOLocal ic ;

    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Client Edited", ((Client) event.getObject()).getNom());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        Client c = (Client) event.getObject();
        ic.edit(c);
    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((Client) event.getObject()).getNom());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        Client c = (Client) event.getObject();
        ic.remove(c);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getDatenaissance() {
        return Datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        Datenaissance = datenaissance;
    }

    public Adresse getAd() {
        return ad;
    }

    public void setAd(Adresse ad) {
        this.ad = ad;
    }

    public String add() {
        Client c = new Client();
        Adresse adresse = new Adresse();
        adresse.setCodePostal("22000");
        adresse.setNumero(12);
        adresse.setRue("rue");
        adresse.setVille("sba");
        c.setAdresse(adresse);
        c.setAge(12);
        c.setNom(this.nom);
        c.setPrenom(this.prenom);
        c.setSexe(Civility.homme);
        c.setEmail(this.email);
        c.setDateNaissance(this.Datenaissance);
        c.setTelephone(this.telephone);
        ic.create(c);
        return "GestionClient.xhtml";
    }

    @PostConstruct
    public void init() {
        lesClients = (ArrayList<Client>) ic.findAll();
    }


    public ArrayList <Client> getLesClients() {
        return lesClients;
    }
//
//    public void setLesClients(ArrayList <Client> lesClients) {
//        this.lesClients = lesClients;
//    }
//
//    public void onRowCancel (RowEditEvit event){
//
//        Client c=((Client) event.getObject();
//    }
}
