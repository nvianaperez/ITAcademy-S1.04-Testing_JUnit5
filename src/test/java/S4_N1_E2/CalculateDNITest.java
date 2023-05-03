package S4_N1_E2;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculateDNITest {

    @BeforeAll
    static void printInit() {
        System.out.println("Inicia el test exercici 2");
    }

    @DisplayName("Mostra la lletra correcta del DNI")
    @ParameterizedTest
    @CsvSource(
            value = {
                    "38849361-S",
                    "46835710-M",
                    "58658745-M",
                    "158526987-Q",
                    "587514569-Q",
                    "528569574-L",
                    "25365785-M",
                    "547862356-X",
                    "478569325-E",
                    "12523-B"
            }, delimiter = '-'
    )
    void checkDNI(String input, String expected) {
        CalculateDNI calculateDNI = new CalculateDNI();
        assertEquals(expected, calculateDNI.calculateDNI(input));
    }

    @AfterAll
    static void printEnd() {
        System.out.println("Finalitza el test exercici 2");
    }
}