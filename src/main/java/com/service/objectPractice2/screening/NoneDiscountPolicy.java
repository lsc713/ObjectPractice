package com.service.objectPractice2.screening;

public class NoneDiscountPolicy implements DiscountPolicy {


    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.zero;
    }
}
