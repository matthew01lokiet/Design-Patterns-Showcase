package org.design.patterns.structural.adapter;

import lombok.val;
import org.design.patterns.structural.adapter.cambridge.CambridgeDataApi;
import org.design.patterns.structural.adapter.cambridge.CambridgeDataFormatAdapter;
import org.design.patterns.structural.adapter.oxford.OxfordDataApi;
import org.design.patterns.structural.adapter.oxford.OxfordDataFormatAdapter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("User data test")
class UserDataTest {

    @Test
    @DisplayName("Gather csv user data.")
    void testGatherCsvUserData() {
        val cambridgeUserRecords = new CambridgeDataApi().getUsersCsvData();
        val oxfordUserRecords = new CambridgeDataFormatAdapter(new OxfordDataApi()).getUsersCsvData();
        val combinedCsvRecords = Stream.concat(cambridgeUserRecords.stream(), oxfordUserRecords.stream()).toList();

        assertThat(combinedCsvRecords).noneMatch(rec -> rec.contains("\t"));
        combinedCsvRecords.forEach(System.out::println);
    }

    @Test
    @DisplayName("Gather tsv user data.")
    void testGatherTsvUserData() {
        val oxfordUserRecords = new OxfordDataApi().getUsersTsvData();
        val cambridgeUserRecords = new OxfordDataFormatAdapter(new CambridgeDataApi()).getUsersTsvData();
        val combinedTsvRecords = Stream.concat(oxfordUserRecords.stream(), cambridgeUserRecords.stream()).toList();

        assertThat(combinedTsvRecords).noneMatch(rec -> rec.contains(","));
        combinedTsvRecords.forEach(System.out::println);
    }
}
