package com.merchandise.entities;

public class Customer extends Merchandise {
	private long creditLimit;
	private String phoneNumber;
	private String email;

	// Constructor
	public Customer(int partnerId, String partnerName, String city, String state, long creditLimit, String phoneNumber, String email) {
		super(partnerId, partnerName, city, state);
		this.creditLimit = creditLimit;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	// Getter & setter
	public long getCreditLimit() {
		return this.creditLimit;
	}

	public String setCreditLimit(String creditLimit) {
		String msg;
		long cr = Long.parseLong(creditLimit);
		if (cr < 50000) {
			this.creditLimit = cr;
			msg = String.valueOf(cr);
		}
		else {
			msg = "Credit limit not valid";
		}
		return msg;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public String setPhoneNumber(String phoneNumber) {
		String msg, regex = "\\d{10}";
		boolean match = phoneNumber.matches(regex);
		if (match) {
			this.phoneNumber = phoneNumber;
			msg = phoneNumber;
		} else {
			msg = "Phone number not valid";
		}
		return msg;
	}

	public String getEmail() {
		return this.email;
	}

	public String setEmail(String email) {
		String msg, regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		boolean match = email.matches(regex);
		if (match) {
			this.email = email;
			msg = email;
		} else {
			msg = "Email not valid";
		}
		return msg;
	}

	// Validation method
	@Override
	public String[] validate() {
		String obj1[] = super.validate();
		String obj2[] = { String.valueOf(this.creditLimit), this.phoneNumber, this.email };
		obj2[0] = setCreditLimit(obj2[0]);
		obj2[1] = setPhoneNumber(obj2[1]);
		obj2[2] = setEmail(obj2[2]);
		
		// Array merge
		int fLen = obj1.length;
		int sLen = obj2.length;
		String s[] = new String[fLen + sLen];
		System.arraycopy(obj1, 0, s, 0, fLen);
		System.arraycopy(obj2, 0, s, fLen, sLen);
		return s;
	}

	// toString method
	@Override
	public String toString() {
		return "Customer : [ " + getPartnerId() + ", " + getPartnerName() + ", " + getCity() + ", " + getState() + ", "
				+ getCreditLimit() + ", " + getPhoneNumber() + ", " + getEmail() + " ]";
	}

	@Override
	public void display() {
		System.out.println(toString());
	}
}
