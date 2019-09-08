package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.domex.model.CorporateClient;
import com.domex.model.RegularClient;
import com.domex.util.ClientDao;

public class CorporateClientService implements ICorporateClient {
	
	private static Connection connection;
	
	private static Statement statement;
	
	public CorporateClientService(){
		connection = ClientDao.getDBconection();
	}

	@Override
	public int addCorporateClient(CorporateClient corporateClient) throws SQLException {
		
		String add = "insert into corporate_client(business_name, address_no, lane, street, city, contact_no, province) values (?,?,?,?,?,?,?)";
		
		PreparedStatement preparedStatement = connection.prepareStatement(add);
		
		preparedStatement.setString(1, corporateClient.getBusinessName());
		preparedStatement.setString(2, corporateClient.getAddressNo());
		preparedStatement.setString(3, corporateClient.getLane());
		preparedStatement.setString(4, corporateClient.getStreet());
		preparedStatement.setString(5, corporateClient.getCity());
		preparedStatement.setString(6, corporateClient.getContactNo());
		preparedStatement.setString(7, corporateClient.getProvince());
		
		int res = preparedStatement.executeUpdate();
		
		String addNext = "insert into corporate_client_email(email) values(?)";
		
		preparedStatement.setString(1, corporateClient.getEmail());
		
		//if extra email exists
		if(corporateClient.getExtraEmail() != null){
			String addEmail = "insert into corporate_client_email(email) values(?)";
			
			preparedStatement.setString(1, corporateClient.getExtraEmail());
			
			int r = preparedStatement.executeUpdate();
		}
		
		
		int result = preparedStatement.executeUpdate();
		
		if(res > 0 && result > 0)
			return 1;
		else
			return -1;
	}

	@Override
	public CorporateClient searchCorporateClient(int clientId) {
		
		return null;
	}

	@Override
	public ArrayList<CorporateClient> listCorporateClients() throws SQLException {
		
		String query = "select * from corporate_client ;";
		statement = connection.createStatement(); //connect
		ResultSet list = statement.executeQuery(query); //execute 
		
		ArrayList<CorporateClient> corpClientList = new ArrayList<CorporateClient>(); //store values
		
		//set attributes - regular client
		while(list.next()){
			CorporateClient corporateClient = new CorporateClient();
			
			corporateClient.setClientId(list.getInt("client_id"));
			corporateClient.setBusinessName(list.getString("business_name"));
			corporateClient.setAddressNo(list.getString("address_no"));
			corporateClient.setLane(list.getString("lane"));
			corporateClient.setStreet(list.getString("street"));
			corporateClient.setTown(list.getString("town"));
			corporateClient.setCity(list.getString("city"));
			corporateClient.setEmail(list.getString("email"));
			corporateClient.setContactNo(list.getString("contact_no"));
			corporateClient.setProvince(list.getString("province"));
			
			corpClientList.add(corporateClient);
			
		}//end of while loop
		
		
		return corpClientList; //return list
	}

	@Override
	public CorporateClient updateCorporateClient(int clientId, CorporateClient corporateClient) {
		
		return null;
	}

	@Override
	public boolean deleteCorporateClient(int clientId) throws SQLException {
		
		String query = "delete from corporate_client where client_id =?";
		
		statement = connection.createStatement();
		
		PreparedStatement ps = connection.prepareStatement(query);
		
		ps.setInt(1, clientId);
		
		int result = ps.executeUpdate();
		
		return (result > 0);
		

	}

}
