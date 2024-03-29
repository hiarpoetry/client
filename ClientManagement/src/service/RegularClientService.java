package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.domex.model.RegularClient;
import com.domex.util.ClientDao;


public class RegularClientService implements IRegularClientService {

	//logger
	//public static final Logger log = Logger.getLogger(RegularClientService.class.getName(), null);
	
	private static Connection connection;
	
	private static Statement statement;
	
	//constructor
	public RegularClientService() {
		connection = ClientDao.getDBconection(); //establish connection
	}
	
	@Override
	public int addRegularClient(RegularClient regularClient) throws SQLException {
		
		String add = "insert into regular_client(first_name,last_name,house_no, lane, street, town, city, email, contact_no, nic, postal_code, province) values (?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement preparedStatement = connection.prepareStatement(add);
		
		preparedStatement.setString(1, regularClient.getFirstName());
		preparedStatement.setString(2, regularClient.getLastName());
		preparedStatement.setString(3, regularClient.getAddressNo());
		preparedStatement.setString(4, regularClient.getLane());
		preparedStatement.setString(5, regularClient.getStreet());
		preparedStatement.setString(6, regularClient.getTown());
		preparedStatement.setString(7, regularClient.getCity());
		preparedStatement.setString(8, regularClient.getEmail());
		preparedStatement.setString(9, regularClient.getContactNo());
		preparedStatement.setString(10, regularClient.getNic());
		preparedStatement.setString(11, regularClient.getPostalCode());
		preparedStatement.setString(12, regularClient.getProvince());
		
		int success = preparedStatement.executeUpdate();
		
		return success;
		
	}

	@Override
	public RegularClient searchRegularClient(int clientId) {
		
		return null;
	}

	@Override
	public ArrayList<RegularClient> listRegularClients() throws SQLException {
		
		String query = "select * from regular_client ;";
		statement = connection.createStatement(); //connect
		ResultSet list = statement.executeQuery(query); //execute 
		
		ArrayList<RegularClient> regClientList = new ArrayList<RegularClient>(); //store values
		
		//set attributes - regular client
		while(list.next()){
			RegularClient regularClient = new RegularClient();
			
			regularClient.setClientId(list.getInt("client_id"));
			regularClient.setFirstName(list.getString("first_name"));
			regularClient.setLastName(list.getString("last_name"));
			regularClient.setAddressNo(list.getString("address_no"));
			regularClient.setLane(list.getString("lane"));
			regularClient.setStreet(list.getString("street"));
			regularClient.setTown(list.getString("town"));
			regularClient.setCity(list.getString("city"));
			regularClient.setNic(list.getString("nic"));
			regularClient.setEmail(list.getString("email"));
			regularClient.setContactNo(list.getString("contact_no"));
			regularClient.setPostalCode(list.getString("postal_code"));
			regularClient.setProvince(list.getString("province"));
			
			regClientList.add(regularClient);
			
		}//end of while loop
		
		
		return regClientList; //return list
	}

	@Override
	public RegularClient updateRegularClient(int clientId, RegularClient regularClient) {
		
		return null;
	}

	@Override
	public boolean deleteRegularClient(int clientId) throws SQLException {
		
		String query = "delete from regular_client where client_id =?";
		statement = connection.createStatement();
		
		PreparedStatement ps = connection.prepareStatement(query);
		
		ps.setInt(1, clientId);
		
		int result = ps.executeUpdate();
		
		return (result > 0);

	}

}
