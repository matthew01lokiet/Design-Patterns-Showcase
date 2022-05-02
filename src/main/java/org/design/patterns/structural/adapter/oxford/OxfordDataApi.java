package org.design.patterns.structural.adapter.oxford;

import java.util.List;

public class OxfordDataApi implements IOxfordData{

    @Override
    public List<String> getUsersTsvData() {
        return List.of(
                "Noah\tJones",
                "Liam\tMiller",
                "Jacob\tDavis",
                "Ethan\tGarcia"
        );
    }
}
