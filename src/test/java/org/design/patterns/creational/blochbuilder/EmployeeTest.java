package org.design.patterns.creational.blochbuilder;

import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Employee test")
class EmployeeTest {

    @Test
    @DisplayName("Build employee with only required parameters")
    void testBuildEmployeeWithOnlyRequiredParameters() {
        val employee = new Employee.Builder("john","doe",20).build();

        assertThat(employee.getName()).isEqualTo("john");
        assertThat(employee.getLastName()).isEqualTo("doe");
        assertThat(employee.getAge()).isEqualTo(20);
        assertThat(employee.getCompensation()).isEqualTo(4000);
        assertThat(employee.getVacationDays()).isEqualTo(28);
        assertThat(employee.getWeeklyEmploymentHours()).isEqualTo(40);
    }

    @Test
    @DisplayName("Build employee with all parameters")
    void testBuildEmployeeWithAllParameters() {
        val employee = new Employee.Builder("john","doe",20)
                .compensation(8000)
                .vacationDays(60)
                .weeklyEmploymentHours(60).build();

        assertThat(employee.getName()).isEqualTo("john");
        assertThat(employee.getLastName()).isEqualTo("doe");
        assertThat(employee.getAge()).isEqualTo(20);
        assertThat(employee.getCompensation()).isEqualTo(8000);
        assertThat(employee.getVacationDays()).isEqualTo(60);
        assertThat(employee.getWeeklyEmploymentHours()).isEqualTo(60);
    }
}
