package com.domex.model;

public class Client {
	//attributes
	private int clientId;
	private String addressNo, lane, street, town ,city, province;
	private String email;
	private String contactNo;
	
	
	//constructors
	
	Client() {} //default constructor


	public Client(int clientId, String addressNo, String lane, String street, String town, String city, String province,
			String email, String contactNo) {
		super();
		this.clientId = clientId;
		this.addressNo = addressNo;
		this.lane = lane;
		this.street = street;
		this.town = town;
		this.city = city;
		this.province = province;
		this.email = email;
		this.contactNo = contactNo;
	}//overloaded constructor


	/**
	 * @return the clientId
	 */
	public int getClientId() {
		return clientId;
	}


	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}


	/**
	 * @return the addressNo
	 */
	public String getAddressNo() {
		return addressNo;
	}


	/**
	 * @param addressNo the addressNo to set
	 */
	public void setAddressNo(String addressNo) {
		this.addressNo = addressNo;
	}


	/**
	 * @return the lane
	 */
	public String getLane() {
		return lane;
	}


	/**
	 * @param lane the lane to set
	 */
	public void setLane(String lane) {
		this.lane = lane;
	}


	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}


	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}


	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}


	/**
	 * @param town the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}


	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}


	/**
	 * @param contactNo the contactNo to set
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	
	
	
}
