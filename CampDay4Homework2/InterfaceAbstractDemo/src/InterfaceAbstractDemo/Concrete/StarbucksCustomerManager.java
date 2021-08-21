package InterfaceAbstractDemo.Concrete;

import InterfaceAbstractDemo.Abstract.BaseCustomerManager;
import InterfaceAbstractDemo.Abstract.CustomerCheckService;
import InterfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Person added");
		}else {
			System.out.println("Not A valid person");
		}
		
	}


}
