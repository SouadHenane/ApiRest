package service;

import DAO.IClientDAOLocal;
import entites.Client;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/client")
public class ClientResource {

    @EJB
    IClientDAOLocal clientDAO;

    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Client find(@QueryParam("id") int id){
       return  clientDAO.find(id);
    }
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Path("/all")
    public ArrayList<Client> getAllClients(){

        return (ArrayList<Client>) clientDAO.findAll();
    }
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    @Path("/count")
    public Long count() {
       return clientDAO.count();
    }

     @POST
     @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})

      public void add(Client c){
       clientDAO.create(c);
      }

      @PUT
      @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
       public  void update(Client c){
       clientDAO.edit(c);
       }

@DELETE
@Path("/{id}")
//@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
//public  void delete(Client c){
//    clientDAO.remove(c);
//}//pas accepter par le framework pas accepter un objet
    public  void delete(@PathParam("id") int id){
        clientDAO.remove(clientDAO.find(id));

}

   // void create(T entity);
//
//    void edit(T entity);
//
//    void remove(T entity);
//
//    T find(Object id);
//
//    List<T> findAll();
//
//    Long count();

}
