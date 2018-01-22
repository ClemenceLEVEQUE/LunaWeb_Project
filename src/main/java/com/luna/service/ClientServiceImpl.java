package com.luna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luna.dao.ClientDAO;
import com.luna.entities.Client;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {
	@Autowired
	private ClientDAO clientDao;

	@Override
	public String add(Client Cli) {
		return clientDao.insertClient(Cli);
	}

	@Override
	public String update(Client Cli) {
		clientDao.updateClient(Cli);
	}

	@Override
	public String delete(int idClient) {
		clientDao.removeClient(idClient);
	}

	@Override
	public Client get(int idClient) {
		return clientDao.getClient(idClient);
	}

	@Override
	public List<Client> listClient() {
		return clientDao.getAllClient();
	}
}
