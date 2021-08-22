package InterfaceAbstractDemo.Concrete;
import InterfaceAbstractDemo.Abstract.CustomerCheckService;
import InterfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

	


	
}
