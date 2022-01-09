package com.merchandise.entities;

public class Supplier extends Merchandise {
	private long creditBalance;
	private String drivingLicenseNumber;

	// Constructor
	public Supplier(int partnerId, String partnerName, String city, String state, long creditBalance,
			String drivingLicenseNumber) {
		super(partnerId, partnerName, city, state);
		this.creditBalance = creditBalance;
		this.drivingLicenseNumber = drivingLicenseNumber;
	}

	// Getter & Setter
	public long getCreditBalance() {
		return this.creditBalance;
	}

	public String setCreditBalance(String creditBalance) {
		String msg;
		long crBal = Long.parseLong(creditBalance);
		if (crBal < 175000) {
			this.creditBalance = crBal;
			msg = String.valueOf(crBal);
		} else {
			msg = "Credit Balance not Valid";
		}
		return msg;
	}

	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}

	public String setDrivingLicenseNumber(String drivingLicenseNumber) {
		String msg, regex = "^(([A-Z]{2}[0-9]{2})" + "( )|([A-Z]{2}-[0-9]" + "{2}))((19|20)[0-9]" + "[0-9])[0-9]{7}$";
		// It validate this format : UP-1120287923164
		boolean match = drivingLicenseNumber.matches(regex);
		if (match) {
			this.drivingLicenseNumber = drivingLicenseNumber;
			msg = drivingLicenseNumber;
		} else {
			msg = "Driving Licence not valid";
		}
		return msg;
	}

	// Validation error method
	@Override
	public String[] validate() {
		String obj1[] = super.validate();
		String obj2[] = { String.valueOf(this.creditBalance), this.drivingLicenseNumber };
		obj2[0] = setCreditBalance(obj2[0]);
		obj2[1] = setDrivingLicenseNumber(obj2[1]);

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
		return "Supplier : [ " + getPartnerId() + ", " + getPartnerName() + ", " + getCity() + ", " + getState() + ", "
				+ getCreditBalance() + ", " + getDrivingLicenseNumber() + " ]";
	}

	@Override
	public void display() {
		System.out.println(toString());
	}
}
