package com.service.objectpractice.screening;

public class NoneDiscountPolicy extends DiscountPolicy {


    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.zero;
    }
}
