package company.discount;

import java.util.UUID;

public class AmountBasedDiscount extends Discount{

private Double discountAmount;//50


public AmountBasedDiscount(UUID id, String name, Double thresholdAmount, Double discountAmount) {
        super(id, name, thresholdAmount);
        this.discountAmount = discountAmount;
        }

@Override
public Double calculateCartAmountAfterDiscountApplied(Double amount) {
        return amount - discountAmount;                        //
        //               50
        }

public Double getDiscountAmount() {
        return discountAmount;
        }
        }
