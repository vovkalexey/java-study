package ua.dp.vovkalexey.junit5.getstarted.type;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageConverterExampleTest {

    @DisplayName("Should pass same messages as method parameters")
    @ParameterizedTest(name = "{index} => actual={0}, expected={1}")
    @CsvSource({
            "Hello, Hello",
            "Hi, Hi",
    })
    void shouldPassMessages(@ConvertWith(MessageConverter.class) Message actual,
                            @ConvertWith(MessageConverter.class) Message expected) {
        assertEquals(expected.getMessage(), actual.getMessage());
    }
}
