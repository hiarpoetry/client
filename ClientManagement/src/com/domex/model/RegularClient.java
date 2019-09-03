package com.domex.model;

public class RegularClient extends Client {

	//attributes
	private String firstName, lastName;
	private int nic;
	private int postalCode;
	
	//constructors
	
	/**
	 * @param clientId
	 * @param addressNo
	 * @param lane
	 * @param street
	 * @param town
	 * @param city
	 * @param province
	 * @param email
	 * @param contactNo
	 * @param firstName
	 * @param lastName
	 * @param nic
	 * @param postalCode
	 */
	public RegularClient(int clientId, String addressNo, String lane, String street, String town, String city,
			String province, String email, String contactNo, String firstName, String lastName, int nic,
			int postalCode) {
		super(clientId, addressNo, lane, street, town, city, province, email, contactNo);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nic = nic;
		this.postalCode = postalCode;
	} //overloaded constructor

	//setters - getters
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the nic
	 */
	public int getNic() {
		return nic;
	}

	/**
	 * @return the postalCode
	 */
	public int getPostalCode() {
		return postalCode;
	}
	
	
	

}
