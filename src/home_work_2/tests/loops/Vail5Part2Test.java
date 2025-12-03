package home_work_2.tests.loops;

import home_work_2.loops.Vail5Part2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Vail5Part2Test {
    @Test
    public void multiplyAllNumbers(){
        Assertions.assertEquals(" = 10080", Vail5Part2.multiplyAllNumbers("181232375"));
        Assertions.assertEquals(" = 3175200", Vail5Part2.multiplyAllNumbers("1238759756"));
        Assertions.assertEquals(" = 362880", Vail5Part2.multiplyAllNumbers("125789643"));
        Assertions.assertEquals("Введено не целое число", Vail5Part2.multiplyAllNumbers("125.875"));
        Assertions.assertEquals("Введено не целое число", Vail5Part2.multiplyAllNumbers("1,5874"));
        Assertions.assertEquals("Введено не число", Vail5Part2.multiplyAllNumbers("Привет"));
        Assertions.assertEquals("Введено не число", Vail5Part2.multiplyAllNumbers("Java"));
        Assertions.assertNull(Vail5Part2.multiplyAllNumbers(null));
        Assertions.assertEquals("Введено не число", Vail5Part2.multiplyAllNumbers(" "));
    }
    @Test
    public void multiplyAllNumbersExeption(){
        Assertions.assertThrows(NumberFormatException.class, () ->{
                Vail5Part2.multiplyAllNumbers("");
                }
        );
        Assertions.assertThrows(NumberFormatException.class, () ->{
                    Vail5Part2.multiplyAllNumbers("How are you");
                }
        );
    }
}
