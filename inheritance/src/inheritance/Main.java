package inheritance;

public class Main {

	public static void main(String[] args) {
	IndividualCustomer �ldem = new IndividualCustomer();
	�ldem.customerNumber = "1234";
	
	
	
	CorporateCustomer hepsiburada = new CorporateCustomer();		
	hepsiburada.customerNumber = "67890";	
	
	
	
	CustomerManager customerManager = new CustomerManager();
	
	Customer[] customers = {�ldem,hepsiburada};
	
	customerManager.addMultiple(customers);
	
	
	
	}

}
    