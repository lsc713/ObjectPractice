package com.service.objectPractice2.screening;

import java.time.Duration;

public class PercentDiscountMovie extends Movie {

    protected double percent;

    public PercentDiscountMovie(String title, Duration duration, Money fee, double percent, DiscountCondition... conditions) {
        super(title, duration, fee, conditions);
        this.percent = percent;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return null;
    }
}
