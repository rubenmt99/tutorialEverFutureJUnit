import org.example.calculadora.Calculadora;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

/*@RunWith(value = Parameterized.class)*/
public class CalculadoraParametroTest {

/*
    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> obj = new ArrayList<>();
        obj.add(new Object[]{2,3,5});
        obj.add(new Object[]{1,4,5});
        return obj;
    }
*/

    @ParameterizedTest
    @CsvSource({ "2,3", "4,1" })
    public void testAdd(int n1, int n2){
        Calculadora calc = new Calculadora();
        int result = calc.suma(n1,n2);
        assertEquals( 5, result);
    }

}
