package org.design.patterns.creational.singleton;

import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

@DisplayName("Pope test")
class PopeTest {

    @Test
    @DisplayName("Test only one pope exists.")
    void testOnlyOnePopeExists(){
        val pope1 = Pope.getPope("Francis I");
        val pope2 = Pope.getPope("Benedict XVI"); // won't set new name, instance already exists

        assertSame(pope1, pope2);
        assertEquals(pope1.getName(), pope2.getName());
    }
}
