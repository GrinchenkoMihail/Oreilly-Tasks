import com.luxoft.AreaOfTheRoom;
import com.luxoft.Config;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(Config.class)
public class TestAreaOfTheRoom {

    private ApplicationContext applicationContext;
    private AreaOfTheRoom areaOfTheRoom;

    @Before
    public void init() {
        applicationContext = new AnnotationConfigApplicationContext(Config.class);
        areaOfTheRoom = applicationContext.getBean(AreaOfTheRoom.class);
    }

    @Test
    public void testCalculateArea(){

        assertEquals(195,areaOfTheRoom.calculateArea());
    }

    @Test
    public  void  testCalculateInMeters(){
        assertEquals(18.116,areaOfTheRoom.calculateInMeters());
    }

}
