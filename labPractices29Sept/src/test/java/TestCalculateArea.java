import com.labalone26sept.classes.CalculateArea;
import com.labalone26sept.classes.ShapeType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculateArea {


    @Test
    @DisplayName("Testing the error exception is working in Circle")
    void Testing_ThroughExection_inCircleShape_Ok(){
        assertThrows(IllegalArgumentException.class, () -> CalculateArea.calculateArea(ShapeType.CIRCLE, 2, 2));
    }
    @Test
    @DisplayName("Testing the error exception is working in Square")
    void Testing_ThroughExection_inSquareShape_Ok(){
        assertThrows(IllegalArgumentException.class, () -> CalculateArea.calculateArea(ShapeType.SQUARE, 2, 2, 2));
    }
    @Test
    @DisplayName("Testing the error exception is working in Rectangle")
    void Testing_ThroughExection_iReactangleShape_Ok(){
        assertThrows(IllegalArgumentException.class, () -> CalculateArea.calculateArea(ShapeType.RECTANGLE, 2, 2, 3));
    }
}
