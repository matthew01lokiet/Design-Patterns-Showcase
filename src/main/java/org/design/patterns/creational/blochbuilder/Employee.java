package org.design.patterns.creational.blochbuilder;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Employee {

    private final String name;
    private final String lastName;
    private final int age;
    private final int compensation;
    private final int vacationDays;
    private final int weeklyEmploymentHours;

    private Employee(Builder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.compensation = builder.compensation;
        this.vacationDays = builder.vacationDays;
        this.weeklyEmploymentHours = builder.weeklyEmploymentHours;
    }

    public static class Builder {
        // required parameters
        private final String name;
        private final String lastName;
        private final int age;

        // optional parameters with initial values
        private int compensation = 4000;
        private int vacationDays = 28;
        private int weeklyEmploymentHours = 40;

        public Builder(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public Builder compensation(int compensation) {
            this.compensation = compensation;
            return this;
        }
        public Builder vacationDays(int vacationDays) {
            this.vacationDays = vacationDays;
            return this;
        }
        public Builder weeklyEmploymentHours(int weeklyEmploymentHours) {
            this.weeklyEmploymentHours = weeklyEmploymentHours;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
