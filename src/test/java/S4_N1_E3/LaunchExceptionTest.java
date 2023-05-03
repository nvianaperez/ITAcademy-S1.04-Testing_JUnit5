package S4_N1_E3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class LaunchExceptionTest {

    @Test
    @DisplayName("IndexOutOfBoundException was expected")
    void countCharacters() {
        IndexOutOfBoundsException thrown = Assertions.assertThrows(IndexOutOfBoundsException.class, () ->
            LaunchException.countCharacters("La")
        );

        Assertions.assertInstanceOf(IndexOutOfBoundsException.class, thrown);
    }

}

//    @Test
//    void testExpectedExceptionWithParentType() {
//
//        Assertions.assertThrows(IllegalArgumentException.class, () -> {
//            Integer.parseInt("One");
//        });
//    }

//    @Test
//    void testExpectedExceptionFail() {
//
//        NumberFormatException thrown = Assertions
//                .assertThrows(NumberFormatException.class, () -> {
//                    Integer.parseInt("1");
//                }, "NumberFormatException error was expected");
//
//        Assertions.assertEquals("Some expected message", thrown.getMessage());
//    }