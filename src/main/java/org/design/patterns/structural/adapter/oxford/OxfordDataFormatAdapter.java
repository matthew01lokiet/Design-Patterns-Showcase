package org.design.patterns.structural.adapter.oxford;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.design.patterns.structural.adapter.cambridge.ICambridgeData;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class OxfordDataFormatAdapter implements IOxfordData{

    private final ICambridgeData cambridgeData;

    @Override
    public List<String> getUsersTsvData() {
        val cambridgeCsvData = this.cambridgeData.getUsersCsvData();
        return cambridgeCsvData.stream().map(rec -> rec.replace(",","\t")).collect(Collectors.toList());
    }
}
