package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.IPersonCheckManager;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckManager customerCheckManager;

    public StarbucksCustomerManager(CustomerCheckManager customerCheckManager) {
        this.customerCheckManager = customerCheckManager;
    }


    @Override
    public void save(Customer customer) {
        if (customerCheckManager.checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
            System.out.println("Not a valid person");
        }

    }


}
