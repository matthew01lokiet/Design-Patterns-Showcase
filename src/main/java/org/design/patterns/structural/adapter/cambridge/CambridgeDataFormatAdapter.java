package org.design.patterns.structural.adapter.cambridge;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.design.patterns.structural.adapter.oxford.IOxfordData;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class CambridgeDataFormatAdapter implements ICambridgeData{

    private final IOxfordData oxfordData;

    @Override
    public List<String> getUsersCsvData() {
        val oxfordTsvData = this.oxfordData.getUsersTsvData();
        return oxfordTsvData.stream().map(rec -> rec.replace("\t",",")).collect(Collectors.toList());
    }
}
