package S4_N1_E1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateMonthsTest {

    CreateMonths createMonths = new CreateMonths();

    @Test
    @DisplayName("Tamany de la llista és 12")
    void checkSizeList() {
        assertEquals(12, createMonths.createMonths().size());
    }

    @Test
    @DisplayName("La llista no és nul.la")
    void checkNotNullList() {
        assertNotNull(createMonths.createMonths(), "La llista de mesos no és nul.la");
    }

    @Test
    @DisplayName("Agost es troba a la posició 8")
    void checkPosition() {
        assertEquals("Agost", createMonths.createMonths().get(7));
    }

//    @Test
//    @DisplayName("Testing exercici 1")
//    void createMonths() {
//        assertAll("createMonths",
//                () -> assertEquals(12, createMonths.createMonths().size()),
//                () -> assertNotNull(createMonths.createMonths(), "La llista no és nul.la"),
//                () -> assertEquals("Agost", createMonths.createMonths().get(7))
//        );
//    }

}

