package org.design.patterns.structural.adapter.cambridge;

import java.util.List;

public class CambridgeDataApi implements ICambridgeData{

    @Override
    public List<String> getUsersCsvData() {
        //stub data
        return List.of(
                "John,Doe",
                "Adam,Smith",
                "Alex,Williams",
                "Stephen,Brown"
        );
    }
}
