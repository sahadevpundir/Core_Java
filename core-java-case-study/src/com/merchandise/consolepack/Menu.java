package com.merchandise.consolepack;

import java.util.List;
import java.util.Scanner;

import com.merchandise.entities.Customer;
import com.merchandise.entities.Supplier;
import com.merchandise.services.Service;

public class Menu {

	public static void main(String[] args) {
		
		Service s = new Service();
		boolean b = true;

		// Loop for Menu
		do {
			System.out.println("+---------- Welcome in Menu ----------+");
			System.out.println("1 - Add Customer");
			System.out.println("2 - Add Supplier");
			System.out.println("3 - Display Report");
			System.out.println("4 - Search");
			System.out.println("5 - Exit");
			Scanner sc = new Scanner(System.in);
			System.out.printf("Enter your choice : ");
			int choice = 0;
			try {
				choice = Integer.parseInt(sc.next());
			} catch (NumberFormatException e) {
				System.err.println("Only numeric choice allowed");
			}

			// Main menu selection
			switch (choice) {
			case 1: {
				// Add Customers
				int number = 0;
				String st;
				System.out.printf("How many customer you want to add : ");
				try {
					number = Integer.parseInt(sc.next());
				} catch (NumberFormatException e) {
					System.err.println("Only numeric choice allowed");
				}

				if (number > 0 && number < 6) {
					for (int i = 1; i <= number; i++) {
						switch (i) {
						case 1: {
							st = "st";
							break;
						}
						case 2: {
							st = "nd";
							break;
						}
						case 3: {
							st = "rd";
							break;
						}
						case 4: {
							st = "th";
							break;
						}
						case 5: {
							st = "th";
							break;
						}
						default:
							st = "th";
						}
						System.out.printf("Enter details for %d%s customer\n", i, st);
						System.out.printf("Enter customer ID : ");
						int partnerId = sc.nextInt();
						System.out.printf("Enter customer name : ");
						String partnerName = sc.next();
						System.out.printf("Enter city : ");
						String city = sc.next();
						System.out.printf("Enter state : ");
						String state = sc.next();
						System.out.printf("Enter amount : ");
						long creditLimit = Long.parseLong(sc.next());
						System.out.printf("Enter phone number : ");
						String phoneNumber = sc.next();
						System.out.printf("Enter email : ");
						String email = sc.next();

						Customer c = new Customer(partnerId, partnerName, city, state, creditLimit, phoneNumber, email);
						String[] val = c.validate();
						boolean flag = true;
						for (String sr : val) {
							if (sr.contains("not valid")) {
								System.out.printf("%s, ", sr);
								flag = false;
							}
						}
						System.out.println("\n");
						if (flag) {
							s.saveCustomerDetails(c);
							System.out.println("Customer added succesfully");
						} else {
							System.err.println("Sorry can't add");
						}
					}
				} else {
					System.err.println("Customer couldn't be negative, 0 and more than 5");
				}
				System.out.println("+-------------------------------------+");
				break;
			}
			case 2: {
				// Add Suppliers
				int number = 0;
				String st;
				System.out.printf("How many supplier you want to add : ");
				try {
					number = Integer.parseInt(sc.next());
				} catch (NumberFormatException e) {
					System.err.println("Only numeric choice allowed");
				}

				if (number > 0 && number < 6) {
					for (int i = 1; i <= number; i++) {
						switch (i) {
						case 1: {
							st = "st";
							break;
						}
						case 2: {
							st = "nd";
							break;
						}
						case 3: {
							st = "rd";
							break;
						}
						case 4: {
							st = "th";
							break;
						}
						case 5: {
							st = "th";
							break;
						}
						default:
							st = "th";
						}
						System.out.printf("Enter details for %d%s Supplier\n", i, st);
						System.out.printf("Enter Id : ");
						int partnerId = sc.nextInt();
						System.out.printf("Enter Supplier Name : ");
						String partnerName = sc.next();
						System.out.printf("Enter City : ");
						String city = sc.next();
						System.out.printf("Enter State : ");
						String state = sc.next();
						System.out.printf("Enter Credit Balance : ");
						long creditBalance = Long.parseLong(sc.next());
						System.out.printf("Enter Driving Licence Number : ");
						String drivingLicenseNumber = sc.next();

						Supplier sup = new Supplier(partnerId, partnerName, city, state, creditBalance,
								drivingLicenseNumber);
						String[] val = sup.validate();
						boolean flag = true;
						for (String sr : val) {
							if (sr.contains("not valid")) {
								System.out.printf("%s, ", sr);
								flag = false;
							}
						}
						System.out.println("\n");
						if (flag) {
							s.saveSupplierDetails(sup);
							System.out.println("Supplier added succesfully");
						} else {
							System.err.println("Sorry can't add");
						}
					}
				} else {
					System.err.println("Supplier couldn't be negative, 0 and more than 5");
				}
				System.out.println("+-------------------------------------+");
				break;
			}
			case 3: {
				// Display the Report
				System.out.println("+---------- Display Report ----------+");
				System.out.printf("\t1 - Customer\n");
				System.out.printf("\t2 - Supplier\n");
				System.out.printf("Enter you choice : ");
				int ch = 0;
				try {
					ch = Integer.parseInt(sc.next());
				} catch (NumberFormatException e) {
					System.err.println("Only numeric choice allowed");
				}
				if (ch > 0 && ch < 3) {
					if (ch == 1) {
						// Display Customers
						List<Customer> customer = s.getAllCustomers();
						if (customer.isEmpty()) {
							System.out.println("No customer added yet");
						}
						 for (Customer c : customer) {
								System.out.println(c);
							}
					} else {
						// Display Suppliers
						List<Supplier> supplier = s.getAllSuppliers();
						if (supplier.isEmpty()) {
							System.out.println("No supplier added yet");
						}
						for (Supplier sup : supplier) {
							System.out.println(sup);
						}
					}
				} else {
					System.out.println("Wrong choice!");
				}
				System.out.println("+-------------------------------------+");
				break;
			}
			case 4: {
				// Search by ID in customer & supplier
				System.out.printf("Enter ID for search : ");
				int id = 0;
				try {
					id = Integer.parseInt(sc.next());
				} catch (NumberFormatException e) {
					System.err.println("ID conains numbers only!");
				}
				boolean check = s.getCustomerById(id);
				if (check) {
					System.out.println("Found successfully!");
				} else {
					boolean flag = s.getSupplierById(id);
					if (flag) {
						System.out.println("Found successfully!");
					} else {
						System.out.println("Sorry! not found");
					}
				}
				System.out.println("+-------------------------------------+");
				break;
			}
			case 5: {
				// Loop termination
				b = false;
				sc.close();
				System.out.println("+------------- Thank You -------------+");
				break;
			}
			default: {
				System.out.println("Wrong choice! try again...");
			}
			}
		}while(b);

		System.gc();
	}
}
