package DAO;

import entites.Compte;

import javax.ejb.Remote;

@Remote
public interface ICompteDAO extends IGenericDAO<Compte> {
}
