package InterfaceAbstractDemo.Adapters;

import InterfaceAbstractDemo.Abstract.CustomerCheckService;
import InterfaceAbstractDemo.Entities.Customer;

public class MernisServiceAdapters implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		System.out.println("Person is valid");
		return true;
	}
		
}
