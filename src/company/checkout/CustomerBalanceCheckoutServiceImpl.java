package company.checkout;

import company.Customer;
import company.balance.CustomerBalance;

import company.Customer;
import company.StaticConstants;
import company.balance.Balance;
import company.balance.CustomerBalance;

import java.util.UUID;
public class CustomerBalanceCheckoutServiceImpl implements CheckoutService{
    @Override
    public boolean checkout(Customer customer, Double totalAmount) {
        CustomerBalance customerBalance = findCustomerBalance(customer.getId());
        double finalBalance = customerBalance.getBalance() - totalAmount;
        if (finalBalance > 0){
            customerBalance.setBalance(finalBalance);
            return true;
        }
        return false;
    }
    private static CustomerBalance findCustomerBalance(UUID customerId){

    }
}
