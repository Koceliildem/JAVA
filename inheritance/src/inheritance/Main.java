package inheritance;

public class Main {

	public static void main(String[] args) {
	IndividualCustomer ýldem = new IndividualCustomer();
	ýldem.customerNumber = "1234";
	
	
	
	CorporateCustomer hepsiburada = new CorporateCustomer();		
	hepsiburada.customerNumber = "67890";	
	
	
	
	CustomerManager customerManager = new CustomerManager();
	
	Customer[] customers = {ýldem,hepsiburada};
	
	customerManager.addMultiple(customers);
	
	
	
	}

}
    