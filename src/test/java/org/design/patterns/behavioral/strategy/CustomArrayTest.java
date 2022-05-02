package org.design.patterns.behavioral.strategy;

import lombok.val;
import org.design.patterns.behavioral.strategy.display.DisplayHorizontallyStrategy;
import org.design.patterns.behavioral.strategy.display.DisplayVerticallyStrategy;
import org.design.patterns.behavioral.strategy.sort.SelectionAscendingSortingStrategy;
import org.design.patterns.behavioral.strategy.sort.SelectionDescendingSortingStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Custom array test.")
class CustomArrayTest {

    @Test
    @DisplayName("Sort array in ascending order and display horizontally.")
    void testSortInAscendingOrderAndDisplayHorizontally() {
        val customArray = new CustomIntegerArray(
                new int[] {10,5,22,3}, new DisplayHorizontallyStrategy(), new SelectionAscendingSortingStrategy()
        );

        customArray.display();
        customArray.sort();
        assertThat(customArray.getArr()).isSorted();
        customArray.display();
    }

    @Test
    @DisplayName("Sort array in descending order and display vertically.")
    void testSortInDescendingOrderAndDisplayVertically() {
        val customArray = new CustomIntegerArray(
                new int[] {15,2,21,8}, new DisplayVerticallyStrategy(), new SelectionDescendingSortingStrategy()
        );

        customArray.display();
        customArray.sort();
        assertThat(customArray.getArr()).isSortedAccordingTo(Comparator.reverseOrder());
        customArray.display();
    }
}
