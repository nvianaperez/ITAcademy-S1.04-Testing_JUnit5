package S4_N1_E3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LaunchException {

    public static void countCharacters(String sentence) {

        if (sentence.length() < 5) {
            throw new IndexOutOfBoundsException();

        }
    }

}
