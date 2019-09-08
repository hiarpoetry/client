package service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.domex.model.CorporateClient;

public interface ICorporateClient {

public int addCorporateClient(CorporateClient corporateClient) throws SQLException;
	
	//search client
	public CorporateClient searchCorporateClient(int clientId);
	
	//display list
	public ArrayList<CorporateClient> listCorporateClients();
	
	//update
	public CorporateClient updateCorporateClient(int clientId, CorporateClient corporateClient);
	
	//delete
	public void deleteCorporateClient(int clientId);
	
	
}
