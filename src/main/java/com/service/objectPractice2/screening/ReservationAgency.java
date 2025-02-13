//package com.service.objectPractice2.screening;
//
//import com.service.objectpractice.screening.Movie.DiscountConditionType;
//
//public class ReservationAgency {
//
//    public Reservation reserve(
//        Screening screening, Customer customer, int audienceCount) {
//        boolean discountable = checkDiscountable(screening);
//        return createReservation(screening, customer, audienceCount, fee);
//    }
//
//    private boolean checkDiscountable(Screening screening) {
//        return screening.getMovie().getDiscountConditions().stream()
//            .anyMatch(condition -> isDiscountable(condition, screening));
//    }
//
//    private boolean isDiscountable(DiscountCondition condition, Screening screening) {
//        if (condition.getType() == DiscountConditionType.PERIOD) {
//            return isSatisfiedByPeriod(condition, screening);
//        }
//        return isSatisfiedBySequence(condition, screening);
//    }
//
//    private boolean isSatisfiedBySequence(DiscountCondition condition, Screening screening) {
//        return condition.getSequence() == screening.getSequence();
//    }
//
//    private boolean isSatisfiedByPeriod(DiscountCondition condition, Screening screening) {
//        return screening.getWhenScreened().getDayOfWeek().equals(condition.getDayOfWeek()) &&
//            condition.getStartTime().compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
//            condition.getEndTime().compareTo(screening.getWhenScreened().toLocalTime()) >=0;
//    }
//
//    private Money calculateFee(Screening screening, boolean discountable, int audienceCount) {
//        if (discountable) {
//            return screening.getMovie().getFee().minus(calculateDiscountedFee(screening.getMovie()))
//                .times(audienceCount);
//        }
//        return screening.getMovie().getFee().times(audienceCount);
//    }
//
//    private Reservation createReservation(Screening screening, Customer customer, int audienceCount, Money fee) {
//        return new Reservation(customer, screening, fee, audienceCount);
//    }
//
//}
