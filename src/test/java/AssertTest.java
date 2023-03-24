import org.example.calculadora.Calculadora;
import org.junit.function.ThrowingRunnable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AssertTest {

    Calculadora calc = new Calculadora();

    @Test()
    public void testDiv(){

        ThrowingRunnable thrw = new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                int number = calc.div(5,0);
            }
        };

        assertThrows(ArithmeticException.class, thrw);
    }


    @Test()
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void algoritmoOptimo(){
        int number = calc.div(5,5);
        assertEquals(1, number);
    }


}
