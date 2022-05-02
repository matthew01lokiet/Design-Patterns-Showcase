package org.design.patterns.behavioral.strategy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.design.patterns.behavioral.strategy.display.IDisplayStrategy;
import org.design.patterns.behavioral.strategy.sort.ISortingStrategy;

@RequiredArgsConstructor
public class CustomIntegerArray {

    @Getter
    private final int[] arr;
    private final IDisplayStrategy displayStrategy;
    private final ISortingStrategy sortingStrategy;

    public void sort() {
        sortingStrategy.sort(this.arr);
    }

    public void display() {
        displayStrategy.display(this.arr);
    }
}
