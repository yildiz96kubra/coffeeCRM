import java.time.LocalDateTime;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class MainProgram {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer customer1 = new Customer();
		customer1.DateOfBirth = LocalDateTime.of(1996, 12, 5, 14, 30);
		customer1.FirstName = "Engin";
		customer1.LastName = "Demiroð";
		customer1.Id = 1;
		customer1.NationalityId = "TR";
 
		Customer customer2 = new Customer();
		customer2.DateOfBirth = LocalDateTime.of(1996, 12, 5, 14, 30);
		customer2.FirstName = "Kübra";
		customer2.LastName = "Yýldýz";
		customer2.Id = 2;
		customer2.NationalityId = "TR";
		
		customerManager.Save(customer1);
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager();
		customerManager2.Save(customer1);
                                  		customerManager2.Save(customer2);                                         
	}

}
