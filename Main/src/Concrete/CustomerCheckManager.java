package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfrealPersone(Customer customer) {
if (customer.Id==1)
	return true;
return false;
	}

}
