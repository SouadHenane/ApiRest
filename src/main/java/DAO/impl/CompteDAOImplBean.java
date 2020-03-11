package DAO.impl;

import DAO.GenericFacade;
import DAO.ICompteDAO;
import DAO.ICompteDAOLocal;
import entites.Compte;

import javax.ejb.Stateless;

@Stateless(name = "CompteDAOImplEJB")
public class CompteDAOImplBean extends GenericFacade<Compte> implements ICompteDAO, ICompteDAOLocal {

}
