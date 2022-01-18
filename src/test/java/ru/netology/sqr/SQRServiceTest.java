package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"general count, 200, 300, 3",
            "change high limit, 200, 400, 6",
            "change low limit, 100, 300, 8",
            "increase range, 100, 800, 19",
            "decrease range, 200, 250, 1"
    })
    void shouldCalculateCount(String testName, int lowestLimit, int highestLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculate(lowestLimit, highestLimit);
        assertEquals(expected, actual);

    }
}
