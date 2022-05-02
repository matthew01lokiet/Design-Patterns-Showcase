package org.design.patterns.structural.decorator.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public abstract class Package {
    protected int cost;
    protected String description;
    protected LocalDate date;
}
