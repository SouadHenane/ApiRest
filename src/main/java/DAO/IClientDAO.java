package DAO;

import entites.Client;

import javax.ejb.Remote;

@Remote
public interface IClientDAO extends IGenericDAO<Client> {
}
