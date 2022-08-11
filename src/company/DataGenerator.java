package company;

import company.category.Category;
import company.category.Electronic;
import company.category.Furniture;
import company.category.SkinCare;

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
    public static void createCategory(){

        Category category1 = new Electronic(UUID.randomUUID(),"Electronic");
        Category category2 = new Furniture(UUID.randomUUID(),"Furniture");
        Category category3 = new SkinCare(UUID.randomUUID(),"SkinCare");

        StaticConstants.CATEGORY_LIST.add(category1);
        StaticConstants.CATEGORY_LIST.add(category2);
        StaticConstants.CATEGORY_LIST.add(category3);

    }
    public static void createProduct(){

        Product product1 =
                new Product(UUID.randomUUID(),"PS5",230.72,7,7,StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product2 =
                new Product(UUID.randomUUID(),"XBOX",120.34,15,15,StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product3=
                new Product(UUID.randomUUID(),"Chair",30.87,85,85,StaticConstants.CATEGORY_LIST.get(1).getId());
        Product product4=
                new Product(UUID.randomUUID(),"Milk",2.87,185,85,UUID.randomUUID());


        StaticConstants.PRODUCT_LIST.add(product1);
        StaticConstants.PRODUCT_LIST.add(product2);
        StaticConstants.PRODUCT_LIST.add(product3);
        StaticConstants.PRODUCT_LIST.add(product4);

    }


}
