package InterfaceAbstractDemo.Abstract;

import InterfaceAbstractDemo.Entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
