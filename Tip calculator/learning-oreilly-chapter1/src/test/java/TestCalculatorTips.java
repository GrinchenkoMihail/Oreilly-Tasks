import com.luxoft.CalculatorTips;
import com.luxoft.Config;
import org.junit.Before;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(Config.class)
public class TestCalculatorTips {


    private ApplicationContext applicationContext;

    private CalculatorTips calculatorTips;


    @Before
    public void init() {
        applicationContext = new AnnotationConfigApplicationContext(Config.class);
        calculatorTips = applicationContext.getBean(CalculatorTips.class);
    }

    @Test
    public void checkCalculatorTips() {
        assertEquals("3,52 47,52", calculatorTips.dataAboutTipAndTotalAmounts());
    }


}
