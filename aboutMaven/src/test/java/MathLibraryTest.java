import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathLibraryTest {

    List<Integer> numList = List.of(1,2,3);

    @Test
    @DisplayName("Test add Nums_works")
    void addNums_addingInts_ok() {


    }
//    la lista es nula

    // suma de numeros positivos
    @Test
    @DisplayName("Test sumList works")
    void sumList_OK() {
        assertEquals(6, MathLibrary.add(2, 4));

    }
    // suma de numero positivo y numero negativo
    @Test
    @DisplayName("Test sumList con un numero negativo y uno positivo")
    void sumList_posNeg_OK(){

    }
    // suma de dos numeros negativos
}
