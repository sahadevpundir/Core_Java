package com.merchandise.entities;

public class Merchandise {
	private int partnerId;
	private String partnerName;
	private String city;
	private String state;

	// Constructor
	public Merchandise(int partnerId, String partnerName, String city, String state) {
		super();
//		setPartnerId(partnerId);
//		setPartnerName(partnerName);
//		setCity(city);
//		setState(state);

		this.partnerId = partnerId;
		this.partnerName = partnerName;
		this.city = city;
		this.state = state;
	}

	// Getter & Setter
	public int getPartnerId() {
		return this.partnerId;
	}

	public String setPartnerId(String partnerId) {
		String msg;
		int pID = Integer.parseInt(partnerId);
		if (pID > 0) {
			this.partnerId = pID;
			msg = String.valueOf(pID);
		} else {
			msg = "ID not valid";
		}
		return msg;
	}

	public String getPartnerName() {
		return this.partnerName;
	}

	public String setPartnerName(String partnerName) {
		String msg;
		if (partnerName.length() > 5 && partnerName != null) {
			this.partnerName = partnerName;
			msg = partnerName;
		} else {
			msg = "Name not valid";
		}
		return msg;
	}

	public String getCity() {
		return this.city;
	}

	public String setCity(String city) {
		String msg;
		if (city.length() > 3 && city != null) {
			this.city = city;
			msg = city;
		} else {
			msg = "City not valid";
		}
		return msg;
	}

	public String getState() {
		return this.state;
	}

	public String setState(String state) {
		String msg;
		if (state.length() > 3 && state != null) {
			this.state = state;
			msg = state;
		} else {
			msg = "State not valid";
		}
		return msg;
	}

	// Validation method
	public String[] validate() {
		String[] objectValue = { String.valueOf(this.partnerId), this.partnerName, this.city, this.state };
		objectValue[0] = setPartnerId(objectValue[0]);
		objectValue[1] = setPartnerName(objectValue[1]);
		objectValue[2] = setCity(objectValue[2]);
		objectValue[3] = setState(objectValue[3]);
		return objectValue;
	}

	// For object value, toString method
	@Override
	public String toString() {
		return "[partnerId=" + partnerId + ", partnerName=" + partnerName + ", city=" + city + ", state="
				+ state + "]";
	}

	public void display() {
		System.out.println(toString());
	}
}