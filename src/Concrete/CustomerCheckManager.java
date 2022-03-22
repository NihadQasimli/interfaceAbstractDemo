package Concrete;

import Abstract.IPersonCheckManager;
import Entities.Customer;

public class CustomerCheckManager implements IPersonCheckManager {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
