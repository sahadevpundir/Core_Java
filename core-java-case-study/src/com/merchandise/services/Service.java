package com.merchandise.services;

import java.util.ArrayList;
import java.util.List;

import com.merchandise.entities.Customer;
import com.merchandise.entities.Supplier;

public class Service {
	ArrayList<Customer> customer = new ArrayList<Customer>();
	ArrayList<Supplier> supplier = new ArrayList<Supplier>();

	public void saveCustomerDetails(Customer cust) {
		customer.add(cust);
	}

	public List<Customer> getAllCustomers() {
		return customer;
	}

	public boolean getCustomerById(int customerId) {
		boolean n = false;
		if (customer.isEmpty()) {
			System.out.println("Customer list is empty!");
		} else {
			for (Customer c : customer) {
				if (c.getPartnerId() == customerId) {
					System.out.println(c);
					n = true;
				}
			}
		}
		return n;
	}

	public boolean getSupplierById(int supplierId) {
		boolean n = false;
		if (supplier.isEmpty()) {
			System.out.println("Supplier list is empty!");
		} else {
			for (Supplier sup : supplier) {
				if (sup.getPartnerId() == supplierId) {
					System.out.println(sup);
					n = true;
				}
			}
		}
		return n;
	}
	
	public void saveSupplierDetails(Supplier supp) {
		supplier.add(supp);
	}

	public List<Supplier> getAllSuppliers() {
		return supplier;
	}

}