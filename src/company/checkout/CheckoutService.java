package company.checkout;

import company.Customer;

public interface CheckoutService {
    boolean checkout(Customer customer, Double totalAmount);
}
