package com.service.javamid.practice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class PJT28 {
    static final Map<Integer,Integer> DAYS_IN_MONTH = new HashMap<>();
    static{
        DAYS_IN_MONTH.put(1, 31);
        DAYS_IN_MONTH.put(3, 31);
        DAYS_IN_MONTH.put(5, 31);
        DAYS_IN_MONTH.put(7, 31);
        DAYS_IN_MONTH.put(8, 31);
        DAYS_IN_MONTH.put(10, 31);
        DAYS_IN_MONTH.put(12, 31);
        DAYS_IN_MONTH.put(4, 30);
        DAYS_IN_MONTH.put(6, 30);
        DAYS_IN_MONTH.put(9, 30);
        DAYS_IN_MONTH.put(11, 30);
    }
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int currYear = now.getYear();
        int currMonth = now.getMonthValue();
        int dayInMonth = DAYS_IN_MONTH.getOrDefault(currMonth,
            isLeapYear(currYear)?29:28);
        System.out.printf("현재 달 %d의 날 수는 : %d입니다%n", currMonth,dayInMonth);
    }
    private static boolean isLeapYear(int year){
        return year % 4==0 && (year%100!=0||year%400==0);
    }

//    public static void main(String[] args) {
//        LocalDateTime now = LocalDateTime.now();
//        int currYear = now.getYear();
//        int currMonth = now.getMonthValue();
//        int[] valOf31 = new int[]{1,3,5,7,8,10,12};
//        int[] valOf30 = new int[]{4,6,9,11};
//
//        for(int val : valOf31){
//           if(val == currMonth){
//               System.out.println("현재 달 "+currMonth+"의 날 수는 : 31입니다");
//               return;
//            }
//        }
//        for(int val : valOf30){
//            if(val == currMonth){
//                System.out.println("현재 달 "+currMonth+"의 날 수는 : 30입니다");
//                return;
//            }
//        }
//        if(currMonth == 2 && currYear %4 == 0 && (currYear % 100 != 0 || currYear % 400 == 0)){
//            System.out.println("현재 달 "+currMonth+"의 날 수는 : 29입니다");
//            return;
//        }else{
//            System.out.println("현재 달 "+currMonth+"의 날 수는 : 28입니다");
//            return;
//        }
//    }

}
