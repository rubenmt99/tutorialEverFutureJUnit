import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

@Suite
@SelectClasses({
        CalculadoraTest.class,
        CalculadoraParametroTest.class
})
public class MiSuiteSuite {
}
