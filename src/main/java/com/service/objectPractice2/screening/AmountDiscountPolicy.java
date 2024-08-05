package com.service.objectPractice2.screening;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {

    protected Money discountAmount;

//    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
//        super(conditions);
//        this.discountAmount = discountAmount;
//    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
