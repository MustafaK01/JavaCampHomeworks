package InterfaceAbstractDemo.Abstract;

import InterfaceAbstractDemo.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	public abstract void save(Customer customer);
	
}
