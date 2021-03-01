package hu.bme.mit.train.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainControllerTest {

	TrainControllerImpl controller
	
	
    @Before
    public void before() {
        controller= new TrainControllerImpl();
    }

    @Test
    public void ThisIsAnExampleTestStub() {
    	Assert.assertEquals(0, controller.getReferenceSpeed());
    }
}
