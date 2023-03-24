import org.example.calculadora.Calculadora;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculadoraTest {

        Calculadora cal;
       @BeforeAll
       void before(){
                System.out.println("before()");
                cal = new Calculadora();
        }

        @AfterEach
        public void after(){
                System.out.println("after()");
        }


        @Test
        public void testSum(){
                int result = cal.suma(3,2);
                int esper = 5;
                assertEquals(esper, result);
        }


        @Test
        public void testAnsSum(){
                cal.suma(3,2);
                int result = cal.ans();
                int esper = 5;
                assertEquals(esper, result);
        }





/*        @Test
        public void testSuma(){
                int resultado = Calculadora.;
                int esperado = 5;
                assertEquals(esperado,resultado);
        }*/

/*        @Test
        public void testResta(){
                int resultado = Calculadora.resta(3,2);
                int esperado = 1;
                assertEquals(esperado,resultado);
        }*/



}
