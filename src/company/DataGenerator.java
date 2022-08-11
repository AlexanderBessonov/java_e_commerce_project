package company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

    public static void createCustomer() {
        Address address1Customer1 = new Address("7925", "Jones Branch Dr", "Suite 3300", "22102", "VA");
        Address address2Customer1 = new Address("825", "GeorgeTown Pky", "Suite 5355", "22036", "VA");
        Address address1Customer2 = new Address("5924", "Lee Hwy", "House", "22044", "VA");


    List<Address> customer1AddressList = new ArrayList<>();

        customer1AddressList.add(address1Customer1);
        customer1AddressList.add(address2Customer1);

    Customer customer1 = new Customer(UUID.randomUUID(),"ozzy","ozzy@cydeo.com",customer1AddressList);
    Customer customer2 = new Customer(UUID.randomUUID(),"mike","mike@gmail.com");

        StaticConstants.CUSTOMER_LIST.add(customer1);
        StaticConstants.CUSTOMER_LIST.add(customer2);




    }
}
