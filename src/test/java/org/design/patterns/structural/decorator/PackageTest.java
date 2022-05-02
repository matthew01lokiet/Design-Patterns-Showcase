package org.design.patterns.structural.decorator;

import lombok.val;
import org.design.patterns.structural.decorator.decoration.GiftPackage;
import org.design.patterns.structural.decorator.decoration.InternationalPackage;
import org.design.patterns.structural.decorator.object.DefaultPackage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Package test")
class PackageTest {

    @Test
    @DisplayName("Test package full configuration.")
    void testPackageFullConfiguration() {
        val defaultPackage = new DefaultPackage();

        assertThat(defaultPackage.getCost()).isEqualTo(1);
        assertThat(defaultPackage.getDate()).isEqualTo(LocalDate.now().plusDays(3));
        System.out.println(defaultPackage);

        val internationalDefaultPackage = new InternationalPackage(defaultPackage);

        assertThat(internationalDefaultPackage.getCost()).isEqualTo(3);
        assertThat(internationalDefaultPackage.getDate()).isEqualTo(LocalDate.now().plusDays(10));
        System.out.println(internationalDefaultPackage);

        val giftInternationalDefaultPackage = new GiftPackage(internationalDefaultPackage);

        assertThat(giftInternationalDefaultPackage.getCost()).isEqualTo(5);
        System.out.println(giftInternationalDefaultPackage);
    }
}
