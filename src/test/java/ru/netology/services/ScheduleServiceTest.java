
package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ScheduleServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/schedule.csv")
    public void testScheduleServiceAll(int income, int expense, int threshold, int expected) {
        ScheduleService service = new ScheduleService();
        int actual = service.calculate(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }


}
