package com.service.objectPractice2.screening;

import java.time.DayOfWeek;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);

    int getSequence();

    DayOfWeek getDayOfWeek();

    Object getStartTime();

    Object getEndTime();

    boolean getType();

}
