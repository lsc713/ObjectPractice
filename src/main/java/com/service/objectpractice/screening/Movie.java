package com.service.objectpractice.screening;


import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;


    public enum MovieType {
        AMOUNT_DISCOUNT,
        PERCENT_DISCOUNT,
        NONE_DISCOUNT
    }


    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public DiscountPolicy getDiscountPolicy() {
        return discountPolicy;
    }

    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public Money calculateAmountDiscountedFee() {
        if (movieType != MovieType.AMOUNT_DISCOUNT) {
            throw new IllegalArgumentException();
        }
        return fee.minus(discountAmount);
    }

    public Money calculatePercentDiscountedFee() {
        if (movieType != MovieType.PERCENT_DISCOUNT) {
            throw new IllegalArgumentException();
        }
        return fee.minus(fee.times(discountPercent));
    }

    public Money calculateNoneDiscountedFee() {
        if (movieType != MovieType.NONE_DISCOUNT) {
            throw new IllegalArgumentException();
        }
        return fee;
    }


    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public Money getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public List<DiscountCondition> getDiscountConditions() {
        return discountConditions;
    }

    public void setDiscountConditions(
        List<DiscountCondition> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public enum DiscountConditionType{
        SEQUENCE,
        PERIOD
    }

    public class DiscountCondition{

        private DiscountConditionType type;

        private int sequence;

        private DayOfWeek dayOfWeek;
        private LocalTime startTime;

        private LocalTime endTime;

        public DiscountConditionType getType() {
            return type;
        }

        public boolean isDiscountable(DayOfWeek dayOfWeek, LocalTime time) {
            if (type != DiscountConditionType.PERIOD) {
                throw new IllegalArgumentException();
            }
            return this.dayOfWeek.equals(dayOfWeek) &&
                this.startTime.compareTo(time) <= 0 &&
                this.endTime.compareTo(time) >= 0;
        }

        public boolean isDiscountable(int sequence) {
            if (type != DiscountConditionType.SEQUENCE) {
                throw new IllegalArgumentException();
            }
            return this.sequence == sequence;
        }


        public void setType(DiscountConditionType type) {
            this.type = type;
        }

        public int getSequence() {
            return sequence;
        }

        public void setSequence(int sequence) {
            this.sequence = sequence;
        }

        public DayOfWeek getDayOfWeek() {
            return dayOfWeek;
        }

        public void setDayOfWeek(DayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
        }

        public LocalDateTime getStartTime() {
            return startTime;
        }

        public void setStartTime(LocalDateTime startTime) {
            this.startTime = startTime;
        }

        public LocalDateTime getEndTime() {
            return endTime;
        }

        public void setEndTime(LocalDateTime endTime) {
            this.endTime = endTime;
        }
    }

    public boolean isDiscountable(LocalDateTime whenScreened, int sequence) {
        for (DiscountCondition discountCondition : discountConditions) {
            if (discountCondition.getType() == DiscountConditionType.PERIOD) {
                if (discountCondition.isDiscountable(whenScreened.getDayOfWeek(),
                    whenScreened.toLocalTime())) {
                    return true;
                } else {
                    if (discountCondition.isDiscountable(sequence)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
