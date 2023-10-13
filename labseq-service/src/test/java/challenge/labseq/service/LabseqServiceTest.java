package challenge.labseq.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class LabseqServiceTest {

    @Value("#{'${config.labseq.default-value-zero}'.split(',')}")
    private List<Integer> defaultValueZero;

    @Value("#{'${config.labseq.default-value-one}'.split(',')}")
    private List<Integer> defaultValueOne;

    @Test
    void whenContextIsInitialized_thenInjectedListOfBasicTypesContainsExpectedValues() {
        assertEquals(Arrays.asList(0, 2), defaultValueZero);
        assertEquals(Arrays.asList(1, 3), defaultValueOne);
    }
}
