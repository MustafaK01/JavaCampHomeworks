import InterfaceAbstractDemo.Abstract.BaseCustomerManager;
import InterfaceAbstractDemo.Adapters.MernisServiceAdapters;
import InterfaceAbstractDemo.Concrete.NeroCustomerManager;
import InterfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import InterfaceAbstractDemo.Entities.Customer;
import InterfaceAbstractDemo.*;
public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapters());
		customerManager.save(new Customer());
	}

}
