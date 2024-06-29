package com.service.javamid.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        ValueAdder adder1 = valueAdder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder3.getValue();
        System.out.println(result);
    }

}
