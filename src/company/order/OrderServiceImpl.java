package company.order;

import company.Cart;

public class OrderServiceImpl implements OrderService {
    @Override
    public String placeOrder(Cart cart) {
        double amountAfterDiscount = cart.calculateCartTotalAmount();


        if (cart.getDiscountId() != null) {

        }

    }
}