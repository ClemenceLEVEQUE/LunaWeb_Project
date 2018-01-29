package com.luna.service;

import java.util.List;

import com.luna.entities.Client;

public interface ClientService {
	String add(Client Cli);
	String update(Client Cli);
	String delete(int idClient);
	Client get(int idClient);
	List<Client> listClient();
	List<Client> search(String search);
}
