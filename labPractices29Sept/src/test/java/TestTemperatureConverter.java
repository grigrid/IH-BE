import com.labalone26sept.classes.TemperatureHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTemperatureConverter {
    /*Using TDD create a TemperatureHelper class that allow you to convert temperatures from Fahrenheit,
    Celsius or Kelvin
    (FahrenheitToCelsius, FahrenheitToKelvin, CelsiusToFahrenheit, CelsiusToKelvin, KelvinToFahrenheit, KelvinToCelsius). Write all tests.*/

    TemperatureHelper temperatureHelper;

    @BeforeEach
    public  void init(){
        temperatureHelper = new TemperatureHelper(32, 0 ,0 );
    }

    @Test
    @DisplayName("Verify FahrenheitToCelsius")
    void Changing_FahrenheitToCelsius(){
        assertEquals(0, TemperatureHelper.fahrenheitToCelsius(32));
        assertEquals(0, temperatureHelper.fahrenheitToCelsiusI(32));
    }

    @Test
    @DisplayName("Verify FahrenheitToKelvin")
    void Changing_FahrenheitToKelvin(){
        assertEquals(273.15, temperatureHelper.fahrenheitToKelvin(32));
    }

    @Test
    @DisplayName("Verify CelsiusToKelvin")
    void Changing_CelsiusToFahrenheit(){
        assertEquals(32, temperatureHelper.celsiusToFahrenheit(0));
    }

    @Test
    @DisplayName("Verify CelsiusToKelvin")
    void Changing_CelsiusToKelvin(){
        assertEquals(273.15, temperatureHelper.celsiusToKelvin(0));
    }

    @Test
    @DisplayName("Verify CelsiusToKelvin")
    void Changing_KelvinToFahrenheit(){
        assertEquals(32, temperatureHelper.kelvinToFahrenheit(273.15));
    }
    @Test
    @DisplayName("Verify CelsiusToKelvin")
    void Changing_KelvinToCelsius(){
        assertEquals(0, temperatureHelper.kelvinToCelsius(273.15));
    }




}
