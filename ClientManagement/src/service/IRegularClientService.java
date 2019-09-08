package service;
import java.sql.SQLException;
import java.util.ArrayList;

import com.domex.model.RegularClient;
import com.sun.istack.internal.logging.Logger;;

public interface IRegularClientService {
	
	public int addRegularClient(RegularClient regularClient) throws SQLException;
	
	//search client
	public RegularClient searchRegularClient(int clientId);
	
	//display list
	public ArrayList<RegularClient> listRegularClients() throws SQLException;
	
	//update
	public RegularClient updateRegularClient(int clientId, RegularClient regularClient);
	
	//delete
	public boolean deleteRegularClient(int clientId) throws SQLException;
	
}
