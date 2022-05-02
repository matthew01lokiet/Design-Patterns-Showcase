package org.design.patterns.behavioral.strategy.display;

import java.util.Arrays;

public class DisplayHorizontallyStrategy implements IDisplayStrategy{

    @Override
    public void display(int[] arr) {
        Arrays.stream(arr).forEach(ele -> System.out.printf("%d ", ele));
        System.out.println();
    }
}
