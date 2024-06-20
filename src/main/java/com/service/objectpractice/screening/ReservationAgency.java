package com.service.objectpractice.screening;

import com.service.objectpractice.screening.Movie.DiscountCondition;
import com.service.objectpractice.screening.Movie.DiscountConditionType;
import java.time.chrono.ChronoLocalDateTime;

public class ReservationAgency {

    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {

        Money fee = screening.calculateFee(audienceCount);
        return new Reservation(customer, screening, fee, audienceCount);

    }

}
