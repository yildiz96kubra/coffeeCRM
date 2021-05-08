package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
CustomerCheckManager customercheck =  new  CustomerCheckManager();
//	public StarbucksCustomerManager() {
	//	_customerCheckService = customerCheckService;
	//}
	public void Save(Customer customer) {

		if (customercheck.CheckIfrealPersone(customer)) {
			super.Save(customer);
		}
		else
		System.out.println("Girdiðiniz kiþi Mernis sisteminde bulunamadý");
;
		

	}

}
