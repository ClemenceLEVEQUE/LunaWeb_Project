package com.luna.service;

import java.util.List;

import com.luna.entities.Client;

public interface ClientService {
	void add(Client Cli);
	void update(Client Cli);
	void delete(int idClient);
	void get(int idClient);
	List<Client> listClient();
}
