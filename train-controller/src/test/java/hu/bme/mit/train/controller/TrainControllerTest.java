package hu.bme.mit.train.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.system.TrainSystem;

import static org.mockito.Mockito.*;

public class TrainControllerTest {

	TrainControllerImpl controller;
	
	
    @Before
    public void before() {
        controller= new TrainControllerImpl();
    }

    @Test
    public void ThisIsAnExampleTestStub() {
    	Assert.assertEquals(10, controller.getReferenceSpeed());
    }
}
