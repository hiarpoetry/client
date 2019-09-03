package com.domex.model;

public class CorporateClient extends Client {
	
	//attributes
	private String businessName;
	private String extraEmail, extraContactNo;
	
	//methods
	
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
	 * @param businessName
	 * @param extraEmail
	 * @param extraContactNo
	 */
	public CorporateClient(int clientId, String addressNo, String lane, String street, String town, String city,
			String province, String email, String contactNo, String businessName, String extraEmail,
			String extraContactNo) {
		super(clientId, addressNo, lane, street, town, city, province, email, contactNo);
		this.businessName = businessName;
		this.extraEmail = extraEmail;
		this.extraContactNo = extraContactNo;
	} //overloaded constructor
	
	CorporateClient(){} //default constructor

	/**
	 * @return the businessName
	 */
	public String getBusinessName() {
		return businessName;
	}

	/**
	 * @param businessName the businessName to set
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	/**
	 * @return the extraEmail
	 */
	public String getExtraEmail() {
		return extraEmail;
	}

	/**
	 * @param extraEmail the extraEmail to set
	 */
	public void setExtraEmail(String extraEmail) {
		this.extraEmail = extraEmail;
	}

	/**
	 * @return the extraContactNo
	 */
	public String getExtraContactNo() {
		return extraContactNo;
	}

	/**
	 * @param extraContactNo the extraContactNo to set
	 */
	public void setExtraContactNo(String extraContactNo) {
		this.extraContactNo = extraContactNo;
	}
	
	

}
