package barriga.suite;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
@SuiteDisplayName("Suite de Testes")
@SelectPackages(value = {
        "trilha.testsjunit.barriga.service",
        "trilha.testsjunit.barriga.domain"
})
public class SuiteTest {

}