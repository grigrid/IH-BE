import com.labalone26sept.classes.StringHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStringHelper {


    @Test
    @DisplayName("Reverse Method is working")
    void reverseMethod_Ok() {
        assertEquals("aloh", StringHelper.reverse("hola"));
    }

    @Test
    @DisplayName("Change vowels for numbers")
    void encoderMethod_Ok() {
        assertEquals("p0p1", StringHelper.encoder("pepe"));
    }


}
