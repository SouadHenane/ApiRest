package DAO.impl;

import DAO.GenericFacade;
import DAO.IClientDAO;
import DAO.IClientDAOLocal;
import entites.Client;

import javax.ejb.Stateless;

@Stateless(name = "ClientDAOImplEJB")
public class ClientDAOImplBean  extends GenericFacade<Client> implements IClientDAO, IClientDAOLocal{

}
