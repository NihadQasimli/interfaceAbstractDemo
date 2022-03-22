import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

    public static void main(String[] args) {

        BaseCustomerManager customerManager = new NeroCustomerManager();
        BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new CustomerCheckManager());
        customerManager.save(new Customer(1, "Nicat"));
        customerManager1.save(new Customer(1, "Nicat"));

    }
}
