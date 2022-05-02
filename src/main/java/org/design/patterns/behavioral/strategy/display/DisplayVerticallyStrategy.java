package org.design.patterns.behavioral.strategy.display;

import java.util.Arrays;

public class DisplayVerticallyStrategy implements IDisplayStrategy{

    @Override
    public void display(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println();
    }
}
