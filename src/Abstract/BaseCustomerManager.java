package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerManager {

    @Override
    public void save(Customer customer) {
        System.out.println("Saved to Database : " + customer.getName());
    }
}
