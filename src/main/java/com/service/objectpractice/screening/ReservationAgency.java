package com.service.objectpractice.screening;

import com.service.objectpractice.screening.Movie.DiscountCondition;
import com.service.objectpractice.screening.Movie.DiscountConditionType;
import java.time.chrono.ChronoLocalDateTime;

public class ReservationAgency {

    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {

        Movie movie = screening.getMovie();
        boolean discountable = false;
        for (DiscountCondition condition : movie.getDiscountConditions()) {
            if (condition.getType() == DiscountConditionType.PERIOD) {
                discountable =
                    screening.getWhenScreened().getDayOfWeek().equals(condition.getDayOfWeek()) &&
                        condition.getStartTime()
                            .compareTo(
                                ChronoLocalDateTime.from(screening.getWhenScreened().toLocalTime())) <= 0 &&
                        condition.getEndTime().compareTo(
                            ChronoLocalDateTime.from(screening.getWhenScreened().toLocalTime()))
                            >= 0;
            } else {
                discountable = condition.getSequence() == screening.getSequence();
            }
            if (discountable) {
                break;
            }
        }

        Money fee;
        if (discountable) {
            Money discountAmount = Money.zero;
            switch (movie.getMovieType()) {
                case AMOUNT_DISCOUNT:
                    discountAmount = movie.getDiscountAmount();
                    break;
                case PERCENT_DISCOUNT:
                    discountAmount = movie.getFee().times(movie.getDiscountPercent());
                    break;
            }

            fee = movie.getFee().minus(discountAmount);
        } else {
            fee = movie.getFee();
        }
        return new Reservation(customer, screening, fee, audienceCount);
    }

}
