package com.luna.service;

import java.util.List;

import com.luna.entities.Client;

public interface ClientService {
	boolean add(Client Cli);
	void update(Client Cli);
	void delete(int idClient);
	Client get(int idClient);
	List<Client> listClient();
}
