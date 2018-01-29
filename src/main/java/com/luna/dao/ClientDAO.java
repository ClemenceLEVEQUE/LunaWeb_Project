package com.luna.dao;

import java.util.ArrayList;
import com.luna.entities.Client;

public interface ClientDAO {
	public boolean insertClient(Client Cli);
	public void updateClient(Client Cli);
	public boolean removeClient(int idClient);
	public Client getClient(int idClient);
	public ArrayList<Client> getAllClient();
	public ArrayList<Client> getSearch(String search);
}
